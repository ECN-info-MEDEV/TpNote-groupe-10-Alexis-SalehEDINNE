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


    @Test
    public void testMarcher() {
        this.personneTest.marcher();
        assertEquals(1,this.personneTest.getPas());
    }

    @Test
    public void getPas() {
        this.personneTest.setPas(0);
        for(int i=0;i<3;i++){
            this.personneTest.marcher();

        }
        assertEquals(3,this.personneTest.getPas());
    }

    @Test
    public void setPas() {
        this.personneTest.setPas(0);

        assertEquals(0,this.personneTest.getPas());
    }
}