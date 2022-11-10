package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler: \n" +
                "1.Kare alan hesapla \n" +
                "2.Üçgen alan hesapla \n" +
                "3.Daire alan hesapla \n" +
                "4.Çıkış \n";
        while (true) {
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplama istiyorsun :");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if (sekil_turu.equals("4")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else if (sekil_turu.equals("1")) {
                System.out.print("Lütfen karenin bir kenarını girin:");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("kare", kenar);
                sekil.alanHesapla();

            } else if (sekil_turu.equals("2")) {
                System.out.print("Kenar 1:");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2:");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3:");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
                sekil.alanHesapla();

            } else if (sekil_turu.equals("3")) {
                System.out.print("Yarıçap :");
                int yarıcap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire", yarıcap);
                sekil.alanHesapla();

            } else {
                System.out.println("Geçersiz işlem tekrar deneyiniz.");
            }
        }

    }
}
