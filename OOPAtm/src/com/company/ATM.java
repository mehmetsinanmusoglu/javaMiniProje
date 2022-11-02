package com.company;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        int gishakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Bankamatiğe hoş geldiniz");
                break;
            } else if (gishakki > 1) {
                System.out.println("lütfen tekrar deneyiniz.");
                gishakki--;
                System.out.println("Kalan hakkınız: " + gishakki);
            } else {
                System.out.println("Giris Hakknız kalmadı.");
                return;
            }
        }

        while (true) {
            System.out.println("******************");
            System.out.println("islemenizi seçiniz \n 1.Bakiye sorgula 2.Para çek 3.Para yatır 4.Çıkış");
            String islem = scanner.next();
            if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.print("Çekmek istediğniz tutar:");
                int cek = scanner.nextInt();
                hesap.paraCek(cek);
            }else if (islem.equals("3")){
                System.out.print("Yatırılacak tutar:");
                int yatir = scanner.nextInt();
                hesap.paraYatir(yatir);
            }else if (islem.equals("4")){
                break;
            }else {
                System.out.println("Olmayan bir işlem sçtiniz.");
            }
        }


    }
}
