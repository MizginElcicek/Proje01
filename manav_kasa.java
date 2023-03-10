package Kodluyoruz;

import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double ar,el,dom,mu,pa,toplamTutar;

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen almak istediğiniz armutun kilosunu giriniz : ");
        ar = scan.nextDouble();

        System.out.println("Lütfen almak istediğiniz elmanın kilosunu giriniz : ");
        el = scan.nextDouble();

        System.out.println("Lütfen almak istediğiniz dometesin kilosunu giriniz : ");
        dom = scan.nextDouble();

        System.out.println("Lütfen almak istediğiniz muzun kilosunu giriniz : ");
        mu = scan.nextDouble();

        System.out.println("Lütfen almak istediğiniz patlıcanın kilosunu giriniz : ");
        pa = scan.nextDouble();

        toplamTutar = ((ar*2.14) + (el*3.67) + (dom*1.11) + (mu*0.95) + (pa*5.00));
        System.out.println("Ödeminiz gereken toplam tutar : " + toplamTutar);

    }
}
