import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Q5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q5 window = new Q5();
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
	public Q5() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 5");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(Q5.class.getResource("/images/e4.jpg")));
		lblImg.setBounds(46, 21, 350, 192);
		frame.getContentPane().add(lblImg);
		
		//five buttons
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(357, 231, 87, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q6();
				frame.dispose();
			}
		});
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(267, 231, 87, 29);
		frame.getContentPane().add(btnPrevious);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q4();
				frame.dispose();
			}
		});
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(178, 231, 87, 29);
		frame.getContentPane().add(btnAnswer);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "7 children total, which includes 4 boys and 3 girls.");
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
				JOptionPane.showMessageDialog(null, "Annabelle is a girl, and Christopher is a boy.");
			}
		});

		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
	}

}
