package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler\n"+
                          "1.Bakiye sorgulama\n"+
                          "2.Para yatırma\n" +
                          "3.Para çekme\n" +
                          "4.Çıkş\n";
        int bakiye = 10000;
        System.out.println("Şuan bakiyeniz : " + bakiye);
        boolean q = true;
        while (q){
            System.out.println("************");
            System.out.print(islemler + "Yapmak istediğiniz işlemi seçiniz :");
            String islem = scanner.nextLine();
            if (islem.equals("4")){
                q = false;
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }else if (islem.equals("2")){
                System.out.println("Yatımak istediğiniz tutarı giriniz : ");
                int a = scanner.nextInt();
                scanner.nextLine();
                bakiye += a;
                System.out.println("Yeni bakiyeniz : " + bakiye);

            }else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı söyleyin : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                if (bakiye < b){
                    System.out.println("Bakiyeniz yeterli değil.");
                }else {
                    bakiye -= b;

                }
                System.out.println("Yeni bakiyeniz : " + bakiye);

            }else {
                System.out.println("Yanlış bir işlem girdiniz.");
            }


        }
    }
}
