import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnAnInstanceOfFizzBuzz() {
        assertNotNull(fizzBuzz);
    }

    @Test
    public void shouldReturnFizzWhenInputIsDivisibleBy3() {
        assertEquals("Fizz", fizzBuzz.calculate(3));
        assertEquals("Fizz", fizzBuzz.calculate(6));
        assertEquals("Fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsDivisibleBy5() {
        assertEquals("Buzz", fizzBuzz.calculate(5));
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIsDivisibleBy3And5() {
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }

    @Test
    public void shouldReturnIntegerWhenInputIsNotDivisibleBy3Or5() {
        assertEquals("2", fizzBuzz.calculate(2));
    }
}




