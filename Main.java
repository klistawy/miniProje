import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Oyuna hoşgeldiniz. Kaç kişisiniz?: ");
        int kisiSayisi = scan.nextInt();
        String[] kisiler = new String[kisiSayisi];

            //isimleri alma
        System.out.println("İsimlerinizi giriniz: ");
        for (int i = 0; i<kisiler.length; i++) {
            if (i == kisiler.length){
                break;
            } else {
                kisiler[i] = scan.next();
            }
        }

            //krupiyer kartları
        int degerKrupiyer1 = kartDeger();
        int degerKrupiyer2 = kartDeger();

        String krupiyerKart1 = direkKartinKendisi(kartRenk(), kartDegeriAmaString(degerKrupiyer1));
        String krupiyerKart2 = direkKartinKendisi(kartRenk(), kartDegeriAmaString(degerKrupiyer2));

        System.out.println("Krupiyerin Kartları: Kapalı - "+ krupiyerKart1);

            //kisiye göre kart








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
        int sayiDeger = rand.nextInt(13) + 1;
        int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int kartDeger = sayilar[sayiDeger];


        return kartDeger;
    }

    public static String kartDegeriAmaString (int gelenKart) {

        String sayiAmaString = "";

        if (gelenKart<11) {
            sayiAmaString = String.valueOf(gelenKart);
        } else if (gelenKart == 11) {
            sayiAmaString = "J";
        } else if (gelenKart == 12) {
            sayiAmaString = "Q";
        } else {
            sayiAmaString = "K";
        }

        return sayiAmaString;
    }

    public static String direkKartinKendisi (String renk, String deger) {

        String kartinKendisi = renk+deger;
        return kartinKendisi;
    }


}

