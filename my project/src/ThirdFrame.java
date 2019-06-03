import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThirdFrame {
	ThirdFrame() {
		JFrame frame3 = new JFrame("MU");
		frame3.setSize(740, 420);
		frame3.setLayout(null);
		frame3.setLocationRelativeTo(null);
		
		Container c = frame3.getContentPane(); /// returns object of contentPane to c. object is in container type
		c.setBackground(Color.LIGHT_GRAY);
		
		JLabel lab1 = new JLabel("Admission Fee Structure");
		lab1.setBounds(170, 20, 400, 35);
		lab1.setForeground(Color.WHITE);
		lab1.setFont(new Font("Calbiri", Font.BOLD, 30));
		frame3.add(lab1);
		
		ImageIcon img = new ImageIcon("Fee1.png");
		JLabel image = new JLabel();
		image.setBounds(35, 60, 650, 330);
		image.setIcon(img);
		frame3.add(image);
		
		frame3.setVisible(true);
		
	}
}
