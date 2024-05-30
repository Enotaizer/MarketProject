package com.amisitysu14.gmail;

public class Market {
    public static void main(String[] args) {

        String product1 = "smartphone";
        double total = 12153.41;
        int days5 = 5;

        double sales = total / days5;

        System.out.printf("Product 1: %s%n", product1);
        System.out.printf("total sales for 5 days is EUR %.2f%n", total);
        System.out.printf("sales by day is EUR %.2f%n", sales);


        String product2 = "laptop";
        double total2 = 10486.85;
        int days7 = 7;

        double sales2 = total2 / days7;

        System.out.printf("Product 2: %s%n", product2);
        System.out.printf("total sales for 7 days is EUR %.2f%n", total2);
        System.out.printf("sales by day is EUR %.2f%n", sales2);
    }
}