package Kodluyoruz;

import java.util.Scanner;

public class vucut_kitle {
    public static void main(String[] args) {
        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //Kilo (kg) / Boy(m) * Boy(m)

        double boy,kilo,sonuc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = scan.nextDouble();

        System.out.println("Lütfen Boyunuzu Giriniz : ");
        boy = scan.nextDouble();

        sonuc = kilo/(boy*boy);
        System.out.println("Beden Kütle İndeksiniz : " + sonuc);
    }
}
