package com.company;

public class Main {

    public static void main(String[] args) {
        Hesap hesap1 = new Hesap("ali", "112270", 10000);
        //Hesap hesap2 = new Hesap("onur", "112021", 15000);
        //Hesap hesap3 = new Hesap("sinan", "112609", 15000);
        ATM atm = new ATM();
        atm.calis(hesap1);
        System.out.println("Bizi tercih etiğiniz için teşakkür ederiz.");
    }
}
