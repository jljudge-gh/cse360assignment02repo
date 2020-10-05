/**
 * Description: Performs basic addition and subtraction operations, prints both operations and result
 * @author Jason Judge
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private StringBuffer operations;
 /**
  * Constructor of AddingMachine
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    operations = new StringBuffer("0");
  }
  
 /**
  * Returns the total of the machine
  * @return total of calculations
  */
  public int getTotal () {
    return total;
  }
 /**
  * Adds a value to the total
  * @param number that will be added 
  */
  public void add (int value) {
	  total += value;
	  operations.append(" + " + value);
  }
  
 /**
  * Subtracts a value to the total
  * @param number that will be subtracted 
  */
  public void subtract (int value) {
	  total -= value;
	  operations.append(" - " + value);
  }

 /**
  * Returns a string that shows the operations and final answer
  * @return returns the result of operations and every operation
  */
  public String toString () {
    return operations.toString() + " = " + getTotal();
  }

 /**
  * Resets the total and operation string
  */
  public void clear() {
	  total = 0;
	  operations.delete(0, operations.length());
  }
}