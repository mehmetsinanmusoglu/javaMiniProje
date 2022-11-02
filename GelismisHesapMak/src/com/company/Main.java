package com.company;

import java.util.Scanner;

public class Main {

    public static int toplam(int sayiBir, int sayiIki) {
        return sayiBir + sayiIki;
    }

    public static int toplam(int sayiBir, int sayiIki, int sayiUc) {
        return sayiBir + sayiIki + sayiUc;
    }

    public static int cıkarma(int sayiBir, int sayiIki) {
        return sayiBir - sayiIki;
    }

    public static int carpma(int sayiBir, int sayiIki) {
        return sayiBir * sayiIki;
    }

    public static int carpma(int sayiBir, int sayiIki, int sayiUc) {
        return sayiBir * sayiIki * sayiUc;
    }

    public static int bolme(int sayiBir, int sayiIki) {
        return sayiBir / sayiIki;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islem = "1.toplama " +
                "2.Çıkarma " +
                "3.Çarpma " +
                "4.Bölme " +
                "5.Çıkış";

        while (true) {
            System.out.println("*****************");
            System.out.println(islem);
            System.out.println("*****************");

            System.out.print("1.Sayıyı giriniz:");
            int bir = scanner.nextInt();
            System.out.print("2.Sayıyı giriniz:");
            int iki = scanner.nextInt();
            System.out.print("3.Sayıyı giriniz (yoksa 0 yazınız. çıkarma ve bölme işlemleri iki sayı kullanınız) :");
            int uc = scanner.nextInt();
            System.out.print("islemi giriniz:");
            String sec = scanner.next();
            if (sec.equals("1")) {
                if (uc == 0) {
                    System.out.println(toplam(bir, iki));

                } else {
                    System.out.println(toplam(bir, iki, uc));
                }
            } else if (sec.equals("2")) {
                System.out.println(cıkarma(bir, iki));
            } else if (sec.equals("3")) {
                if (uc == 0) {
                    System.out.println(carpma(bir, iki));
                } else {
                    System.out.println(carpma(bir, iki, uc));
                }
            } else if (sec.equals("4")) {
                System.out.println(bolme(bir, iki));
            } else if (sec.equals("5")) {
                System.out.println("hesap makinesi kapatılıyor...");
                break;
            } else {
                System.out.println("Yanlış bir işlem girdiniz 1-5 arası bir rakam giriniz.");
            }


        }


    }
}
