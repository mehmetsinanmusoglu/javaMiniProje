package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        scanner.nextLine();
        int gecici_sayi = sayi;
        int basamak_sayisi = 0;


        while (gecici_sayi > 0) {
            gecici_sayi /= 10;
            basamak_sayisi++;
        }

        gecici_sayi = sayi;
        int toplam = 0;
        do {
            int basamak = gecici_sayi % 10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak, basamak_sayisi);

        } while (gecici_sayi > 0);
        if (sayi == toplam) {
            System.out.println("Bu sayı bir amstron sayısıdır.");
        } else {
            System.out.println("Busayı bir amstron sayısı değildir.");
        }
    }
}
