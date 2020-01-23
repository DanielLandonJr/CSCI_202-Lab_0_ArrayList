/**
 * Date Written:
 * Purpose: Simulates an ArrayList for Strings. MyStringArrrayList
 * is an abstract data type (ADT).
 *  
 * <p><strong>author: </strong><em>Daniel C. Landon Jr.</em></p>
 * <p><strong>instructor: </strong><em>Dr. Bob Walsh</em></p>
 * <p><strong>class: </strong><em>CSCI 202 - Introduction to Software Systems</em></p>
 * <p><strong>date: </strong><em>01.23.2020</em></p>
 * <p><strong>NOTE: </strong><em>Class supplied as part of course, modified per instructions for assignment.</em></p>
 *
 * @author Suranga Hettiarachchi
 */
public class MyStringArrayList {
    
    private String[] array; //container of this array list
    private static final int CAPACITY = 10; // initial capacity of the array
    private int size; // number of elements in the array
    
    /**
     * This default constructor sets the container capacity to be 10 and size to
     * 0, where container is empty.
     */
    public MyStringArrayList() {
        array = new String[CAPACITY];
        size = 0;
        
    }//comstructor
    
    /**
     *
     * @param e - element to be added
     * requires: e != null
     * ensures : e added to the end of this array list.
     * Add a new element at the end of this list
     */
    public void addLast(String e) {
        if (isFull()) { // increase capacity if array is full
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }//for
            array = temparray; // make temparray the container
        }//if
        array[size] = e; //add element e to last empty location.
        size++; // increment the size of this array list
    }//addLast
    
    /* This method is only used by this class.
     * returns true if this array list is full, otherwise returns false.
     */
    private boolean isFull() {
        return size == array.length;
    }//Full
    
    /**
     * requires: none
     * ensures: self.size == #self.size
     * @return current size of this array list
     * returns the current size (# of elements) of this list
     */
    public int getSize() {
        return size;
    }//Size
    
}

