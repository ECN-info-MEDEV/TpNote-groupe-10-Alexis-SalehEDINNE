
package ecn.edu.medev;

import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeurTest {
 
    @Test
    public void devinerTest(Joueur j){
        ArrayList<String> expectedcolors = new ArrayList<>(Arrays.asList("V","B","N","R"));
        ArrayList<Pion>  expected = new ArrayList<>();
        int i=0;
        for(String s : expectedcolors){
            Pion p = new Pion(s,i);
            expected.add(p);
        }
        Decodeur d = new Decodeur(j);
        System.out.println("expected is V , B , N , R");
        ArrayList<Pion> guess = d.deviner();
        assertEquals(expected, guess);
       
    }
    
}

