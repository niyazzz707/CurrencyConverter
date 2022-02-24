package com.company;

import java.sql.*;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:postgresql://localhost:5432/currency"; // write our connection URL
        String username = "postgres"; // our username
        String password = "niyazbek"; // our password
        try {
            Class.forName("org.postgresql.Driver"); //  Driver upload

            Connection con = DriverManager.getConnection(connectionURL, username, password); // Get connection to our DB

            return con;
        } catch (Exception e) { // exception
            System.out.println(e);
            return null;
        }
    }
}