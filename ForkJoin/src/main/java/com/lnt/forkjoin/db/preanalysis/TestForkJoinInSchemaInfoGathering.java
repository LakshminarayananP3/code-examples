package com.lnt.forkjoin.db.preanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author Lakshminarayanan
 * @project ForkJoin
 * @created 08/06/20
 */
public class TestForkJoinInSchemaInfoGathering {

    String SERVER = "SQL";
    String HOST = "localhost";
    String PORT = "1433";
    String DB = "CLAIMS_SYS";
    String sc = "dbo";
    String usr = "sa";
    String pwd = "secret@123";
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
        TestForkJoinInSchemaInfoGathering jdbc = new TestForkJoinInSchemaInfoGathering();

        jdbc.getConnection();
//        jdbc.begin();
        jdbc.gatherSchemaInformation();
//        jdbc.TestSPVJoin();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private void getConnection() throws SQLException {
        url = getUrl();
        con = DriverManager.getConnection(url, usr, pwd);
        System.out.println("Connection Success");
    }

    private void gatherSchemaInformation() throws SQLException {
        ResultSet rs1;
        String tableName = "(ADDRESS|MEMBER)";
        ResultSet rs = con.getMetaData().getTables(null, sc, null, new String[]{"TABLE"});
        while (rs.next()) {
            rs1 = con.getMetaData().getColumns(null, sc, rs.getString("TABLE_NAME"), "%");
        }
        rs1 = con.getMetaData().getColumns(null, sc, null, "%");
        while (rs1.next()) {
            System.out.print(rs1.getString("TABLE_NAME") + "=>" + rs1.getString("COLUMN_NAME"));
        }
//                }
        System.out.println();
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
