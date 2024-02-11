public class ArabaTest {
    public static void main(String[] args) {

        //Araba sinifindan iki nesne olusturuluyor
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();

        //Arabalarin ozellikleri ayarlaniyor
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.renk = "Beyaz";

        araba2.marka = "Honda";
        araba2.model = "Civic";
        araba2.renk = "Mavi";

        //Arabalarin islemleri gerceklestiriliyor
        araba1.calistir();
        araba1.hizlan(100);
        araba1.durdur();

        System.out.println("**************************");

        araba2.calistir();
        araba2.hizlan(50);
        araba2.durdur();

    }
}
