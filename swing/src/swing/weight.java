package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class weight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	double result1; 
	String op;
	String ans;
	String ans1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weight window = new weight();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public weight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter v.Beta 0.12.1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("US Measurement");
		lblNewLabel.setBounds(122, 88, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Metric");
		lblNewLabel_1.setBounds(262, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Height:");
		lblNewLabel_2.setBounds(54, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Weight:");
		lblNewLabel_3.setBounds(54, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(122, 117, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 159, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Label_4 = new JLabel();
		Label_4.setBounds(262, 120, 46, 14);
		frame.getContentPane().add(Label_4);
		
		JLabel Label_5 = new JLabel();
		Label_5.setBounds(262, 162, 46, 14);
		frame.getContentPane().add(Label_5);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ans;
				String ans1;
				num1=Double.parseDouble(textField.getText());
				result=num1/3.280;
				ans=String.format("%.2f m", result);
				//JLabel Label_4 = null;
				Label_4.setText(ans);
				num2=Double.parseDouble(textField_1.getText());
				result1=num2/2.204;
				ans1=String.format("%.2f kg", result1);
				//JLabel lblNewLabel_5 = null;
				Label_5.setText(ans1);
				
			}
		});
		btnNewButton.setBounds(122, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				Label_4.setText("");
				Label_5.setText("");
			}
		});
		btnNewButton_1.setBounds(242, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JLabel lblNewLabel_6 = new JLabel("Help");
		lblNewLabel_6.setBounds(10, 11, 29, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("About");
		lblNewLabel_7.setBounds(43, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
