import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("MUJA");
		frame.setSize(700,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel lab1 = new JLabel("Name");
		frame.add(lab1);
		lab1.setBounds(10,10,100,20);
		
		JLabel lab2 = new JLabel("Batch");
		frame.add(lab2);
		lab2.setBounds(10,40,100,20);
		
		JLabel lab3 = new JLabel("ID");
		frame.add(lab3);
		lab3.setBounds(10,70,100,20);
		
		JTextField tf1 = new JTextField();
		frame.add(tf1);
		tf1.setBounds(120,10,100,20);
		
		JTextField tf2 = new JTextField();
		frame.add(tf2);
		tf2.setBounds(120,40,100,20);
		
		JTextField tf3 = new JTextField();
		frame.add(tf3);
		tf3.setBounds(120,70,100,20);
		
		JLabel displayName = new JLabel("Display Name");
		frame.add(displayName);
		displayName.setBounds(10, 120, 100, 20);
		
		JLabel displayBatch = new JLabel("Display Batch");
		frame.add(displayBatch);
		displayBatch.setBounds(10, 150, 100, 20);
		
		JLabel displayId = new JLabel("Display ID");
		frame.add(displayId);
		displayId.setBounds(10, 180, 100, 20);
		
		JButton button = new JButton("Display");
		frame.add(button);
		button.setBounds(120,100,100,20);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				displayName.setText(tf1.getText());
				displayBatch.setText(tf2.getText());
				displayId.setText(tf3.getText());
			}
		});
		
	}

}
