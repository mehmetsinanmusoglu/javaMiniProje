package com.company;

public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikaye;

    private int oncelik;

    public Hasta(String isim, String sikaye) {
        this.isim = isim;
        this.sikaye = sikaye;

        if (sikaye.equals("Apandisit")) {
            this.oncelik = 3;

        } else if (sikaye.equals("Yanık")) {
            this.oncelik = 2;

        } else {
            this.oncelik = 1;
        }
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "isim='" + isim + '\'' +
                ", sikaye='" + sikaye + '\'' +
                ", oncelik=" + oncelik +
                '}';
    }

    @Override
    public int compareTo(Hasta hasta) {


        if (this.oncelik > hasta.oncelik) {
            return -1;

        } else if (this.oncelik < hasta.oncelik) {
            return 1;
        } else {
            return 0;
        }

    }
}
