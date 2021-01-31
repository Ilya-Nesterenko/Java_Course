package com.task3.idea;

public class Main {
    public static void main (String [] args){
        int[] arr = {1, 2, 3, 4, 5};
        int buf = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = buf;
        int sum = arr[0] + arr[arr.length - 3];
        System.out.println("Сумма первого и среднего элементов: " + sum);
    }
}
