package com.company;

public class Hello {
    public static void main ( String[] args )
    {
        for (int i = 0; i < 10 ; i++) {
            int sum = 1;
            sum = sum + i;
            // System.out.println( sum);
        }
        System.out.println("one\ttwo\tthree");
        double myFirstVar = 20.00d;
        double meSecondVar = 80.00d;
        double myTotalValue = myFirstVar + meSecondVar * 100.00d;

        double theRemainder = myTotalValue % 40.00d;

    }
}
