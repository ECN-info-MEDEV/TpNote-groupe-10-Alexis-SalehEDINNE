package ecn.edu.medev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    private Personne personneTest= new Personne();

    @Test
    void marcher() {
        this.personneTest.marcher();
        assertEquals(1,this.personneTest.getPas());
    }
}