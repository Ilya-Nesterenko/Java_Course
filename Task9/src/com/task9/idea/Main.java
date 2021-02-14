package com.task9.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int arrLen = in.nextInt();
        double [] arr = new double [arrLen];
        for (int i=0; i<arr.length; i++){
            System.out.println("Введите элемент массива");
            arr[i] = in.nextDouble();
        }
        double sum = 0;
        for (double i : arr){
            sum += i;
        }
        double srar = sum / arr.length;
        System.out.println("Массив, умноженный на своё среднее арифметическое:");
        for (double i : arr){
            System.out.print(i * srar + ", ");
        }
    }
}
