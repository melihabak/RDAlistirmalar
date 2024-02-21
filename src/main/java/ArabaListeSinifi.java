import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArabaListeSinifi {

    public static void main(String[] args) {

        arabaOlustur("Audi",2005);
        arabaOlustur("Mercedes",1995);
        arabaOlustur("Ford",2007);
        arabaOlustur("Audi",2009);

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


        ArabaListeSinifi secilenAraba = genelArabaListesi.stream().filter(s->s.getMarka().equals("Audi")).findAny().orElse(null);
        System.out.println(secilenAraba.getMarka()+" - "+secilenAraba.getModel());

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
