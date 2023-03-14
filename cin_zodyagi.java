package Kodluyoruz;

import java.util.Scanner;

public class cin_zodyagi {
    public static void main(String[] args) {
        //Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program
        //4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        //Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        //Doğum Tarihi %12 = 0 ➜ Maymun
        //Doğum Tarihi %12 = 1 ➜ Horoz
        //Doğum Tarihi %12 = 2 ➜ Köpek
        //Doğum Tarihi %12 = 3 ➜ Domuz
        //Doğum Tarihi %12 = 4 ➜ Fare
        //Doğum Tarihi %12 = 5 ➜ Öküz
        //Doğum Tarihi %12 = 6 ➜ Kaplan
        //Doğum Tarihi %12 = 7 ➜ Tavşan
        //Doğum Tarihi %12 = 8 ➜ Ejderha
        //Doğum Tarihi %12 = 9 ➜ Yılan
        //Doğum Tarihi %12 = 10 ➜ At
        //Doğum Tarihi %12 = 11 ➜ Koyun

        int dogumY;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Doğum Yılınızı Giriniz :  ");
        dogumY = scan.nextInt();

        if(dogumY % 12 == 0){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Maymun ");
        }else if(dogumY % 12 == 1){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Horuz ");
        }else if(dogumY % 12 == 2){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Köpek ");
        }else if(dogumY % 12 == 3){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Domuz ");
        }else if(dogumY % 12 == 4){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Fare ");
        }else if(dogumY % 12 == 5){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Öküz ");
        }else if(dogumY % 12 == 6){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Kaplan ");
        }else if(dogumY % 12 == 7){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Tavşan ");
        }else if(dogumY % 12 == 8){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Ejderha ");
        }else if(dogumY % 12 == 9){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Yılan ");
        }else if(dogumY % 12 == 10){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : At ");
        }else if(dogumY % 12 == 11){
            System.out.println("Çin Zodayğı Hesap Sonucunuz : Koyun ");
        }
    }
}
