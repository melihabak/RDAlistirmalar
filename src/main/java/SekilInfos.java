public class SekilInfos {
    public static void main(String[] args) {
        Sekil sekil1 = new Dikdortgen(5,10);
        sekil1.yazdir();
        sekil1.alanHesapla();
        sekil1.cevreHesapla();
        System.out.println("*************************");
        Sekil sekil2 = new Daire(10);
        sekil2.yazdir();
        sekil2.alanHesapla();
        sekil2.cevreHesapla();
    }
}
