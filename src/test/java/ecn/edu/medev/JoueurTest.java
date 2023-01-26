package ecn.edu.medev;

import org.junit.Test;

import static org.junit.Assert.*;

public class JoueurTest {

    private Joueur player=new Joueur("Alexis");

    @Test
    public void getName() {
        assertEquals("Alexis",player.getName());
    }

    @Test
    public void setName() {
    }

    @Test
    public void getRole() {
    }

    @Test
    public void setRole() {
    }

    @Test
    public void getScore() {
        assertEquals(0,player.getScore());

    }

    @Test
    public void setScore() {
    }
}