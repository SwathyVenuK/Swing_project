package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temprature {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	//double result1; 
	String op;
	String ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temprature window = new temprature();
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
	public temprature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Degrees");
		lblNewLabel.setBounds(123, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(180, 34, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result=");
		lblResult.setBounds(157, 89, 38, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel label = new JLabel("");
		label.setBounds(200, 89, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnToCelcius = new JButton("To Celcius");
		btnToCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num1=Double.parseDouble(textField.getText());
				double result=(num1-32) * (5/9);
				ans=String.format("%.2f",result);
				label.setText(ans);
				
			}
		});
		btnToCelcius.setBounds(92, 135, 89, 23);
		frame.getContentPane().add(btnToCelcius);
		
		JButton btnToFarenheit = new JButton("To Farenheit");
		btnToFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num1=Double.parseDouble(textField.getText());
				double result=(num1 * 9/5) + 32;
				ans=String.format("%.2f",result);
				label.setText(ans);
			}
		});
		btnToFarenheit.setBounds(211, 135, 89, 23);
		frame.getContentPane().add(btnToFarenheit);
	}

}
