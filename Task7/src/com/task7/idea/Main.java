package com.task7.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        final double c1 = 1;
        final double c2 = 2;
        final double c3 = 3;
        System.out.println("Константы: " + c1 + ", " + c2 + ", " + c3);
        System.out.println("Введите длину массива");
        int arrLen = in.nextInt();
        double [] arr = new double [arrLen];
        for (int i=0; i<arr.length; i++){
            System.out.println("Введите элемент массива");
            arr[i] = in.nextDouble();
        }
        for (double i : arr){
            if (i == c1 || i == c2 || i == c3){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}