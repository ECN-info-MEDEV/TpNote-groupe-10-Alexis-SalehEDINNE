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
abstract class Role {
    
    

   private String nomDuJoueur;

   private Joueur playerWithThisRole;

   public String getNomDuJoeur() {
      return nomDuJoueur;
   }

   public void setNomDuJoeur(String nomDuJoeur) {
      this.nomDuJoueur = nomDuJoeur;
   }

   public String getNomDuJoueur() {
      return nomDuJoueur;
   }

   public void setNomDuJoueur(String nomDuJoueur) {
      this.nomDuJoueur = nomDuJoueur;
   }

   public Joueur getPlayerWithThisRole() {
      return playerWithThisRole;
   }

   public void setPlayerWithThisRole(Joueur playerWithThisRole) {
      this.playerWithThisRole = playerWithThisRole;
   }
}
