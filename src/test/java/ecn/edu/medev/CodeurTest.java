package ecn.edu.medev;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CodeurTest {

    private Codeur codeur=new Codeur("Alexis");
    private Pion pion1=new Pion("Blue",0);
    private Pion pion2=new Pion("Blue",0);
    private Pion pion3=new Pion("Red",0);
    private Pion pion4=new Pion("Red",1);


    @Test
    public void getMyPawns() {

        ArrayList<Pion> mesPions=new ArrayList<>();
        mesPions.add(pion1);
        mesPions.add(pion2);
        mesPions.add(pion3);
        mesPions.add(pion4);



        codeur.setMyPawns(mesPions);
        assertEquals(mesPions,codeur.getMyPawns());
    }

    @Test
    public void setMyPawns() {
    }
}