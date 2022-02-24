package com.company;

import java.sql.Connection;
import java.sql.*;

public class CurrencyRepository implements ICurrencyRepository {
    private final IDB db; // add Data Base for Currency repositody

    public CurrencyRepository(IDB db) {
        this.db = db;
    }

    Currency cur=new Currency(); // allocate memory for Currency getters and setters
    @Override // override class from ICurrencyRepository
    public void  usd_rub(float amount) {
        Connection con = null;
        try {
            con = db.getConnection(); // Get Connection for our sql
            PreparedStatement st = con.prepareStatement("select \"USD/RUB\" from currency_base"); // Create sql
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setUsd_rub(res.getFloat("USD/RUB")); // Set USD/RUB currency for the right setter
                float sum=amount*cur.getUsd_rub(); // find the amount of converted currency
                System.out.println(amount + " USD" + " = " + sum + " RUB"); // output our converted currency
            }
        } catch (SQLException throwables) { // catch our exteptions
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close(); // close our connection
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void usd_kzt(float amount) {
        Connection con = null;
        try {
            con = db.getConnection(); // Get Connection for our sql
            PreparedStatement st = con.prepareStatement("select \"USD/KZT\" from currency_base"); // Create sql
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setUsd_kzt(res.getFloat("USD/KZT")); // Set USD/KZT currency for the right setter
                float sum=amount*cur.getUsd_kzt(); // find the amount of converted currency
                System.out.println(amount + " USD" + " = " + sum + " KZT"); // output our converted currency
            }
        } catch (SQLException throwables) { // catch our exteptions
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close(); // close our connection
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public void usd_eur(float amount) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("select \"USD/EUR\" from currency_base");
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setUsd_eur(res.getFloat("USD/EUR"));
                float sum=amount*cur.getUsd_eur();
                System.out.println(amount + " USD" + " = " + sum + " EUR");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public void eur_kzt(float amount) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("select \"EUR/KZT\" from currency_base");
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setEur_kzt(res.getFloat("EUR/KZT"));
                float sum=amount*cur.getEur_kzt();
                System.out.println(amount + " EUR" + " = " + sum + " KZT");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void eur_rub(float amount) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("select \"EUR/RUB\" from currency_base");
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setEur_rub(res.getFloat("EUR/RUB"));
                float sum=amount*cur.getEur_rub();
                System.out.println(amount + " EUR" + " = " + sum + " RUB");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void rub_kzt(float amount) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("select \"RUB/KZT\" from currency_base");
            ResultSet res = st.executeQuery();
            if (res.next()) {
                cur.setRub_kzt(res.getFloat("RUB/KZT"));
                float sum=amount*cur.getRub_kzt();
                System.out.println(amount + " RUB" + " = " + sum + "KZT");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

