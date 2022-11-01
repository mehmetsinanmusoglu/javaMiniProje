package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınızın Km başına yaktığınız yakıtı giriniz? (örnek: 0,32) :");
        double kurus = scanner.nextDouble();

        System.out.print("Aracınızla Kaç Km gittiniz ? : ");
        int km = scanner.nextInt();

        System.out.println("Toplam yaktığınız yakıt : " + (km * kurus) + " kuruş");

    }
}
