import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Max3Test {

    @Test
    public void testAllDifferentNumbers() {
        assertEquals(9, Max3.max3(9, 3, 4));
    }

    @Test
    public void testAllSameNumbers() {
        assertEquals(7, Max3.max3(7, 7, 7));
    }

    @Test
    public void testTwoSameNumbersThirdDifferent() {
        assertEquals(6, Max3.max3(6, 6, 3));
    }

    @Test
    public void testTwoSameNumbersLargerThanThird() {
        assertEquals(8, Max3.max3(8, 4, 4));
    }

    @Test
    public void testTwoSameNumbersSmallerThanThird() {
        assertEquals(5, Max3.max3(4, 5, 4));
    }

    @Test
    public void testAllNegativeNumbers() {
        assertEquals(-2, Max3.max3(-5, -2, -3));
    }
}