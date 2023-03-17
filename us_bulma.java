package Kodluyoruz;
import java.util.Scanner;

public class us_bulma {
    public static void main(String[] args) {
        //Java'da Üslü Sayı Bulma

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
    }
}
