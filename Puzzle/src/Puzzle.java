import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Puzzle {

	private JFrame frame;
	public static int point = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle window = new Puzzle();
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
	public Puzzle() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Puzzle");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JButton btnStartGame = new JButton("Start game");
		btnStartGame.setBounds(162, 136, 117, 29);
		frame.getContentPane().add(btnStartGame);
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q1();
				frame.dispose();
			}
		});
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(162, 177, 117, 29);
		frame.getContentPane().add(btnHelp);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Try to answer each puzzle questions yourself."
						+ "\nYou could cheat, but that's not what this game is made for.");
			}
		});
		
		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg4.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
	}
}
