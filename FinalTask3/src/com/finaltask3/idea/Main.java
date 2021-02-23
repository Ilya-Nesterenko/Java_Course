package com.finaltask3.idea;

import sun.plugin.dom.css.Counter;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int strNum = in.nextInt();
        String[] arr = new String[strNum];
        int[] arrCounts = new int[strNum];

        System.out.println("Введите строки:");
        for (int i=0; i<strNum; i++){
            System.out.print("Строка " + (i+1) + ": ");
            arr[i] = in.next();
        }

        for (int i=0; i<arr.length; i++){
            arrCounts[i] = counter(arr[i]);
        }
        int max = arrCounts[0];
        int maxPos = 0;
        for (int i=0; i<arrCounts.length; i++){
            if (arrCounts[i]>max){
                max = arrCounts[i];
                maxPos=i;
            }
        }
        System.out.println("Ответ: " + arr[maxPos]);
    }
    public static int counter(String str){
        int count = 0;
        for (int j=0; j<str.length()-1; j++){
            for (int k=j+1; k<str.length(); k++){
                if (str.charAt(j) != str.charAt(k)){
                    count++;
                }
            }
        }
        return count;
    }
}
