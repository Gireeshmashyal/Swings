import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci frame = new Calci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CALCILATOR = new JLabel("CALCULATOR");
		CALCILATOR.setFont(new Font("Cambria", Font.BOLD, 14));
		CALCILATOR.setBounds(165, 11, 87, 18);
		contentPane.add(CALCILATOR);
		
		tfa = new JTextField();
		tfa.setBackground(new Color(255, 255, 255));
		tfa.setBounds(175, 42, 86, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel la = new JLabel("A");
		la.setBackground(Color.BLACK);
		la.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		la.setBounds(134, 34, 46, 34);
		contentPane.add(la);
		
		JLabel lb = new JLabel("B");
		lb.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lb.setBackground(Color.BLACK);
		lb.setBounds(134, 79, 46, 34);
		contentPane.add(lb);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBackground(new Color(255, 255, 255));
		tfb.setBounds(175, 87, 86, 20);
		contentPane.add(tfb);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblResult.setBackground(Color.BLACK);
		lblResult.setBounds(114, 124, 46, 34);
		contentPane.add(lblResult);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBackground(new Color(128, 255, 0));
		tfr.setBounds(175, 132, 86, 20);
		contentPane.add(tfr);
		
		JButton Addition = new JButton("ADD");
		Addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		Addition.setBounds(10, 192, 59, 23);
		contentPane.add(Addition);
		
		JButton Substraction = new JButton("SUB");
		Substraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to substraction
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		Substraction.setBounds(83, 192, 59, 23);
		contentPane.add(Substraction);
		
		JButton multipication = new JButton("MUL");
		multipication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for multiplication
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res =var1*var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		multipication.setBounds(164, 192, 59, 23);
		contentPane.add(multipication);
		
		JButton Division = new JButton("DIV");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for division
				String data1=tfa.getText();
				String data2=tfb.getText();
				float var1=Integer.valueOf(data1);
				float var2=Integer.valueOf(data2);
				float res=var1/var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		Division.setBounds(233, 192, 59, 23);
		contentPane.add(Division);
		
		JButton Rimender = new JButton("REM");
		Rimender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for remender
				String data1=tfa.getText();
				String data2=tfb.getText();
				float var1=Integer.valueOf(data1);
				float var2=Integer.valueOf(data2);
				float res=var1%var2;
				String result=String.valueOf(res);
				tfr.setText(result);
				
			}
		});
		Rimender.setBounds(312, 192, 59, 23);
		contentPane.add(Rimender);
	}
}
