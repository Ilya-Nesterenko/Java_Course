package com.finaltask1.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double corse = in.nextDouble();
        System.out.println("Введите количество рублей");
        double rubs = in.nextDouble();
        double sum = rubs/corse;
        System.out.println("Итого: " + (double) Math.round(sum*100)/100);
    }
}
