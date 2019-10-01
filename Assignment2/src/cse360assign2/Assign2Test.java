package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assign2Test {

	@Test
	void test() {
	AddingMachine ad = new AddingMachine();
	ad.add(4);
	ad.subtract(2);
	ad.add(5);
	
	System.out.println("toString: " + ad.toString());
	System.out.println("Total: " + ad.getTotal());

	
	}

}
