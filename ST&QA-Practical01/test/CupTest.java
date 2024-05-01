import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CupTest {

    @Test
    @DisplayName("Test cup constructor with valid capacity")
    void testCupConstructor_ValidCapacity() {
        Cup cup = new Cup(500);
        assertEquals(500, cup.getCapacity());
        assertTrue(cup.isEmpty());
        assertFalse(cup.isFull());
    }

    @Test
    @DisplayName("Test cup constructor with zero capacity")
    void testCupConstructor_ZeroCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new Cup(0));
    }

    @Test
    @DisplayName("Test cup constructor with negative capacity")
    void testCupConstructor_NegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new Cup(-100));
    }

    @Test
    @DisplayName("Test fill method with valid amount")
    void testFill_ValidAmount() {
        Cup cup = new Cup(500);
        cup.fill(300);
        assertEquals(300, cup.getCurrentVolume());
        assertFalse(cup.isEmpty());
        assertFalse(cup.isFull());
    }

    @Test
    @DisplayName("Test fill method with amount exceeding capacity")
    void testFill_AmountExceedingCapacity() {
        Cup cup = new Cup(500);
        assertThrows(IllegalArgumentException.class, () -> cup.fill(600));
    }

    @Test
    @DisplayName("Test fill method with negative amount")
    void testFill_NegativeAmount() {
        Cup cup = new Cup(500);
        assertThrows(IllegalArgumentException.class, () -> cup.fill(-100));
    }

    @Test
    @DisplayName("Test empty method")
    void testEmpty() {
        Cup cup = new Cup(500);
        cup.fill(300);
        cup.empty();
        assertTrue(cup.isEmpty());
        assertFalse(cup.isFull());
    }
}
