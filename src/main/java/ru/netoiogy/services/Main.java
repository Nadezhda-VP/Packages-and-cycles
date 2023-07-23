package ru.netoiogy.services;

public class Main {
    public static void main(String[] args) {
        RestServices services = new RestServices();

        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        int count = services.calculate(10_000,3_000,20_000);
        System.out.println( count);
    }
}





   /* int money = 0;
    int count = 0;
        for (int month = 1; month <= 12; month++) {
                if (money >= threshold) {
                System.out.println("Месяц "+month+". Денег "+money+" Буду отдыхать . Потратил -"+expenses+", затем еше -"+expenses);
                count++;
                System.out.println(count);

                money = (money - expenses) / 3;

                } else {
                System.out.println("Месяц "+month+". Денег "+money+" Прийдется работать. Заработал +"+income+", потратил -"+expenses);
                money = money + income - expenses;
                }
                }
                }*/