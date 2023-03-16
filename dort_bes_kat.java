package Kodluyoruz;

import java.util.Scanner;

public class dort_bes_kat {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int sayi;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfne Bir Sayı Giriniz : ");
        sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i *= 4){
            System.out.println("Dördün Kuvveti : " + i);

        }

        System.out.println("+++++++++++");

        for(int k = 1; k <= sayi; k *= 5) {
            System.out.println("Beşin Kuvveti : " + k);
        }
    }
}
