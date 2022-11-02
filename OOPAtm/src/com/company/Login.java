package com.company;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = scanner.next();
        System.out.print("Parolanızı giriniz:");
        parola = scanner.next();

        if (hesap.getIsim().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }

    }
}
