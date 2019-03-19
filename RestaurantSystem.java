import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.List;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class RestaurantSystem {

	private JFrame frame;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantSystem window = new RestaurantSystem();
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
	public RestaurantSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(0, 0, 1450, 1300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 0, 255), 7));
		panel.setBounds(65, 162, 678, 393);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMainCourses = new JLabel("MAIN COURSES");
		lblMainCourses.setBounds(235, 12, 208, 36);
		lblMainCourses.setFont(new Font("Sylfaen", Font.BOLD, 27));
		panel.add(lblMainCourses);
		
		JToggleButton tglbtnSoup = new JToggleButton("Soup \r\n($ 07.50)");
		tglbtnSoup.setBounds(26, 68, 249, 79);
		panel.add(tglbtnSoup);
		
		JToggleButton tglbtnChowder = new JToggleButton("Chowder ($ 07.50)");
		tglbtnChowder.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tglbtnChowder.setBounds(26, 187, 249, 71);
		panel.add(tglbtnChowder);
		
		JToggleButton tglbtnTossedSalad = new JToggleButton("Tossed Salad ($ 07.50)");
		tglbtnTossedSalad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnTossedSalad.setBounds(26, 286, 249, 79);
		panel.add(tglbtnTossedSalad);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel dim = new DefaultListModel();
			}
		});
		btnNewButton_7.setBounds(478, 87, 105, 41);
		panel.add(btnNewButton_7);
		
		JButton button = new JButton("1");
		button.setBounds(478, 201, 105, 41);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(478, 302, 105, 41);
		panel.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 0, 255), 7));
		panel_2.setBounds(846, 162, 526, 962);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 568, 496, 24);
		panel_2.add(separator);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setBounds(25, 644, 115, 33);
		panel_2.add(lblTax);
		
		JLabel label = new JLabel("Sub-Total:");
		label.setBounds(25, 734, 161, 33);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Total Amount: ");
		label_1.setBounds(25, 831, 179, 33);
		panel_2.add(label_1);
		
		List list_1 = new List();
		list_1.setBounds(19, 21, 486, 527);
		list_1.setBackground(new Color(127, 255, 212));
		list_1.setMultipleMode(true);
		list_1.setMultipleSelections(true);
		panel_2.add(list_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 0, 255), 7));
		panel_3.setBounds(65, 609, 678, 349);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setBounds(297, 12, 84, 36);
		lblItems.setFont(new Font("Sylfaen", Font.BOLD, 27));
		panel_3.add(lblItems);
		
		JToggleButton tglbtnFriedCod = new JToggleButton("Fried Cod\r\n ($16.00)");
		tglbtnFriedCod.setBounds(26, 41, 249, 57);
		tglbtnFriedCod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_3.add(tglbtnFriedCod);
		
		JToggleButton tglbtnMacaroniAndCheese = new JToggleButton("Macaroni and Cheese\r\n ($10.00)");
		tglbtnMacaroniAndCheese.setBounds(26, 121, 249, 57);
		tglbtnMacaroniAndCheese.setToolTipText("");
		tglbtnMacaroniAndCheese.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_3.add(tglbtnMacaroniAndCheese);
		
		JToggleButton tglbtnBurgerAndFries = new JToggleButton("Burger and Fries\r\n ($11.00)");
		tglbtnBurgerAndFries.setBounds(26, 259, 249, 79);
		tglbtnBurgerAndFries.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_3.add(tglbtnBurgerAndFries);
		
		JToggleButton tglbtnClubSandwich = new JToggleButton("Club Sandwich\r\n ($10.00)");
		tglbtnClubSandwich.setBounds(26, 191, 249, 57);
		tglbtnClubSandwich.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_3.add(tglbtnClubSandwich);
		
		JButton btnNewButton_3 = new JButton("Buy");
		btnNewButton_3.setBounds(429, 45, 171, 41);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Buy");
		btnNewButton_4.setBounds(429, 124, 171, 41);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Buy");
		btnNewButton_5.setBounds(429, 207, 171, 41);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Buy");
		btnNewButton_6.setBounds(429, 297, 171, 41);
		panel_3.add(btnNewButton_6);
		
		JLabel lblRestaurant = new JLabel("Restaurant Payment System");
		lblRestaurant.setToolTipText("");
		lblRestaurant.setFont(new Font("Algerian", Font.PLAIN, 76));
		lblRestaurant.setBounds(108, 28, 1152, 85);
		frame.getContentPane().add(lblRestaurant);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 0, 255), 7));
		panel_1.setBounds(65, 1014, 678, 110);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToggleButton toggleButton_6 = new JToggleButton("TIPS");
		toggleButton_6.setBounds(26, 14, 249, 79);
		panel_1.add(toggleButton_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(453, 22, 101, 71);
		panel_1.add(textField_7);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(1201, 1152, 171, 41);
		frame.getContentPane().add(btnNewButton_2);
	}
}
