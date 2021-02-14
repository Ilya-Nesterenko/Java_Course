package com.task13.idea;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = in.nextLine();
        String[] res = a.split(" ");
        int counter = 0;
        System.out.println("Слова из латинских букв:");
        for (String str : res){
            boolean flag = false;
            for (int j = 0; j<str.length(); j++){
                if(Character.isAlphabetic(str.charAt(j)) && Character.UnicodeBlock.of(str.charAt(j)).equals(Character.UnicodeBlock.BASIC_LATIN)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
                //System.out.println(str.charAt(j));
            }
            if(flag){
                System.out.println(str);
                counter += 1;
            }
        }
        System.out.println("Количество слов, написанных Латиницей: " + counter);
    }
}
