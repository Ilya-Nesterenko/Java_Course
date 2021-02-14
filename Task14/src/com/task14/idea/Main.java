package com.task14.idea;


import java.util.Random;

public class Main {
    public static void main (String [] args){
        Random rand = new Random();
        int[] arr = new int[15];
        int i = 0;
        while (i < arr.length){
            int buf = rand.nextInt();
            if (buf > -20 && buf < 20){
                arr[i] = buf;
                i++;
            }
        }
        System.out.println("Сгенерированный мвссив");
        for (int j : arr){
            System.out.print(j + " ");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        for (int j : arr){
            if (j > max){
                max = j;
            }
            if (j < min){
                min = j;
            }
        }
        if (Math.abs(min) < Math.abs(max)){
            System.out.println("Максимальное по модулю из массива: " + max);
        }
        else {
            System.out.println("Максимальное по модулю из массива: " + min);
        }
    }
}
