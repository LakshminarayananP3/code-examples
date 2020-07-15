package com.lnt.forkjoin.db.preanalysis;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/*
 * @author Lakshminarayanan
 * @project ForkJoin
 * @created 08/06/20
 */
public class ColumnInfoParser extends RecursiveAction {

    private String schema;
    private List<String> tableList;
    private Connection connection;

    public ColumnInfoParser(String sc, Connection con, List<String> newTableList) {
        this.schema = sc;
        this.connection = con;
        this.tableList = newTableList;
    }

    @Override
    protected void compute() {
        ResultSet rs1;
        String tableName = "%";
        Writer out = null;

        try {
            for (String table : tableList) {
                out = new OutputStreamWriter(new FileOutputStream("out" + File.separator + table));
                rs1 = connection.getMetaData().getColumns(null, schema, table, "%");
                while (rs1.next()) {
                    out.write(rs1.getString("TABLE_NAME") + "=>" + rs1.getString("COLUMN_NAME") + "\n");
                }
                rs1.close();
                out.flush();
                out.close();
            }
        } catch (Exception e) {
                    e.printStackTrace();
        }
        finally {
        }
    }

}
