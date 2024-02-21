import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ArabaListeSinifi {

    public static void main(String[] args) {

        arabaOlustur("Audi",2005);
        arabaOlustur("Mercedes",1995);
        arabaOlustur("Ford",2007);
        arabaOlustur("Audi",2006);
        arabaOlustur("Aston Martin",2005);
        arabaOlustur("Audi",2005);
        arabaOlustur("Mercedes",1995);
        arabaOlustur("Ford",2007);
        arabaOlustur("Audi",2006);
        arabaOlustur("Aston Martin",2005);

        System.out.println("***********************");

        for (ArabaListeSinifi arabaIteratoru : genelArabaListesi){
            System.out.println(arabaIteratoru.getMarka());
        }

        System.out.println("***********************");

        for (ArabaListeSinifi arabaIteratoru : genelArabaListesi){
            System.out.println(arabaIteratoru.getModel());
        }

        System.out.println("***********************");

        System.out.println("Liste : "+genelArabaListesi);

        System.out.println("***********************");


        ArabaListeSinifi secilenAraba = genelArabaListesi.stream().filter(s->s.getMarka().equals("Audi")).limit(5).findAny().orElse(null); //tek bir tane arac secer ve diger ozelliklere erisim imkanı verir
        System.out.println(secilenAraba.getMarka()+" - "+secilenAraba.getModel());

        System.out.println("***********************");

        List<String> secilenArabalar = genelArabaListesi.stream().map(ArabaListeSinifi::getMarka).filter(s->s.startsWith("A")).limit(5).collect(Collectors.toList()); //Listedeki tüm arac markalarını sorgulayarak A harfi ile baslayan ilk 5 araci dondurur.
        System.out.println(secilenArabalar);
        System.out.println("*************************");

        Set<String> arabaAdlari =  genelArabaListesi.stream().map(ArabaListeSinifi::getMarka).filter(s->s.startsWith("A")).limit(5).collect(Collectors.toSet()); //Listedeki tüm arac markalarını sorgulayarak A harfi ile baslayan farklı modeldeki ilk 5 araci dondurur. Mukerrer marka adlarini (varsa) yazmaz
        System.out.println(arabaAdlari);
        System.out.println("*************************");

        Set<ArabaListeSinifi> ismeGoreSecilenArabalar = genelArabaListesi.stream().filter(s->s.getMarka().equals("Audi")).collect(Collectors.toSet());// Arabalar sınıfından olusmus genel listeden sadece audi marka aracları sec ve ozelliklerini yazdir
        for (ArabaListeSinifi arabaIteratoru : ismeGoreSecilenArabalar){
            System.out.println(arabaIteratoru.getMarka()+" - "+arabaIteratoru.getModel());
        }
        System.out.println("*************************");

        Set<ArabaListeSinifi> aIleBaslayanArabalar = genelArabaListesi.stream().filter(s->s.getMarka().startsWith("A")).collect(Collectors.toSet()); //Arabalar sınıfından olusmus listeden sadece A harfi ile baslayan aracları secip bir listeye ekle ve diger ozelliklerini de yazdir
        for (ArabaListeSinifi arabaIteratoru : aIleBaslayanArabalar){
            System.out.println(arabaIteratoru.getMarka()+" - "+arabaIteratoru.getModel());
        }
        System.out.println("*************************");


    }

    private String marka;
    private int model;

    public ArabaListeSinifi(String marka, int model) {
        this.marka = marka;
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public static List<ArabaListeSinifi> genelArabaListesi = new ArrayList<>();

    public static void arabaOlustur(String olusanMarka,int olusanYil){

        ArabaListeSinifi araba = new ArabaListeSinifi(olusanMarka,olusanYil);
        genelArabaListesi.add(araba);

    }
}
