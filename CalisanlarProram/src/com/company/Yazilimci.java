package com.company;

public class Yazilimci extends Calisan {
    private String diller;

    public Yazilimci(String isim, String soyAd, int id, String diller) {
        super(isim, soyAd, id);
        this.diller = diller;
    }

    public void formatAt(String isletimSistemi) {
        System.out.println(getIsim() + " " + isletimSistemi + "yüklüyor...");
    }

    @Override
    public void CalisanBilgileri() {
        super.CalisanBilgileri();
        System.out.println("Yazılımcının bildiği diller : " + diller);
    }
}
