package com.google;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        1. Решить логические вычисления:
//        a. true && false || true && !false                                  Ответ:True
//        b. false || false || !true && false                                 Ответ:False
//        c. !false && (false || true && true)                                Ответ:True
//        d. 4 > 8 && !(7 == 0)                                               Ответ:False
//        e. !(true && false || false && true) && !(true && 4 <= 5)           Ответ:False


//        2. Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
//        и возле каждого пишет четное это число или нечетное.
//                Пример
//        1 -> нечетное
//        2 -> четное
//        и т д.
        String text = "";
        
        int i = 0;
        while (i < 10){
            i++;
            int index = i % 2;
            if (index == 0){
                text = " -> четное";
            }else{
                text = " -> нечетное";
            }
            System.out.println(i + text);


        }






//        3. Написать программу, которая выводит информацию о дне неделе.
//                Например для понедельника – пятницы выводит сообщение “Это рабочий
//        день”, а для субботы и воскресенья выводит “Это выходной!”

        System.out.println("ЗАДАНИЕ №3\n");
        Scanner scanner = new Scanner(System.in);
        String[] m = {"понедельник","вторник","среда","четверг","пятница"};
        String[] m2 = {"суббота","воскресенье"};


        System.out.print("\n\nВведите день недели!:");
        String text2 = scanner.nextLine();
        boolean contains = Arrays.stream(m).anyMatch(text2::equals);

        if (contains){
            System.out.println("Это рабочий день");
        }else {
            boolean contains2 = Arrays.stream(m2).anyMatch(text2::equals);
            if (contains2){
                System.out.println("Это выходной день!");


            }else {
                System.out.println("Вы ввели не правельное значение!");
            }



        }


       System.out.println("\n\nЗАДАНИЕ 4\n");
//        4. Написать программу, которая считает факториал числа и выводит
//        промежуточные значения на экран.
//        Условие: если промежуточное значение >1000, завершить цикл предварительно
//        написав в консоли “Достигнут максимально возможный результат”.
        boolean b = true;
        int num = 0;
        int q = 0;
        wh:
            while (b){
                int d = 1;
                int l = 0;
                q = 0;
                System.out.println("Введите число в диапазоне до 1000!");
                int input = scanner.nextInt();
                num = input;
                while (l < input){
                    if (num >= 1000){
                        System.out.println("Достигнут максимально возможный результат");
                        break wh;
                    }
                    l++;
                    q = d * l;
                    d = q;




            }
            if (num == 0){
                break wh;
            }
            System.out.println("Факториал числа " + num + " : " + q);
            System.out.println("Для выхода введите 0");




        }


        System.out.println("\nЗАДАНИЕ 5\n");
//        Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.

        int a = 0;
        int a1 = 0;
        while (a <= 10){
            a++;
            a1++;
            if (a1 == 3){
                a1 = 0;
                System.out.println(a);
            }
        }














    }
}
