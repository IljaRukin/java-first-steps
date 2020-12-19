import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	boolean var = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	final static JButton button = new JButton();
	final static JButton button_1 = new JButton();
	final static JButton button_2 = new JButton();
	final static JButton button_3 = new JButton();
	final static JButton button_4 = new JButton();
	final static JButton button_5 = new JButton();
	final static JButton button_6 = new JButton();
	final static JButton button_7 = new JButton();
	final static JButton button_8 = new JButton();
	final static JButton button_9 = new JButton("zurücksetzen");
	static JLabel lblNewLabel = new JLabel();

	public static void wergewinnt() {

		if ((button.getText().equals("X")) && (button_1.getText().equals("X"))
				&& (button_2.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_3.getText().equals("X"))
				&& (button_4.getText().equals("X"))
				&& (button_5.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_6.getText().equals("X"))
				&& (button_7.getText().equals("X"))
				&& (button_8.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button.getText().equals("X")) && (button_4.getText().equals("X"))
				&& (button_8.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_2.getText().equals("X"))
				&& (button_4.getText().equals("X"))
				&& (button_6.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button.getText().equals("X")) && (button_3.getText().equals("X"))
				&& (button_6.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_1.getText().equals("X"))
				&& (button_4.getText().equals("X"))
				&& (button_7.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_2.getText().equals("X"))
				&& (button_5.getText().equals("X"))
				&& (button_8.getText().equals("X"))) {
			lblNewLabel.setText("X gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}

		if ((button.getText().equals("O")) && (button_1.getText().equals("O"))
				&& (button_2.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_3.getText().equals("O"))
				&& (button_4.getText().equals("O"))
				&& (button_5.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_6.getText().equals("O"))
				&& (button_7.getText().equals("O"))
				&& (button_8.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button.getText().equals("O")) && (button_4.getText().equals("O"))
				&& (button_8.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_2.getText().equals("O"))
				&& (button_4.getText().equals("O"))
				&& (button_6.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}

		if ((button.getText().equals("O")) && (button_3.getText().equals("O"))
				&& (button_6.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_1.getText().equals("O"))
				&& (button_4.getText().equals("O"))
				&& (button_7.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");
		}
		if ((button_2.getText().equals("O"))
				&& (button_5.getText().equals("O"))
				&& (button_8.getText().equals("O"))) {
			lblNewLabel.setText("O gewinnt");
			button.setText("");
			button_1.setText("");
			button_2.setText("");
			button_3.setText("");
			button_4.setText("");
			button_5.setText("");
			button_6.setText("");
			button_7.setText("");
			button_8.setText("");

		}
	}

	/**
	 * Create the frame.fuktioniert
	 */
	public TicTacToe() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button.getText().equals("")) {
					if (var == true) {
						button.setText("X");
						var = false;
					} else if (var == false) {
						button.setText("O");
						var = true;
					}
					wergewinnt();
				}

			}
		});
		button.setBounds(0, 0, 100, 100);
		contentPane.add(button);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_1.getText().equals("")) {
					if (var == true) {
						button_1.setText("X");
						var = false;
					} else if (var == false) {
						button_1.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_1.setBounds(100, 0, 100, 100);
		contentPane.add(button_1);

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_2.getText().equals("")) {
					if (var == true) {
						button_2.setText("X");
						var = false;
					} else if (var == false) {
						button_2.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_2.setBounds(200, 0, 100, 100);
		contentPane.add(button_2);

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_3.getText().equals("")) {
					if (var == true) {
						button_3.setText("X");
						var = false;
					} else if (var == false) {
						button_3.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_3.setBounds(0, 100, 100, 100);
		contentPane.add(button_3);

		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_4.getText().equals("")) {
					if (var == true) {
						button_4.setText("X");
						var = false;
					} else if (var == false) {
						button_4.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_4.setBounds(100, 100, 100, 100);
		contentPane.add(button_4);

		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_5.getText().equals("")) {
					if (var == true) {
						button_5.setText("X");
						var = false;
					} else if (var == false) {
						button_5.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_5.setBounds(200, 100, 100, 100);
		contentPane.add(button_5);

		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_6.getText().equals("")) {
					if (var == true) {
						button_6.setText("X");
						var = false;
					} else if (var == false) {
						button_6.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_6.setBounds(0, 200, 100, 100);
		contentPane.add(button_6);

		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_7.getText().equals("")) {
					if (var == true) {
						button_7.setText("X");
						var = false;
					} else if (var == false) {
						button_7.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_7.setBounds(100, 200, 100, 100);
		contentPane.add(button_7);

		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button_8.getText().equals("")) {
					if (var == true) {
						button_8.setText("X");
						var = false;
					} else if (var == false) {
						button_8.setText("O");
						var = true;
					}
					wergewinnt();
				}
			}
		});
		button_8.setBounds(200, 200, 100, 100);
		contentPane.add(button_8);

		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setText("");
				button_1.setText("");
				button_2.setText("");
				button_3.setText("");
				button_4.setText("");
				button_5.setText("");
				button_6.setText("");
				button_7.setText("");
				button_8.setText("");
				lblNewLabel.setText("");
			}
		});
		button_9.setBounds(0, 340, 300, 20);
		contentPane.add(button_9);
		
		lblNewLabel.setBounds(0, 310, 300, 20);
		contentPane.add(lblNewLabel);

	}
}
