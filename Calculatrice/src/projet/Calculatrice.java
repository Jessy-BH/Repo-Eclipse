package projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatrice {

	private JFrame frame;

	private boolean clickOperateur = false;
	private boolean clickDot = false;
	private double chiffre1;
	private double resultat;
	private JLabel label_screen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
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
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);

		JPanel screen = new JPanel();
		screen.setBackground(Color.GRAY);
		screen.setBounds(31, 21, 385, 106);
		frame.getContentPane().add(screen);
		screen.setLayout(null);

		label_screen = new JLabel("");
		label_screen.setFont(new Font("Tahoma", Font.BOLD, 40));
		label_screen.setHorizontalAlignment(SwingConstants.RIGHT);
		label_screen.setBounds(0, 0, 375, 106);
		screen.add(label_screen);

		// ----------------- 0 à 9 ---------------- \\

		JButton Btn0 = new JButton("0");
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn0.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn0.setBackground(Color.LIGHT_GRAY);
		Btn0.setBounds(31, 374, 69, 44);
		frame.getContentPane().add(Btn0);

		JButton Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn1.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn1.setBackground(Color.LIGHT_GRAY);
		Btn1.setBounds(31, 319, 69, 44);
		frame.getContentPane().add(Btn1);

		JButton Btn2 = new JButton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn2.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn2.setBackground(Color.LIGHT_GRAY);
		Btn2.setBounds(110, 319, 69, 44);
		frame.getContentPane().add(Btn2);

		JButton Btn_sign = new JButton("+ / -");
		Btn_sign.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_sign.setBackground(Color.LIGHT_GRAY);
		Btn_sign.setBounds(189, 374, 69, 44);
		frame.getContentPane().add(Btn_sign);

		JButton Btn3 = new JButton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn3.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn3.setBackground(Color.LIGHT_GRAY);
		Btn3.setBounds(189, 319, 69, 44);
		frame.getContentPane().add(Btn3);

		JButton Btn4 = new JButton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn4.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn4.setBackground(Color.LIGHT_GRAY);
		Btn4.setBounds(31, 264, 69, 44);
		frame.getContentPane().add(Btn4);

		JButton Btn5 = new JButton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn5.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn5.setBackground(Color.LIGHT_GRAY);
		Btn5.setBounds(110, 264, 69, 44);
		frame.getContentPane().add(Btn5);

		JButton Btn6 = new JButton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn6.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn6.setBackground(Color.LIGHT_GRAY);
		Btn6.setBounds(189, 264, 69, 44);
		frame.getContentPane().add(Btn6);

		JButton Btn7 = new JButton("7");
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn7.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn7.setBackground(Color.LIGHT_GRAY);
		Btn7.setBounds(31, 209, 69, 44);
		frame.getContentPane().add(Btn7);

		JButton Btn8 = new JButton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn8.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn8.setBackground(Color.LIGHT_GRAY);
		Btn8.setBounds(110, 209, 69, 44);
		frame.getContentPane().add(Btn8);

		JButton Btn9 = new JButton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == true) {
					String value = label_screen.getText() + Btn9.getText();
					label_screen.setText(value);
				}
			}
		});
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn9.setBackground(Color.LIGHT_GRAY);
		Btn9.setBounds(189, 209, 69, 44);
		frame.getContentPane().add(Btn9);

		// ----------------- Mémoires ---------------- \\

		JButton Btn_MRC = new JButton("MRC");
		Btn_MRC.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_MRC.setBackground(Color.LIGHT_GRAY);
		Btn_MRC.setBounds(31, 154, 69, 44);
		frame.getContentPane().add(Btn_MRC);

		JButton Btn_Mplus = new JButton("M+");
		Btn_Mplus.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Mplus.setBackground(Color.LIGHT_GRAY);
		Btn_Mplus.setBounds(110, 154, 69, 44);
		frame.getContentPane().add(Btn_Mplus);

		JButton Btn_Mminus = new JButton("M-");
		Btn_Mminus.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_Mminus.setBackground(Color.LIGHT_GRAY);
		Btn_Mminus.setBounds(189, 154, 69, 44);
		frame.getContentPane().add(Btn_Mminus);

		// ----------------- Opérateurs ---------------- \\

		JButton Btn_plus = new JButton("+");
		Btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addition();
			}
		});
		Btn_plus.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_plus.setBackground(Color.LIGHT_GRAY);
		Btn_plus.setBounds(268, 319, 69, 99);
		frame.getContentPane().add(Btn_plus);

		JButton Btn_equal = new JButton("=");
		Btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equal();
			}
		});
		Btn_equal.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_equal.setBackground(Color.LIGHT_GRAY);
		Btn_equal.setBounds(347, 374, 69, 44);
		frame.getContentPane().add(Btn_equal);

		JButton Btn_minus = new JButton("-");
		Btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtraction();
			}
		});
		Btn_minus.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_minus.setBackground(Color.LIGHT_GRAY);
		Btn_minus.setBounds(347, 319, 69, 44);
		frame.getContentPane().add(Btn_minus);

		JButton Btn_devide = new JButton("\u00F7");
		Btn_devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				division();
			}
		});
		Btn_devide.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_devide.setBackground(Color.LIGHT_GRAY);
		Btn_devide.setBounds(347, 264, 69, 44);
		frame.getContentPane().add(Btn_devide);

		JButton Btn_multiply = new JButton("x");
		Btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplication();
			}
		});
		Btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_multiply.setBackground(Color.LIGHT_GRAY);
		Btn_multiply.setBounds(268, 264, 69, 44);
		frame.getContentPane().add(Btn_multiply);

		JButton Btn_root = new JButton("\u221A");
		Btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root();
			}
		});
		Btn_root.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_root.setBackground(Color.LIGHT_GRAY);
		Btn_root.setBounds(347, 209, 69, 44);
		frame.getContentPane().add(Btn_root);

		JButton Btn_percent = new JButton("%");
		Btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				percentage();
			}
		});
		Btn_percent.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_percent.setBackground(Color.LIGHT_GRAY);
		Btn_percent.setBounds(268, 209, 69, 44);
		frame.getContentPane().add(Btn_percent);

		JButton Btn_dot = new JButton(".");
		Btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickDot == false) {
					clickDot = true;
					String value1 = label_screen.getText() + Btn_dot.getText();
					label_screen.setText(value1);
				}

