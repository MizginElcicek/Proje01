package Kodluyoruz;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program

        int ilkS,sonS;
        int a = 0,b =1,c = 0;
        int sayac  = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Başlangıç Sayısını Giriniz : ");
        ilkS = scan.nextInt();

        System.out.println("Lütfen Son Sayı Aralığını Giriniz : ");
        sonS = scan.nextInt();

        while(c<sonS){
            c = a + b;
            if(c>ilkS && c<sonS){
                System.out.println(sayac + ". Adımdaki Fibonacci Sayı : " + c);
            }
            sayac++;

            a = b;
            b = c;
        }
    }
}
