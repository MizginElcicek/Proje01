package Kodluyoruz;

import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        //Ters Üçgen Yapımı

        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen elmas sayısını giriniz : ");
        sayi = input.nextInt();


        for (int i = 1; i <= sayi; i++) {

            for(int j = 1; j <= i - 1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * sayi - (2 * i - 1)); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
