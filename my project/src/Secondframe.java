import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Secondframe extends Main{
	Secondframe()
	{
		JFrame frame2 = new JFrame("confirmation message");
		frame2.setSize(600, 300);
		frame2.setLayout(null);
		frame2.setLocationRelativeTo(null);
		
		Container c = frame2.getContentPane(); /// returns object of contentPane to c. object is in container type
		c.setBackground(Color.lightGray);
		
		JLabel lab = new JLabel("You Have Entered Following Inputs");
		lab.setBounds(30,10,550,35);
		lab.setForeground(Color.BLACK);
		lab.setFont(new Font("Calbiri", Font.BOLD, 30));
		frame2.add(lab);
		
		JLabel lab1 = new JLabel("Your name is "+str1+" "+str2);
		lab1.setBounds(90,60,450,25);
		lab1.setForeground(Color.WHITE);
		lab1.setFont(new Font("Calbiri", Font.BOLD, 20));
		frame2.add(lab1);
		
		JLabel lab2 = new JLabel("Your Home Address "+str3);
		lab2.setBounds(90,100,450,25);
		lab2.setForeground(Color.WHITE);
		lab2.setFont(new Font("Calbiri", Font.BOLD, 20));
		frame2.add(lab2);
		
		JLabel lab3 = new JLabel("Your Postcode is "+str4);
		lab3.setBounds(90,140,450,25);
		lab3.setForeground(Color.WHITE);
		lab3.setFont(new Font("Calbiri", Font.BOLD, 20));
		frame2.add(lab3);
		
		frame2.setVisible(true);
		
		
		
	}
	
}
