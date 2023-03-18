package Kodluyoruz;

import java.util.Scanner;

public class atm_yapim {
    public static void main(String[] args) {
        //Switch-Case İle Atm Yapımı

        Scanner scan = new Scanner(System.in);

        String isim,sifre;
        int bakiye = 2500;
        int sayac = 3;
        int paraC = 0;
        int paraY = 0;
        int islem = 0;

        while(sayac > 0) {
            System.out.print("Lütfen Geçerli Kullanıcı İsmni Giriniz : ");
            isim = scan.nextLine();
            System.out.println("Lütfen Geçerli Kullanıcı Şifresini Girniz : ");
            sifre = scan.nextLine();

            if (isim.equals("Mizgin") && sifre.equals("1234")) {
                System.out.println("Bankamıza Hoş Geldiniz :) ");

                do {
                    System.out.println("Para Çekmek İçin 1'e \n Para Yatırmak İçin 2'ye " +
                            "Bakiye Sorgulamak İçin 3'e \n Çıkış Yapmak İçin 0'a Basınız :)");
                    System.out.println("Lütfen Bir İşlem Seçiniz : ");
                    islem = scan.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.println("Lütfen Çekmek İstediğiniz Para Tutarını Giriniz : ");
                            paraC = scan.nextInt();
                            if (paraC > bakiye) {
                                System.out.println("Yetersiz Bakiye :( ");
                            }
                            bakiye -= paraC;
                            break;
                        case 2:
                            System.out.println("Lütfen Yatırmak İstediğiniz Para Tutarını Giriniz : ");
                            paraY = scan.nextInt();
                            bakiye += paraY;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                }while(islem != 0);
                System.out.println("Başarılı Bir Şekilde Çıkış Yaptınız :) ");
                break;
            }else {
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
