import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestTask4 {

    @Test
    public void testLastIndexOf() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        stringList.add("A");
        assertEquals(2, stringList.lastIndexOf("A"), "Last index of 'A' should be 2");
    }

    @Test
    public void testSubList() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        StringList sublist = stringList.subList(1, 3);
        assertEquals(2, sublist.size(), "Size of sublist should be 2");
        assertEquals("B", sublist.get(0), "First element of sublist should be 'B'");
    }

    @Test
    public void testRemoveRange() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.removeRange(0, 2);
        assertEquals(1, stringList.size(), "Size of list should be 1 after removing range");
        assertEquals("C", stringList.get(0), "First element of list should be 'C'");
    }

    @Test
    public void testEquals() {
        StringList stringList1 = new StringList();
        stringList1.add("A");
        stringList1.add("B");
        StringList stringList2 = new StringList();
        stringList2.add("A");
        stringList2.add("B");
        assertTrue(stringList1.equals(stringList2), "Lists should be equal");
    }

    @Test
    public void testToArray() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        String[] array = stringList.toArray();
        assertEquals(2, array.length, "Array length should be 2");
        assertEquals("A", array[0], "First element of array should be 'A'");
    }
}
