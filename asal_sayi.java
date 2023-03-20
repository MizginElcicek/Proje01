package Kodluyoruz;

public class asal_sayi {
    public static void main(String[] args) {
        //Asal Sayı Bulma
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

       /* for(int i = 2; i<100; i++){

        }*/

        int sayac = 0;

        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    sayac++;
                }
            }

            if (sayac == 0) {
                System.out.println(i);
            }
            sayac = 0;
        
        }
    }
}
