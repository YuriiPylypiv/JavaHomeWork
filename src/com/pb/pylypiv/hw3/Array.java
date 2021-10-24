package com.pb.pylypiv.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть числа в масив");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Заповнений масив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сума елементів масиву = " + sum);

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i]>0) {
                num++;
            }
            System.out.println("Кількість елементів більше нуля = " +num);
            }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

