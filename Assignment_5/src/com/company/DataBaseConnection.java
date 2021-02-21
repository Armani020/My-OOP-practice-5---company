package com.company;

import java.sql.*;
// this is the class for connecting the database
public class DataBaseConnection {
    public Connection getConnection() throws SQLException,ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl,"postgres","741963");
            return con;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public ResultSet getResultSet() {
        ResultSet rs = null;
        return rs;
    }
    public Statement getStatement() throws SQLException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
        Statement stmt = null;
        Connection con = DriverManager.getConnection(connectionUrl, "postgres", "741963");
        stmt = con.createStatement();
        return stmt;
    }
}
