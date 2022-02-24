package com.company;


public class Main {
    public static void main(String args[]) {
        IDB db=new PostgresDB();
        ICurrencyRepository repo=new CurrencyRepository(db);
        Converter conv=new Converter(repo);

        conv.start();
    }
}