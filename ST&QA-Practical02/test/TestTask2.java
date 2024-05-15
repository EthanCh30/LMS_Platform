import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestTask2 {

    @Test
    public void testContains() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertTrue(stringList.contains("A"), "List should contain 'A'");
        assertFalse(stringList.contains("C"), "List should not contain 'C'");
    }

    @Test
    public void testIndexOf() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals(0, stringList.indexOf("A"), "Index of 'A' should be 0");
        assertEquals(1, stringList.indexOf("B"), "Index of 'B' should be 1");
        assertEquals(-1, stringList.indexOf("C"), "Index of 'C' should be -1 (not found)");
    }

    @Test
    public void testSet() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals("A", stringList.set(0, "C"), "set(0, 'C') should return 'A'");
        assertEquals("C", stringList.get(0), "get(0) should return 'C' after setting");
    }

    @Test
    public void testSize() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals(2, stringList.size(), "Size should be 2 after adding two elements");
    }
}
