import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reversestring extends JFrame {

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
					Reversestring frame = new Reversestring();
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
	public Reversestring() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lable = new JLabel("REVERSE STRING");
		lable.setFont(new Font("Tahoma", Font.BOLD, 14));
		lable.setBounds(160, 11, 126, 17);
		contentPane.add(lable);
		
		JLabel lable1 = new JLabel("Enter a String");
		lable1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lable1.setForeground(new Color(255, 255, 0));
		lable1.setBounds(38, 46, 88, 19);
		contentPane.add(lable1);
		
		JLabel lable2 = new JLabel("Reversed String");
		lable2.setForeground(new Color(255, 255, 0));
		lable2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lable2.setBounds(38, 192, 102, 19);
		contentPane.add(lable2);
		
		tfa = new JTextField();
		tfa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfa.setBounds(143, 45, 179, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfb.setColumns(10);
		tfb.setBounds(150, 193, 179, 20);
		contentPane.add(tfb);
		
		JButton Button = new JButton("REVERSE STRING");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sentence=tfa.getText();
				char arr1[]=sentence.toCharArray();
				char arr2[]=new char[arr1.length];
				int j=arr2.length-1;
				for(int i=0;i<=arr1.length-1;i++)
				{
					arr2[j]=arr1[i];
					j--;
				}
				sentence=new String(arr2);
				tfb.setText(sentence);
			}
		});
		Button.setBounds(129, 110, 193, 23);
		contentPane.add(Button);
	}
}
