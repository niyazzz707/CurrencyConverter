package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL="jdbc:postgresql://localhost:5432/currency";
        try {
            Class.forName("org.postgresql.Driver");

            Connection con= DriverManager.getConnection(connectionURL,"postgres","niyazbek");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
