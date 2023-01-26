package ecn.edu.medev;

import java.util.ArrayList;
import java.util.Scanner;

public class Manche {
    /**
     * indique le joueur avec le role codeur dans cette manche
     */
    private Codeur codeurManche;
    /**
     * indique el joueur avec le role décodeur dans cette manche
     */
    private Decodeur decodeurManche;
    /**
     * indique le nombre de tentatives du décodeur restante pour deviner le code de l'adversaire
     */
    int nombreTentatives=12;
    /**
     * représente la combinaison gagnante choisi par le codeur
     */
    ArrayList<Pion> combinaisonGagnante;
    /**
     * représente la combinaison actuelle tentée par le décodeur
     */
    ArrayList<Combinaison> combinaisonsTentees=new ArrayList<>();

    /**
     * indique si cette manche n'est pas encore terminé
     */
    boolean isEnCours=true;
    /**
     * indique si la manche est terminé
     */
    boolean isOver=false;

    /**
     * constructeur pour une manche avec deux paramètres 
     * @param c le codeur de cette manche
     * @param d le décodeur de cette manche
     */
    public Manche(Codeur c,Decodeur d){
        this.codeurManche=c;
        this.decodeurManche=d;
        this.combinaisonGagnante=codeurManche.getMyPawns();
        System.out.println("Creation d'une nouvelle manche");
        Scanner scanner= new Scanner(System.in);

        while(nombreTentatives>0 && !this.isOver){
            this.codeurManche.getPlayerWithThisRole().setScore(this.codeurManche.getPlayerWithThisRole().getScore()+1);
            System.out.println();
            System.out.println("Il reste " + nombreTentatives + " tentatives ");
            nombreTentatives=nombreTentatives-1;

            System.out.println( decodeurManche.getNomDuJoeur()+ " Veuillez saisir une combinaison ");
            Combinaison currentCombinaison= new Combinaison();

            for(int i=0;i<4;i++){
                String colorName=scanner.next();
                Pion pionCombinaisonGagnante=new Pion(colorName,i);
                currentCombinaison.add(pionCombinaisonGagnante);


            }
            currentCombinaison.affiche();
            this.combinaisonsTentees.add(currentCombinaison);
            currentCombinaison.indice(currentCombinaison.getPions(),combinaisonGagnante);
            this.remporterLaManche(currentCombinaison);

        }
        System.out.println("Fin de la manche");

    }


    public void remporterLaManche(Combinaison combinaisonTentee) {
        System.out.println("verification si la manche est terminée ou non '");
        boolean isOverCal = true;
        for (int i = 0; i < 4; ) {
            if (!combinaisonTentee.getPions().get(i).isIsrevealed()) {
                isOverCal = false;
            }
        }
        this.isOver = isOverCal;

    }
    // ----------------here you find all the getters and the setters---------------------------
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
