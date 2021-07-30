package com.company;

public class PoundToKilogram {
    public static void main(String[] args) {
        // write your code here
        double Kilogram;
        int Pounds;
        for (Pounds = 200; Pounds <=202; Pounds++){
            Kilogram = Pounds * 0.45359237;
            System.out.println(Pounds + " Pounds equals " + Kilogram + " kilogram");
        }
    }

}
