package ru.netoiogy.services;

public class Main {
    public static void main(String[] args) {
        RestServices services = new RestServices();

        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        int count = services.calculate(10_000, 3_000, 20_000);
        System.out.println(count);
    }
}



