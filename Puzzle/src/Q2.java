import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q2 window = new Q2();
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
	public Q2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 2");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(new ImageIcon(getClass().getResource("/images/e1.jpg")));
		imageLabel.setBounds(55, 12, 346, 144);
		frame.getContentPane().add(imageLabel);
		
		JLabel lblBear = new JLabel("");
		lblBear.setIcon(new ImageIcon(Q2.class.getResource("/images/bear.jpg")));
		lblBear.setBounds(73, 224, 47, 48);
		frame.getContentPane().add(lblBear);
		
		JLabel lblNose = new JLabel("");
		lblNose.setIcon(new ImageIcon(Q2.class.getResource("/images/nose.png")));
		lblNose.setBounds(167, 224, 47, 43);
		frame.getContentPane().add(lblNose);
		
		JLabel lblDog = new JLabel("");
		lblDog.setIcon(new ImageIcon(Q2.class.getResource("/images/dog.gif")));
		lblDog.setBounds(77, 165, 61, 51);
		frame.getContentPane().add(lblDog);
		
		JLabel lblTwo = new JLabel("");
		lblTwo.setIcon(new ImageIcon(Q2.class.getResource("/images/2.png")));
		lblTwo.setBounds(168, 167, 45, 43);
		frame.getContentPane().add(lblTwo);

		//Dog
		JRadioButton rdbtnDog = new JRadioButton("");
		rdbtnDog.setBounds(43, 179, 27, 23);
		frame.getContentPane().add(rdbtnDog);
		rdbtnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope, not me!");
			}
		});
		
		//Bear
		JRadioButton rdbtnBear = new JRadioButton("");
		rdbtnBear.setBounds(44, 236, 27, 23);
		frame.getContentPane().add(rdbtnBear);
		rdbtnBear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
			}
		});

		//Two
		JRadioButton rdbtnTwo = new JRadioButton("Two");
		rdbtnTwo.setBounds(145, 178, 29, 23);
		frame.getContentPane().add(rdbtnTwo);
		rdbtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Uh uh..");
			}
		});
		
		//Nose
		JRadioButton rdbtnNose = new JRadioButton("Nose");
		rdbtnNose.setBounds(145, 233, 27, 23);
		frame.getContentPane().add(rdbtnNose);
		rdbtnNose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nop!");
			}
		});

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnDog);
		group.add(rdbtnBear);
		group.add(rdbtnTwo);
		group.add(rdbtnNose);

		//Previous button
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(249, 181, 87, 29);
		frame.getContentPane().add(btnPrevious);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q1();
				frame.dispose();
			}
		});
		
		//Next button
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(344, 181, 87, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q3();
				frame.dispose();
			}
		});
		
		//Hint button
		JButton btnHint = new JButton("Hint");
		btnHint.setBounds(249, 224, 87, 29);
		frame.getContentPane().add(btnHint);
		btnHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Try spelling it out.");
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
