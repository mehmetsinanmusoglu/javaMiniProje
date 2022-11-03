package com.company;

public class Yönetici extends Calisan{
    private int sorumluKisiSayisi;

    public Yönetici(String isim, String soyAd, int id, int sorumluKisiSayisi) {
        super(isim, soyAd, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void CalisanBilgileri() {
        super.CalisanBilgileri();
        System.out.println("Sorumlu olduğu kişi sayısı : " + sorumluKisiSayisi);
    }
    public void zamYap(int zamMikatri){
        System.out.println(getIsim() + " yönetici" + zamMikatri + " kadar zam yaptı.");
    }
}
