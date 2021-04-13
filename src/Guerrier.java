import java.util.Random;

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

    public void setPv(int pv) {
        if (pv > 100) {
            this.pv = 100;
        }   else if (pv < 0){
            this.pv = 0;
        } else {
            this.pv = pv;
        }
    }

    public void afficherInfos() {
        System.out.println(this.nom+"{PV="+this+"}");
    }

    public void attaquer (Guerrier Adversaire) {
        for (int i=0; i<nbDesAttaque; i++) {
            Random rd = new Random();
            int valeurLancer = rd.nextInt(bound:)+1;
            Adversaire.subirDegats(valeurLancer);
            Adversaire.afficherInfos();
        }

    }

    public void subirDegats(int degats) {
        this.pv = this.pv - degats
    }
}
