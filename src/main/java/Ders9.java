public class Ders9 {

    public static void main(String[] args) {

        double yaricap = 5.0;
        double alan = SabitOrnek.PI*yaricap*yaricap;
        System.out.println("Dairenin Alani : "+alan);

        int sayi = 750;

        if (sayi>SabitOrnek.MAX_SAYI){
            System.out.println("Sayi ("+sayi+") "+SabitOrnek.MAX_SAYI+"'den buyuk");
        }else{
            System.out.println("Sayi ("+sayi+") "+SabitOrnek.MAX_SAYI+"'den kucuk veya esit");
        }

        System.out.println("PI Sabiti = "+StatikAlanOrnek.PI);

        StatikAlanOrnek nesne1 = new StatikAlanOrnek();
        System.out.println("Sayac Degeri: "+StatikAlanOrnek.sayac);
        System.out.println("Instance Sayac Degeri: "+nesne1.instanceSayac);

        StatikAlanOrnek nesne2 = new StatikAlanOrnek();
        System.out.println("Sayac Degeri: "+StatikAlanOrnek.sayac);
        System.out.println("Instance Sayac Degeri: "+nesne1.instanceSayac);

        StatikMetotOrnek.staticMetot();
        StatikMetotOrnek ornekNesne = new StatikMetotOrnek();
        ornekNesne.nonStsticMethod();

        Ogrenci ogrenci = new Ogrenci("Ahmet",20);
        System.out.println("Orijinal Ogrenci Bilgileri : "+ogrenci.getAd()+", "+ogrenci.getYas());
        degisiklikYap(ogrenci);
        System.out.println("Orijinal Ogrenci Bilgileri : "+ogrenci.getAd()+", "+ogrenci.getYas());

        System.out.println("Bugun gunlerden : "+Gunler.CARSAMBA);
        for (Gunler gun : Gunler.values()){
            System.out.println(gun);
        }
        Gunler secilenGun = Gunler.valueOf("CUMA");
        System.out.println("Secilen gun : "+secilenGun);

        Gunler bugun = Gunler.CUMARTESI;

        System.out.println("Gun Numarasi : "+ bugun.getGunNo());
        System.out.println("Gunun Durumu : "+bugun.isHaftaIci());

        mevsimBelirle();

   }

    public class SabitOrnek{
        public static final double PI = 3.14159;
        public static final int MAX_SAYI = 100;
    }
    public static class StatikAlanOrnek{
        public static final double PI=3.14159;
        public static int sayac =0;
        public int instanceSayac =0;
        public StatikAlanOrnek(){
            sayac++;
            instanceSayac++;
        }
    }
    public static class StatikMetotOrnek{
        public static void staticMetot(){
            System.out.println("Bu bir statik metottur.");
        }
        public void nonStsticMethod(){
            System.out.println("Bu bir statik metot degildir.");
        }
    }
        public static void degisiklikYap(Ogrenci ogrenci){
            ogrenci.setAd("Mehmet");
            ogrenci.setYas(25);
            System.out.println("Metod Icindeki Ogrenci Bilgileri : "+ogrenci.getAd()+", "+ogrenci.getYas());
    }
    public static class Ogrenci{
        private String ad;
        private int yas;

        public Ogrenci(String ad, int yas) {
            this.ad = ad;
            this.yas = yas;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            this.yas = yas;
        }
    }
    public enum Gunler {
        PAZARTESI(1),
        SALI(2),
        CARSAMBA(3),
        PERSEMBE(4),
        CUMA(5),
        CUMARTESI(6),
        PAZAR(7);

        private int gunNo;

        Gunler(int gunNo) {
            this.gunNo = gunNo;
        }
        public int getGunNo() {
            return gunNo;
        }
        public String isHaftaIci(){
            if (gunNo>=1 && gunNo<=5){
                return "Hafta ici";
            }else {
                return "Hafta sonu";
            }
        }
    }

    public enum Mevsimler{
        ILKBAHAR,YAZ,SONBAHAR,KIS
    }

    static void mevsimBelirle(){
        Mevsimler mevsim = Mevsimler.YAZ;
        switch (mevsim){
            case ILKBAHAR:
                System.out.println("Su an Ilkbahar mevsimindeyiz.");
                break;

            case YAZ:
                System.out.println("Su an Yaz mevsimindeyiz.");
                break;

            case SONBAHAR:
                System.out.println("Su an Sonbahar mevsimindeyiz.");
                break;

            case KIS:
                System.out.println("Su an Kis mevsimindeyiz.");
                break;
        }
    }


}
