package EnumZadanie.Kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void testPlusOperation(){

        assertEquals(4, Operation.PLUS.calculate(2,2));
        assertEquals(4, Operation.PLUS.calculate(1.5,2.5));
        assertEquals(5, Operation.PLUS.calculate(2,3));
    }

    @Test
    public void testMinusOperation(){

        assertEquals(3,Operation.MINUS.calculate(9,6));
        assertEquals(3,Operation.MINUS.calculate(4.5,1.5));
        assertEquals(0,Operation.MINUS.calculate(9,9));

    }

    @Test

    public void testWhenDefaultOperationThenThrowError(){

        assertThrows(AssertionError.class, ()->Operation.DODATKOWAOPERACJA.calculate(5,5));

    }
}