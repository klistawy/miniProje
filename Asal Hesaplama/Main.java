import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Mini Proje 1: Sayı Asal Mı?
        //Fonksiyon kullanarak yaptır

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        asalHesaplama(sayi);

    }

    public static void asalHesaplama (int sayi){
        boolean b = false;
        int a = 1;
        for (int i=2; sayi>i; i++) {
            retry:
            if (sayi%i == 0){
                b = true;
                a = i;
                break;
            } else {
                b = false;
                continue;
            }
        }
        if (b){
            System.out.println("Girilen sayı asal değildir. Sayınız "+a+" sayısına tam bölünebiliyor.");
        } else {
            System.out.println("Girilen sayı asaldır.");
        }
    }
}