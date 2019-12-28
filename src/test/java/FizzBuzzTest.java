import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void fizzBuzzReturnFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5, 7));
    }

    @Test
    public void fizzBuzzReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5, 7));
    }

    @Test
    public void fizzBuzzReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5,7));
    }

    @Test
    public void fizzBuzzReturnNormal() {
        assertEquals("1", FizzBuzz.fizzBuzz(1, 3, 5,7));
    }

    @Test
    public void fizzBuzzReturnWhizz() {
        assertEquals("Whizz", FizzBuzz.fizzBuzz(7, 3, 5,7));
    }

    @Test
    public void fizzBuzzReturnFizzWhizz() {
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(21, 3, 5, 7));
    }

    @Test
    public void fizzBuzzReturnBuzzWhizz() {
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(35, 3, 5, 7));
    }

    @Test
    public void fizzBuzzReturnFizzBuzzWhizz() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.fizzBuzz(105, 3, 5, 7));
    }

    @Test
    public void fizzBuzzInputZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid Input");
        FizzBuzz.fizzBuzz(0, 1, 5,7);
//        assertEquals("0", FizzBuzz.fizzBuzz(0, 1, 5,7));

    }

    @Test
    public void fizzBuzzFirstNumZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid Input");
        FizzBuzz.fizzBuzz(1, 0, 5, 7);
//        assertEquals("Error", FizzBuzz.fizzBuzz(1, 0, 5, 7));
    }


}