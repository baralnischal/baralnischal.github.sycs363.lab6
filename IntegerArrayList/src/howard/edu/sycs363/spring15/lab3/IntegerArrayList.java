package howard.edu.sycs363.spring15.lab3;

/**
 * This class represents a integer array list that functions as a dynamic integer array.
 * @author Nischal Baral
 */
public class IntegerArrayList {

	/**
	 * Integer Array that acts as the dynamic integer array list.
	 */
	private int[] arrayList;
	
	/**
	 * The current size of dynamic array list.
	 */
	private int size = 0;
	
	/**
	 * The size of arrayList array.
	 */
    private int maxSize = 50;
    
	/**
     * Initializes array of size 50.
     */
    public IntegerArrayList(){
    	arrayList = new int[50];
    }

    /**
     * Initializes array of size size.
     * @param size
     */
    public IntegerArrayList(int size){
    	arrayList = new int[size];
    	maxSize = size;
    }

    /**
     * Adds an integer value to the end of the list/array.
     * @param value
     */
    public void add(int value){
    	if (size < maxSize){
    		arrayList[size] = value;
    		size++;
    	} else {
    		increaseArraySize();
    		// Now add the value into the array and increase size.
    		arrayList[size] = value;
    		size++;
    	}
    }

    /**
     * Inserts an integer value at the specified index if 
     * 	index > 0 and index < maxSize.
     * @param index
     * @param value
     */
    public void add(int index, int value){
    	if ( !(size < 0  || size >= maxSize) ){
    		for (int i = size; i > index; i--){
    			arrayList[i] = arrayList[i-1];
    		}
    		arrayList[index] = value;
    		size++;
    	} else {
    		increaseArraySize();
    		// Now add the value into the array and increase size.
    		arrayList[size] = value;
    		size++;
    	}
    }

    /**
     * Returns the integer value at the specified index.
     * @param index
     * @return
     */
    public int get(int index){
    	// If the index is larger than maxSize throws java.lang.ArrayIndexOutOfBoundsException
    	return arrayList[index];
    }

    /**
     * Returns the index of the specified value in the list/array.  Returns -1 if not present.
     * @param value The integer value being inserted into the list.
     * @return
     */
    public int indexOf(int value){
    	// Loop through the arrayList to find the element
    	for (int i = 0; i < size; i++){
    		if (value==arrayList[i])
    			return i; // return the index of the found element.
    	}
    	return -1;
    }

    /**
     * Returns true if the list/array is empty, else false.
     * @return Weather the list is empty or not.s
     */
    public boolean isEmpty(){
    	// size tracks the size of the dynamic list in arrayList.
    	return size == 0;
    }

    /**
     * Removes and returns the value from the specified index in the list/array.
     * @param index Position to get item from
     * @return
     */
    public int remove(int index){
    	// Move elements after index in arrayList one place left to delete element at index.
    	int temp = arrayList[index];
    	for (int i = index; i < size-1; i++){
    		arrayList[i] = arrayList[i+1];
    	}
    	size--;
    	return temp;
    }
    
    /**
     * Helper function to facilitate use of size of list in client. 
     */
    public int getLengthOfArray(){
    	return size;
    }
    
    /**
     * Helper function that increases the size of the array arrayList to hold more values.
     * Specifically increases the capacity of the array by 50 elements. 
     */
    private void increaseArraySize(){
		// Creating new larger array to hold more than maxSize elements.
		int[] tempArrayList = new int[maxSize+50];
		// Copy all current elements in arrayList into larger array. 
		for (int i = 0; i < size; i++){
			tempArrayList[i] = arrayList[i];
		}
		// Make arrayList point to larger array.
		arrayList =tempArrayList;
    }
}