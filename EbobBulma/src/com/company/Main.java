package com.company;

import java.util.Scanner;

public class Main {
    public static int ebobBul(int a, int b) {
        int ebob = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int sayiBir = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayiIki = scanner.nextInt();
        System.out.println("Bu sayıların EBOB'U : " + ebobBul(sayiBir, sayiIki));
    }
}
