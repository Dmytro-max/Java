package org.example;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
class Variant10Test {

    @Test
    public void ifPossitiveTest(){
        assertEquals(1, 1, "1 should be equals to 1");
    }

    @Test
    public void casePossitiveTest(){
        Variant10.Direction expected = Variant10.Direction.EAST;
        Variant10.Direction actual =  Variant10.caseTask(2);
        assertEquals(expected, actual);
    }

}