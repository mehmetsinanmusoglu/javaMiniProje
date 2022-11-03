package com.company;

public class Idman {

    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

    public Idman(int burpee, int pushup, int situp, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;
    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public void hareketiYap(String hareket, int sayi) {
        if (hareket.equals("burpee")) {
            setBurpee(yap("burpee", getBurpee(), sayi));
        } else if (hareket.equals("pushup")) {
            setPushup(yap("pusup", getPushup(), sayi));
        } else if (hareket.equals("situp")) {
            setSitup(yap("situp", getSitup(), sayi));
        } else if (hareket.equals("squat")) {
            setSquat(yap("squat", getSquat(), sayi));
        } else {
            System.out.println("Yanlış bir hareket girdiniz");
        }

    }

    public int yap(String hareketAdı, int hareket_sayısı, int yapilan_sayi) {
        if (hareket_sayısı == 0) {
            System.out.println("Yapılacak " + hareketAdı + " kalmadı");
        }
        if (hareket_sayısı - yapilan_sayi < 0) {
            System.out.println("Yapılacak " + hareketAdı + "sayısını geçtiniz tebrikler");
            hareket_sayısı = 0;
            return hareket_sayısı;

        } else {
            hareket_sayısı -= yapilan_sayi;
            System.out.println("Kalan " + hareketAdı + " :" + hareket_sayısı);
            return hareket_sayısı;

        }
    }

    public boolean haretlerBitti() {
        return (burpee == 0) && (pushup == 0) && (situp == 0) && (squat == 0);
    }
}
