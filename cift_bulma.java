package Kodluyoruz;

import java.util.Scanner;

public class cift_bulma {
    public static void main(String[] args) {
        int sayi;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        sayi = scan.nextInt();

        for (int i = 2; i <= sayi; i += 2) {
            System.out.println("Çift sayılar : " + i);
            //break;
        }
    }
}
