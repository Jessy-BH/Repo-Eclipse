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

public class MainProjet {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProjet window = new MainProjet();
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
	public MainProjet() {
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
		screen.setBackground(Color.WHITE);
		screen.setBounds(10, 11, 392, 133);
		frame.getContentPane().add(screen);
		screen.setLayout(null);
		
		JLabel label_screen = new JLabel("0");
		label_screen.setBounds(232, 65, 20, 14);
		screen.add(label_screen);
		
		JButton Btn0 = new JButton("0");
		Btn0.setBounds(26, 434, 64, 44);
		frame.getContentPane().add(Btn0);
		
		JButton Btn1 = new JButton("1");
		Btn1.setBounds(26, 379, 64, 44);
		frame.getContentPane().add(Btn1);
		
		JButton Btn_dot = new JButton(".");
		Btn_dot.setBounds(100, 434, 64, 44);
		frame.getContentPane().add(Btn_dot);
		
		JButton Btn2 = new JButton("2");
		Btn2.setBounds(100, 379, 64, 44);
		frame.getContentPane().add(Btn2);
		
		JButton Btn_sign = new JButton("+ / -");
		Btn_sign.setBounds(174, 434, 64, 44);
		frame.getContentPane().add(Btn_sign);
		
		JButton Btn3 = new JButton("3");
		Btn3.setBounds(174, 379, 64, 44);
		frame.getContentPane().add(Btn3);
		
		JButton Btn6 = new JButton("6");
		Btn6.setBounds(174, 324, 64, 44);
		frame.getContentPane().add(Btn6);
		
		JButton Btn5 = new JButton("5");
		Btn5.setBounds(100, 324, 64, 44);
		frame.getContentPane().add(Btn5);
		
		JButton Btn4 = new JButton("4");
		Btn4.setBounds(26, 324, 64, 44);
		frame.getContentPane().add(Btn4);
		
		JButton Btn7 = new JButton("7");
		Btn7.setBounds(26, 269, 64, 44);
		frame.getContentPane().add(Btn7);
		
		JButton Btn8 = new JButton("8");
		Btn8.setBounds(100, 269, 64, 44);
		frame.getContentPane().add(Btn8);
		
		JButton Btn9 = new JButton("9");
		Btn9.setBounds(174, 269, 64, 44);
		frame.getContentPane().add(Btn9);
		
		JButton Btn_MRC = new JButton("MRC");
		Btn_MRC.setBounds(26, 214, 64, 44);
		frame.getContentPane().add(Btn_MRC);
		
		JButton Btn_Mplus = new JButton("M+");
		Btn_Mplus.setBounds(100, 214, 64, 44);
		frame.getContentPane().add(Btn_Mplus);
		
		JButton Btn_Mminus = new JButton("M-");
		Btn_Mminus.setBounds(174, 214, 64, 44);
		frame.getContentPane().add(Btn_Mminus);
		
		JButton Btn_plus = new JButton("+");
		Btn_plus.setBounds(248, 379, 64, 99);
		frame.getContentPane().add(Btn_plus);
		
		JButton Btn_equal = new JButton("=");
		Btn_equal.setBounds(322, 434, 64, 44);
		frame.getContentPane().add(Btn_equal);
		
		JButton Btn_minus = new JButton("-");
		Btn_minus.setBounds(322, 379, 64, 44);
		frame.getContentPane().add(Btn_minus);
		
		JButton Btn_devide = new JButton("\u00F7");
		Btn_devide.setBounds(322, 324, 64, 44);
		frame.getContentPane().add(Btn_devide);
		
		JButton Btn_multiply = new JButton("x");
		Btn_multiply.setBounds(248, 324, 64, 44);
		frame.getContentPane().add(Btn_multiply);
		
		JButton Btn_root = new JButton("\u221A");
		Btn_root.setBounds(322, 269, 64, 44);
		frame.getContentPane().add(Btn_root);
		
		JButton Btn_percent = new JButton("%");
		Btn_percent.setBounds(248, 269, 64, 44);
		frame.getContentPane().add(Btn_percent);
		
		JButton Btn_On = new JButton("ON-C");
		Btn_On.setBackground(Color.RED);
		Btn_On.setBounds(322, 214, 64, 44);
		frame.getContentPane().add(Btn_On);
		
		JButton Btn_CE = new JButton("CE");
		Btn_CE.setBounds(248, 214, 64, 44);
		frame.getContentPane().add(Btn_CE);
		frame.setBounds(100, 100, 430, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
