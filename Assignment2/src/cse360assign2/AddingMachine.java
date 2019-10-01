
package cse360assign2;

/**
 * This is a class for Assignment 2
 * The class will perform operations using the add/subtract operands.
 * Each operation is saved to the history, which can be called using toString().
 * The total method will return the total of the calculations.
 * 
 * https://github.com/mchirco/Assignment2.git
 * @author Matteo Chirco
 */

public class AddingMachine {

	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total-= value;
		history = history + " - " + value;
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
		total = 0;
		history = "0";
	}
}
