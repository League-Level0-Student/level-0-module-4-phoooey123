

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

	for (int i = 0; i < 10; i++) {
		
	
		// 1. Get 2 numbers from the user and convert them to integer.
		String answer1 = JOptionPane.showInputDialog("Give me a number.");
		String answer2 = JOptionPane.showInputDialog("Give me another number");
		int number1 = Integer.parseInt(answer1);
		int number2 = Integer.parseInt(answer2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to add subtract multiply or divide?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		System.out.println(operation);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0) {
			add(number1, number2);
		}
		else if(operation == 1) {
			subtract(number1, number2);
		}
		else if(operation == 2) {
			multiply(number1, number2);
			}
		else if(operation == 3) {
			divide(number1, number2);
		}
	}	
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int a, int b) {
	 int c;
	c=a+b;
	JOptionPane.showMessageDialog(null, c);
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtract(int a, int b) {
	int c;
	c=a-b;
	JOptionPane.showMessageDialog(null, c);
	}
static void multiply(int a, int b) {
	int c;
	c=a*b;
	JOptionPane.showMessageDialog(null, c);
}
static void divide(int a, int b) {
	int c;
	c=a/b;
	JOptionPane.showMessageDialog(null, c);
}
}
