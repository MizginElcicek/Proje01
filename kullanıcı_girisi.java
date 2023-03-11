package Kodluyoruz;

import java.util.Scanner;

public class kullanıcı_girisi {
    public static void main(String[] args) {
        //Kullanıcı Girişi

        int kullanıcıSifre;
        String kullanıcıIsmi;
        int islem = 0;
        int yeniSifre = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı İsminizi Giriniz : ");
        kullanıcıIsmi = scan.next();

        System.out.println("Lütfen Kullanıcı Şifrenizi Giriniz: ");
        kullanıcıSifre = scan.nextInt();

        if (!kullanıcıIsmi.equals("Mizgin")) {
            System.out.println("Kullanıcı İsmini Yanlış Girdiniz :(");
            //System.out.println("Kullanıcı İsmi Doğru");
        }else if(kullanıcıSifre == 214100){
            System.out.println("Giriş Yapıldı :)");
        }else if(kullanıcıSifre != 214100) {
            System.out.println("Kullanıcı Şifresini Yanlış Girdiniz :( \n Eğer Şifreyi Sıfırlamak İstiyorsanız 1'e \n " +
                    "Şifreyi Sıfırlamak İstemiyorsanız 0'a Basınız : ");
            islem = scan.nextInt();
        if(islem == 0){
            System.out.println("Program Bitti :(");
        }
        }if(islem == 1) {
            System.out.println("Yeni Şifreyi Giriniz : ");
            yeniSifre = scan.nextInt();
            if (yeniSifre == 214100) {
                System.out.println("Yeni Şifre Oluşturulamadı :(");
            } else {
                System.out.println("Yeni Şifre Başarılı Bir Şekilde Oluşturuldu :)");
            }
        }

    }
}
