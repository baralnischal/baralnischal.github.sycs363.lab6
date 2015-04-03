package howard.edu.sycs363.spring15.lab5;

import static org.junit.Assert.*;
import howard.edu.sycs363.spring15.lab3.IntegerArrayList;

import org.junit.Test;

/*
 * JUnit Test Class for IntegerArrayList. 
 */
public class IntegerArrayListTest {

	@Test
	public void testAdd() {
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		assertEquals("Should return 10", 10, tester.get(0));
		
		// Testing for dynamic array function used in add function.
		IntegerArrayList testerDynamic = new IntegerArrayList(1); // max size 1
		testerDynamic.add(4);
		testerDynamic.add(5); // needs to increase size to accommodate 5
		assertEquals("Should return 5", 5, testerDynamic.get(1));
	}
	
	@Test
	public void testAddWithValue(){
	   IntegerArrayList tester = new IntegerArrayList();
	   tester.add(0, 20);
	   tester.add(3, 50);
	   
	   // Tests
	   assertEquals("Should return 20", 20, tester.get(0));
	   assertEquals("Should return 30", 50, tester.get(3));
	   
	   // Testing for dynamic array increase function using in add with value function.
		IntegerArrayList testerDynamic = new IntegerArrayList(1); // max size 1
		testerDynamic.add(0,50);
		testerDynamic.add(1,10); // needs to increase size to accommodate 5
		assertEquals("Should return 10", 10, testerDynamic.get(1));
	}
	
	@Test
	public void testGet(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(20);
		tester.add(40);
		
		// Tests
		assertEquals("Should return 40", 40, tester.get(1));
		assertEquals("Should return 20", 20, tester.get(0));
	}
	
	@Test
	public void testIndexOf(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		tester.add(20);
		
		// Tests
		assertEquals("Should return 0", 0, tester.indexOf(10));
		assertEquals("Should return 1", 1, tester.indexOf(20));
		assertEquals("Should return -1", -1, tester.indexOf(100)); // -1 for value not in class
	}
	
	@Test
	public void testIsEmpty(){
		IntegerArrayList tester = new IntegerArrayList();
		
		// Tests
		assertEquals("Should return False", true, tester.isEmpty());
		tester.add(10);
		assertEquals("Should return True", false, tester.isEmpty());
	}
	
	@Test
	public void testRemove(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		tester.remove(0);
		
		// Tests
		assertEquals("Should return True", true, tester.isEmpty());
	}
}
