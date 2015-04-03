package howard.edu.sycs363.spring15.lab3;

public class IntegerArrayListDriver{
	
	/**
	 * Print every item present in the IntegerArrayList supplied.
	 * @param array 
	 */
	private static void printArray(IntegerArrayList array){
		System.out.println("\tUpdated Array:\n\tIndex  Element");
		for (int i = 0; i < array.getLengthOfArray() ;i++){ 
			System.out.println("\t\t" + i + "\t" + array.get(i));
		}
	}
	
	/**
	   * Test the usage of class IntegerArrayList 
	   * @param arg String array containing command line arguments.
	   * @return This has no return value.
	   */ 
	public static void main(String[] args) {
		IntegerArrayList test = new IntegerArrayList();
		
		System.out.println("Is the stack empty? " + test.isEmpty() + "\n");
		
		System.out.println("Adding 5,6,7 to array.");
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		printArray(test);
		
		System.out.println("\nIs the stack empty? " + test.isEmpty() + "\n");
		
		System.out.println("Adding 8 to index 1:");
		test.add(1,8);
		printArray(test);

		System.out.println("\nIndex of 5 is "+ test.indexOf(5)+".");
		
		System.out.println("\nRemoving element at index 2.");
		System.out.println("\tThe element at index 2 is " + test.remove(2) + ".");
		printArray(test);
		
		for (int i=0;i<60;i++){
			test.add(i);
		}
		System.out.println("\nAddition of 60 more elements successful.\n"
				+ "\tThe initial array was of size 50. Now it has increased dynamically."
				+ "\n\tElement at index " + 54 + " is " + test.get(54));
		
		
		System.out.print("\nCreating Integer array with initial array size of 20.");
		IntegerArrayList test1 = new IntegerArrayList(20);
		test1.add(1);
		test1.add(2);
		test1.add(3);
		System.out.println("\nElement at index 0 of this new array is " + test1.get(0)+".");
		printArray(test1);
		
	}
}
