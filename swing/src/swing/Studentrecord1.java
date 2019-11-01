package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Studentrecord1 {
double total=0;
double avg=0;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentrecord1 window = new Studentrecord1();
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
	public Studentrecord1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 815, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(10, 11, 382, 250);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentid.setBounds(10, 23, 66, 14);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(96, 20, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Firstname");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(10, 51, 66, 14);
		panel.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 48, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 76, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(10, 79, 66, 14);
		panel.add(lblSurname);
		
		JLabel lblNewLabel = new JLabel("Course Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 106, 80, 14);
		panel.add(lblNewLabel);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CS301", "CS302", "CS303", "CS304", "CS305", "CS306", "CS307", "CS308"}));
		comboBox.setBounds(96, 107, 86, 20);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 140, 172, 2);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(10, 160, 66, 14);
		panel.add(lblTotalScore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 157, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(10, 185, 66, 14);
		panel.add(lblAverage);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 182, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(10, 210, 46, 14);
		panel.add(lblRanking);
		
		textField_5 = new JTextField();
		textField_5.setBounds(96, 207, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaths.setBounds(204, 23, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnglish.setBounds(204, 51, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(204, 79, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(204, 106, 66, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(204, 135, 66, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(204, 163, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(204, 188, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(204, 210, 66, 14);
		panel.add(lblMalayalam);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
				public void keyTyped(java.awt.event.KeyEvent evt) {
	                char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
	            }
			
		});
		textField_6.setColumns(10);
		textField_6.setBounds(286, 20, 86, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
				public void keyTyped(java.awt.event.KeyEvent evt) {
	                char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
	            
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(286, 48, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_8.setColumns(10);
		textField_8.setBounds(286, 76, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_9.setColumns(10);
		textField_9.setBounds(286, 103, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_10.setColumns(10);
		textField_10.setBounds(286, 132, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_11.setColumns(10);
		textField_11.setBounds(286, 157, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_12.setColumns(10);
		textField_12.setBounds(286, 182, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_13.setColumns(10);
		textField_13.setBounds(286, 207, 86, 20);
		panel.add(textField_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(147, 112, 219));
		panel_1.setBounds(412, 11, 377, 292);
		panel_1.setBorder(new TitledBorder(null, "Student report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 357, 226);
		panel_1.add(textArea);
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(140, 258, 89, 23);
		panel_1.add(btnClear);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 314, 779, 91);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 82, 779, -77);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
		
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(0, 0, 779, 91);
		panel_2.add(table_1);
		
		JButton btnAdd = new JButton("Add Report");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField_6.getText());
				int b=Integer.parseInt(textField_7.getText());
				int c=Integer.parseInt(textField_8.getText());
				int d=Integer.parseInt(textField_9.getText());
				int e1=Integer.parseInt(textField_10.getText());
				int f=Integer.parseInt(textField_11.getText());
				int g=Integer.parseInt(textField_12.getText());
				int h=Integer.parseInt(textField_13.getText());
				total=a+b+c+d+e1+f+g+h;
				String p=String.format("%.2f",total);
				textField_3.setText(p);
				avg=total/8;
				String q=String.format("%.2f",avg);
				textField_4.setText(q);
				
				if(total>700) {
					textField_5.setText("1");
				}
				else if(total> 600 && total<700)
				{
					textField_5.setText("2");
				}
				else if(total>500 && total<700){
					textField_5.setText("3");
				}
				else
				{
					textField_5.setText("fail");
				}
				
				DefaultTableModel  model=(DefaultTableModel)table_1.getModel();
				{
				model.addRow(new String[] {
				textField.getText(),
				(String) comboBox.getSelectedItem(),
				textField_6.getText(),
				textField_7.getText(),
				textField_8.getText(),
				textField_9.getText(),
				textField_10.getText(),
				textField_11.getText(),
				textField_12.getText(),
				textField_13.getText(),
				textField_3.getText(),
				textField_4.getText(),
				textField_5.getText(),
				});
				}
				
		}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdd.setForeground(new Color(34, 139, 34));
		btnAdd.setBounds(63, 416, 107, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			
				
				public void actionPerformed(ActionEvent arg0) {
					DefaultTableModel model=(DefaultTableModel) table_1.getModel();
					{
			            if(table_1.getSelectedRow() != -1) {
			               model.removeRow(table_1.getSelectedRow());
			               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
			        	
					}
			            else {		               
			            	JOptionPane.showMessageDialog(null, "Please select a row");
			            }
					}
				
			
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setBounds(209, 416, 107, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+"Student Name :\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"
						+"=======================================\n"
						+"Math:\t\t"+textField_6.getText()+"\n"
						+"English:\t\t"+textField_7.getText()+"\n"
						+ "Biology:\t\t"+textField_8.getText()+"\n"
						+ "Computer:\t\t"+textField_9.getText()+"\n"
						+"Chemistry:\t\t"+textField_10.getText()+"\n"
						+"Physics:\t\t"+textField_11.getText()+"\n"
						+"Tamil:\t\t"+textField_12.getText()+"\n"
						+"Malayalam:\t\t"+textField_13.getText()+"\n"
						+"=======================================\n"
						+"Total Score:\t\t"+textField_3.getText()+"\n"
						+"Average:\t\t"+textField_4.getText()+"\n"
						+"Ranking:\t\t"+textField_5.getText()+"\n"

						);
			}
		});
		btnShowReport.setForeground(new Color(0, 0, 205));
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setBounds(353, 416, 107, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 20, 147));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) 
				{System.exit(0);
				}
			}
		});
		btnExit.setBounds(495, 416, 107, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
			}
		});
		btnReset.setForeground(new Color(138, 43, 226));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(638, 416, 107, 23);
		frame.getContentPane().add(btnReset);
	}
}
