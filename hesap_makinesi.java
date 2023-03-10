package Kodluyoruz;

import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        // if-else Yapısı ile hesap makinesi

        double islem, sayi1, sayi2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen işlem yapmak istediğiniz ilk sayıyı seçiniz : ");
        sayi1 = scan.nextDouble();

        System.out.println("Lütfen işlem yapmak istediğin ikinci sayıyı giriniz : ");
        sayi2 = scan.nextDouble();

        System.out.println("***Toplamama İşlemi İçin 1'e Basınız \n Çıkarma İşlemi İçin 2'ye Basınız \n" +
                " Çarpma İşlemi İçin 3'e Basınız \n Bölme İşlemi İçin 4'e Basınız \n *LÜTFEN BİR İŞLEM SEÇİNİZ :  ****");
        islem = scan.nextDouble();

        if (islem == 1) {
            System.out.println("Toplama İşlemi Sonucu : " + (sayi1 + sayi2));
        }else if (islem == 2) {
            if(sayi1<sayi2){
                System.out.println("Lütfen Geçerli Bir Sayı Giriniz !!!");
            }else {
                System.out.println("Çıkarma İşlemi Sonucu : " + (sayi1 - sayi2));
            }
        }else if (islem == 3) {
            System.out.println("Çarpma İşlem Sonucu : " + (sayi1 * sayi2));
        }else if(islem == 4){
            if(sayi1<sayi2){
                System.out.println("Lütfen Geçerli Bir Sayı Giriniz !!!");
            }else {
                System.out.println("Bölme İşlemi Sonucu : " + (sayi1 / sayi2));
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız !!!");
        }


    }
}
