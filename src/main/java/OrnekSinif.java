import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrnekSinif {

    public static void main(String[] args) {
        
        //List olusturulanListe = listeOlustur();
        //yazdirListe(olusturulanListe);


        List<String> degerler = Arrays.asList("melih","abak","java");
        List<String> sonuc = degerler.stream()
                .filter(deger -> !"java".equals(degerler))
                .collect(Collectors.toList());
        sonuc.stream().forEach(System.out::print);

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
