public class main {

    public static void main(String[] args) {

        Guerrier g1 = new Guerrier("Lancelot", 35, 3);
        g1.afficherInfos();

        Guerrier g2 = new Guerrier("Galahad", 30, 4);
        g2.afficherInfos();
        g1.attaquer(g2);
        g2.afficherInfos();
    }
}
