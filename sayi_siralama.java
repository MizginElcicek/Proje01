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
            if(b<c){
            System.out.println("Sayı Sıralaması : a < b < c");
             }else {
                System.out.println("Sayı Sıralaması : a < c < b");
            }
        }else if(b<a && b<c){
            if(a<c){
            System.out.println("Sayı Sıralaması : b < a < c");
            }else {
                System.out.println("Sayı Sıralaması : b < c < a");
            }
        }else if(c<a && c<b){
            if(b<a){
                System.out.println("Sayı Sıralaması : c < b < a");
            }else {
                System.out.println("Sayı Sıralaması : c < a < b");
            }
        }
    }
}
