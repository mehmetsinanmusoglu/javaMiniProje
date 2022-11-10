import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda Programına Hoşgeldiniz ....");
        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler : " +
                "1. Kanaları göster\n" +
                "2. Kanal Ekle\n" +
                "3. Kanal Sil\n" +
                "4. Kanal Sayısını Öğren\n" +
                "5. Çıkış";
        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.println(islemler);
            System.out.print("İşlemi giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("5")) {
                System.out.println("Sistemden çıkılıyor ...");
                break;
            } else if (islem.equals("1")) {
                kanalariGöster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print("Eklenecek kanal ismi : ");
                String kanalIsmi = scanner.nextLine();
                kumanda.kanalEkle(kanalIsmi);
            } else if (islem.equals("3")) {
                System.out.print("Silineck Kanal ismi : ");
                String kanal_Sil = scanner.nextLine();
                kumanda.kanalSil(kanal_Sil);
            } else if (islem.equals("4")) {
                System.out.println("Kanal Sayıs" + kumanda.kanalSayisi());

            } else {
                System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }

    }

    public static void kanalariGöster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Şu anda hiçbir kanal bulunmuyor.");
        } else {
            for (String kanal : kumanda) {
                System.out.println("Kanal : " + kanal);
            }
        }
    }
}
