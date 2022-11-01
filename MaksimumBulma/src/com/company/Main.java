package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        int c = scanner.nextInt();
        int max = -1;
        int min = -1;
        if (a >= b && a >= c){
            max = a;
        }else if (b >=a && b >= c){
            max = b;
        }else {
            max = c;
        }
        if(a <= c && a <= b ){
            min = a;

        }else if(b <= c && b <= a){
            min = b;
        }else {
            min = c;
        }

        System.out.println("En büyük olan : " + max + ", En küçük olan : " + min );

    }
}
