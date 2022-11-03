package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Bilgi isleme hoş geldiniz.");
        System.out.println("********************");

        String islemler = "1. Yönetici işlemleri" + " 2. Yazılımcı işlemleri" + " 3. Calışan işelemleri" + " 4. Çıkış";
        String yönIslem = "1. Bilgileri göster." + " 2. Zam yap." + " 3. Yönetici işlemlerinden çıkış yap.";
        String yazilimciIslem = "1. Bilgileri göster." + " 2. Format At." + " 3.Yazılımcı işelmelerinden çıkış yap.";
        String calisanIslemleri = "1.Bilgileri göster." + " 2.Çalışan işlemlerinde çıkış yap";
        while (true) {
            System.out.println(islemler);
            System.out.println("Bir işlem seçiniz:");
            int islem = scanner.nextInt();
            if (islem ==4){
                System.out.println("Sistemden çıkılıyor...");
                break;
            }else if (islem == 1){
                Yönetici yönetici = new Yönetici("Sinan", "Muşoğlu", 6009,90);
                while (true) {
                    System.out.println(yönIslem);
                    System.out.println("Bir işlem seçiniz:");
                    int yönislem = scanner.nextInt();

                    if (yönislem == 3){
                        break;
                    }else if (yönislem == 1){
                        yönetici.CalisanBilgileri();
                    }else if (yönislem == 2){
                        System.out.println("Nekadar zam yapılacak.");
                        int zamMiktar = scanner.nextInt();
                        yönetici.zamYap(zamMiktar);

                    }else {
                        System.out.println("Yanlış bir seçim yaptınız.");
                    }

                }

            }else if (islem == 2){
                Yazilimci yazilimci = new Yazilimci("Onur", "Kurt", 6011, "java, javaScript, HTML, CSS");
                while (true){
                    System.out.println(yazilimciIslem);
                    System.out.println("Bir işlem seçiniz:");
                    int yazmislem = scanner.nextInt();
                    if (yazmislem == 3){
                        break;
                    }else if (yazmislem == 1){
                        yazilimci.CalisanBilgileri();
                    }else if (yazmislem == 2){
                        System.out.println("Lütfen işletim sistemini giriniz : ");
                        String isletimsistem = scanner.next();
                        yazilimci.formatAt(isletimsistem);
                    }else {
                        System.out.println("Yanlış bir seçim yaptınız.");
                    }
                }
            }else if (islem == 3){
                Calisan calisan = new Calisan("Ali", "Torun", 6052);
                while (true){
                    System.out.println(calisanIslemleri);
                    System.out.println("Bir işlem seçiniz:");
                    int calisanislem = scanner.nextInt();
                    if (calisanislem == 1){
                        calisan.CalisanBilgileri();
                    }else if (calisanislem == 2){
                        break;
                    }else {
                        System.out.println("Yanlış bir işlem seçtiniz.");
                    }
                }
            }else {
                System.out.println("Yanlış bir işlem seçtiniz.");
            }
        }
    }
}
