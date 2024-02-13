public class Daire extends Sekil{
    private int yaricap;
    double PI = 3.145159;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        double alan = PI*yaricap*yaricap;
        System.out.println("Dairenin Alani : "+alan);
    }

    @Override
    void cevreHesapla() {
        double cevre = 2*PI*yaricap;
        System.out.println("Dairenin Cevresi : "+cevre);
    }
}
