import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q4 window = new Q4();
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
	public Q4() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 4");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImg = new JLabel();
		lblImg.setIcon(new ImageIcon(getClass().getResource("/images/e3.jpg")));
		lblImg.setBounds(73, 39, 300, 163);
		frame.getContentPane().add(lblImg);

		//five buttons
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(357, 231, 87, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q5();
				frame.dispose();
			}
		});
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(267, 231, 87, 29);
		frame.getContentPane().add(btnPrevious);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q3();
				frame.dispose();
			}
		});
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(178, 231, 87, 29);
		frame.getContentPane().add(btnAnswer);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Word 'the' appears twice in the sentence.");
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
				JOptionPane.showMessageDialog(null, "You need to click somewhere that is mistaken.");
			}
		});

		//label for "The" 
		JLabel lblThe = new JLabel();
		lblThe.setBounds(302, 49, 67, 56);
		frame.getContentPane().add(lblThe);
		lblThe.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
			}
		});
		
		JLabel lblThe2 = new JLabel();
		lblThe2.setBounds(91, 103, 68, 46);
		frame.getContentPane().add(lblThe2);
		lblThe2.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
			}
		});

		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
	}

}
