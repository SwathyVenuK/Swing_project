package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class scientific_cal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	double result1;
	String op;
	String ans;
	double united=302.96;
	double india=100.96;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientific_cal window = new scientific_cal();
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
	public scientific_cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calculator");
		frame.setBounds(100, 100, 848, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard_1 = new JMenuItem("Standard");
		mntmStandard_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 357, 435);
				textField.setBounds(30, 21, 500, 40);
			}
		});
		mnFile.add(mntmStandard_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Unit Conversion");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 848, 435);
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 623, 435);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmStandard = new JMenuItem("Exit");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String Container frame = mntmStandard.getParent();
	            do 
	                frame = frame.getParent(); 
	            while (!(frame instanceof JFrame));                                      
	            ((JFrame) frame).dispose();

			}
		});
		mnFile.add(mntmStandard);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 21, 314, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnNewButton.setBounds(10, 76, 64, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnCe.setBounds(77, 76, 64, 40);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setBounds(144, 76, 64, 40);
		frame.getContentPane().add(btnC);
		
		JButton button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("-"+num1);
				//op="+/-";
			}
		});
		button.setBounds(210, 76, 64, 40);
		frame.getContentPane().add(button);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSqrt.setBounds(276, 76, 64, 40);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L..");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnL.setBounds(342, 76, 64, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		                num1=Double.parseDouble(textField.getText());
		                num1=Math.sin(num1);
		                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(407, 76, 64, 40);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSinh.setBounds(473, 76, 64, 40);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Mod";
			}
		});
		btnMod.setBounds(538, 76, 64, 40);
		frame.getContentPane().add(btnMod);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(10, 127, 64, 40);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(77, 127, 64, 40);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(144, 127, 64, 40);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_4.setBounds(210, 127, 64, 40);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("%");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_5.setBounds(276, 127, 64, 40);
		frame.getContentPane().add(button_5);
		
		JButton btnPie = new JButton("pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=num1*3.14;;
                textField.setText(String.valueOf(num1));
			}
		});
		btnPie.setBounds(342, 127, 64, 40);
		frame.getContentPane().add(btnPie);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(407, 127, 64, 40);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(473, 127, 64, 40);
		frame.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnLnx.setBounds(538, 127, 64, 40);
		frame.getContentPane().add(btnLnx);
		
		JButton button_10 = new JButton("4");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(10, 174, 64, 38);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("5");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(77, 174, 64, 38);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(144, 174, 64, 38);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_13.setBounds(210, 174, 64, 38);
		frame.getContentPane().add(button_13);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=(1/num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnx.setBounds(276, 174, 64, 38);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
		});
		btnXy.setBounds(342, 174, 64, 38);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(407, 174, 64, 38);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(473, 174, 64, 38);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("c");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC_1.setBounds(538, 174, 64, 38);
		frame.getContentPane().add(btnC_1);
		
		JButton button_19 = new JButton("1");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_19.getText();
				textField.setText(Number);
			}
		});
		button_19.setBounds(10, 223, 64, 39);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("2");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_20.getText();
				textField.setText(Number);
			}
		});
		button_20.setBounds(77, 223, 64, 39);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("3");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_21.getText();
				textField.setText(Number);
			}
		});
		button_21.setBounds(144, 223, 64, 39);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("-");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_22.setBounds(210, 223, 64, 39);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("=");
		button_23.addActionListener(new ActionListener() {
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
				if(op=="x^y")
				{
					result=Math.pow(num1,num2);
					//result1=Math.acos(result);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="Mod")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="Cbr")
				{
					result=(num1*num2)/100;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		button_23.setBounds(276, 223, 64, 90);
		frame.getContentPane().add(button_23);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=num1*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnX.setBounds(342, 223, 64, 39);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
			}
		});
		btnCbr.setBounds(407, 223, 64, 39);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.round(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnRund.setBounds(473, 223, 64, 39);
		frame.getContentPane().add(btnRund);
		
		JButton btnpie = new JButton("2*pie");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=2*3.14*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnpie.setBounds(538, 223, 64, 39);
		frame.getContentPane().add(btnpie);
		
		JButton button_28 = new JButton("0");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_28.getText();
				textField.setText(Number);
			}
		});
		button_28.setBounds(10, 273, 131, 40);
		frame.getContentPane().add(button_28);
		
		JButton button_30 = new JButton(".");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_30.getText();
				textField.setText(Number);
			}
		});
		button_30.setBounds(144, 273, 64, 40);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("+");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_31.setBounds(210, 273, 64, 40);
		frame.getContentPane().add(button_31);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=num1*num1*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(342, 273, 64, 40);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(407, 273, 64, 40);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(473, 273, 64, 40);
		frame.getContentPane().add(btnHex);
		
		JButton btnOc = new JButton("Oc..");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOc.setBounds(538, 273, 64, 40);
		frame.getContentPane().add(btnOc);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(604, 21, 223, 289);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 11, 143, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"selected one..", "india", "united"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setBounds(66, 51, 104, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 101, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(94, 161, 46, 14);
		panel.add(label);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("india"));
				{
					String c=String.format("Rs%.2f",bp*india);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("united"));
				{
					String c=String.format("Rs%.2f",bp*united);
					label.setText(c);
				}
			}
		});
		btnNewButton_1.setBounds(25, 211, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				label.setText("");
			}
		});
		btnNewButton_2.setBounds(124, 211, 89, 23);
		panel.add(btnNewButton_2);
	}
}
