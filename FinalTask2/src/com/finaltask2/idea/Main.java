package com.finaltask2.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String task = in.nextLine();
        Character a = task.charAt(0);
        Character oper = task.charAt(1);
        Character b = task.charAt(2);
        Character c = task.charAt(4);

        if (Character.isLetter(a) && Character.isDigit(b) && Character.isDigit(c) && oper == '+'){
            int res = Character.getNumericValue(c) - Character.getNumericValue(b);
            System.out.println("x=" + res);
        }
        else if (Character.isLetter(a) && Character.isDigit(b) && Character.isDigit(c) && oper == '-'){
            int res = Character.getNumericValue(c) + Character.getNumericValue(b);
            System.out.println("x=" + res);
        }
        else if (Character.isDigit(a) && Character.isLetter(b) && Character.isDigit(c) && oper == '+'){
            int res = Character.getNumericValue(c) - Character.getNumericValue(a);
            System.out.println("x=" + res);
        }
        else if (Character.isDigit(a) && Character.isLetter(b) && Character.isDigit(c) && oper == '-'){
            int res = Character.getNumericValue(a) - Character.getNumericValue(c);
            System.out.println("x=" + res);
        }
        else if (Character.isDigit(a) && Character.isDigit(b) && Character.isLetter(c) && oper == '+'){
            int res = Character.getNumericValue(a) + Character.getNumericValue(b);
            System.out.println("x=" + res);
        }
        else if (Character.isDigit(a) && Character.isDigit(b) && Character.isLetter(c) && oper == '-'){
            int res = Character.getNumericValue(a) - Character.getNumericValue(b);
            System.out.println("x=" + res);
        }
    }
}
