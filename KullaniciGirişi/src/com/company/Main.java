package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sys_isim = "emre aslan";
        String sys_sfr = "1993";
        int girisHakki = 3;

        System.out.println("********************");
        System.out.println("Kullanıcı Girişine hoşgeldiniz.");
        System.out.println("********************");
        while (true) {
            System.out.print("Lütfen kullanıcı adını giriniz : ");
            String isim = scanner.nextLine();

            System.out.print("Lütfen kullanıcı adını giriniz : ");
            String sfr = scanner.nextLine();

            if (sys_isim.equals(isim) && sys_sfr.equals(sfr)) {
                System.out.println("Hoş geldiniz.");
                break;
            } else if (sys_isim.equals(isim) && !(sys_sfr.equals(sfr))) {
                System.out.println("Şifreniz yanlış.");
                girisHakki--;
            } else if (!(sys_isim.equals(isim)) && sys_sfr.equals(sfr)) {
                System.out.println("Kullanıcı adınız yanlış.");
                girisHakki--;
            } else {
                System.out.println("Bilgileriniz kayıtlı değil.");
                girisHakki--;
            }
            if (girisHakki == 0) {
                System.out.println("3 Defa yanlış girdiniz. Giriş hakkınız bitti.");
                break;
            }
            System.out.println("Kalan giriş kınız : " + girisHakki);

        }
    }
}
