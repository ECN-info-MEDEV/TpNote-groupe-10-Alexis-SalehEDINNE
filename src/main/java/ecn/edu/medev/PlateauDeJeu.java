package ecn.edu.medev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * Classe representant le plateau de jeu sur lequel se deroule la partie
 */
public class PlateauDeJeu {

    /**
     * Joueur 1 de la serie de manches
     */
    private Joueur player1;


    /**
     * Joueur 2 de la serie de manches
     */
    private Joueur player2;


    /**
     * Liste des manches jouees dans le plateau
     */
    private ArrayList<Manche> manchesJouees;


    /**
     * Nombre de Manches à jouer pour gagner
     */
    private int nombreDetours=10;





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

        System.out.println("Veuillez entrer le nombre de tours : ");
        Scanner scan=new Scanner(System.in);
        this.nombreDetours= scan.nextInt();
        Random random = new Random();
        int nb;
        nb = random.nextInt(2);
        if(nb==1){
            System.out.println("Le joueur " + this.player1.getName() + " a été designé comme le codeur");
            Codeur codeur=new Codeur(this.player1);
            Decodeur decodeur=new Decodeur(this.player2);
            while(this.nombreDetours>0){
                Manche currentManche=new Manche(codeur,decodeur);
                manchesJouees.add(currentManche);
                this.nombreDetours=this.nombreDetours-1;
            }


        }
        else{
            System.out.println("Le joueur " + this.player2.getName() + " a été designé comme le codeur");
            Codeur codeur=new Codeur(this.player2);
            Decodeur decodeur=new Decodeur(this.player1);
            while(this.nombreDetours>0){
                Manche currentManche=new Manche(codeur,decodeur);
                manchesJouees.add(currentManche);
                this.nombreDetours=this.nombreDetours-1;
            }

        }

    }


}
