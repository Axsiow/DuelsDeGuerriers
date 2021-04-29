import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Guerrier g1 = new Guerrier("Jay Ksaaffer", 35, 3);
        Guerrier g2 = new Guerrier("Morph Hal", 30, 4);
        Nain n1 = new Nain("Mardézelf", 25, 2, 4);
        Nain n2 = new Nain("Hildegarde Havou", 12, 4, 4);
        Elfe e1 = new Elfe("Amaury Oley", 30, 2, 6);
        Elfe e2 = new Elfe("Marie Houana",35, 2, 5);

        list<Guerrier> combattants= new ArrayList<>();
        g2.afficherInfos();
        GuerriersUtil.regenereGuerrier(g2);
        g2.afficherInfos();
        GuerriersUtil.regenereGuerrier(g2);
        g2.afficherInfos();
        g2.afficherInfos();
    }
}
