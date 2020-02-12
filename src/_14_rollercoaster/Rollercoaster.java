package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String S_height = JOptionPane.showInputDialog("What's your height in inches?");
int I_height = Integer.parseInt(S_height);

if (48 <= I_height)	{
	JOptionPane.showMessageDialog(null, "You're tall enough to ride!!");
}
if (48 > I_height)	{
	JOptionPane.showMessageDialog(null, "Sorry, you're too short to ride! :(");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
