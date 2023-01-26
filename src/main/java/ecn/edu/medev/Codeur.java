/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Codeur extends Role{

    /**
     * une list des pions choisis par le codeur
     */
    private ArrayList<Pion> myPawns=new ArrayList<>();


    /**
     * un constructeur qui attribue le role codeur au  {@link Joueur} j
     * @param j 
     */
    public Codeur(Joueur j ){
        this.setNomDuJoeur(j.getName());
        System.out.println( this.getNomDuJoeur()+ " Veuillez selectionner la combinaison gagnante svp : ");
        System.out.println(  " Rappel du code couleur R=Rouge, J=Jaune,V=Vert, B=Bleu,W=Blanc,N=Noir ");
        System.out.println(  " Veuillez entrer chaque lettre une par une et cliquer sur entrèe ");

        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<4;i++){
            String colorName=scanner.next();
            Pion pionCombinaisonGagnante=new Pion(colorName,i);
            myPawns.add(pionCombinaisonGagnante);



        }
    }

    public Codeur(String name){
        this.setNomDuJoeur(name);
    }

    public ArrayList<Pion> getMyPawns() {
        return myPawns;
    }

    public void setMyPawns(ArrayList<Pion> myPawns) {
        this.myPawns = myPawns;
    }
}
