package Kodluyoruz;

import java.util.Scanner;
public class taksi_metre {
    public static void main(String[] args) {
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarlarını ekranı yazdıran programı yazın.
        //Taksimetre KM başına 2,20 TL tutmaktadır.
        //Asgari ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        int km,biniş = 10;
        double tutar = 0,taksiKm = 2.20;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Gideceğiniz Yerin Km'sini Giriniz : ");
        km = scan.nextInt();

        tutar = (biniş + (km*taksiKm));
        double t = (tutar<20) ? tutar = 20 : tutar ;
        System.out.println("Ödenecek Toplam Tutar :  " + tutar);


    }
}
