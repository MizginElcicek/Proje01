package Kodluyoruz;
import java.util.Scanner;
public class faktoryel {
    public static void main(String[] args) {
        //Java ile faktöriyel hesaplayan program yazıyoruz.

        int sayi,fak = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz: ");
        sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++){
            fak *= i;
        }
        System.out.println(sayi + " Faktoryel : " + fak);
    }
}
