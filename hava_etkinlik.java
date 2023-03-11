package Kodluyoruz;

import java.util.Scanner;

public class hava_etkinlik {
    public static void main(String[] args) {
        //Hava Durumuna Göre Etkinlik Önerisi
        //koşullar :
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öneriyor.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" incelemesi öneriliyor.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" görüşmesini öneriyor.
        //Sıcaklık 25'ten büyük ise "Yüzme" görüşü öneriyor.

        double der;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hava Sıçaklığını Giriniz : ");
        der = scan.nextDouble();

        if(der<5){
            System.out.println("Hava Bugün Kayak Yapmak İçin Çok Uygun :) ");
        }else if(der>=5 && der<15){
            System.out.println("Hava Bugün Sinemaya Gitmek İçin Çok Uygun :) ");
        }else if(der>=15 && der<25){
            System.out.println("Hava Bugün Piknik Yapmak İçin Çok Uygun :) ");
        }else if(der>=25){
            System.out.println("Hava Bugün Yüzmek İçin Çok Uygun :) ");
        }
    }
}
