package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dik kenarlardan birini giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Diğer dik kenarı giriniz: ");
        int b = scanner.nextInt();
        double h = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs : " + h);

    }
}
