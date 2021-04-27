public class GuerriersUtil {

    // Constante du maximum de PV qu'un guerrier peut avoir
    public static final int PV_MAXI = 50;

    // Méthode qui régénère les PV de 10 points
    public static void regenereGuerrier(Guerrier g){
        if ((g.getPv() + 10) > PV_MAXI) {
            g.setPv(PV_MAXI);
        } else {
            g.setPv(g.getPv() + 10);
        }
    }

    public static void regenereGuerrier(int pv){


    }
}
