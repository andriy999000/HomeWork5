package com.google;

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


    }
}
