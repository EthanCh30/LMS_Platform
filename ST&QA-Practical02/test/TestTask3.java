import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestTask3 {

    @Test
    public void testConstructorWithInitialCapacity() {
        StringList stringList = new StringList(10);
        assertEquals(0, stringList.size(), "Initial size should be 0");
    }

    @Test
    public void testAddAtIndex() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        stringList.add(1, "C");
        assertEquals("C", stringList.get(1), "get(1) should return 'C'");
    }

    @Test
    public void testRemoveByIndex() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals("A", stringList.remove(0), "remove(0) should return 'A'");
        assertEquals(1, stringList.size(), "Size should be 1 after removing one element");
    }

    @Test
    public void testRemoveByElement() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertTrue(stringList.remove("A"), "Removing 'A' should return true");
        assertFalse(stringList.remove("C"), "Removing 'C' should return false");
    }

    @Test
    public void testClear() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        stringList.clear();
        assertTrue(stringList.isEmpty(), "List should be empty after clear()");
    }

    @Test
    public void testIsEmpty() {
        StringList stringList = new StringList();
        assertTrue(stringList.isEmpty(), "List should be empty initially");
        stringList.add("A");
        assertFalse(stringList.isEmpty(), "List should not be empty after adding an element");
    }
}
