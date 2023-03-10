package Kodluyoruz;

import java.util.Scanner;

public class hesap_makinesiS {
    public static void main(String[] args) {
        // Switch - Case ile hesap makinesi

        int islem, sayi1, sayi2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen işlem yapmak istediğiniz ilk sayıyı seçiniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Lütfen işlem yapmak istediğin ikinci sayıyı giriniz : ");
        sayi2 = scan.nextInt();

        System.out.println("***Toplamama İşlemi İçin 1'e Basınız \n Çıkarma İşlemi İçin 2'ye Basınız \n" +
                " Çarpma İşlemi İçin 3'e Basınız \n Bölme İşlemi İçin 4'e Basınız \n *LÜTFEN BİR İŞLEM SEÇİNİZ :  ****");
        islem = scan.nextInt();


        switch(islem) {
            case 1 :
                System.out.println("Toplama İşlemi Sonucu : " + (sayi1 + sayi2));
                break;
            case 2 :
                System.out.println("Çıkarma İşlemi Sonucu : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu : " + (sayi1 * sayi2));
                break;
            case 4 :
                System.out.println("Bölme İşlemi Sonucu : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı Girişi !!! ");
                break;
        }






    }
}
