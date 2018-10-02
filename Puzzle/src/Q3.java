import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;

public class Q3 {

	private JFrame frame;
	private JTextField txtAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q3 window = new Q3();
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
	public Q3() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 3");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(new ImageIcon(getClass().getResource("/images/e2.jpg")));
		imageLabel.setBounds(78, 21, 295, 136);
		frame.getContentPane().add(imageLabel);
		
		JLabel lblGuessAnEnglish = new JLabel("Guess an English word:");
		lblGuessAnEnglish.setFont(new Font("Lucida Bright", Font.BOLD, 16));
		lblGuessAnEnglish.setBounds(28, 185, 184, 24);
		frame.getContentPane().add(lblGuessAnEnglish);
		
		//answer textField
		txtAnswer = new JTextField();
		txtAnswer.setBounds(28, 213, 184, 28);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		txtAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtAnswer.getText().toLowerCase().matches("missunderstood")) {
					JOptionPane.showMessageDialog(null, "You MISspelled.");
					txtAnswer.setText("");
				} else if(txtAnswer.getText().toLowerCase().matches("misunderstood")) {
					JOptionPane.showMessageDialog(null, "Congratulations!");
					txtAnswer.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Nop, try again.");
					txtAnswer.setText("");
				}
					
			}
		});
		
		//Previous button
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(249, 181, 87, 29);
		frame.getContentPane().add(btnPrevious);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q2();
				frame.dispose();
			}
		});
		
		//Next button
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(344, 181, 87, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q4();
				frame.dispose();
			}
		});
		
		//Hint button
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(249, 224, 87, 29);
		frame.getContentPane().add(btnAnswer);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Misunderstood");
			}
		});
		
		//Home button
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Puzzle();
				frame.dispose();
			}
		});
		btnHome.setBounds(345, 223, 87, 29);
		frame.getContentPane().add(btnHome);

		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
		
	}
}
