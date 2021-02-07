package com.task4.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        double[] nums = new double[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        nums[0]= in.nextDouble();
        System.out.println("Введите ещё число");
        nums[1] = in.nextDouble();
        System.out.println("Введите последнее число");
        nums[2] = in.nextDouble();
        System.out.println("Вы ввели: "+nums[0]+" "+nums[1]+" "+nums[2]);
        double srAr = 0;
        for(int i=0; i<3; i++){
            srAr += nums[i];
        }
        srAr = srAr / nums.length;
        System.out.println("Среднее арифсетическое введённых чисел: " + srAr);
        double halfSrAr = srAr / 2;
        double ans = Math.round(halfSrAr);
        if (ans > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
