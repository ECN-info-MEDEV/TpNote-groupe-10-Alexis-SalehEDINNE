package ecn.edu.medev;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CombinaisonTest {

    private Pion pion1=new Pion("Blue",0);
    private Pion pion2=new Pion("Blue",0);
    private Pion pion3=new Pion("Red",0);
    private Pion pion4=new Pion("Red",1);

    private Pion pion5=new Pion("Green",0);
    private Pion pion6=new Pion("Blue",0);
    private Pion pion7=new Pion("Red",0);
    private Pion pion8=new Pion("Red",1);


    @Test
    public void affiche() {
    }

    @Test
    public void indice() {
    }

    @Test
    public void add() {
        Combinaison combi= new Combinaison();
        ArrayList<Pion> pions=new ArrayList<>();
        combi.setPions(pions);
        combi.add(pion1);
        ArrayList<Pion> result=new ArrayList<>();
        result.add(pion1);
        assertEquals(combi.getPions(),result);


    }

    @Test
    public void getPions() {
    }

    @Test
    public void setPions() {
    }
}