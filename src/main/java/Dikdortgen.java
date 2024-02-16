public class Dikdortgen extends Sekil {

    private static int en ;
    private static int boy ;

    public Dikdortgen(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }
    @Override
    void cevreHesapla() {
        int cevre = 2*(en+boy);
        System.out.println("Dikdortgenin Cevresi : "+cevre);
    }

    @Override
    void alanHesapla() {
        int alan = en*boy;
        System.out.println("Dikdortgenin Alani : "+alan);
    }
}
