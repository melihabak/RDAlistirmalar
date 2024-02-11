public class Araba {
    String marka;
    String model;
    String renk;
    int hiz;

    void calistir(){
        System.out.println(marka+" arabasi calistirildi.");
    }
    void durdur(){
        System.out.println(marka+" arabasi durduruldu.");
    }
    void hizlan(int artis){
        hiz += artis;
        System.out.println(marka+" arabasi "+artis+" km/s hizlandi.");
    }
}
