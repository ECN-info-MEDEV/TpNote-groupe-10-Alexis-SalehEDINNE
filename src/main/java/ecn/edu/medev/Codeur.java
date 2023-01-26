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


    private ArrayList<Pion> myPawns=new ArrayList<>();



    
    


    public Codeur(Joueur j ){
        this.setNomDuJoeur(j.getName());
        System.out.println( this.getNomDuJoeur()+ " Veuillez selectionner la combinaison gagnante svp : ");
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<4;i++){
            String colorName=scanner.next();
            Pion pionCombinaisonGagnante=new Pion(colorName,i);
            myPawns.add(pionCombinaisonGagnante);



        }


    }


    
}
