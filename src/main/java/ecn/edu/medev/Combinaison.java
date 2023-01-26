package ecn.edu.medev;


import java.util.ArrayList;

/**
 * Classe representant une combinaison ou tentative pour deviner la bonne combinaison
 */
public class Combinaison {


    private ArrayList<Pion> pions;

    /**
     * Methode permettant d'afficher la combinaison tentée par le décodeur
     * @return la combinaison sous forme RBVJ
     */
    public void affiche(){
        for(int i=0;i<pions.size();i++){
            Pion currentPion=pions.get(i);
            System.out.print(currentPion.toString());
        }
    }
    
    /**
     * cette methode permet au codeur d'indiquer que l'un des pions 
     * du décodeur est correcte
     */
    public void indice(ArrayList<Pion> codeurPions){
        for(Pion p : pions){
            for (Pion pc : codeurPions){
                pc.comparer(p);
            }
        }
    }


    public void add(Pion p){
        this.pions.add(p);
    }

}
