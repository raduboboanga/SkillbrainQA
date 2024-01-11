package org.exemple.annalynsinfiltration;


import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste {

    @Test
    public void Testcaracternuestegasit(){
        String propozitie = "Ana are mere. ";
        boolean rezultat = Main.esteCaracterulPrezent(propozitie ,  'i' );
        Assertions.assertFalse(rezultat);
    }

    @Test
    public void testEstePrim(){
        boolean prim = Main.estePrim(3);
        Assertions.assertTrue(prim);
    }

    @Test
    public void testNuEstePrim(){
        boolean prim = Main.estePrim(4);
        Assertions.assertFalse(prim);
    }
}
