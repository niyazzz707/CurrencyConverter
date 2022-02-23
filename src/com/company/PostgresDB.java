package com.company;

import java.sql.*;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:postgresql://localhost:5432/currency";
        String username = "postgres";
        String password = "niyazbek";
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(connectionURL, username, password);

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}