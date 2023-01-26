package ecn.edu.medev;

import java.util.ArrayList;
import java.util.Scanner;

public class Manche {

    private Codeur codeurManche;

    private Decodeur decodeurManche;

    int nombreTentatives=12;

    ArrayList<Pion> combinaisonGagnante;

    boolean isEnCours;

    boolean isOver;


    public Manche(){
        System.out.println("Creation d'une nouvelle manche");
        System.out.println( codeurManche.getName()+ " Veuillez selectionner la combinaison gagnante svp : ");
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.print("");


        }

    }

    public void remporterLaManche(){


    }



}
