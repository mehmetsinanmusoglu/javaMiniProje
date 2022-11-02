package com.company;

public class Main {
    public static boolean asalBul(int sayi){

        for (int i = 2; i < sayi; i++){
            if((sayi % i) == 0){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++){
            if (asalBul(i)){
                System.out.println(i);
            }
        }
    }
}
