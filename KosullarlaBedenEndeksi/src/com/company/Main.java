package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(örnek: 1,75) : ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        double bki = kilo / (boy * boy);
        System.out.println("Endeksiniz: " + bki);
        if(bki < 18.5 ){
            System.out.println("Zayıfsın.");
        }else if (bki >= 18.5 && bki < 25){
            System.out.println("Normalsin.");
        }else if (bki >= 25 && bki < 30){
            System.out.println("Kilolusun.");
        }else {
            System.out.println("Obezsin.");
        }
    }
}
