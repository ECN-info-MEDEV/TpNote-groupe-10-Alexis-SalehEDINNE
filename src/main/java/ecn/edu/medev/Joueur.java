/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.edu.medev;

import java.util.Scanner;

/**
 * Classe representant un Joueur de la partie
 * @author User
 */
public  class Joueur {
    /**
     * attribut qui indique le nom du joueur 
     */
    private String name;
    /**
     * un chaine de caractère qui indique le role d'un joueur
     */
    private String role;
    /**
     * un réal qui indique le score d'un joueur
     */
    private float score=0;
    /**
     * constructeur sans paramèttre d'un joueur qui prend une entrée clavier
     * pour construire un joueur
     */
    public Joueur(){
        System.out.println("veuillez entrer un nom de joueur svp : ");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        this.name=name;

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
