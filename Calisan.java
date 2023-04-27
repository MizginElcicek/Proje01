package Kodluyoruz;

public class Calisan {
    String ad;
    String soyad;
    double maas;
    int calSaat;
    double tarih;
    double vergi;
    double bonus;
    double maasA;
    double toplamM;

    Calisan(String ad,String soyad,int maas,int calSaat,double tarih,double bonus){
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.calSaat = calSaat;
        this.tarih = tarih;
        this.vergi = 0;
        this.bonus = bonus;
        this.maasA = 0;
        this.toplamM = 0;
    }

    void addMaas(){
        if(this.maas > 1000){
            this.vergi = (this.maas * 0.03);
        }
        this.bonus/*sonuc*/ = (this.calSaat/*a*/ % 40);
        if(this.bonus > 0){
            if(this.calSaat > 40) {
                this.bonus *= 30;
            }else{
                this.bonus = 0;
            }
        }
        if(2023 - this.tarih < 10){
            this.maasA = (this.maas * 0.05);
        }
        if(2023 - this.tarih >= 10 && 2023 - this.tarih < 20){
            this.maasA = (this.maas * 0.10);
        }
        if(2023 - this.tarih >= 20) {
            this.maasA = (this.maas * 0.15);
        }
        this.toplamM = (this.maas + this.vergi + this.bonus + this.maasA);

        printCalisan();


    }

    void printCalisan(){
        System.out.println("Çalışan Adı \t:" + this.ad + "\nÇalışan Soyadı \t:" + this.soyad + "\nÇalışan Maaşı \t:" + this.maas +
                "\nÇalışan Haftalık Çalışma Saati \t:" + this.calSaat + "\nÇalışan İşe Başlama Tarihi \t:" + this.tarih + "\nVergi \t:" + this.vergi + "\nBonus \t:" + this.bonus +
                "\nÇalışan Maaş Artışı :" + this.maasA);
        System.out.println("Çalışan Toplam Maaşı \t:" + this.toplamM);
    }

    public static void main(String[] args) {
        Calisan c1 = new Calisan("Azra","Kalem",5000,45,2019);
        c1.addMaas();


    }
}
