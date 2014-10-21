import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JLabel;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import myPackage.Lab1;;

public class GUI {

	private JFrame frame;
	private JTextField txtInvestmentAmount;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 300, 400));
		frame.getContentPane().setLayout(null);
		
		txtInvestmentAmount = new JTextField();
		txtInvestmentAmount.setBounds(171, 93, 105, 20);
		frame.getContentPane().add(txtInvestmentAmount);
		//Double amount = Double.parseDouble(txtInvestmentAmount.getText());
		txtInvestmentAmount.setColumns(10);
		
		JLabel lblIn = new JLabel("Investment Amount");
		lblIn.setBounds(34, 92, 127, 23);
		frame.getContentPane().add(lblIn);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(57, 142, 46, 14);
		frame.getContentPane().add(lblYears);
		
		textField = new JTextField();
		textField.setBounds(171, 139, 105, 20);
		frame.getContentPane().add(textField);
		//Double years = Double.parseDouble(textField.getText());
		textField.setColumns(10);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(34, 194, 117, 14);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 191, 105, 20);
		frame.getContentPane().add(textField_1);
		//Double interest = Double.parseDouble(textField_1.getText());
		textField_1.setColumns(10);
		
		JLabel lblFutureValue = new JLabel("Future value");
		lblFutureValue.setBounds(34, 237, 105, 14);
		frame.getContentPane().add(lblFutureValue);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(105, 269, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		final JLabel label = new JLabel("");
		label.setBounds(171, 237, 105, 19);
		frame.getContentPane().add(label);
		btnCalculate.addActionListener(new ActionListener() {
			 @Override
            public void actionPerformed(ActionEvent e)
            {
            	Double amount = Double.parseDouble(txtInvestmentAmount.getText());
            	Double years = Double.parseDouble(textField.getText());
            	Double interest = Double.parseDouble(textField_1.getText());
            	double value = Lab1.PMT(years,amount,interest);
            	DecimalFormat df = new DecimalFormat("#.##");
            	label.setText(String.valueOf(df.format(value)));
            	
            }
        });   
		


	}

}
