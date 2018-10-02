import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q6 window = new Q6();
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
	public Q6() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 6");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JLabel lblImg = new JLabel();
		lblImg.setIcon(new ImageIcon(Q6.class.getResource("/images/shapes.png")));
		lblImg.setBounds(23, 65, 400, 147);
		frame.getContentPane().add(lblImg);

		JLabel lblWhatDoes = new JLabel("Which shape is different from the rest three?");
		lblWhatDoes.setFont(new Font("Krungthep", Font.ITALIC, 16));
		lblWhatDoes.setBounds(23, 24, 400, 29);
		frame.getContentPane().add(lblWhatDoes);

		// five buttons
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(357, 231, 87, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Puzzle();
				frame.dispose();
			}
		});

		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(267, 231, 87, 29);
		frame.getContentPane().add(btnPrevious);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q5();
				frame.dispose();
			}
		});

		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(178, 231, 87, 29);
		frame.getContentPane().add(btnAnswer);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"The answer is the second one.\n\nThe 1st one is "
						+ "different becuase it doesn't have lines in it;\n"
						+ "The 3rd one is different because of its color;\nThe"
						+ " last one is different because of its shape.\nOnly "
						+ "the second shape has nothing special, "
						+ "so it is different.");
			}
		});

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(6, 231, 87, 29);
		frame.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Puzzle();
				frame.dispose();
			}
		});

		JButton btnHint = new JButton("Hint");
		btnHint.setBounds(91, 231, 87, 29);
		frame.getContentPane().add(btnHint);
		btnHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Sometimes when you have nothing special, you are special already.");
			}
		});

		// background image
		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
	}

}
