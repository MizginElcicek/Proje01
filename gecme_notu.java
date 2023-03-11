package Kodluyoruz;

import java.util.Scanner;

public class gecme_notu {
    public static void main(String[] args) {
        // Not ortalaması
        // Ders : Matematik, Fizik, Türkçe, Kimya, Müzik

        int mat,fiz,tur,kim,muz;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu Girini : ");
        mat = scan.nextInt();

        System.out.println("Lütfen Fizik Notunuzu Girini : ");
        fiz = scan.nextInt();

        System.out.println("Lütfen Türkçe Notunuzu Girini : ");
        tur = scan.nextInt();

        System.out.println("Lütfen Kimya Notunuzu Girini : ");
        kim = scan.nextInt();

        System.out.println("Lütfen Müzik Notunuzu Girini : ");
        muz = scan.nextInt();

        double ort = (mat+fiz+tur+kim+muz) / 5;

        if(mat<0 || mat>100 || fiz<0 || fiz>100 || tur<0 || tur>100 || kim<0 || kim>100 || muz<0 || muz>100 ){
            System.out.println("Lütfen Notunuzu 0 ila 100 arasında giriniz !!!");
        }else if(ort<55){
            System.out.println("Sınıfta Kaldınız :( ");
        }else if(ort>=55){
            System.out.println("Sınıfı Geçtiniz :)");
        }else{
            System.out.println("Sınıf Ortalamanız : " + ort);
        }


    }
}
