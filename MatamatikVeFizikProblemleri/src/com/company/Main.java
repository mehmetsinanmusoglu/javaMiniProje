package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "İşelmler : \n" +
                "1. Daire alanı hesplama\n" +
                "2. Üçgen çevresi hesaplama\n" +
                "3. 2 vektörün iç çarpımını hesaplama\n" +
                "4. Çıkış";
        while (true) {
            System.out.println(islemler);
            System.out.print("İşlem seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("4")) {
                System.out.println("Sistemden çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlan(yaricap);
            }else if (islem.equals("2")){
                System.out.print("Üçgenin 1. kenarını giriniz:");
                int a = scanner.nextInt();
                System.out.print("Üçgenin 2. kenarını giriniz:");
                int b = scanner.nextInt();
                System.out.print("Üçgenin 3. kenarını giriniz:");
                int c = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(a,b,c);


            }else if (islem.equals("3")){
                Vec vec1 = new Vec("vector1");
                Vec vec2 = new Vec("vector2");

                Problem.Fizik.icCarpim(vec1,vec2);
            }else {
                System.out.println("Geçersiz bir işlem girdiniz.");

            }
        }
    }
}
