package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0 && array[i] %2 ==0)
            {
                System.out.print (" " + array[i]); // Выводим на экран, полученный массив
            }
        }
        System.out.println();
    }
}
