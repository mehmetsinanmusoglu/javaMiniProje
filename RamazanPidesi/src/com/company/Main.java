package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Pide kuyruğu uygulaması");
        Random random = new Random();

        Queue<String> pideKuyrugu = new LinkedList<String>();
        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayşe");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oğuz");
        pideKuyrugu.offer("Azer");

        int pideSayisi = 1 + random.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayisi: " + pideSayisi);
        Thread.sleep(3000);

        while (pideSayisi != 0) {
            System.out.println(pideKuyrugu.poll() + " pideyi aldı.");
            pideSayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı!");



    }
}
