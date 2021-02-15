package com.task11.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = in.next();
        a = a.replaceAll(",", ".");
        System.out.println("Второе первое число");
        int b = in.nextInt();
        double res1 = Math.max(Double.parseDouble(a), (double) b);
        System.out.println(res1);
        double res2 = Math.min(Double.parseDouble(a), (double) b);
        System.out.println(res2);
    }


}
