package com.example.galtolittable;

public class GalToLitTable {
    public static void main(String[] args) {

        double gallons,liters;  // TODO code application logic here
        int    counter;

        counter =0;
        for (gallons = 1; gallons <16; gallons++){
            liters = gallons*3.7854;
            System.out.println(gallons + " gallons equals "
                    + liters + " liters");
            counter++;
            if (counter == 5) {
                System.out.println();
                counter=0;
            }
        }
    }
}
