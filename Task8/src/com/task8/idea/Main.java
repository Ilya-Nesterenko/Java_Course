package com.task8.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int arrLen = in.nextInt();
        int [] arr = new int [arrLen];
        for (int i=1; i<=arr.length; i++){
            arr[i - 1] = i;
        }
        int sum = 0;
        for (int i : arr){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("Сумма нечётных чисел от 1 до " + arr.length + ": " + sum);
    }
}
