public class SekillerInfosInterface {
    public static void main(String[] args) {

        DikdortgenImplementsInterface dikdortgen = new DikdortgenImplementsInterface(10,20);
        double alanDikdortgen = dikdortgen.alanHesapla();
        double cevreDikdortgen = dikdortgen.cevreHesapla();

        System.out.println("Alan : "+alanDikdortgen+" --- Cevre : "+cevreDikdortgen);

        System.out.println("************************************");

        DaireImplementsInterface daire = new DaireImplementsInterface(10);
        double alanDaire = daire.alanHesapla();
        double cevreDaire = daire.cevreHesapla();

        System.out.println("Alan : "+alanDaire+" --- Cevre : "+cevreDaire);

    }
}
