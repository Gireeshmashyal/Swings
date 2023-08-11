import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reversesentence extends JFrame {

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
					Reversesentence frame = new Reversesentence();
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
	public Reversesentence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE SENTENCE");
		heading.setFont(new Font("Tahoma", Font.BOLD, 14));
		heading.setBounds(148, 11, 147, 17);
		contentPane.add(heading);
		
		JLabel lable = new JLabel("Enter a sentence");
		lable.setForeground(new Color(255, 0, 0));
		lable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lable.setBounds(60, 54, 128, 14);
		contentPane.add(lable);
		
		JLabel label = new JLabel("Reversed sentence");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(60, 212, 128, 14);
		contentPane.add(label);
		
		JButton btnReverseSentence = new JButton("Reverse sentence");
		btnReverseSentence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sentence=tfa.getText();
				String arr[]=sentence.split(" ");
				String revsentence="";
				for(int i=0;i<=arr.length-1;i++)
				{
					String word=arr[i];
					String revword="";
					for(int j=word.length()-1;j>=0;j--)
					{
						revword=revword+word.charAt(j);
					}
					revsentence=revsentence+revword+" ";
				}
				String str1=new String(revsentence);
				tfb.setText(str1);
			}
		});
		btnReverseSentence.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReverseSentence.setBounds(133, 121, 173, 23);
		contentPane.add(btnReverseSentence);
		
		tfa = new JTextField();
		tfa.setBounds(178, 53, 158, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(188, 211, 158, 20);
		contentPane.add(tfb);
	}
}
