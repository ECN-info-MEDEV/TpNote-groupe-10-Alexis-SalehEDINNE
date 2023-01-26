package ecn.edu.medev;

import java.util.ArrayList;

public class PlateauDeJeu {

    private Joueur player1;

    private Joueur player2;




    public void checkTentative(){

    }

    /**
     * Methode permettant d'afficher le plateau de Jeu
     * @return une chaine de caractère representant le plateau de jeu
     */
    public String toString(){
        for(int i=0;i<12;i++){
            for(int j=0;j<4;j++){
                System.out.print("-");

            }
            System.out.println();
        }
        return "";
    }

    /***
     * Methode permettant d'initialiser une partie
     */
    public void creationPartie(){
        System.out.println("creer partie ");

    }

    public PlateauDeJeu(){
        System.out.println("Creation du Plateau de Jeu ");
        this.player1=new Joueur();
        this.player2=new Joueur();

    }
}
