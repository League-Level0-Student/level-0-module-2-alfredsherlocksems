//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if( randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You have a nice personality!");
		}
		if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You have a great hair style!");
		}
		if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "What a creative imagination you have!");
		}
		if( randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You're so kind and thoughtfull!");
		}
		
		if( randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are a great football player!");
		}
		if( randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You're cool");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
