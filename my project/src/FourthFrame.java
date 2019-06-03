import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FourthFrame extends Main {

	FourthFrame()
	{
		JFrame frame4 = new JFrame("MU");
		frame4.setSize(480,300);
		frame4.setLayout(null);
		frame4.setLocationRelativeTo(null);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame4.getContentPane(); /// returns object of contentPane to c. object is in container type
		c.setBackground(Color.LIGHT_GRAY);
		
		JTextArea area1 = new JTextArea("Congratulations "+str1+" "+str2+"\nYou have successfully submitted\nyour application");
		area1.setBounds(45, 30, 350, 100);
		area1.setForeground(Color.WHITE);
		area1.setBackground(Color.LIGHT_GRAY);
		area1.setFont(new Font("Calbiri", Font.PLAIN, 20));
		area1.setEditable(false);
		frame4.add(area1);
		

		frame4.setVisible(true);
	}
}
