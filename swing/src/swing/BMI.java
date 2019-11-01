package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
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
					BMI window = new BMI();
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
	public BMI() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 74, 414, 117);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWeight = new JLabel("weight");
		lblWeight.setBounds(74, 21, 46, 14);
		panel.add(lblWeight);
		
		textField = new JTextField();
		textField.setBounds(156, 18, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("height");
		lblNewLabel.setBounds(74, 56, 46, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 53, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(32, 92, 46, 14);
		panel.add(lblBmi);
		
		JLabel Label_1 = new JLabel("");
		Label_1.setBounds(103, 92, 46, 14);
		panel.add(Label_1);
		
		JLabel Label_2 = new JLabel("");
		Label_2.setBounds(166, 92, 46, 14);
		panel.add(Label_2);
		
		JButton btnCalulate = new JButton("Calulate");
		btnCalulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ans;
				//String ans1;
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField.getText());
				double result=(num1/num2/num2)*1000;
				ans=String.format("%.2f",result);
				Label_1.setText(ans);
				if(result<18.5)
				{
					Label_2.setText("Under Weight");
				}
				else if(result>=18.5&&result<=24.9)
				{
					Label_2.setText("Normal Weight");
				}
				else if(result>=25&&result<=29.9)
				{
					Label_2.setText("Over Weight");
				}
				else
				{
					Label_2.setText("Obese");
				}
			}
		});
		btnCalulate.setBounds(263, 83, 89, 23);
		panel.add(btnCalulate);
	}

}
