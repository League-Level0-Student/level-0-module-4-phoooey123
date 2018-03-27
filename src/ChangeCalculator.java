//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels1 = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickels = Integer.parseInt(nickels1);
		// Ask the user how many dimes they have, and convert their answer
		String dimes1 = JOptionPane.showInputDialog("How many dimes?");
		int dimes = Integer.parseInt(dimes1);
		// Ask the user how many quarters they have, and convert their answer
		String quarters1 = JOptionPane.showInputDialog("How many quarters?");
		int quarters = Integer.parseInt(quarters1);
		// Calculate how much money the user has and save it in a double variable
		double total = nickels * 0.05 + quarters * 0.25 + dimes * 0.10;

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + total);
	}
}
