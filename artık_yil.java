package Kodluyoruz;
import java.util.Scanner;
public class artık_yil {
    public static void main(String[] args) {
        //Artık Yıl hesaplama

        int yil;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğiniz Yılı Giriniz : ");
        yil = scan.nextInt();

        if(yil % 4 == 0 && yil % 100 != 0){
            System.out.println(yil + " Yılı Artık Yıldır :))");
        }else if(yil % 100 == 0 && yil % 400 == 0){
            System.out.println(yil + " Yılı Artık Yıldır :))");
        }else {
            System.out.println(yil + " Yılı Artık Yıl Değildir :((");
        }
    }
}
