package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Hotelmanagement {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-10,9
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotelmanagement window = new Hotelmanagement();
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
	public Hotelmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 2000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 67, 450, 236);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 325, 450, 143);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 314, 475, 167);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(0, 67, 475, 247);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(493, 67, 270, 236);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(477, 48, 297, 266);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(493, 325, 270, 143);
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(477, 314, 297, 167);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(813, 67, 282, 395);
		frame.getContentPane().add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(782, 48, 332, 431);
		frame.getContentPane().add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(273, 492, 841, 149);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(10, 11, 821, 127);
		panel_11.add(panel_12);
		
		JLabel lblHotelManagementSystems = new JLabel("Hotel Management Systems");
		lblHotelManagementSystems.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelManagementSystems.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHotelManagementSystems.setBounds(291, 11, 398, 32);
		frame.getContentPane().add(lblHotelManagementSystems);
	}
}
