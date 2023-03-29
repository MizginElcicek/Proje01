package Kodluyoruz;

import java.util.Scanner;

public class gelismis_makine {

    static void top() {
        int sayac = 1;
        int toplam = 0;
        int sayi;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(sayac++ + " . sayı");
            sayi = scan.nextInt();
            if(sayi == 0) {
                break;
            }
            toplam += sayi;
        }
        System.out.println("Sayıların Toplamı : " + toplam);
    }

    static void cik() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int sayac = scan.nextInt();
        int sayi, cik = 0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextInt();
            if (i == 1) {
                cik += sayi;
                continue;
            }
            cik -= sayi;
        }

        System.out.println("Sonuç : " + cik);
    }

    static void carp(){
        int sayac = 1;
        int carp = 1;
        int sayi ;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(sayac ++ + " . Sayı");
            sayi = scan.nextInt();
            if(sayi == 1){
                break;
            }
            carp *= sayi;

        }
        System.out.println("Sayıların Çarpımı : " + carp);
    }
    static void bol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int sayac = scan.nextInt();
        double sayi,bol = 0.0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                bol = sayi;
                continue;
            }
            bol /= sayi;
        }

        System.out.println("Sonuç : " + bol);
    }

    static void fak(){
        int sayi;
        int fak = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz : ");
        sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++){
            fak *= i;
        }
        System.out.println("Sayının Faktoriyeli : " + fak);
    }

    static void us(){
        int sayi1;
        int sayi2;
        int uss = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Üs Sayısını Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Lütfen Hesaplamak İstediğiniz Üssü Olacak Sayıyı Giriniz : ");
        sayi2 = scan.nextInt();

        for(int i = 1; i <= sayi2; i++){
            uss *= sayi1;
        }

        System.out.println("Sayı : " + uss);

    }

    static void mod(){
        int sayi1;
        int sayi2;
        int mod = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İlk Sayıyı Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Lütfen Hesaplamak İstediğiniz İkinci Sayıyı Giriniz : ");
        sayi2 = scan.nextInt();

        mod = sayi1 % sayi2;

        System.out.println("Sayıların Modu : " + mod);
    }

    static void dik(){
        int a,b,c,cevre;
        double u,alan;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Üçgenin İlk Kenarını Giriniz : ");
        a = scan.nextInt();

        System.out.println("Lütfen Üçgenin İkinci Kenarını Giriniz : ");
        b = scan.nextInt();

        System.out.println("Lütfen Üçgenin Üçüncü Kenarını Giriniz : ");
        c = scan.nextInt();

        cevre = a+b+c;
        System.out.println("Üçgenin Çevresi : " + cevre);

        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            islem = scan.nextInt();
            switch (islem) {
                case 1:
                    top();
                    break;
                case 2:
                    cik();
                    break;
                case 3:
                    carp();
                    break;
                case 4 :
                    bol();
                    break;
                case 5:
                    fak();
                    break;
                case 6:
                    us();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dik();
                    break;

            }
        } while (islem != 0);
        System.out.println("Başarılı Bir Şekilde Çıkış Yapıldı :)");


    }
}
