package Kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class dizi_kucukBuyuk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Eleman Sayısını Giriniz : ");
        int sayi = input.nextInt();

        int[] array = new int[sayi];

        System.out.println("Lütfen Dizi Elemanlarını Giriniz : ");



        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". Elemanı : ");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        System.out.print("Sıralama : ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(array[i] + " ");
        }


    }
    }

