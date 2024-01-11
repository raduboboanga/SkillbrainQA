package org.exemple.annalynsinfiltration;

import org.example.annalynsinfiltration.AnnalynsInfiltration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnnalynsInfiltrationTest {
AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
    @Test
    public void canPrisionerCanBeFreedPositive(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                false, false);
        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisionerCanBeFreedPositive2(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                true, true);
        Assertions.assertTrue(actual);
    }

    @Test
    public void canPrisionerCanBeFreedPositive3(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                true, false,
                true, false);
        Assertions.assertFalse(actual);
    }
@Test
public void canPrisionerCanBeFreedPositive4(){
    boolean actual = annalynsInfiltration.canFreePrisoner(
            false, true,
            true, false);
    Assertions.assertFalse(actual);
}

@Test
public void canPrisionerCanBeFreedPositive5(){
    boolean actual = annalynsInfiltration.canFreePrisoner(
            false, true,
            false, true);
    Assertions.assertFalse(actual);
}

@Test
public void canPrisionerCanBeFreedPositive6(){
    boolean actual = annalynsInfiltration.canFreePrisoner(
            true, true,
            false, false);
    Assertions.assertFalse(actual);
}

@Test
public void canPrisionerCanBeFreedPositive7(){
    boolean actual = annalynsInfiltration.canFreePrisoner(
            false, false,
            false, true);
    Assertions.assertFalse(actual);
}
}
