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
    private ArrayList<Manche> manchesJouees=new ArrayList<>();


    /**
     * Nombre de Manches à jouer pour gagner
     */
    private int nombreDetours=10;





  

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
    /**
     * un constructeur sans paramètre pour créer un tableau de jeu
     */
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
        int nombreManchesJouees=0;

        if(nb==1){
            System.out.println("Le joueur " + this.player1.getName() + " a été designé comme le codeur");
            this.player1.setRole("codeur");
            this.player2.setRole("decodeur");
            Codeur codeur=null;
            Decodeur decodeur=null;

            while(this.nombreDetours>0){
                System.out.println("Le score du joueur " + player1.getName() + " est de " + player1.getScore());
                System.out.println("Le score du joueur " + player2.getName() + " est de " + player2.getScore());
                if(this.player1.getRole().equals("codeur") && this.player2.getRole().equals("decodeur") ){
                    codeur=new Codeur(this.player1);
                    decodeur=new Decodeur(this.player2);}

                else if(this.player2.getRole().equals("codeur") && this.player1.getRole().equals("decodeur") ){
                    codeur=new Codeur(this.player2);
                    decodeur=new Decodeur(this.player1);}
                Manche currentManche=new Manche(codeur,decodeur);
                manchesJouees.add(currentManche);
                this.nombreDetours=this.nombreDetours-1;
                System.out.println("il reste " +this.nombreDetours + " tours de jeu");
                this.switchCodeur(codeur,decodeur);


            }


        }
        else{
            System.out.println("Le joueur " + this.player2.getName() + " a été designé comme le codeur");
            Codeur codeur=null;
            Decodeur decodeur=null;
            this.player2.setRole("codeur");

            this.player1.setRole("decodeur");
            while(this.nombreDetours>0){
                System.out.println("Le score du joueur " + player1.getName() + " est de " + player1.getScore());
                System.out.println("Le score du joueur " + player2.getName() + " est de " + player2.getScore());
                if(this.player1.getRole().equals("codeur") && this.player2.getRole().equals("decodeur") ){
                    codeur=new Codeur(this.player1);
                    decodeur=new Decodeur(this.player2);}

                else if(this.player2.getRole().equals("codeur") && this.player1.getRole().equals("decodeur") ){
                    codeur=new Codeur(this.player2);
                    decodeur=new Decodeur(this.player1);}

                Manche currentManche=new Manche(codeur,decodeur);
                manchesJouees.add(currentManche);
                this.nombreDetours=this.nombreDetours-1;
                this.switchCodeur(codeur,decodeur);
                System.out.println("il reste " +this.nombreDetours +" tours");

            }

            System.out.println("le score final est : ");

        }

    }

    public void switchCodeur(Codeur c, Decodeur d){
        boolean set=false;
        System.out.println("Changement des roles");
        if(this.player1.getRole().equals("codeur") && this.player2.getRole().equals("decodeur") && !set){
            this.player1.setScore(this.player1.getScore()+c.getPointSurManche());
            this.player2.equals("codeur");
            this.player1.equals("decodeur");
            set=true;



        }
        if(this.player1.getRole().equals("decodeur") && this.player2.getRole().equals("codeur") && !set){
            this.player2.setScore(this.player2.getScore()+c.getPointSurManche());

            this.player1.equals("codeur");
            this.player2.equals("decodeur");

            set=true;


        }
        System.out.println("Le codeu est " + c.getNomDuJoeur() + " le decodeur est " + d.getNomDuJoeur());


    }
}
