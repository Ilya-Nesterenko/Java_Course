package com.task10.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов");
        int b = in.nextInt();
        double [][] arr = new double [a][b];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("Введите " + (j + 1) + "-й" + " элемент " + (i + 1) + "-й" + " строки");
                arr[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i<arr[0].length; i++){
            System.out.print(arr[0][i]*3 + " ");
        }

    }
}
