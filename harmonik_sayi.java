package Kodluyoruz;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class harmonik_sayi {
    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program

        int sayi;
        double toplam = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Gİriniz : ");
        sayi = scan.nextInt();

        for(double i = 1; i <= sayi; i++) {
            toplam += (1 / i);
        }

        System.out.println(sayi + " Sayısıın Harmonik Ortlaması : " + toplam);
    }
}
