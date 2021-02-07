package com.task5.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        double[] nums = new double[2];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        nums[0]= in.nextDouble();
        System.out.println("Введите ещё число");
        nums[1] = in.nextDouble();
        System.out.println("Введите +, -, * или /");
        String oper = in.next();
        switch (oper){
            case "+": System.out.println(nums[0] + nums[1]);
                break;
            case "-": System.out.println(nums[0] - nums[1]);
                break;
            case "*": System.out.println(nums[0] * nums[1]);
                break;
            case "/":
                if (nums[1] != 0){
                    System.out.println(nums[0] / nums[1]);
                }
                else {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            default: System.out.println("Неизвестная операция, вы с какой планеты?");
        }
    }
}
