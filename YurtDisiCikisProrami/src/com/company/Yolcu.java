package com.company;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasağınız var mı ? (evet veya hayır) : ");
        String siyasi_cevap = scanner.nextLine();

        if (siyasi_cevap.equals("evet")) {
            this.siyasiYasak = true;

        } else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet yada hayır):");
        String vize_cevap = scanner.nextLine();

        if (vize_cevap.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;

        }

    }

    @Override
    public boolean yurdisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen yurtdışı harcını tam yatırın!");
            return false;

        } else {
            System.out.println("Yurtdışı harcı tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor yurt dışına çıkamazsınız.");
            return false;
        } else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam.");
            return true;
        } else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır");
            return false;
        }
    }
}
