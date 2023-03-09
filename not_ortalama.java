package Kodluyoruz;

import java.util.Scanner;

public class not_ortalama {
    public static void main(String[] args) {
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
        //ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        double Mat,Fiz,Kim,Tur,Tar,Muz;
        double ort = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Matematik notunuzu giriniz:");
        Mat = scan.nextDouble();

        System.out.println("Lütfen Fizik notunuzu giriniz:");
        Fiz = scan.nextDouble();

        System.out.println("Lütfen Kimya notunuzu giriniz:");
        Kim = scan.nextDouble();

        System.out.println("Lütfen Türkçe notunuzu giriniz:");
        Tur = scan.nextDouble();

        System.out.println("Lütfen Tarih notunuzu giriniz:");
        Tar = scan.nextDouble();

        System.out.println("Lütfen Müzik notunuzu giriniz:");
        Muz = scan.nextDouble();

        ort = (Mat + Fiz + Kim + Tur + Tar + Muz )/(6);
        System.out.println(ort);

        String sonuc = ort>=60 ? "Sınıfı Başarı ile Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);



    }
}
