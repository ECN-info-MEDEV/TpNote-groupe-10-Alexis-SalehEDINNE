/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

/**
 *
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
    private boolean isrevealed;

    /**
     * Indique si le pion est de la bonne couleur
     */
    private boolean isBonneCouleur;

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


    public String toString(){
        return color;
    }
    
}
