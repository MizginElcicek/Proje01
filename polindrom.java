package Kodluyoruz;

public class polindrom {

    static boolean Pol(int sayi) {
        int geciciS = sayi;
        int tersS = 0;
        int sonS;
        while (geciciS != 0) {
            sonS = geciciS % 10;
            tersS = (tersS * 10) + sonS;
            geciciS /= 10;
        }
        if (sayi == tersS) {
            System.out.println(sayi + " Sayısı Polindrom Sayıdır :)");
            return true;

        } else {
            System.out.println(sayi + " Sayısı Polindrom Sayı Değildir :(");
            return false;
        }

    }

    public static void main(String[] args) {
        Pol(4);
        Pol(475);
        Pol(848);


    }
}
