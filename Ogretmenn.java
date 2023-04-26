package Kodluyoruz;

public class Ogretmenn {
    String ad;
    String soyad;
    String bolum;
    String tel_no;

    Ogretmenn(String ad,String soyad,String bolum,String tel_no){
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.tel_no = tel_no;
    }

    void print(){
        System.out.println("Öğretmen Adı : " + this.ad + "\nÖğretmen Soyadı : " + this.soyad + "\nBölüm : " + this.bolum + "\nÖğretmen Telefon No : " + this.tel_no);
    }
}
