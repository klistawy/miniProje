import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList array = new ArrayList();

        String oyuncuKartlar = "a";

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



           //krupiyer
        String kartKrupiyer1 = kartOlustur();
        String kartKrupiyer2 = kartOlustur();
        System.out.println("Krupiyerin Kartları: Kapalı - " + kartKrupiyer1);
        System.out.println("-------------------------------- ");


            //oyuncular

        ArrayList<String> oyuncuKartlari = new ArrayList<String>();

        if (kisiSayisi == 1) {
            String kartOyuncu1 = kartOlustur();
            String kartOyuncu2 = kartOlustur();
            System.out.println(kisiler[0] + " Kartları: " + kartOyuncu1 + " - " + kartOyuncu2);
            System.out.println("-------------------------------- ");
        } else {
            for (int i = 0; i < kisiler.length; i++) {
                String oyuncuKart1 = kartOlustur();
                String oyuncuKart2 = kartOlustur();
                oyuncuKartlar = kisiler[i]+": "+oyuncuKart1+ " - " +oyuncuKart2;
                System.out.println(oyuncuKartlar);
                oyuncuKartlari.add(oyuncuKartlar);

            }
        }
        System.out.println("--------------------------------");









    }


    public static String kartOlustur() {

        Random rand = new Random();

        //karta değer atama

        int sayiDeger = rand.nextInt(13) + 1;
        String kartDeger = "";

        if (sayiDeger == 1) {
            kartDeger = "A";
        } else if (sayiDeger == 2) {
            kartDeger = "2";
        } else if (sayiDeger == 3) {
            kartDeger = "3";
        } else if (sayiDeger == 4) {
            kartDeger = "4";
        } else if (sayiDeger == 5) {
            kartDeger = "5";
        } else if (sayiDeger == 6) {
            kartDeger = "6";
        } else if (sayiDeger == 7) {
            kartDeger = "7";
        } else if (sayiDeger == 8) {
            kartDeger = "8";
        } else if (sayiDeger == 9) {
            kartDeger = "9";
        } else if (sayiDeger == 10) {
            kartDeger = "10";
        } else if (sayiDeger == 11) {
            kartDeger = "J";
        } else if (sayiDeger == 12) {
            kartDeger = "Q";
        } else {
            kartDeger = "K";
        }


        //renk atama

        int sayiRenk = rand.nextInt(4) + 1;
        String kartRenk = "";

        if (sayiDeger == 1) {
            kartRenk = "♥";
        } else if (sayiDeger == 2) {
            kartRenk = "♦";
        } else if (sayiDeger == 3) {
            kartRenk = "♣";
        } else {
            kartRenk = "♠";
        }

        String kart = kartRenk + kartDeger;
        return kart;


    }

}



