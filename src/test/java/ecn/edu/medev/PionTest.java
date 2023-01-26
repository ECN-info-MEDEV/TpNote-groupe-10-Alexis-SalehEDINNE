package ecn.edu.medev;

import org.junit.Test;

import static org.junit.Assert.*;

public class PionTest {

    private Pion pion1=new Pion("Blue",0);
    private Pion pion2=new Pion("Blue",0);
    private Pion pion3=new Pion("Red",0);
    private Pion pion4=new Pion("Red",1);



    @Test
    public void getColor() {
    }

    @Test
    public void comparer() {
        pion1.comparer(pion3);
        assertEquals(false,pion3.isIsrevealed());
    }

    @Test
    public void setIsrevealed() {
        pion1.comparer(pion2);
        assertEquals(true,pion2.isIsrevealed());
    }

    @Test
    public void setIsBonneCouleur() {
       Pion pionToTest=new Pion("Violet",1);
       pionToTest.setColor("Green");
       assertEquals("Green",pionToTest.getColor());
    }

    @Test
    public void testGetColor() {
    }

    @Test
    public void getPos() {
    }

    @Test
    public void setColor() {
    }

    @Test
    public void setPos() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testComparer() {
    }
}