public class SekillerInheritanceInfos {

    public static void main(String[] args) {

        DikdortgenInheritance dikdortgen = new DikdortgenInheritance(10,20,30,40);
        dikdortgen.yazdirPozisyon();
        dikdortgen.alanHesapla();

        System.out.println("**************************");

        DaireInheritance daire = new DaireInheritance(10,15,10);
        daire.yazdirPozisyon();
        daire.alanHesapla();

    }
}
