package Kodluyoruz;

public class dizi_harmonik {
    public static void main(String[] args) {

        int[] list = {5,6,4,9,8};

        double toplam = 0.0;
        double toplam1 = 0.0;
        double toplam3 = 0.0;

        for(int i = 0; i < list.length; i++){
            toplam += list[i];
        }

        double ort = toplam/list.length;
        System.out.println("Dizi Ortalaması : " + ort);

        for(double j = 1; j <= ort; j++){
           toplam1 += 1/j;
        }

        System.out.println("Dizi Ortalamasının Hermonik Ortlaması : " + toplam1);

        for(double k = 1; k <= list.length; k++){
            toplam3 += 1/k;
        }

        System.out.println("Dizi Eleman Sayısı Harmonik Ortalaması : "+ toplam3);
    }
}
