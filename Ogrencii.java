package Kodluyoruz;

public class Ogrencii {
    Derss kim;
    Derss edeb;
    Derss beden;
    Derss sozK;
    Derss sozE;
    Derss sozB;
    String ad;
    String soyad;
    String sinif;
    String og_no;
    double kimOrtalama;
    Double edebOrtalama;
    double bedenOrtalama;
    double anaOrtalama;
    boolean isGec;

    Ogrencii(String ad,String soyad,String sinif,String og_no,Derss kim,Derss edeb,Derss beden,Derss sozK,Derss sozE,Derss sozB){
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.og_no = og_no;
        this.kim = kim;
        this.edeb = edeb;
        this.beden = beden;
        this.sozK = sozK;
        this.sozE = sozE;
        this.sozB = sozB;
        this.anaOrtalama = 0.0;
        this.kimOrtalama = 0.0;
        this.edebOrtalama = 0.0;
        this.bedenOrtalama = 0.0;
        this.isGec = false;
    }
    void addOgrencii(int not1,int not2,int not3,int soz1,int soz2,int soz3){
        if(not1 >= 0 && not1 <= 100){
            this.kim.not = not1;
        }
        if(not2 >= 0 && not2 <= 100){
            this.edeb.not = not2;
        }
        if(not3 >= 0 && not3 <= 100){
            this.beden.not = not3;
        }
        if(soz1 >= 0 && soz1 <= 100){
            this.sozK.sozlu = soz1;
        }
        if(soz2 >= 0 && soz2 <= 100){
            this.sozB.sozlu = soz2;
        } if(soz3 >= 0 && soz3 <= 100){
            this.sozE.sozlu = soz3;
        }

    }

    void isGec(){
        this.kimOrtalama = ((this.kim.sozlu * 0.20) + (this.kim.not * 0.80));
        this.edebOrtalama = ((this.edeb.sozlu * 0.30) + (this.edeb.not * 0.70));
        this.bedenOrtalama = ((this.beden.sozlu * 0.10) + (this.beden.not * 0.90));
        this.anaOrtalama = (this.kimOrtalama + this.edebOrtalama + this.bedenOrtalama) / 3.0;
        if(this.anaOrtalama >= 60){
            System.out.println("Tebrikler Geçtiniz :)))");
        }else{
            System.out.println("Üzgünüz Geçemediniz :((");
        }
        printNot();
    }

    void printNot(){
        System.out.println(this.ad + " Kimya Notu: " + this.kimOrtalama);
        System.out.println(this.ad + " Edebiyat Notu: " + this.edebOrtalama);
        System.out.println(this.ad + " Beden Eğitimi Notu: " + this.bedenOrtalama);
        System.out.println("Ortalamanız : " + this.anaOrtalama);
    }

}
