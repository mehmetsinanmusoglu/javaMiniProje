package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void islenleriBastir(){
        System.out.println("0 - İşelmeleri görüntüle.");
        System.out.println("1 - Bir sonraki şehere git.");
        System.out.println("2 - Bir önceki şehre git.");
        System.out.println("3 - Uygulamdan çık.");
    }
    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islenleriBastir();
        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()){
            System.out.println("Herhangi bir Şehir bulunmuyor.");
        }
        boolean cikis = false;
        boolean ileri = true;
        while (!cikis){
            System.out.println("Bir işlem seçiniz: ");
            islem = scanner.nextInt();

            switch (islem){
                case 0:
                    islenleriBastir();
                    break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();

                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehre gidiliyor : " + iterator.next());
                    }else {
                        System.out.println("Gidilecek Şehir kalmadı.");
                        ileri = true;
                        break;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor " + iterator.previous());
                    }else {
                        System.out.println("Şehir turunun başındasın");
                    }
                    break;
                case 3:
                    System.out.println("Sistemden çıkılıyor.");
                    cikis = true;
                    break;
                default:
                    System.out.println("Yanlis bir işlem girdiniz.");
                    break;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        sehirleri_turla(sehirler);

    }
}
