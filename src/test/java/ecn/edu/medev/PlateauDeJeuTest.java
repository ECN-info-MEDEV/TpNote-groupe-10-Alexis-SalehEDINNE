package ecn.edu.medev;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauDeJeuTest {

    @Test
    public void checkTentative() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void creationPartie() {
    }

    @Test
    public void testToString1() {
    }

    @Test
    public void testCreationPartie() {
    }

    @Test
    public void switchCodeur() {
        Joueur player1=new Joueur("Alexis");
        Joueur player2=new Joueur("Alexis");

        Codeur c=new Codeur(player1);
        Decodeur d= new Decodeur(player2);

    }
}