package ecn.edu.medev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.Before;

public class PersonneTest {

    private Personne personneTest= new Personne();

    @Test
    public void marcher() {
        this.personneTest.marcher();
        assertEquals(1,this.personneTest.getPas());
    }
}