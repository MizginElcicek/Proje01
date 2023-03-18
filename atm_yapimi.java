package Kodluyoruz;

import java.util.Scanner;

public class atm_yapimi {
    public static void main(String[] args) {
        //While ve Do-While ile Atm Yapımı

        String isim,sifre;
        int sayac = 3;
        int bakiye = 2000;
        int islem;
        int cekmeP = 0;
        int yatırP = 0;

        Scanner scan = new Scanner(System.in);

        while (sayac > 0) {
            System.out.println("Lütfen Geçerli Kullanıcı Adınızı Giriniz : ");
            isim = scan.nextLine();
            System.out.print("Lütfen Geçerli Parolanızı Giriniz : ");
            sifre = scan.nextLine();


            if (isim.equals("Mizgin") && sifre.equals("1234")) {
                System.out.println("Bankamıza Hoş Geldiniz :)");

                do {
                    System.out.print("Para Çekmek İçin 1'e \n Para Yatırmak İçin 2'ye \n Bakiye Sorugulamak İçin 3'e" +
                            "Çıkış Yapmak İçin 0'a Basınız  :) \n Lütfen Bir İşlem Seçiniz : ");
                    islem = scan.nextInt();
                    if (islem == 1) {
                        System.out.println("Lütfen Çekmek İstediğiniz Para Tutarını Giriniz : ");
                        cekmeP = scan.nextInt();
                        bakiye -= cekmeP;
                        if (cekmeP > bakiye) {
                            System.out.println("Yetersiz Bakiye :( ");
                        }
                    } else if (islem == 2) {
                        System.out.println("Lütfen Yatırmak İstediğiniz Para Tutarını Giriniz : ");
                        yatırP = scan.nextInt();
                        bakiye += yatırP;
                    } else if (islem == 3) {
                        System.out.println("Bakiyeniz : " + bakiye);
                    }
                } while (islem != 0);
                System.out.println("Başarılı Bir Şekilde Çıkış Yaptınız :) ");
                break;
            } else {
                sayac--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (sayac == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + sayac);
                }
            }

        }
    }
}
