package Cushman.Zachary.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame; //test stuff
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GMain window = new GMain();
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
	public GMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField NumeratorField = new JTextField();
		NumeratorField.setBounds(12, 29, 116, 22);
		frame.getContentPane().add(NumeratorField);
		NumeratorField.setColumns(10);
		
		JTextField DenominatorField = new JTextField();
		DenominatorField.setBounds(304, 29, 116, 22);
		frame.getContentPane().add(DenominatorField);
		DenominatorField.setColumns(10);
		
		JLabel NumeratorLabel = new JLabel("Numerator");
		NumeratorLabel.setBounds(40, 13, 77, 16);
		frame.getContentPane().add(NumeratorLabel);
		
		JLabel DenominatorLabel = new JLabel("Denominator");
		DenominatorLabel.setBounds(326, 13, 82, 16);
		frame.getContentPane().add(DenominatorLabel);
		
		JLabel ResultField = new JLabel("Result");
		ResultField.setBounds(184, 101, 56, 16);
		frame.getContentPane().add(ResultField);
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.setBounds(164, 61, 97, 25);
		frame.getContentPane().add(CalculateButton);
		CalculateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double numer = Double.parseDouble(NumeratorField.getText());
				double denom = Double.parseDouble(DenominatorField.getText());
				
				SimpleMath math = new SimpleMath();
				try {
					double result = math.divide(numer, denom);
					ResultField.setText("" + result);
				}
				catch(ArithmeticException e) {
					ResultField.setText("Cannot divide by 0");
				};
			}
			});
		}
	}
