import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static String str1, str2, str3, str4, str5, str6;
	public static double a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("MU");
		frame.setSize(1000, 660);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane(); /// returns object of contentPane to c. object is in container type
		c.setBackground(Color.LIGHT_GRAY);

		ImageIcon img1 = new ImageIcon("MU.png");
		frame.setIconImage(img1.getImage());

		JLabel lab1 = new JLabel("Application Form");
		lab1.setBounds(10, 20, 245, 35);
		lab1.setForeground(Color.WHITE);
		lab1.setFont(new Font("Calbiri", Font.BOLD, 30));
		frame.add(lab1);

		JLabel lab2 = new JLabel("Please complete this application form.");
		lab2.setBounds(10, 55, 245, 15);
		frame.add(lab2);

		ImageIcon img2 = new ImageIcon("MU_.png");
		JLabel image1 = new JLabel();
		image1.setBounds(370, 10, 245, 70);
		image1.setIcon(img2);
		frame.add(image1);

		ImageIcon img3 = new ImageIcon("me.png");
		JLabel image2 = new JLabel();
		image2.setBounds(800, 10, 250, 150);
		image2.setIcon(img3);
		frame.add(image2);

		JLabel lab3 = new JLabel("Attach a passport size photo here");
		lab3.setBounds(780, 165, 300, 15);
		frame.add(lab3);

		JButton bt1 = new JButton("Attach");
		bt1.setBounds(825, 185, 90, 20);
		frame.add(bt1);
		image2.setVisible(false);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				image2.setVisible(true);
				JOptionPane.showMessageDialog(null, "Your image is Attached");
			}
		});

		JTextArea area1 = new JTextArea("1. Personal Details");
		area1.setBounds(20, 90, 135, 20);
		area1.setForeground(Color.WHITE);
		area1.setBackground(Color.BLACK);
		area1.setFont(new Font("Calbiri", Font.PLAIN, 15));
		area1.setEditable(false);
		frame.add(area1);

		JLabel lab4 = new JLabel("First Name:");
		lab4.setBounds(20, 120, 100, 20);
		frame.add(lab4);

		JLabel lab5 = new JLabel("Last Name:");
		lab5.setBounds(20, 150, 100, 20);
		frame.add(lab5);

		JLabel lab6 = new JLabel("Home Address:");
		lab6.setBounds(20, 180, 100, 20);
		frame.add(lab6);

		JLabel lab7 = new JLabel("Postcode:");
		lab7.setBounds(20, 210, 100, 20);
		frame.add(lab7);

		JLabel lab8 = new JLabel("Gender:");
		lab8.setBounds(20, 240, 100, 20);
		frame.add(lab8);

		JTextField tf1 = new JTextField();
		tf1.setBounds(120, 120, 120, 20);
		frame.add(tf1);

		JTextField tf2 = new JTextField();
		tf2.setBounds(120, 150, 120, 20);
		frame.add(tf2);

		JTextField tf3 = new JTextField();
		tf3.setBounds(120, 180, 120, 20);
		frame.add(tf3);

		JTextField tf4 = new JTextField();
		tf4.setBounds(120, 210, 120, 20);
		frame.add(tf4);

		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setBounds(20, 260, 55, 20);
		frame.add(rb1);

		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setBounds(86, 260, 70, 20);
		frame.add(rb2);

		JRadioButton rb3 = new JRadioButton("Other");
		rb3.setBounds(167, 260, 60, 20);
		frame.add(rb3);

		ButtonGroup bg = new ButtonGroup(); // selecting only one RadioButton
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		JButton bt2 = new JButton("Confirm");
		bt2.setBounds(85, 290, 85, 20);
		frame.add(bt2);

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				str1 = tf1.getText();
				str2 = tf2.getText();
				str3 = tf3.getText();
				str4 = tf4.getText();
				Secondframe ob1 = new Secondframe();
			}
		});

		JTextArea area2 = new JTextArea("2. Courses to which you are applying");
		area2.setBounds(20, 320, 240, 20);
		area2.setForeground(Color.WHITE);
		area2.setBackground(Color.BLACK);
		area2.setFont(new Font("Calbiri", Font.PLAIN, 15));
		area2.setEditable(false);
		frame.add(area2);

		JCheckBox cb1 = new JCheckBox("BBA");
		cb1.setBounds(20, 350, 50, 20);
		frame.add(cb1);

		JCheckBox cb2 = new JCheckBox("English");
		cb2.setBounds(90, 350, 70, 20);
		frame.add(cb2);

		JCheckBox cb3 = new JCheckBox("LLB");
		cb3.setBounds(180, 350, 50, 20);
		frame.add(cb3);

		JCheckBox cb4 = new JCheckBox("CSE");
		cb4.setBounds(20, 380, 50, 20);
		frame.add(cb4);

		JCheckBox cb5 = new JCheckBox("EEE");
		cb5.setBounds(90, 380, 50, 20);
		frame.add(cb5);

		JLabel lab9 = new JLabel("Date of birth:");
		lab9.setBounds(20, 420, 120, 20);
		frame.add(lab9);

		JLabel lab10 = new JLabel("Day:");
		lab10.setBounds(20, 450, 60, 20);
		frame.add(lab10);

		JTextField tf5 = new JTextField();
		tf5.setBounds(50, 450, 30, 20);
		frame.add(tf5);

		JLabel lab11 = new JLabel("Month:");
		lab11.setBounds(90, 450, 60, 20);
		frame.add(lab11);

		JTextField tf6 = new JTextField();
		tf6.setBounds(135, 450, 30, 20);
		frame.add(tf6);

		JLabel lab12 = new JLabel("Year:");
		lab12.setBounds(175, 450, 60, 20);
		frame.add(lab12);

		JTextField tf7 = new JTextField();
		tf7.setBounds(210, 450, 30, 20);
		frame.add(tf7);

		JTextArea area3 = new JTextArea("3. Background");
		area3.setBounds(330, 130, 100, 20);
		area3.setForeground(Color.WHITE);
		area3.setBackground(Color.BLACK);
		area3.setFont(new Font("Calbiri", Font.PLAIN, 15));
		area3.setEditable(false);
		frame.add(area3);

		JLabel lab13 = new JLabel("Nationality (as on Passport):");
		lab13.setBounds(330, 170, 200, 20);
		frame.add(lab13);

		JTextField tf8 = new JTextField();
		tf8.setBounds(330, 200, 250, 20);
		frame.add(tf8);

		JLabel lab14 = new JLabel("Country of Birth:");
		lab14.setBounds(330, 230, 200, 20);
		frame.add(lab14);

		JTextField tf9 = new JTextField();
		tf9.setBounds(330, 260, 250, 20);
		frame.add(tf9);

		JTextArea area4 = new JTextArea("4. Education");
		area4.setBounds(330, 290, 100, 20);
		area4.setForeground(Color.WHITE);
		area4.setBackground(Color.BLACK);
		area4.setFont(new Font("Calbiri", Font.PLAIN, 15));
		area4.setEditable(false);
		frame.add(area4);

		JLabel lab15 = new JLabel("HSC Result (in CGPA):");
		lab15.setBounds(330, 330, 130, 20);
		frame.add(lab15);

		JLabel lab16 = new JLabel("SSC Result (in CGPA):");
		lab16.setBounds(330, 360, 130, 20);
		frame.add(lab16);

		JTextField tf10 = new JTextField();
		tf10.setBounds(470, 330, 70, 20);
		frame.add(tf10);

		JTextField tf11 = new JTextField();
		tf11.setBounds(470, 360, 70, 20);
		frame.add(tf11);

		JButton bt3 = new JButton("Show Waiver");
		bt3.setBounds(390, 420, 120, 30);
		frame.add(bt3);

		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				str5 = tf10.getText();
				str6 = tf11.getText();
				a = Double.parseDouble(str5);
				b = Double.parseDouble(str6);
				if (a + b >= 8.0 && a + b < 9.0)
					JOptionPane.showMessageDialog(null, "You will get 25%  tuition fees waiver");
				if (a + b >= 9.0 && a + b < 10.0)
					JOptionPane.showMessageDialog(null, "You will get 50%  tuition fees waiver");
				if (a + b >= 10)
					JOptionPane.showMessageDialog(null, "You will get 75%  tuition fees waiver");
				else if (a + b < 8)
					JOptionPane.showMessageDialog(null, "You have no waiver");
			}
		});

		JLabel lab17 = new JLabel("Employment History:");
		lab17.setBounds(680, 220, 130, 20);
		frame.add(lab17);

		JTextField tf12 = new JTextField();
		tf12.setBounds(680, 250, 250, 25);
		frame.add(tf12);

		JTextArea area5 = new JTextArea("5. Payment of Fees");
		area5.setBounds(680, 285, 128, 20);
		area5.setForeground(Color.WHITE);
		area5.setBackground(Color.BLACK);
		area5.setFont(new Font("Calbiri", Font.PLAIN, 15));
		area5.setEditable(false);
		frame.add(area5);

		JLabel lab18 = new JLabel("Who is expected to pay your fees?");
		lab18.setBounds(680, 320, 200, 20);
		frame.add(lab18);

		JCheckBox cb6 = new JCheckBox("Your Employer");
		cb6.setBounds(680, 350, 110, 20);
		frame.add(cb6);

		JCheckBox cb7 = new JCheckBox("Yourself");
		cb7.setBounds(840, 350, 75, 20);
		frame.add(cb7);

		JCheckBox cb8 = new JCheckBox("Relative");
		cb8.setBounds(680, 380, 75, 20);
		frame.add(cb8);

		JCheckBox cb9 = new JCheckBox("Other Sponsor");
		cb9.setBounds(840, 380, 110, 20);
		frame.add(cb9);

		JButton bt4 = new JButton("Show Admission Fee Structure");
		bt4.setBounds(680, 420, 210, 30);
		frame.add(bt4);

		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThirdFrame ob2 = new ThirdFrame();
			}
		});

		JButton bt5 = new JButton("Submit");
		bt5.setBounds(420, 510, 100, 30);
		frame.add(bt5);
		
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FourthFrame ob2 = new FourthFrame();
			}
		});
		
		frame.setVisible(true);
	}

}
