package Kodluyoruz;

import java.util.Scanner;

public class muk_sayi {
    public static void main(String[] args) {
        //Mükemmel Sayı
        //Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.
        //Örneğin : 28 = 1,2,4,7,14 sayılarına tam bölünür.Bu sayıların Toplamı da 28 olduğu için 28 sayısı mükemmel sayıdır.

        int sayi;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstdeğiniz Sayıyı Giriniz : ");
        sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi + " Sayısı Mükemmel Bir Sayıdır :)");
        }else{
            System.out.println(sayi + " Sayısı Mükemmel Bir Sayı Değildir :(");
        }
    }
}
