import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bubblesort extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bubblesort frame = new Bubblesort();
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
	public Bubblesort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SORTING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(169, 24, 76, 20);
		contentPane.add(lblNewLabel);
		
		JLabel LABLE = new JLabel("Enter a number for sorting");
		LABLE.setForeground(new Color(64, 0, 64));
		LABLE.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		LABLE.setBounds(47, 67, 198, 14);
		contentPane.add(LABLE);
		
		JLabel lblNumberAfterSorting = new JLabel("Number after sorting");
		lblNumberAfterSorting.setForeground(new Color(64, 0, 64));
		lblNumberAfterSorting.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberAfterSorting.setBounds(47, 126, 198, 14);
		contentPane.add(lblNumberAfterSorting);
		
		tfa = new JTextField();
		tfa.setBounds(228, 65, 151, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(228, 124, 151, 20);
		contentPane.add(tfb);
		
		JButton btnNewButton = new JButton("BUBBLE SORT");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(156, 194, 151, 23);
		contentPane.add(btnNewButton);
	}
}
