/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Codeur extends Role{

    private ArrayList<Pion> myPawns;
    
    /**
     * cette methode permet au codeur d'indiquer que l'un des pions 
     * du décodeur est correcte
     */
    public void indice(){
        
    }
    @Override
    void choisir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}