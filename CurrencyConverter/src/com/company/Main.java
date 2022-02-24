package com.company;


public class Main {
    public static void main(String args[]) {
        IDB db=new PostgresDB(); // allocate memory for the database class
        ICurrencyRepository repo=new CurrencyRepository(db); // allocate memory for currency repository
        Converter conv=new Converter(repo); // allocate memory for the class with currency selection

        conv.start(); // Start our Currency Converter
    }
}