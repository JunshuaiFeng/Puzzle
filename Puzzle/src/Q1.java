import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 window = new Q1();
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
	public Q1() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Question 1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JTextArea lblASimpleBut = new JTextArea("\n A simple but tricky    math question:\n\n If \n 1 = 5,\n 2 = 10;\n 3 = 15;\n 4 = 20");
		lblASimpleBut.setEditable(false);
		lblASimpleBut.setFont(new Font("Krungthep", Font.ITALIC, 16));
		lblASimpleBut.setBackground(new Color(152, 251, 152));
		lblASimpleBut.setLineWrap(true);
		lblASimpleBut.setWrapStyleWord(true);
		lblASimpleBut.setBounds(28, 17, 174, 220);
		frame.getContentPane().add(lblASimpleBut);
		
		JLabel lblWhatDoes = new JLabel("What does 5 equal to?");
		lblWhatDoes.setFont(new Font("Krungthep", Font.ITALIC, 17));
		lblWhatDoes.setBounds(214, 17, 200, 43);
		frame.getContentPane().add(lblWhatDoes);

		JLabel lblAfafwefe = new JLabel("(Press Enter when finish)");
		lblAfafwefe.setFont(new Font("Krungthep", Font.ITALIC, 14));
		lblAfafwefe.setBounds(214, 43, 200, 43);
		frame.getContentPane().add(lblAfafwefe);
		
		//ANSWER textField
		textField = new JTextField();
		textField.setBounds(214, 90, 190, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().toLowerCase().matches("25|twenty five|twenty-five")) {
					JOptionPane.showMessageDialog(null, "Sometimes, life is better if you don't follow the logic.");
					textField.setText("");
				} else if(textField.getText().toLowerCase().matches("1|one")) {
					JOptionPane.showMessageDialog(null, "Congratulations!");
					textField.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Nop, try again.");
					textField.setText("");
				}
			}
		});
		
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Puzzle();
				frame.dispose();
			}
		});
		btnHome.setBounds(28, 243, 117, 29);
		frame.getContentPane().add(btnHome);
		
		JButton btnHint = new JButton("Hint");
		btnHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Read the question again slowly, and pause when finish each sentence.");
			}
		});
		btnHint.setBounds(250, 130, 117, 29);
		frame.getContentPane().add(btnHint);
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The answer is 1, since 1 = 5 is said at the beginning.");
			}
		});
		btnAnswer.setBounds(250, 171, 117, 29);
		frame.getContentPane().add(btnAnswer);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(316, 243, 117, 29);
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q2();
				frame.dispose();
			}
		});
		
		JLabel bgLabel = new JLabel();
		bgLabel.setIcon(new ImageIcon(getClass().getResource("/images/bg.png")));
		bgLabel.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(bgLabel);
		
	}
}
