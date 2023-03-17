package Kodluyoruz;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        // Java ile kombinasyon hesaplayan program yazınız.

        int sayi1,sayi2,fak1 = 1,fak2 = 1,fak3 = 1,kom = 1;
        //int sayi3 = sayi1 - sayi2;


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz : ");
        sayi2 = scan.nextInt();

        for(int i = 1; i <= sayi1; i++){
            fak1 *= i;
        }
        for(int k = 1; k <= sayi2; k++){
            fak2 *= k;
        }
        int sayi3 = sayi1 - sayi2;
        for(int a = 1; a <= sayi3; a++){
            fak3 *= a;
        }

        kom = fak1/(fak2*(fak3));

        System.out.println("Kombinasyon : " + kom);

    }
}
