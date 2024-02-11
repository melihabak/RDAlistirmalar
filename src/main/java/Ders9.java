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
}
