package com.pb.pylypiv.hw2;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        String symbol;
        System.out.println("Ведіть число");
        x = in.nextInt();

        if (0 >= x | x <= 14) {
            System.out.println("Діапазон [0-14]");
        } else if (15 >= x | x <= 35) {
            System.out.println("Діапазон [15-35]");
        } else if (36 >= x | x <= 50) {
            System.out.println("Діапазон [36-50]");
        } else if (51 >= x | x <= 100) {
            System.out.println("Діапазон [51-100]");
        } else {
            System.out.println("Діапазон не визначено");

                }
            }

        }


