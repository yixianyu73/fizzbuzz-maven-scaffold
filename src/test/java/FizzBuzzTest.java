import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5));
    }

    @Test
    public void fizzBuzzReturnFizzbuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5));
    }

    @Test
    public void fizzBuzzReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5));
    }

    @Test
    public void fizzBuzzReturnNormal() {
        assertEquals("1", FizzBuzz.fizzBuzz(1, 3, 5));
    }

    @Test
    public void fizzBuzzInputZero() {
        assertEquals("0", FizzBuzz.fizzBuzz(0, 1, 5));
    }

    @Test
    public void fizzBuzzFirstNumZero() {
        assertEquals("Error", FizzBuzz.fizzBuzz(1, 0, 5));
    }
}