package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Ticketbooking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	int i=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
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
	public Ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Details", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(282, 111, 382, 337);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(22, 35, 57, 24);
		panel.add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(89, 39, 145, 20);
		panel.add(textField_4);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(22, 96, 57, 24);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(89, 99, 145, 20);
		panel.add(textField_5);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(22, 147, 57, 24);
		panel.add(lblTo);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(89, 150, 145, 20);
		panel.add(textField_6);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(22, 194, 41, 24);
		panel.add(lblDate);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(89, 197, 145, 20);
		panel.add(textField_7);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(22, 238, 41, 24);
		panel.add(lblTime);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(89, 241, 145, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(257, 150, 115, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(257, 197, 115, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(257, 242, 115, 20);
		panel.add(textField_11);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicketNo.setBounds(273, 135, 68, 14);
		panel.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(286, 182, 46, 14);
		panel.add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRoute.setBounds(273, 228, 46, 14);
		panel.add(lblRoute);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 111, 269, 337);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox_2.setBounds(188, 149, 71, 20);
		panel_1.add(comboBox_2);
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				
				 int a=JOptionPane.showConfirmDialog(frame,"Confirm?");  
				 if(a==JOptionPane.YES_OPTION){  
				     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
				 DefaultTableModel model=(DefaultTableModel) table_2.getModel();
					{
					model.addRow(new String[] {
					textField_4.getText(),
					textField_9.getText(),
					textField_5.getText(),
					textField_6.getText(),
					(String) comboBox_2.getSelectedItem(),
					textField_8.getText(),
					textField_7.getText(),
					textField_10.getText(),
			
				
				});
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(161, 291, 89, 23);
		panel.add(btnNewButton);
		
	
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(20, 11, 57, 24);
		panel_1.add(lblName);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(97, 15, 145, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 46, 249, 4);
		panel_1.add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		{

		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnStandard.setBounds(6, 57, 83, 23);
		panel_1.add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSingleTicket.setBounds(97, 57, 102, 23);
		panel_1.add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAdult.setBounds(201, 57, 57, 23);
		panel_1.add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(6, 100, 83, 23);
		panel_1.add(rdbtnFirstClass);
		
		JRadioButton ac = new JRadioButton("Ac");
		ac.setFont(new Font("Tahoma", Font.BOLD, 11));
		ac.setBounds(97, 100, 39, 23);
		panel_1.add(ac);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnChild.setBounds(202, 100, 61, 23);
		panel_1.add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradesh", "kerala", "Tamilnadu", "goa"}));
		comboBox.setBounds(10, 149, 83, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradesh", "kerala", "Tamilnadu", "goa"}));
		comboBox_1.setBounds(97, 149, 83, 20);
		panel_1.add(comboBox_1);
		
	
		
		JLabel lblTicket = new JLabel("Tax");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicket.setBounds(20, 194, 46, 14);
		panel_1.add(lblTicket);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 180, 249, 2);
		panel_1.add(separator_1);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(20, 226, 67, 14);
		panel_1.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(20, 261, 46, 14);
		panel_1.add(lblTotal);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSleeper.setBounds(133, 100, 83, 23);
		panel_1.add(rdbtnSleeper);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 191, 145, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(97, 223, 145, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 258, 145, 20);
		panel_1.add(textField_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 283, 249, 2);
		panel_1.add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
				String name=textField.getText();
				textField_4.setText(name);
			String p=(String) comboBox.getSelectedItem();
				textField_5.setText(p);
			String k=(String) comboBox_1.getSelectedItem();
				textField_6.setText(k);
				String va=comboBox_2.getSelectedItem().toString();
				double value=Double.parseDouble(va);
				double t;
				double tax;
				double subtotal;
				 String text = (String)comboBox_2.getSelectedItem();
	             int b = Integer.parseInt(text);
	             

				  Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_7.setText(tTime.format(timer.getTime()));
	            
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_8.setText(tdate.format(timer.getTime()));
	               
	                String bkno=String.format("%d", i);
	                textField_9.setText(bkno);
	                		i++;
	                	
	        				textField_11.setText("any");
	                		
				if(ac.isSelected())
				{
					tax=400;
					textField_1.setText(String.format("%.0f",tax));
				}
				else
				{
					tax=200;
					textField_1.setText(String.format("%.0f",tax));
				}
				if(rdbtnSingleTicket.isSelected()&&rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=3400*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleTicket.isSelected()&&rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=4000*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleTicket.isSelected()&&rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=3000*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleTicket.isSelected()&&rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=3400*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleTicket.isSelected()&&!rdbtnSleeper.isSelected()&&ac.isSelected()) 
				{
					subtotal=3200*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleTicket.isSelected()&&!rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=3800*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleTicket.isSelected()&&!rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=2800*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				else
				{
					subtotal=3200*b;
					textField_2.setText(String.format("%.0f",subtotal));
				}
				t=Double.parseDouble(textField_1.getText())+Double.parseDouble(textField_2.getText());
				textField_3.setText(String.format("%.2f", t));
			String j=textField_3.getText();
			textField_10.setText(j);
			
			
             
				
				
	                		
			}}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(6, 303, 71, 23);
		panel_1.add(btnTotal);
		
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
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(87, 303, 77, 23);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) 
				{System.exit(0);
				}
			}
		});
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(174, 303, 89, 23);
		panel_1.add(btnExit);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 459, 644, 127);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(322, 5, 0, 0);
		panel_2.add(table_1);
		
		table = new JTable();
		table.setBounds(327, 5, 0, 0);
		panel_2.add(table);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{		"Name", "Booking No", "From", "To", "No.of Seats", "Time", "Date", "AC/Non-AC", "Price"},
		
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No.of Seats", "Time", "Date", "AC/Non-AC", "Price"
			}
		));
		table_2.setBounds(10, 16, 634, 100);
		panel_2.add(table_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(0, 6, 644, 121);
		panel_2.add(panel_3);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTicketBooking.setBounds(166, 61, 302, 33);
		frame.getContentPane().add(lblTicketBooking);
	}
	}
}
