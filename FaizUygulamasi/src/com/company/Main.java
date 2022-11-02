package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double faizOrani = 0.06;
        System.out.println("Yıllık Faiz Oranı %6 dır.");

        System.out.print("Yatırmak istediğinizi Tutarı giriniz :");
        int anaPara = scanner.nextInt();
        System.out.print("Kaç yıl yatırılacak ? :");
        int sure = scanner.nextInt();

        int toplam = anaPara;

        for (int i = 1 ; i <= sure; i++){
        toplam = (int)(toplam * faizOrani) + toplam;
            System.out.println(i + ". Yıl sonu anapara " + toplam );
        }

    }
}
