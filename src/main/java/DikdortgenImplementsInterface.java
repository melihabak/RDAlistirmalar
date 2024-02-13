public class DikdortgenImplementsInterface implements SekilInterface{

    private double en;
    private double boy;

    public DikdortgenImplementsInterface(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alanHesapla(){
       return en*boy;
    }

    @Override
    public double cevreHesapla(){
        return 2*(en+boy);
    }
}
