package ecn.edu.medev;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de Test de la classe principale
 */
public class MainTest {

    /**
     * Test de la méthode main
     */
    @Test
    public void main() {

        assertEquals(1,1);
    }


    /**
     * Test de la méthode getZero
     */
    @Test
    public void getZero() {
        assertEquals(0,Main.getZero());
    }
}