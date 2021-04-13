public class Guerrier {

    private String nom;
    private int pv;
    private int nbDesAttaque;

    public Guerrier(String nom, int pv, int nbDesAttaque) {
        this.nom = nom;
        this.pv = pv;
        nbDesAttaque = nbDesAttaque;
    }

    public int getPv() {
        return pv;
    }

    public void afficherInfos() {
        System.out.println(this.nom+"{PV="+this+"}");
    }

}
