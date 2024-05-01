import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @DisplayName("Test factorial of positive number")
    void testFactorial_PositiveNumber() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(40320, Factorial.factorial(8));
    }

    @Test
    @DisplayName("Test factorial of negative number")
    void testFactorial_NegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-2));
    }

    @Test
    @DisplayName("Test factorial of number exceeding limit")
    void testFactorial_ExceedingLimit() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(25));
    }
}
