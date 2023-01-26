package ecn.edu.medev;


import java.util.ArrayList;

/**
 * Classe representant une combinaison ou tentative pour deviner la bonne combinaison
 */
public class Combinaison {

    /**
     * une liste des pions choisi par un décodeur (tentative)
     */
    private ArrayList<Pion> pions= new ArrayList<>();

    /**
     * Methode permettant d'afficher la combinaison tentée par le décodeur
     * @return la combinaison sous forme RBVJ
     */
    public void affiche(){
        for(int i=0;i<pions.size();i++){
            Pion currentPion=pions.get(i);
            System.out.print(currentPion.toString());
        }
        System.out.println("");

    }
    
    /**
     * cette methode permet au codeur d'indiquer que l'un des pions 
     * du décodeur est correcte
     */
    public void indice(ArrayList<Pion> decodeurPions,ArrayList<Pion> trueCombinaison){
        System.out.println("comparaison à la combinaison gagnate");

        for(int i=0;i<4; i++){
            Pion currentPionProvided=decodeurPions.get(i);
            currentPionProvided.comparer(trueCombinaison);



        }
    }

    /**
     * cette méthode permet d'ajouter un pion à la collection d'un décodeur
     * @param p représnet le pion choisi par le décodeur à ajouter
     */
    public void add(Pion p){
        this.pions.add(p);
    }

    public ArrayList<Pion> getPions() {
        return pions;
    }

    public void setPions(ArrayList<Pion> pions) {
        this.pions = pions;
    }
}
