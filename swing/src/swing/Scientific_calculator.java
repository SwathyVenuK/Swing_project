package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scientific_calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	double result1;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_calculator window = new Scientific_calculator();
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
	public Scientific_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("View");
		lblNewLabel_1.setBounds(41, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(76, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 486, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(20, 86, 75, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblSimple = new JLabel("Standard");
		lblSimple.setBounds(231, 86, 75, 14);
		frame.getContentPane().add(lblSimple);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 111, 211, 146);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="sqrt";
			}
		});
		btnNewButton.setBounds(10, 11, 57, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="1/x";
			}
		});
		btnNewButton_1.setBounds(75, 11, 57, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("sin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="sin";
			}
		});
		btnNewButton_2.setBounds(142, 11, 57, 23);
		panel.add(btnNewButton_2);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button.setBounds(10, 45, 57, 23);
		panel.add(button);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="exp";
			}
		});
		btnExp.setBounds(75, 45, 57, 23);
		panel.add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="cos";
			}
		});
		btnCos.setBounds(142, 45, 57, 23);
		panel.add(btnCos);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="x^y";
			}
		});
		btnXy.setBounds(10, 79, 57, 23);
		panel.add(btnXy);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="ln";
			}
		});
		btnLn.setBounds(75, 79, 57, 23);
		panel.add(btnLn);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="tan";
			}
		});
		btnTan.setBounds(142, 79, 57, 23);
		panel.add(btnTan);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="x^2";
			}
		});
		btnX.setBounds(10, 113, 57, 23);
		panel.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(75, 113, 57, 23);
		panel.add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				op="sec";
			}
		});
		btnSec.setBounds(142, 113, 57, 23);
		panel.add(btnSec);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(231, 111, 277, 146);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_9 = new JButton("7");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(10, 11, 57, 23);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(77, 11, 57, 23);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_11.setBounds(208, 11, 57, 23);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("4");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(10, 45, 57, 23);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("5");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setBounds(77, 45, 57, 23);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_14.setBounds(208, 45, 57, 23);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_15.getText();
				textField.setText(Number);
			}
		});
		button_15.setBounds(10, 77, 57, 23);
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("2");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_16.getText();
				textField.setText(Number);
			}
		});
		button_16.setBounds(77, 79, 57, 23);
		panel_1.add(button_16);
		
		JButton button_17 = new JButton("-");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_17.setBounds(208, 79, 57, 23);
		panel_1.add(button_17);
		
		JButton button_18 = new JButton("0");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_18.getText();
				textField.setText(Number);
			}
		});
		button_18.setBounds(10, 111, 57, 23);
		panel_1.add(button_18);
		
		JButton button_19 = new JButton(".");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_19.getText();
				textField.setText(Number);
			}
		});
		button_19.setBounds(77, 111, 57, 23);
		panel_1.add(button_19);
		
		JButton button_20 = new JButton("+");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_20.setBounds(208, 111, 57, 23);
		panel_1.add(button_20);
		
		JButton button_21 = new JButton("9");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_21.getText();
				textField.setText(Number);
			}
		});
		button_21.setBounds(141, 11, 57, 23);
		panel_1.add(button_21);
		
		JButton button_22 = new JButton("6");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_22.getText();
				textField.setText(Number);
			}
		});
		button_22.setBounds(144, 45, 57, 23);
		panel_1.add(button_22);
		
		JButton button_23 = new JButton("3");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_23.getText();
				textField.setText(Number);
			}
		});
		button_23.setBounds(144, 77, 57, 23);
		panel_1.add(button_23);
		
		JButton button_24 = new JButton("=");
		button_24.addActionListener(new ActionListener() {
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
				if(op=="sqrt")
				{
					result=Math.sqrt(num2);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="sin")
				{
					result=Math.toRadians(num2);
					result1=Math.sin(result);
					ans=String.format("%.2f", result1);
					textField.setText(ans);
				}
				if(op=="cos")
				{
					result=Math.toRadians(num2);
					result1=Math.cos(result);
					ans=String.format("%.2f", result1);
					textField.setText(ans);
				}
				if(op=="tan")
				{
					result=Math.toRadians(num2);
					result1=Math.tan(result);
					ans=String.format("%.2f", result1);
					textField.setText(ans);
				}
				if(op=="sec")
				{
					result=Math.toRadians(num2);
					result1=Math.acos(result);
					ans=String.format("%.2f", result1);
					textField.setText(ans);
				}
				if(op=="fac")
				{
				//	for (int i = num; i > 1; i--) {
					//	ans = ans * (i - 1)
					ans=String.format("%.2f", result1);
					textField.setText(ans);
				}
				if(op=="sec")
				{
					result=Math.getExponent(num2);
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="sec")
				{
					result=Math.log(num2);
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1,num2);
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="x^2")
				{
					result=num2*num2;
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="1/x")
				{
					//result=modInverse(num1,num2);
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		button_24.setBounds(144, 111, 57, 23);
		panel_1.add(button_24);
	}
}
