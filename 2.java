package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // Объявляем Scanner
                int array[] = new int[7]; // Создаём массив int
                /*Пройдёмся по всему массиву, заполняя его*/
                for (int i = 0; i < 7; i++) {
                    Random generator = new Random();
                    int d = generator.nextInt(10);
                    if (d % 2 == 0){
                        array[i] = d; // Заполняем массив элементами
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    if (i %2 ==1)
                    {
                        array[i] =array [i-1]*array[i];

                    }
                    System.out.print (" " + array[i]); // Выводим на экран, полученный массив
                }
                System.out.println();


    }
}
