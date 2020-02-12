package _15_voting_booth;

import javax.swing.JOptionPane;

public class Photo_Booth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String S_age = JOptionPane.showInputDialog("How old are you in years?");
	String minister="";	
		int I_age = Integer.parseInt(S_age);
		
		
	if (18 <= I_age) {
	minister = JOptionPane.showInputDialog("Who do you think the next prime minister to be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, but you are to young to vote!!");
	}
	if (minister.equals("Jeremy Corbyn")){
		JOptionPane.showMessageDialog(null, "Well Said!!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Really??");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
