import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Swing Test");
		frame.setSize(600,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JLabel lab = new JLabel("Hello World");
		frame.add(lab);
		lab.setBounds(10, 10, 100, 20);
		
		JLabel lab2 = new JLabel("CSE 39th");
		frame.add(lab2);
		lab2.setBounds(120,10,100,20);
		
		JLabel lab3 = new JLabel("It's Barun");
		frame.add(lab3);
		lab3.setBounds(230, 10, 100, 20);
	}

}
