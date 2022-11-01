package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean q = true;
        double s = -1;

        while (q) {

            System.out.print("Lütfen birinci sayıyı giriniz: ");
            double a = scanner.nextDouble();
            System.out.print("Lütfen ikinc sayıyı giriniz: ");
            double b = scanner.nextDouble();
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz(Not: q basarsanız kapanır.): ");

            String i = scanner.next();
            if (i.equals("q")) {
                q = false;
                break;
            }


            switch (i) {
                case "+":
                    s = a + b;
                    System.out.println("Sonuç : " + s);
                    break;
                case "-":
                    s = a - b;
                    System.out.println("Sonuç : " + s);
                    break;
                case "*":
                    s = a * b;
                    System.out.println("Sonuç : " + s);
                    break;
                case "/":
                    s = a / b;
                    System.out.println("Sonuç : " + s);
                    break;
                default:
                    System.out.println("Geçersiz işlem.");

            }
        }
    }
}
