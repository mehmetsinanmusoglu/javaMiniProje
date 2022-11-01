package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int birinciSayi;
        int ikinciSayi;
        int tutcu;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        birinciSayi = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        ikinciSayi = scanner.nextInt();
        System.out.println("Sayıların değerleri 1." + birinciSayi + " 2." + ikinciSayi);
        tutcu = birinciSayi;
        birinciSayi = ikinciSayi;
        ikinciSayi = tutcu;
        System.out.print("Yerleri değiştirdim 1." + birinciSayi + " 2." + ikinciSayi);

    }
}
