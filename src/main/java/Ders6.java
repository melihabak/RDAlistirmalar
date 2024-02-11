public class Ders6 {

    public static void main(String[] args) {

        aritmetikOperatorlar();
        ternaryOperator();
        switchCase();

    }

    static void aritmetikOperatorlar() {

        int x = 20;
        int y = 8;

        int toplam = x + y;
        int carpim = x * y;
        int fark = x - y;
        int bolum = x / y;
        int kalan = x % y;

        System.out.println(toplam);
        System.out.println(carpim);
        System.out.println(fark);
        System.out.println(bolum);
        System.out.println(kalan);

        int a = 5;
        boolean sonuc1 = (a < 10) && (a++ > 5);
        boolean sonuc2 = (a < 10) && (++a > 5);

        System.out.println(sonuc1);
        System.out.println(sonuc2);

    }
    static void ternaryOperator(){

        int yas = 18;
        String sonuc = (yas>=18)?"Ehliyet alabilirsiniz.":"Ehliyet alamazsınız";
        System.out.println(sonuc);

    }
    static void switchCase(){

        int degisken = 10;
         switch (degisken){
             case 1:
                 System.out.println("Degisken degeri 1");
                 break;
             case 2:
                 System.out.println("Degisken degeri 2");
                 break;
             default:
                 System.out.println("Degisken degeri 1 veya 2 degil");
         }

    }
}