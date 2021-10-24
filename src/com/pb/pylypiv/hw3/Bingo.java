package com.pb.pylypiv.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Вітаємо у грі Bingo");
        System.out.println("Вам потрібно відгадати загадане системою число від 0 до 100");

        Random random = new Random();
        int x = random.nextInt(101);
        System.out.println("Число загадано системою");

        final int MAX_ATTEMPT = 101;
        int attempt = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть Ваш варіант числа від 0 до 100 і натисніть enter");

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Спроба" + attempt + ":");
            int y;
            y = scan.nextInt();
            if (y > x) {
                System.out.println("Загадай число менше");
            }
            if (y < x) {
                System.out.println("Загадай число більше");
            }
            if (y == x) {
                System.out.println("Вітаємо. Ви вгадали число з " + attempt + "спроби");
            }
            if (y > 101) {
                System.out.println("Дострокове завершення гри"); break;
            }

        }



    }
}
