package com.finaltask4.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадка: сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        System.out.println("У вас есть 3 попытки и 1 подсказка, удачи!");
        boolean f = false;
        for (int i=0; i<3; i++){
            String str = in.nextLine();
            switch (i){
                case 0:
                    if (str.equalsIgnoreCase("Подсказка")){
                        System.out.println("Не лук. Теперь нужно ответить с первой попытки");
                        String str1 = in.nextLine();
                        if (str1.equals("Заархивированный вирус")){
                            System.out.println("Правильно!");
                            f = true;
                            break;
                        }
                        else {
                            System.out.println("Обидно, приходи в другой раз");
                            f = true;
                            break;
                        }
                    }
                    else if (str.equals("Заархивированный вирус")){
                        System.out.println("Правильно!");
                        f = true;
                        break;
                    }
                    else {
                        System.out.println("Подумай ещё.");
                    }
                    break;
                case 1:
                    if (str.equalsIgnoreCase("Подсказка") ) {
                        System.out.println("Подсказка уже недоступна, введи ответ");
                        str = in.nextLine();
                        if (str.equals("Заархивированный вирус")){
                            System.out.println("Правильно!");
                            f = true;
                            break;
                        }
                        else {
                            System.out.println("Подумай ещё.");
                        }
                        break;
                    }
                    else if (str.equals("Заархивированный вирус")){
                        System.out.println("Правильно!");
                        f = true;
                        break;
                    }
                    else {
                        System.out.println("Подумай ещё.");
                    }
                    break;
                case 2:
                    if (str.equalsIgnoreCase("Подсказка") ) {
                        System.out.println("Подсказка уже недоступна, введи ответ");
                        str = in.nextLine();
                        if (str.equals("Заархивированный вирус")){
                            System.out.println("Правильно!");
                            f = true;
                            break;
                        }
                        else {
                            System.out.println("Обидно, приходи в другой раз.");
                            f = true;
                        }
                        break;
                    }
                    else if (str.equals("Заархивированный вирус")){
                        System.out.println("Правильно!");
                        f = true;
                        break;
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз.");
                        f = true;
                    }
                    break;
                default:
                    System.out.println("Как я сюда попал?");
            }
            if (f){
                break;
            }
        }

    }

}
