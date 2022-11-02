package com.company;

public class Hesap {
    String isim;
    String parola;
    int bakiye;

    public Hesap(String isim, String parola, int bakiye) {
        this.isim = isim;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraCek(int a) {
        if (bakiye >= a) {
            bakiye -= a;
            System.out.println("Yeni bakiye: " + bakiye);

        } else {
            System.out.println("Yeterli bakiyeye sahip değilsin.");
        }
    }

    public void paraYatir(int a) {
        bakiye += a;
        System.out.println("Yeni bakiye: " + bakiye);


    }
}
