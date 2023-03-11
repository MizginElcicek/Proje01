package Kodluyoruz;

import java.util.Scanner;

public class sayi_siralama {

    public static void main(String[] args) {

        //Kullanıcıdan üç sayıyı küçükten büyüğe sıralama

        int a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sıralamak istediğiniz ilk sayıyı giriniz : ");
        a = scan.nextInt();

        System.out.println("Lütfen sıralamak istediğiniz ikinci sayıyı giriniz : ");
        b = scan.nextInt();

        System.out.println("Lütfen sıralmak istediğiniz ikinci sayıyı giriniz : ");
        c = scan.nextInt();

        if(a<b && a<c){
            System.out.println("a sayısı en küçük sayıydır : " + a);
        }else if(b<a && b<c){
            System.out.println("b sayısı en küçük sayıdır : " + b);
        }else{
            System.out.println("c sayısı en küçük  sayıdır : " + c);
        }
    }
}
