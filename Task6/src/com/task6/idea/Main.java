package com.task6.idea;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int what = in.nextInt();
        if (what == 1){
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
            int mers = in.nextInt();
            System.out.println("Введите число");
            double num = in.nextDouble();
            switch (mers){
                case 1:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: "+num);
                    System.out.println("Фунты: "+num * 2.20462);
                    System.out.println("Унции: "+num * 35.274);
                    break;
                case 2:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: "+num / 2.20462);
                    System.out.println("Фунты: "+num);
                    System.out.println("Унции: "+num * 16);
                    break;
                case 3:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: "+num / 35.274);
                    System.out.println("Фунты: "+num / 16);
                    System.out.println("Унции: "+num);
                    break;
                default: System.out.println("Действуйте по инструкции в следующий раз");
            }
        }
        else if (what == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int mers = in.nextInt();
            System.out.println("Введите число");
            double num = in.nextDouble();
            switch (mers){
                case 1:
                    System.out.println("Результат:");
                    System.out.println("Метры: "+num);
                    System.out.println("Мили: "+num / 1609.34);
                    System.out.println("Ярды: "+num / 0.9144);
                    System.out.println("Футы: "+num / 0.3048);
                    break;
                case 2:
                    System.out.println("Результат:");
                    System.out.println("Метры: "+num * 1609.34);
                    System.out.println("Мили: "+num);
                    System.out.println("Ярды: "+num * 1760);
                    System.out.println("Футы: "+num * 5280);
                    break;
                case 3:
                    System.out.println("Результат:");
                    System.out.println("Метры: "+num * 0.9144);
                    System.out.println("Мили: "+num / 1760);
                    System.out.println("Ярды: "+num);
                    System.out.println("Футы: "+num * 3);
                    break;
                case 4:
                    System.out.println("Результат:");
                    System.out.println("Метры: "+num * 0.3048);
                    System.out.println("Мили: "+num / 5280);
                    System.out.println("Ярды: "+num / 3);
                    System.out.println("Футы: "+num);
                    break;
                default: System.out.println("Действуйте по инструкции в следующий раз");
            }
        }
        else {
            System.out.println("Действуйте по инструкции в следующий раз");
        }
    }
}