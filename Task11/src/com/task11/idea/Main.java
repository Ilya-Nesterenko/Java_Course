package com.task11.idea;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = in.next();
        System.out.println("Второе первое число");
        int b = in.nextInt();
        int res = Math.max(Integer.parseInt(a), b);
        System.out.println(res);
    }


}
