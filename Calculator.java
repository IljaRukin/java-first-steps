import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static double zahl3;
	private static double zahl2;
	private static double zahl1;
	private static JLabel lblErgebnis = new JLabel("Ergebnis");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 270);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(30, 30, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(150, 30, 115, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Double.parseDouble((textField_1.getText()));
				zahl3 = zahl1 + zahl2;
				String zahl4 = String.valueOf(zahl3);
				lblErgebnis.setText(zahl4);
			}
		});
		button.setBounds(20, 110, 117, 25);
		contentPane.add(button);

		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Double.parseDouble((textField_1.getText()));
				zahl3 = zahl1 - zahl2;
				String zahl4 = String.valueOf(zahl3);
				lblErgebnis.setText(zahl4);
			}
		});
		button_1.setBounds(150, 110, 117, 25);
		contentPane.add(button_1);

		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Double.parseDouble((textField_1.getText()));
				zahl3 = zahl1 * zahl2;
				String zahl4 = String.valueOf(zahl3);
				lblErgebnis.setText(zahl4);
			}
		});
		button_2.setBounds(20, 150, 117, 25);
		contentPane.add(button_2);

		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Double.parseDouble((textField_1.getText()));
				zahl3 = zahl1 / zahl2;
				String zahl4 = String.valueOf(zahl3);
				lblErgebnis.setText(zahl4);
			}
		});
		button_3.setBounds(150, 150, 117, 25);
		contentPane.add(button_3);

		JButton button_4 = new JButton("^");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Integer.parseInt((textField_1.getText()));
				double zahl5 = zahl1;
				while (zahl2 > 1) {
					zahl1 = zahl1 * zahl5;
					zahl2 = zahl2 - 1;
				}
				String zahl4 = String.valueOf(zahl1);
				lblErgebnis.setText(zahl4);
			}
		});
		button_4.setBounds(20, 190, 117, 25);
		contentPane.add(button_4);

		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl1 = Double.parseDouble((textField.getText()));
				zahl2 = Double.parseDouble((textField_1.getText()));
//				zahl3 = Math.sqrt(zahl1);
				zahl3 = Math.pow(Math.E, Math.log(zahl2)/zahl1);
				String zahl4 = String.valueOf(zahl3);
				lblErgebnis.setText(zahl4);
			}
		});
		btnSqrt.setBounds(150, 190, 117, 25);
		contentPane.add(btnSqrt);

		lblErgebnis.setBounds(25, 60, 240, 20);
		contentPane.add(lblErgebnis);

	}
}
