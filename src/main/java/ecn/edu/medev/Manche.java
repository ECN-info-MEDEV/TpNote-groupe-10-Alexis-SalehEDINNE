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


    public Manche(Codeur c,Decodeur d){
        this.codeurManche=c;
        this.decodeurManche=d;
        System.out.println("Creation d'une nouvelle manche");
        Scanner scanner= new Scanner(System.in);

        while(nombreTentatives>0){
            nombreTentatives=nombreTentatives-1;

            System.out.println( decodeurManche.getNomDuJoeur()+ " Veuillez saisir une combinaison ");
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


    public Codeur getCodeurManche() {
        return codeurManche;
    }

    public void setCodeurManche(Codeur codeurManche) {
        this.codeurManche = codeurManche;
    }

    public Decodeur getDecodeurManche() {
        return decodeurManche;
    }

    public void setDecodeurManche(Decodeur decodeurManche) {
        this.decodeurManche = decodeurManche;
    }

    public int getNombreTentatives() {
        return nombreTentatives;
    }

    public void setNombreTentatives(int nombreTentatives) {
        this.nombreTentatives = nombreTentatives;
    }

    public ArrayList<Pion> getCombinaisonGagnante() {
        return combinaisonGagnante;
    }

    public void setCombinaisonGagnante(ArrayList<Pion> combinaisonGagnante) {
        this.combinaisonGagnante = combinaisonGagnante;
    }

    public ArrayList<Combinaison> getCombinaisonsTentees() {
        return combinaisonsTentees;
    }

    public void setCombinaisonsTentees(ArrayList<Combinaison> combinaisonsTentees) {
        this.combinaisonsTentees = combinaisonsTentees;
    }

    public boolean isEnCours() {
        return isEnCours;
    }

    public void setEnCours(boolean enCours) {
        isEnCours = enCours;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }
}
