package Kodluyoruz;

import java.util.Scanner;

public class uc_dort_kat {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        //3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int sayi,toplam  = 0 ,sayac = 0,ort;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz :  ");
        sayi = scan.nextInt();

        for(int i = 1; i<=sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                sayac++;
                System.out.println("Bulunan Sayılar : " + i);
            }
        }
        ort = toplam/sayac;

        System.out.println("Üç ve Dörde Tam Bölünen Sayıların Ortalaması : " + ort);

    }
}
