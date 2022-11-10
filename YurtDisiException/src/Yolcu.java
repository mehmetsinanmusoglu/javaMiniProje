import java.util.Scanner;

class SiyasiExceptin extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor.");
    }
}
class VizeExceptin extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Gideğiniz ülkeye vizeniz bulunuyor.");
    }
}
class HarcExceptin extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Yurt Dışı Harcını tam yatırın.");
    }
}
public class Yolcu {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasağınız var mı ? (evet veya hayır) : ");
        String siyasi_cevap = scanner.nextLine();

        if (siyasi_cevap.equals("evet")) {
            this.siyasiYasak = true;

        } else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet yada hayır):");
        String vize_cevap = scanner.nextLine();

        if (vize_cevap.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;

        }

    }

    public void yurdisiHarciKontrol() throws HarcExceptin {
        if (this.harc < 15) {
        throw  new HarcExceptin();

        } else {
            System.out.println("Yurtdışı harcı tamam.");
        }
    }

    public void siyasiYasakKontrol() throws SiyasiExceptin {
        if (this.siyasiYasak == true) {
            throw new SiyasiExceptin();

        } else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
        }
    }

    public void vizeDurumKontrol() throws VizeExceptin {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam.");
        } else {
            throw new VizeExceptin();
        }
    }
}
