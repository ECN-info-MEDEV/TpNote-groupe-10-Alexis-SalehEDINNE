package ecn.edu.medev;

import java.util.ArrayList;
import java.util.Scanner;

public class Manche {

    private Codeur codeurManche;

    private Decodeur decodeurManche;

    int nombreTentatives=12;

    ArrayList<Pion> combinaisonGagnante;

    ArrayList<Combinaison> combinaisonsTentees;

    boolean isEnCours;

    boolean isOver;


    public Manche(){
        System.out.println("Creation d'une nouvelle manche");
        System.out.println( codeurManche.getName()+ " Veuillez selectionner la combinaison gagnante svp : ");
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<4;i++){
            String colorName=scanner.next();
            Pion pionCombinaisonGagnante=new Pion(colorName,i);
            combinaisonGagnante.add(pionCombinaisonGagnante);



        }

        while(nombreTentatives>0){
            nombreTentatives=nombreTentatives-1;
            System.out.println( decodeurManche.getName()+ " Veuillez saisir une combinaison ");
            Combinaison currentCombinaison= new Combinaison();
            for(int i=0;i<4;i++){
                String colorName=scanner.next();
                Pion pionCombinaisonGagnante=new Pion(colorName,i);
                currentCombinaison.add(pionCombinaisonGagnante);


            }

            this.combinaisonsTentees.add(currentCombinaison);


        }

    }

    public void remporterLaManche(){


    }



}
