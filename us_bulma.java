package Kodluyoruz;
import java.util.Scanner;

public class us_bulma {
    public static void main(String[] args) {
        //Java'da Üslü Sayı Bulma

        //For DÖngüsü ile

        int sayi1,sayi2,us = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Üssü Alınacak Sayıyı Giriniz : ");
        sayi1  = scan.nextInt();

        System.out.println("Lütfen Üs Sayısını Seçiniz : ");
        sayi2 = scan.nextInt();

        for(int i = 1; i <= sayi2; i++){
            us *= sayi1;
        }
        System.out.println(sayi1 + " Sayısının Üssü : " + us);


        System.out.println("+++++++++++++++++++++");

        //While DÖngüsü ile

        int sayi3,sayi4,uss = 1;

        Scanner scann = new Scanner(System.in);

        System.out.println("Lütfen Üssü Alınacak Sayıyı Giriniz : ");
        sayi3  = scann.nextInt();

        System.out.println("Lütfen Üs Sayısını Seçiniz : ");
        sayi4 = scann.nextInt();

        int i = 1;
        while(i <= sayi4){
            uss *= sayi1;
            i++;

        }
        System.out.println(sayi1 + " Sayısının Üssü : " + us);
    }
}
