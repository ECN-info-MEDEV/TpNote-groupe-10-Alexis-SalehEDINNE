/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe representant le decodeur de la manche actuelle
 * @author User
 */
public class Decodeur extends Role{


    /**
     * un constructeur qui donne le role décodeur à un joueur
     * @param j le joueur
     */
    public Decodeur(Joueur j){
        this.setNomDuJoeur(j.getName());
    }
    /**
     * cette méthode permet au décodeur de choisir sa combinaison
     * @return une liste depions choisis
     */
    public ArrayList<Pion> deviner(){
        ArrayList<Pion> guess = new ArrayList<>();
        System.out.println( this.getNomDuJoeur()+ " Veuillez selectionner la combinaison gagnante pour décoder la combinaison de ton adversaire et gagner svp : ");
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<4;i++){
            String colorName=scanner.next();
            Pion pionguess=new Pion(colorName,i);
            guess.add(pionguess);
        }
        return guess;
    }
}
