package Kodluyoruz;

import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        //For Döngüsü ile ebob - ekok

        int sayi1, sayi2,ebob = 1,ekok;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz İlk Sayıyı Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Lütfen Hesaplamak İstediğiniz İkinci Sayıyı Giriniz : ");
        sayi2 = scan.nextInt();

        for (int i = 1; i <= sayi1; i++) {
          if(sayi1 % i == 0 && sayi2 % i == 0){
              ebob = i;
          }
        }

        System.out.println("Sayıların EBOB'u : " + ebob);

        ekok = (sayi1 * sayi2)/ebob;
        System.out.println("Sayıların EKOK'u : " + ekok);
    }
}