public class Nain extends Guerrier {
    /* Un Nain peut porter une armure lourde qui réduit
    les dégâts qu'il encaisse */
    private int protectionArmureLourde;
    public Nain(String nom, int pv, int nbDesAtt, int protecArmuLourde){
        super(nom, pv, nbDesAtt); // (Appelle le constructeur de Guerrier)
        protectionArmureLourde = protecArmuLourde;
    }
    /* ...(SUITE DU CODE)... */
}