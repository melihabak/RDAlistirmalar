public class DaireInheritance extends SekilInheritance {

    double PI = 3.145159;
    private int yaricap ;

    public DaireInheritance(int x, int y, int yaricap) {
        super(x, y);
        this.yaricap = yaricap;
    }

    public void alanHesapla(){
        double alan = PI*yaricap*yaricap;
        System.out.println("Alan : "+alan);
    }
}
