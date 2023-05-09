package Kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class dizi_girilenKucuk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi;

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz :");
        sayi = scan.nextInt();

        int[] list = {0,2,5,6,4,8,9,30};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);

        int kucuk = list[0];
        int  buyuk = list[7];


        for(int i: list){
            if(i < sayi){
                kucuk = i;
            }
            if(i < buyuk && i > sayi){
                buyuk = i;
            }

        }
        System.out.println("Minumum Sayı : " + kucuk);
        System.out.println("Maxsimum Sayı : " + buyuk);
    }
}
