import java.util.ArrayList;
import java.util.List;

public class OrnekSinif {

    public static void main(String[] args) {
        
        List olusturulanListe = listeOlustur();
        yazdirListe(olusturulanListe);

    }

    static List listeOlustur() {

        List<Object> karisikListe = new ArrayList<>();
        karisikListe.add(15);
        karisikListe.add("MFA");
        karisikListe.add(1222.4);
        karisikListe.add(true);
        return karisikListe;
    }
    static void yazdirListe(List karisikListe){

        for (Object donguNesnesi : karisikListe){
            System.out.println("Listenin "+(karisikListe.indexOf(donguNesnesi)+1)+". elemani -> "+donguNesnesi);

        }
    }
}
