/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

import java.util.ArrayList;

/**
 * Classe représentant un pion 
 * @author User
 */
public class Pion {

    /**
     * représente la couleur d'un pion
     */
    private String color;
    /**
     * représente la position d'un pion
     */
    private int pos;
    /**
     * indique si un pion est décodé
     */
    private boolean isrevealed=false;

    /**
     * Indique si le pion est de la bonne couleur
     */
    private boolean isBonneCouleur=false;

    public void setIsrevealed(boolean isrevealed) {
        this.isrevealed = isrevealed;
    }

    public void setIsBonneCouleur(boolean isBonneCouleur) {
        this.isBonneCouleur = isBonneCouleur;
    }

    public String getColor() {
        return color;
    }

    public int getPos() {
        return pos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String toString() {
        return color;
    }
    /**
     * Constructeur à deux paramètres d'un pion
     * @param s
     * @param i 
     */
    public Pion(String s, int i) {
        this.pos = i;
        this.color = s;
    }

    /**
     * cette méthode permet de comparer deux pions tout en indiquant si
     * nous avons seulement la couleur qui est bonne
     * @param pDecodeur
     * @return 
     */
    public void comparer(Pion pDecodeur) {


        if (pDecodeur.getColor().equals(this.getColor())) {
            if (pDecodeur.getPos() == this.getPos()) {
                System.out.print("B");
                pDecodeur.setIsrevealed(true);

            }
            else{
                System.out.print("C");
                pDecodeur.setIsBonneCouleur(true);



            }


        }
        else{
            System.out.print('X');
        }
    }


    /**
     * cette méthode permet de comparer deux pions tout en indiquant si
     * nous avons seulement la couleur qui est bonne
     * @param pCodeurs
     * @return
     */
    public void comparer(ArrayList<Pion> pCodeurs) {
        for (int i=0;i<pCodeurs.size();i++){
            Pion currentPion=pCodeurs.get(i);
            if(currentPion.getColor().equals(this.getColor())){
              this.setIsBonneCouleur(true);

            }

        }
        Pion samePositionPion=pCodeurs.get(this.getPos());
        if(this.isBonneCouleur){
            if (samePositionPion.getPos() == this.getPos() && samePositionPion.getColor().equals(this.getColor())) {
                System.out.print("B");
                this.setIsrevealed(true);

            }
            else{
                System.out.print("C");



            }

        }








        else{
            System.out.print('X');
        }
    }

    public boolean isIsrevealed() {
        return isrevealed;
    }

    public boolean isBonneCouleur() {
        return isBonneCouleur;
    }

    public void setBonneCouleur(boolean bonneCouleur) {
        isBonneCouleur = bonneCouleur;
    }
}
