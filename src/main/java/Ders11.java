public class Ders11 {

    public static void main(String[] args) {

        System.out.println("Metodda Girilen Sayilarin Toplami : "+hesaplaToplam(20,3));

    }

    // Sinif disindan erisime acik olan public metotlar, gizli metotlarin islevlerini kullaniciya sunar
    private static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int hesaplaToplam(int x, int y){
        return topla(x,y); // Gizli metot kullanilarak toplama islemi yapilir
    }


}
