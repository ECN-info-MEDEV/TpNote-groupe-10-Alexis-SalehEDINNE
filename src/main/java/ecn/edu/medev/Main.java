package ecn.edu.medev;

/**
 * Classe principale du projet contenant la methode main
 */
public class Main {
    /**
     * Méthode main permettant le lancement 
     * @param args liste des paramètres à fournir en ligne de commande
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Everything works");
        PlateauDeJeu gameBoard=new PlateauDeJeu();
        gameBoard.toString();

    }

    /**
     * Test pour ajout de la java doc rapidement => cliquer sur option et entre au niveau de la methode
     * pour ajout classe de test maj puis command et T
     * @return an int representing zero
     */
    public static int getZero(){
        return 0;

    }
}