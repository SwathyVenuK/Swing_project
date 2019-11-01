package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(39, 37, 385, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(39, 97, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_1.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(145, 97, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_2.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(254, 97, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_3.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_3.setBounds(39, 131, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_4.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(145, 131, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_5.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBounds(254, 131, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_6.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_6.setBounds(39, 165, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_7.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_7.setBounds(145, 165, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_8.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_8.setBounds(254, 165, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_9.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9.setBounds(39, 199, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_10.setBounds(145, 199, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_11.setBounds(254, 199, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_12.setBounds(366, 97, 58, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_13.setBounds(366, 131, 58, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_14.setBounds(366, 165, 58, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_15.setBounds(366, 199, 58, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("C");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("");
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_16.setBounds(39, 233, 89, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("BACK");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_17.setBounds(145, 233, 89, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("%");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_18.setBounds(254, 233, 89, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(40, 11, 70, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
