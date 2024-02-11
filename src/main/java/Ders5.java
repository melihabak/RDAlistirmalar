public class Ders5 {

    static int[] sayilar={1,2,3,4,5};
    static int ilkEleman = sayilar[0];

    static void diziler(){

        //int[] sayilar = new int[5];

        System.out.println(ilkEleman);

    }



    public static void main(String[] args) {

        String ad = "Melih Furkan";
        String soyad = "Abak";
        String tamAd = ad + " " + soyad;
        System.out.println("Gercek Isim : "+tamAd);

        int adUzunlugu = tamAd.length();
        char sekizinciKarakter = tamAd.charAt(7);
        String belirliIndeksler = tamAd.substring(3,12);
        String kucukHarfle = tamAd.toLowerCase();
        String buyukHarfle = tamAd.toUpperCase();
        boolean isimKarsilastirma = tamAd.equals("Melih Furkan Abak");
        boolean onek = tamAd.startsWith("Mel");
        boolean sonek = tamAd.endsWith("ba");

        System.out.println(adUzunlugu);
        System.out.println(sekizinciKarakter);
        System.out.println(belirliIndeksler);
        System.out.println(kucukHarfle);
        System.out.println(buyukHarfle);
        System.out.println(isimKarsilastirma);
        System.out.println(onek);
        System.out.println(sonek);

        System.out.println("**********");

        diziler();


    }

}
