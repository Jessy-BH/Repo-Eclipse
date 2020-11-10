package tpswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainTPSwing {

	private JFrame frame;
	private JTextField input_title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTPSwing window = new MainTPSwing();
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
	public MainTPSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_container = new JPanel();
		panel_container.setBackground(Color.PINK);
		frame.getContentPane().add(panel_container, BorderLayout.CENTER);
		panel_container.setLayout(null);
		
		JLabel label_title = new JLabel("Hello world");
		label_title.setBounds(187, 86, 66, 14);
		panel_container.add(label_title);
		
		input_title = new JTextField();
		input_title.setBounds(169, 111, 96, 20);
		panel_container.add(input_title);
		input_title.setColumns(10);
		
		JButton BtnOk = new JButton("ok");
		BtnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String title = input_title.getText();
				System.out.println("ok " + title);
				label_title.setText(title);
				
				//System.out.println("Ok " + input_title.getText());
			}
		});
		BtnOk.setBounds(269, 110, 50, 23);
		panel_container.add(BtnOk);
	}
}
