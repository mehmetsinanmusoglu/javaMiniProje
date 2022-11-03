package com.company;

public class Calisan {
    private String isim;
    private String soyAd;
    private int id;

    public Calisan(String isim, String soyAd, int id) {
        this.isim = isim;
        this.soyAd = soyAd;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void CalisanBilgileri(){
        System.out.println("Çalışan Biligiler : \n isim : " + isim + "\n soyisim : " + soyAd + "\n İd : " + id );
    }
}
