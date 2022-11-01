import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz :");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu giriniz :(örnek: 1,85) ");
        double boy = scanner.nextDouble();

        double bki = kilo / ( boy* boy);
        System.out.println("Beden kitle endeksiniz: " + bki);
    }
}
