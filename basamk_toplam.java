package Kodluyoruz;

import java.util.Scanner;

public class basamk_toplam {
    public static void main(String[] args) {
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Scanner scan = new Scanner(System.in);

        int numara;
        int basNumara = 0;
        int toplam = 0;
        int basDeger = 0 ;

        System.out.println("Lütfen Bir Değer Giriniz : ");
        numara = scan.nextInt();
        int geciciNumara = numara;

        while(geciciNumara != 0){
            geciciNumara /= 10;
            basNumara++;
        }
        //System.out.println(basNumara);

        geciciNumara = numara;
        while(geciciNumara != 0){
           basDeger = geciciNumara % 10;
            toplam += basDeger;
            geciciNumara /= 10;
        }

        System.out.println(numara + " Sayısının Basamak Toplamı : " + toplam);


    }
}
