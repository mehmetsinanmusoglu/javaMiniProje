package com.company;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    private static void islemleriBastir() {
        String islemler = "\t 0-İşlemleri görüntüle" +
                "\t 1-Şarkıcıları görüntüle" +
                "\t 2-Şarkıcı Ekle" +
                "\t 3-Şarkıcı Güncelle" +
                "\t 4-Şarkıcı Sil" +
                "\t 5-Şarkıcı Ara" +
                "\t 6-Uygulamadan Çık";

        System.out.println(islemler);
    }

    private static void sarkicilari_goruntule() {
        sarkicilar.sarkicilariBastir();

    }

    private static void sarkiciEkle() {
        System.out.println("Eklemek istediğniz şarkıcının ismi:");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    private static void sarkiciGüncelle() {
        System.out.println("Güncellemek istediğiniz şarkıcının pozisyonu (1,2,3)");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ŞArkıcının yeni simini giriniz.");
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeni_isim, pozisyon - 1);
    }

    private static void sarkiciSil() {
        System.out.println("Silmek istediğiniz pzisyon.");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon - 1);
    }

    private static void sarkiciAra() {
        System.out.println("Aramak istediğniz Şarkıcının ismini giriniz: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {
        System.out.println("\t Şarkıcı uygulaması başlatılıyor.");
        islemleriBastir();

        boolean cikis = false;
        int islem;
        while (!cikis) {
            System.out.println("Bir işlem seçiniz: ");

            islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGüncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    System.out.println("Uygulamadan çıkılıyor.");
                    cikis = true;
                    break;
                default:
                    System.out.println("Yanlış bir işlem girdiniz tekrar deneyiniz");
            }
        }

    }

}
