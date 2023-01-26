/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

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
    
}
