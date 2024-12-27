import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList array = new ArrayList();

        System.out.println("Yeni oyuna hoşgeldiniz. Kaç kişi oynuyorsunuz?");
        int kisiSayisi = scan.nextInt();
        String[] kisiler = new String[kisiSayisi];

        //isimleri alma
        System.out.println("İsimlerinizi giriniz: ");
        for (int i = 0; i < kisiler.length; i++) {
            if (i == kisiler.length) {
                break;
            } else {
                kisiler[i] = scan.next();
            }
        }

        //krupiyer kartları
        String renkKrupiyer1 = kartRenk();
        String renkKrupiyer2 = kartRenk();

        int degerKrupiyer1 = kartDeger();
        int degerKrupiyer2 = kartDeger();

        System.out.println("Krupiyerin Kartları: Kapalı - " + renkKrupiyer1 + degerKrupiyer1);
        System.out.println("-------------------------------- ");


        //oyuncular
        ArrayList<String> oyuncuKartlari = new ArrayList<String>();
        String oyuncuKartlar = "a";

        if (kisiSayisi == 1) {
            String renkOyuncu1 = kartRenk();
            String renkOyuncu2 = kartRenk();

            int degerOyuncu1 = kartDeger();
            int degerOyuncu2 = kartDeger();

            System.out.println(kisiler[0] + " Kartları: " + renkOyuncu1 + degerOyuncu1 + " - " + renkOyuncu2 + degerOyuncu2);
            System.out.println("-------------------------------- ");
        } else {
            for (int i = 0; i < kisiler.length; i++) {
                String renkOyuncu1 = kartRenk();
                String renkOyuncu2 = kartRenk();

                int degerOyuncu1 = kartDeger();
                int degerOyuncu2 = kartDeger();

                oyuncuKartlar = kisiler[i] + ": " + renkOyuncu1 + degerOyuncu1 + " - " + renkOyuncu2 + degerOyuncu2;
                System.out.println(oyuncuKartlar);
                oyuncuKartlari.add(oyuncuKartlar);

            }
        }


    }


    public static String kartRenk() {

        Random rand = new Random();

        int sayiRenk = rand.nextInt(4) + 1;
        String kartRenk = "";

        if (sayiRenk == 1) {
            kartRenk = "♥";
        } else if (sayiRenk == 2) {
            kartRenk = "♦";
        } else if (sayiRenk == 3) {
            kartRenk = "♣";
        } else {
            kartRenk = "♠";
        }

        return kartRenk;
    }

    public static int kartDeger() {

        Random rand = new Random();
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int sayiDeger = 0;
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rand.nextInt(13) + 1;
            sayiDeger = sayilar[i];
        }
        return sayiDeger;
    }

    public static String kartOlustur() {

        String kart = kartRenk() + kartDeger();
        return kart;
    }

}