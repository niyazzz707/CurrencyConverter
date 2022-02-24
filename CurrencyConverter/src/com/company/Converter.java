package com.company;

import java.util.Scanner;

public class Converter {
    private final ICurrencyRepository repo;
    private final Scanner scanner;

    public Converter(ICurrencyRepository repo) {
        this.repo = repo;
        scanner = new Scanner(System.in);
    }

    public void start() { // Our start method
        while (true) {
            System.out.println();
            System.out.println("Welcome to our Currency Converter!");
            System.out.println("Please, select operation: ");
            System.out.println("1. From USD to RUB");
            System.out.println("2. From USD to KZT");
            System.out.println("3. From USD to EUR");
            System.out.println("4. From EUR to KZT");
            System.out.println("5. From EUR to RUB");
            System.out.println("6. From RUB to KZT");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter operation(1-6): ");
                int operation = scanner.nextInt();
                if (operation == 1) { // if input equal to 1, we use getUSDtoRUB() function
                getUSDtoRUB();
                }
                else if (operation == 2) {
                    getUSDtoKZT();
                }
                else if (operation == 3) {
                    getUSDtoEUR();
                }
                else if (operation == 4) {
                    getEURtoKZT();
                }
                else if (operation == 5) {
                    getEURtoRUB();
                }
                else if (operation == 6) {
                    getRUBtoKZT();
                } else {
                    System.out.println("Thank you for using our Currency Converter :3");
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("======================================");
        }
    }

    public void getUSDtoRUB() {
        System.out.println("Enter how many amount you want convert?"); // Input how many amount we want to convert
        float amount = scanner.nextFloat();

        repo.usd_rub(amount); // use function from CurrencyRepository
    }

    public void getUSDtoKZT() {
        System.out.println("Enter how many amount you want convert?");
        float amount = scanner.nextFloat();

        repo.usd_kzt(amount);
    }

    public void getUSDtoEUR() {
        System.out.println("Enter how many amount you want convert?");
        float amount = scanner.nextFloat();

        repo.usd_eur(amount);
    }

    public void getEURtoKZT() {
        System.out.println("Enter how many amount you want convert?");
        float amount = scanner.nextFloat();

        repo.eur_kzt(amount);
    }

    public void getEURtoRUB() {
        System.out.println("Enter how many amount you want convert?");
        float amount = scanner.nextFloat();

        repo.eur_rub(amount);
    }

    public void getRUBtoKZT() {
        System.out.println("Enter how many amount you want convert?");
        float amount = scanner.nextFloat();

        repo.rub_kzt(amount);
    }
}
