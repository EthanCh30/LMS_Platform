import java.util.Arrays;

/**
 * Class that simulates a list for storing Strings.
 *
 * @author Zhiyun Chen
 * @version 1
 */
public class StringList {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 4;

    /**
     * The amount to grow this {@code StringList} when {@code grow()} is called.
     */
    private static final int GROW = 5;
    /**
     * The size of the {@code StringList} (the number of elements it contains).
     */
    private int size = 0;
    /**
     * The array buffer into which the elements of the {@code StringList} are stored.
     */
    private String[] elementData;

    /**
     * Default constructor that creates an empty list with a default capacity of 4 Strings.
     */
    public StringList() {
        this.elementData = new String[DEFAULT_CAPACITY];
        this.size = 0; // Initialize size to 0
    }


    /**
     * Increases the size of the internal array {@code elementData} by {@code GROW}.
     *
     * @return the new array with increased size
     */
    private String[] grow() {
        String[] tempArray = Arrays.copyOf(elementData, elementData.length + GROW);
        return tempArray;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element the element to be appended to this list
     * @return true (as specified by the Collection interface)
     */
    public boolean add(String element) {
        if (size == elementData.length) {
            elementData = grow();
        }
        elementData[size] = element;
        size++;
        return true;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to be returned
     * @return the element at the specified position in this list
     * @throws IllegalArgumentException if the index is out of range (index < 0 || index >= size)
     */
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        return elementData[index];
    }

    /**
     * Returns a formatted string representation of the elements in this list.
     * If the list is empty, returns "List is empty: []".
     * Otherwise, returns a string in the format "Printing List: [e1, e2, ..., en]".
     *
     * @return a string representation of the elements in this list
     */
    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty: []";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Printing List: [");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elementData[i]).append(", ");
        }
        sb.append(elementData[size - 1]).append("]");
        return sb.toString();
    }

    /**
     * Checks if this list contains the specified element.
     *
     * @param element the element to be checked for containment in this list
     * @return true if this list contains the specified element, false otherwise
     */
    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     *
     * @param element the element to search for
     * @return the index of the first occurrence of the specified element, or -1 if not found
     */
    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * Returns the element previously at the specified position.
     *
     * @param index   the index of the element to be replaced
     * @param element the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IllegalArgumentException if the index is out of range (index < 0 || index >= size)
     */
    public String set(int index, String element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        String previousElement = elementData[index];
        elementData[index] = element;
        return previousElement;
    }


    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * Constructor to create an empty list of the specified size.
     *
     * @param initialCapacity the initial capacity of the list
     */
    public StringList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }
        this.elementData = new String[initialCapacity];
    }

    /**
     * @param index   the index at which the element is to be inserted
     * @param element the element to be inserted
     * @throws IllegalArgumentException if the index is out of range (index < 0 || index > size)
     */
    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        if (size == elementData.length) {
            elementData = grow();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    /**
     * Removes the element at the specified position in the list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IllegalArgumentException if the index is out of range (index < 0 || index >= size)
     */
    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        String removedElement = elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        size--;
        return removedElement;
    }

    /**
     * Removes the first occurrence of the specified element from the list, if it is present.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *
     * @param element the element to be removed from the list, if present
     * @return true if the list contained the specified element, false otherwise
     */
    public boolean remove(String element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {
        size = 0;
    }

    /**
     * Checks if the list contains no elements.
     *
     * @return true if the list contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Returns the index of the last occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     *
     * @param element the element to search for
     * @return the index of the last occurrence of the specified element, or -1 if not found
     */
    public int lastIndexOf(String element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a StringList of the portion of this list between the specified fromIndex, inclusive,
     * and toIndex, exclusive.
     *
     * @param fromIndex the starting index (inclusive)
     * @param toIndex   the ending index (exclusive)
     * @return a view of the specified range within this list
     */
    public StringList subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid indices");
        }
        StringList sublist = new StringList(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(elementData[i]);
        }
        return sublist;
    }

    /**
     * Shifts any succeeding elements to the left (reduces their index).
     *
     * @param fromIndex the starting index (inclusive)
     * @param toIndex   the ending index (exclusive)
     */
    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid indices");
        }
        int numToRemove = toIndex - fromIndex;
        if (numToRemove > 0) {
            System.arraycopy(elementData, toIndex, elementData, fromIndex, size - toIndex);
            size -= numToRemove;
        }
    }

    /**
     * Compares the specified StringList with this list for equality.
     * Two lists are equal if they contain the same elements in the same order.
     *
     * @param sl the other StringList to compare
     * @return true if the lists are equal, false otherwise
     */
    public boolean equals(StringList sl) {
        if (sl.size() != this.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!sl.get(i).equals(elementData[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return an array containing all the elements in this list
     */
    public String[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

}

