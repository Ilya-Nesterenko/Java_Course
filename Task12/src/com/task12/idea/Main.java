package com.task12.idea;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = in.nextLine();
        if (a.contains("Java") && a.startsWith("I like") && a.endsWith("!!!")){
            System.out.println(a.toUpperCase(Locale.ROOT));
        }
        a = a.replaceAll("a", "o");
        System.out.println(a.substring(7, 11));
    }
}
