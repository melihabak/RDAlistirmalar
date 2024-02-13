public class DaireImplementsInterface implements SekilInterface{

    double PI = 3.145159;
    private int yaricap = 10;

    public DaireImplementsInterface(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla(){
        return PI*yaricap*yaricap;
    }
    @Override
    public double cevreHesapla(){
        return 2*PI*yaricap;
    }
}
