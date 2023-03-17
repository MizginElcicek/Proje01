package Kodluyoruz;
import java.util.Scanner;

public class armstrong_sayi {
    public static void main(String[] args) {
        //Armstrong Sayı
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int numara = scan.nextInt();
        int basamakNumara = 0;
        int geciciNumara = numara;
        int basamakDegeri;
        int toplam = 0;
        int kuvvet;

        while (geciciNumara != 0) {
            geciciNumara /= 10;
            basamakNumara++;
        }

        geciciNumara = numara;
        while (geciciNumara != 0) {
            basamakDegeri = geciciNumara % 10;
            kuvvet = 1;
            for (int i = 1; i <= basamakNumara; i++) {
                kuvvet *= basamakDegeri;
            }
            toplam += kuvvet;
            geciciNumara /= 10;
        }

        if (toplam == numara) {
            System.out.println(numara + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(numara + " sayısı bir Armstrong sayısı değildir.");
        }



    }
}
