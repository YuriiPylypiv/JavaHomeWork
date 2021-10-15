package com.pb.pylypiv.hw2;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.prism.shader.Solid_TextureFirstPassLCD_AlphaTest_Loader;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть operand1: ");
        int operand1 = in.nextInt();
        System.out.println("Введіть operand2: ");
        int operand2 = in.nextInt();
        System.out.println("Введіть знак арифметичної дії +,-,*,/");
        char sign;
        sign = in.next().charAt(0);
        int Результат;
        switch (sign) {
            case '+':
                System.out.println("Результат" + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат" + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат" + (operand1 * operand2));
                break;
            case '/':
                if (operand2 > 0) {
                    System.out.println("Результат" + (operand1 / operand2));
                }
                else
                System.out.println("Результат" + ("На нуль не ділиться"));
                break;
        }















    }

































}
