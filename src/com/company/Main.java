package com.company;

import java.sql.*;

public class Main {
    public static void main(String args[]) {
        String connectionUrl = "jdbc:postgresql://localhost:5432/currency";
        Connection con = null;
        ResultSet res = null;
        Statement stat = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "niyazbek");
            stat = con.createStatement();
            res = stat.executeQuery("");
            while(res.next()) {
            }

        }
        catch(Exception e) {

            System.out.println(e);
        }
        finally{
            try{
                res.close();
                stat.close();
                con.close();
            } catch(SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}