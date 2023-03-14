package Kodluyoruz;

import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {
        //Ucak Bileti Hesaplama
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        //Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int yas, mesafe = 0, tip;
        double indirimY,indirimT, indirimF, biletF,sonF;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Gideneceğiniz Yerin Km Mesafesini Giriniz :  ");
        mesafe = scan.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz : ");
        yas = scan.nextInt();

        System.out.println("Lütfen Bilet Türünüzü Gidiş-Dönüş İse 1'e \n Biletiniz Sadece Gidiş İse 2'ye Basınız \n Lütfen Bilet Türünüzü Giriniz ");
        tip = scan.nextInt();

        if (yas < 0 || mesafe < 0 || tip <= 0 || tip > 3) {
            System.out.println("Hatalı Veri Girişi Yaptınız :( ");
        }
        if(yas < 12){
            if(tip == 1) {
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.50);
                System.out.println("Bilet Fiyatınız : " + indirimY);
            }else{
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.50);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else if(yas >= 12 && yas < 24){
            if(tip == 1) {
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.10);
                sonF = (indirimF - indirimY);
                System.out.println("Bilet Fiyatınız : " + sonF);
            }else {
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.10);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else if(yas > 65){
            if(tip == 1){
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.30);
                sonF = (indirimF - indirimY);
                System.out.println("Bilet Fiyatınız : " + sonF);
            }else {
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.30);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else{
            System.out.println("Program Bitti.....");
        }

        }

    }

