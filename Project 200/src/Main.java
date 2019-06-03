import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	public static String str1,str2,str3;

	public static int a,b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Topological Sort");
		frame.setSize(700,600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container c = frame.getContentPane();
		c.setBackground(Color.GRAY);
		
		JLabel lab1 = new JLabel("Topological Sort");
		lab1.setBounds(225,20,235,35);
		lab1.setForeground(Color.GREEN);
		lab1.setFont(new Font("Calbiri",Font.BOLD,30));
		frame.add(lab1);
		
		JLabel lab2 = new JLabel("______________");
		lab2.setBounds(224,30,240,35);
		lab2.setForeground(Color.WHITE);
		lab2.setFont(new Font("Calbiri",Font.BOLD,30));
		frame.add(lab2);
		
		JLabel lab3 = new JLabel("Algorithm to Find Topological Sorting");
		lab3.setBounds(290, 490, 350, 30);
		lab3.setForeground(Color.GREEN);
		lab3.setFont(new Font("Calbiri",Font.ITALIC,20));
		frame.add(lab3);
		
		JLabel lab4 = new JLabel("Enter The Number of Vertices: ");
		lab4.setBounds(95,160,255,25);
		lab4.setForeground(Color.GREEN);
		lab4.setFont(new Font("Calbiri",Font.PLAIN ,18));
		frame.add(lab4);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(350,160,70,25);
		frame.add(tf1);
		
		JLabel lab5 = new JLabel("Enter The Number of Edges: ");
		lab5.setBounds(95,200,255,25);
		lab5.setForeground(Color.GREEN);
		lab5.setFont(new Font("Calbiri",Font.PLAIN ,18));
		frame.add(lab5);
	
		JTextField tf2 = new JTextField();
		tf2.setBounds(350,200,70,25);
		frame.add(tf2);
		
		JLabel lab6 = new JLabel("Enter The Path:");
		lab6.setBounds(95,265,150,25);
		lab6.setForeground(Color.GREEN);
		lab6.setFont(new Font("Calbiri",Font.PLAIN,18));
		frame.add(lab6);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(260,255,350,50);
		frame.add(tf3);
		
		JButton bt1 = new JButton("Done");
		bt1.setBounds(290,340,80,20);
		frame.add(bt1);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				str1 = tf1.getText();
				str2 = tf2.getText();
				str3 = tf3.getText();
				
				TopSort ob1 = new TopSort();
				
			}
		});
			
		
		frame.setVisible(true);
	}

}
