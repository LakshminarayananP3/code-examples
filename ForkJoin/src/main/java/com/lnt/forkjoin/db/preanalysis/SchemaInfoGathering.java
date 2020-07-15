package com.lnt.forkjoin.db.preanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/*
 * @author Lakshminarayanan
 * @project ForkJoin
 * @created 08/06/20
 */
public class SchemaInfoGathering {

    String SERVER = "SQL";
    String HOST = "13.233.195.225";
    String PORT = "1433";
    String DB = "PS_FINANCE";
    String sc = "dbo";
    String usr = "sa";
    String pwd = "Secret@123";

//    String SERVER = "SQL";
//    String HOST = "localhost";
//    String PORT = "1433";
//    String DB = "CLAIMS_SYS";
//    String sc = "dbo";
//    String usr = "sa";
//    String pwd = "secret@123";

    String url;
    Connection con;

    //MYSQL
//    String SERVER = "mySQL";
//    String HOST = "localhost";
//    String PORT = "3306";
//    String DB = "ARCHON_DEMO_DB";
//    String sc = "ARCHON_DEMO_DB";
//    String usr = "root";
//    String pwd = "secret123";
//    String url;

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        SchemaInfoGathering jdbc = new SchemaInfoGathering();

        jdbc.getConnection();
//        jdbc.begin();
        jdbc.gatherSchemaInformation();
//        jdbc.TestSPVJoin();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private void gatherSchemaInformation() throws SQLException {
        ForkJoinPool pool = new ForkJoinPool(8);

        List<String> tableList = new ArrayList<>();
        ResultSet rs = con.getMetaData().getTables(null, sc, null, new String[]{"TABLE"});
        int counter = 0;
        while (rs.next()) {
            tableList.add(rs.getString(3));
            if(++counter > 110)
                break;
        }
        int count = 0;
        List<String> newTableList = new ArrayList<>();
        List<String> finalList;
        List<ColumnInfoParser> columnInfoParserList = new ArrayList<>();
        for (String table : tableList){
            newTableList.add(table);
            System.out.println(table);
            if (++count == 1 || count == tableList.size()) {
                count = 0;
                finalList = new ArrayList<>();
                finalList.addAll(newTableList);
                ColumnInfoParser columnInfoParser = new ColumnInfoParser(sc, con, finalList);
                columnInfoParserList.add(columnInfoParser);
                newTableList.clear();
            }
        }
        ForkJoinTask.invokeAll(columnInfoParserList);
        System.out.println(pool.getActiveThreadCount());
        pool.shutdown();
    }

    private void getConnection() throws SQLException {
        url = getUrl();
        con = DriverManager.getConnection(url, usr, pwd);
        System.out.println("Connection Success");
    }


    public String getUrl() {
        switch (SERVER.toLowerCase()) {
            case "sql":
                return "jdbc:sqlserver://" + HOST + ":" + PORT + ";databaseName=" + DB + ";user=" + usr
                        + ";password=" + pwd;
//                return "jdbc:jtds:sqlserver://" + HOST + ":" + PORT + "/" + DB + ";appName=SchemaCrawler;useCursors=true";
            case "oracle":
                return "jdbc:oracle:thin:@" + HOST + ":" + PORT + ":" + DB;
            case "oracleservice":
                return "jdbc:oracle:thin:@//" + HOST + ":" + PORT + "/" + DB;
            case "mysql":
                return "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB
                        + "?nullNamePatternMatchesAll=true&logger=Jdk14Logger&dumpQueriesOnException=true" +
                        "&dumpMetadataOnColumnNotFound=true&maxQuerySizeToLog=4096&&useJDBCCompliantTimezoneShift=true" +
                        "&useLegacyDatetimeCode=false&serverTimezone="
                        + "&disableMariaDbDriver";
            case "maria":
            case "mariadb":
                return "jdbc:mariadb://" + HOST + ":" + PORT + "/" + DB;
            case "db2":
                return "jdbc:db2://" + HOST + ":" + PORT + "/" + DB + ";retrieveMessagesFromServerOnGetMessage=true;";
            case "postgresql":
                return "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DB;
            case "sybase":
                return "jdbc:jtds:sybase://" + HOST + ":" + PORT + "/" + DB;
        }
        return null;
    }
}
