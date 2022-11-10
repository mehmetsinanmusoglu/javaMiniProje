package com.company;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("Şarkıcı listesinde " + sarkici_listesi.size() + " kadar şarkıcı var.");

        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i + 1) + ".Şarkıcı : " + sarkici_listesi.get(i));
        }
    }

    public void sarkiciEkle(String isim) {
        sarkici_listesi.add(isim);

        System.out.println("Şarkıcı listeye eklendi.");
    }

    public void sarkiciGuncelle(String yeni_isim, int pozisyon) {
        sarkici_listesi.set(pozisyon, yeni_isim);

        System.out.println("Şarkıcı listesi güncellendi. ");
    }

    public void sarkiciSil(int pozisyon) {
        String isim = sarkici_listesi.get(pozisyon);

        sarkici_listesi.remove(pozisyon);

        System.out.println(isim + " isimli şarkıcı listeden silindi");
    }

    public void sarkici_ara(String sarkici_isim) {
        int pzisyon = sarkici_listesi.indexOf(sarkici_isim);

        if (pzisyon >= 0) {
            System.out.println("Şarkıcı bulundu");
            System.out.println(sarkici_isim + " isimli şarkıcı " + (pzisyon + 1) + ". pozisyonda.");
        } else {
            System.out.println("Şarkıcı bulunamadı!");
        }
    }
}
