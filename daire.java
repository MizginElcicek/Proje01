package Kodluyoruz;

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        //Java ile yarı çapını kullanıcıdan edinilen dairenin alanını ve çevresini hesaplayan programı yazın.
        //Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;

        int r,a;
        double pi = 3.14, alan, cevre,dilimALan;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Yarı Çapı Giriniz : ");
        r = scan.nextInt();

        System.out.println("Lütfen Daire Dilim Alanını Giriniz : ");
        a = scan.nextInt();

        alan = pi * r * r;
        System.out.println("Daire'nin Alanı : " + alan);

        cevre = 2 * pi * r;
        System.out.println("Daire'nin Çevresi : " + cevre);

        dilimALan = (pi*(r*r)*a)/360;
        System.out.println("Daire Dilim Alanı : " + dilimALan);
    }
}
