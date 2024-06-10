import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        String expectedMessage = "Number must be non-negative";
        try {
            Factorial.calculate(-1);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}

