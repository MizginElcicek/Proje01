package Kodluyoruz;

import java.util.Scanner;

public class para_Kdv {
    public static void main(String[] args) {
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //(Not : KDV tutarını 18% olarak alın)
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
        //tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double tutar;
        double kdvOrani = 0.18;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Ücret Tutarını Giriniz : ");
        tutar = scan.nextDouble();

        double v = !(tutar > 0 && tutar < 1000) ? kdvOrani = 0.08 : 0.18;

        double kdvTutar = tutar * kdvOrani;
        System.out.println("KDV Tutarı : " + kdvTutar);

        double kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'li Tutarı : " + kdvliTutar);






    }
}
