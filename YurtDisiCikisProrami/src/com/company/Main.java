package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiya Gökçen havalimanına hoş geldiniz.");

        String sartlar = "Yurtdışı Çıkış Kuralları : \n" +
                "Herhangi bir siyasi yasağınız bulmaması gerekiyor\n" +
                "15 Tl harç bedelini tam olarak yatırmanız gerekiyor\n" +
                "Gideceğiniz ülkeye vizeniz bulunması gerekiyor.";
        String message = "Yurtdışı şartlarını tamamlamanız gerekiyor.";
        while (true){
            System.out.println("************************************");
            System.out.println(sartlar);
            System.out.println("************************************");



            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor.");
            Thread.sleep(3000);

            if (yolcu.yurdisiHarciKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor.");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(3000);
            if(yolcu.vizeDurumKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam. Yurtdışına çıkabilirsiniz.");
            break;

        }

    }
}
