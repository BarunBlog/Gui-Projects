import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Menu Card");
		frame.setSize(1050, 660);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane(); /// returns object of contentPane to c. object is in container type
		c.setBackground(Color.RED);

		ImageIcon img1 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\kfc.jpg");
		JLabel image1 = new JLabel();
		image1.setBounds(430, 10, 180, 100);
		image1.setIcon(img1);
		frame.add(image1);

		JTextArea area1 = new JTextArea("KFC Menu Card");
		area1.setBounds(20, 10, 150, 25);
		area1.setForeground(Color.red);
		area1.setBackground(Color.BLACK);
		area1.setFont(new Font("Calbiri", Font.BOLD, 20));
		area1.setEditable(false);
		frame.add(area1);

		ImageIcon img2 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\burger.jpg");
		JLabel image2 = new JLabel();
		image2.setBounds(20, 50, 180, 100);
		image2.setIcon(img2);
		frame.add(image2);

		JLabel lab1 = new JLabel("Zinger Burger");
		lab1.setBounds(65, 155, 100, 15);
		frame.add(lab1);

		JButton bt1 = new JButton("Price");
		bt1.setBounds(65, 170, 70, 20);
		frame.add(bt1);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Price is 320 tk");
			}
		});

		ImageIcon img3 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\Chicken.jpg");
		JLabel image3 = new JLabel();
		image3.setBounds(800, 45, 180, 100);
		image3.setIcon(img3);
		frame.add(image3);
		
		JLabel lab2 = new JLabel("Fried Chicken");
		lab2.setBounds(850, 150, 90, 15);
		frame.add(lab2);

		JButton bt2 = new JButton("Price");
		bt2.setBounds(855, 165, 70, 20);
		frame.add(bt2);

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Price is 400 tk");
			}
		});
		
		ImageIcon img4 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\Twister.jpg");
		JLabel image4 = new JLabel();
		image4.setBounds(20, 270, 350, 220);
		image4.setIcon(img4);
		frame.add(image4);
		
		JLabel lab4 = new JLabel("Twister");
		lab4.setBounds(120, 490, 90, 15);
		frame.add(lab4);

		JButton bt4 = new JButton("Price");
		bt4.setBounds(105, 510, 70, 20);
		frame.add(bt4);

		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Price is 300 tk");
			}
		});
		
		ImageIcon img5 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\Chicken_b.jpg");
		JLabel image5 = new JLabel();
		image5.setBounds(400, 250, 350, 250);
		image5.setIcon(img5);
		frame.add(image5);
		
		JLabel lab5 = new JLabel("Chicken Bucket");
		lab5.setBounds(460, 505, 90, 15);
		frame.add(lab5);

		JButton bt5 = new JButton("Price");
		bt5.setBounds(470, 520, 70, 20);
		frame.add(bt5);

		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Price is 1100 tk");
			}
		});
		
		ImageIcon img6 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Java pic\\Fries.jpg");
		JLabel image6 = new JLabel();
		image6.setBounds(690, 250, 340, 250);
		image6.setIcon(img6);
		frame.add(image6);
		
		JLabel lab6 = new JLabel("Colonel's Fries");
		lab6.setBounds(810, 480, 90, 15);
		frame.add(lab6);

		JButton bt6 = new JButton("Price");
		bt6.setBounds(820, 495, 70, 20);
		frame.add(bt6);

		bt6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Price is 500 tk");
			}
		});
		
		JTextArea area2 = new JTextArea("Finger Lickin Good");
		area2.setBounds(400, 580, 183, 25);
		area2.setForeground(Color.red);
		area2.setBackground(Color.BLACK);
		area2.setFont(new Font("Calbiri", Font.BOLD, 20));
		area2.setEditable(false);
		frame.add(area2);
		
		frame.setVisible(true);
	}

}
