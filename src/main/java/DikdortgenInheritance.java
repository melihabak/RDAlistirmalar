public class DikdortgenInheritance extends SekilInheritance {

    private int en;
    private int boy;

    public DikdortgenInheritance(int x, int y,int en,int boy){

        super(x,y); //Ust sinifin yapici metodlari cagrilir
        this.en=en;
        this.boy=boy;
    }

    public void alanHesapla(){
        int alan = en*boy;
        System.out.println("Alan : "+alan);
    }

}
