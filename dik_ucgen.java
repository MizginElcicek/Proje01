package Kodluyoruz;

import java.util.Scanner;

public class dik_ucgen {
    public static void main(String[] args) {
        //java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        int ilkKenar;
        int ikinciKenar;
        double hipotenuz;

        Scanner ucgen = new Scanner(System.in);

        System.out.print("Lütfen İlk Kenar Uzunluğunu Giriniz :");
        ilkKenar = ucgen.nextInt();

        System.out.print("Lütfen İkinci Kenar Uzunluğunu Giriniz : ");
        ikinciKenar = ucgen.nextInt();

        hipotenuz  = Math.sqrt((ilkKenar*ilkKenar) + (ikinciKenar*ikinciKenar));
        System.out.println("Üçgen Hipotenüzü : " + hipotenuz);



    }
}
