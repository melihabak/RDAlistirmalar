import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ders8 {

    public static void main(String[] args) {

        ikiBoyutluMatris();
        arrayListOrnegi();
        linkedListOrnegi();
        hashSetOrnegi();
        hashMapOrnegi();
        ogrenciHashmap();
    }
    static void ikiBoyutluMatris(){

        int [][] matris = new int [3][3];

        matris[0][0]=1;
        matris[0][1]=1;
        matris[0][2]=1;
        matris[1][0]=1;
        matris[1][1]=1;
        matris[1][2]=1;
        matris[2][0]=1;
        matris[2][1]=1;
        matris[2][2]=1;

        for(int satir=0;satir< matris.length;satir++){
            for(int sutun=0;sutun<matris[satir].length;sutun++){
                System.out.print(matris[satir][sutun]+" ");
            }
            System.out.println();
        }
    }

    static void arrayListOrnegi(){

        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Domates");
        liste.add("Biber");
        liste.add("Patlican");

        System.out.println(liste);

    }

    static void linkedListOrnegi(){

        LinkedList<String> liste = new LinkedList<>();
        liste.add("Domates");
        liste.add("Biber");
        liste.add("Patlican");

        System.out.println(liste);

    }
    static void hashSetOrnegi(){

        HashSet<String> liste = new HashSet<>();
        liste.add("Domates");
        liste.add("Biber");
        liste.add("Patlican");

        System.out.println(liste);

    }
    static void hashMapOrnegi(){

        HashMap<String,String> renkler = new HashMap<>();
        renkler.put("R","Kirmizi");
        renkler.put("B","Mavi");
        renkler.put("G","Yesil");

        String mavi = renkler.get("B");
        System.out.println("B anahtarinin karsiligi : "+mavi);

        // tum anahtar-deger ciftlerini gezinme
        for (String anahtar : renkler.keySet()){
            String deger = renkler.get(anahtar);
            System.out.println(anahtar+" -> "+deger);
        }

    }
    static class Ogrenci{
        String ad;
        int yas;
        public Ogrenci(String ad,int yas){
            this.ad=ad;
            this.yas=yas;
        }
    }
    static void ogrenciHashmap(){

        HashMap<Integer,Ogrenci> ogrenciMap = new HashMap<>();

        ogrenciMap.put(1,new Ogrenci("Ali",20));
        ogrenciMap.put(2,new Ogrenci("Ayse",22));
        ogrenciMap.put(3,new Ogrenci("Mehmet",21));

        for (int numara:ogrenciMap.keySet()){
            Ogrenci ogrenci = ogrenciMap.get(numara);
            System.out.println(numara+" -> "+ogrenci.ad+", "+ogrenci.yas+" yasindadir.");
        }

    }

}
