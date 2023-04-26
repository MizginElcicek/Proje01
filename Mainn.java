package Kodluyoruz;

public class Mainn {
    public static void main(String[] args) {
        Ogretmenn og1 = new Ogretmenn("Mustafa","Çelik","KMY","052222");
        //og1.print();
        System.out.println("------------------------------");
        Ogretmenn og2 = new Ogretmenn("Duha","Tunus","EDBYT","052156");
        //og2.print();
        System.out.println("------------------------------");
        Ogretmenn og3 = new Ogretmenn("Karun","Kalender","BDNEGT","05654");
        //og3.print();
        System.out.println("------------------------------");

        Derss kimya = new Derss("Kimya","401","KMY");
        kimya.addOgrtmenn(og1);
        kimya.printOgretmenn();
        System.out.println("------------------------------");
        Derss edebiyat = new Derss("Edebiyat","429","EDBYT");
        edebiyat.addOgrtmenn(og2);
        edebiyat.printOgretmenn();
        System.out.println("------------------------------");
        Derss beden = new Derss("Beden Eğitimi","582","BDNEGT");
        beden.addOgrtmenn(og3);
        beden.printOgretmenn();
        System.out.println("------------------------------");

        Ogrencii o1 = new Ogrencii("Barlas","Karaaslan","4","852",kimya,edebiyat,beden,kimya,edebiyat,beden);
        o1.addOgrencii(70,30,60,80,40,20);
        o1.isGec();
        Ogrencii o2 = new Ogrencii("Alaz","Sipahi","3","785",kimya,edebiyat,beden,kimya,edebiyat,beden);
        o2.addOgrencii(80,85,75,80,90,70);
        o2.isGec();
        Ogrencii o3 = new Ogrencii("Alparslan","Kılıç","2","666",kimya,edebiyat,beden,kimya,edebiyat,beden);
        o3.addOgrencii(65,85,75,80,90,100);
        o3.isGec();
        Ogrencii o4 = new Ogrencii("Siraç","Barbaros","3","784",kimya,edebiyat,beden,kimya,edebiyat,beden);
        o4.addOgrencii(80,85,40,60,30,70);
        o4.isGec();

    }
}
