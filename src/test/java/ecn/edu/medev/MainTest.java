package ecn.edu.medev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Test de la classe principale
 */
class MainTest {

    /**
     * Test de la méthode main
     */
    @Test
    void main() {

        assertEquals(1,1);
    }


    /**
     * Test de la méthode getZero
     */
    @Test
    void getZero() {
        assertEquals(0,Main.getZero());
    }
}