//				Class<Double> value = null;
//                if (value == double.class);
//                String value1 = label_screen.getText() + Btn_dot.getText();
//                label_screen.setText(value1);
			}
		});
		Btn_dot.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_dot.setBackground(Color.LIGHT_GRAY);
		Btn_dot.setBounds(110, 374, 69, 44);
		frame.getContentPane().add(Btn_dot);

		// ----------------- ON / CE ---------------- \\

		JButton Btn_On = new JButton("ON-C");
		Btn_On.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (clickOperateur == false) {
					clickOperateur = true;
					label_screen.setText("");
					screen.setBackground(Color.LIGHT_GRAY);
				} else {

				}
			}
		});
		Btn_On.setFont(new Font("Tahoma", Font.BOLD, 13));
		Btn_On.setForeground(Color.WHITE);
		Btn_On.setBackground(Color.RED);
		Btn_On.setBounds(347, 154, 69, 44);
		frame.getContentPane().add(Btn_On);

		JButton Btn_CE = new JButton("CE");
		Btn_CE.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btn_CE.setBackground(Color.LIGHT_GRAY);
		Btn_CE.setBounds(268, 154, 69, 44);
		frame.getContentPane().add(Btn_CE);
		frame.setBounds(100, 100, 469, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ----------------- Fonctions Opérateurs ---------------- \\

	public void addition() {

//		
//		chiffre1 = chiffre1 + Double.valueOf(label_screen.getText()).doubleValue();
//		label_screen.setText(String.valueOf(chiffre1));
	}

	public void subtraction() {

	}

	public void multiplication() {

	}

	public void division() {

	}

	public void percentage() {

	}

	public void root() {

	}
	
	public void equal() {
		
	}
}