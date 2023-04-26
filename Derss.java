package Kodluyoruz;

public class Derss {
    Ogretmenn ogretmen;

    String ad;
    String kod;
    String onEkk;
    int not;
    int sozlu;

    Derss(String ad,String kod,String onEkk){
        this.ad = ad;
        this.kod = kod;
        this.onEkk = onEkk;
        this.not = 0;
        this.sozlu = 0;
    }

    void addOgrtmenn(Ogretmenn ogretmen){
        if(ogretmen.bolum.equals(this.onEkk)){
            this.ogretmen = ogretmen;
        }else{
            System.out.println("Öğretmen adı ve ders bölümleri uyuşmuyor");
        }
    }

    void printOgretmenn(){
        this.ogretmen.print();
    }

    }

