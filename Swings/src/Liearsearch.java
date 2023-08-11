import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Liearsearch extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Liearsearch frame = new Liearsearch();
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
	public Liearsearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("LINEAR SEARCH");
		Heading.setForeground(new Color(255, 255, 0));
		Heading.setFont(new Font("DialogInput", Font.BOLD, 15));
		Heading.setBounds(166, 11, 117, 21);
		contentPane.add(Heading);
		
		JLabel LABLE1 = new JLabel("Enter 5 numbers");
		LABLE1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LABLE1.setBounds(53, 47, 103, 17);
		contentPane.add(LABLE1);
		
		JLabel LABLE2 = new JLabel("enter key to search");
		LABLE2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LABLE2.setBounds(37, 96, 146, 17);
		contentPane.add(LABLE2);
		
		JLabel LABLE3 = new JLabel("Result");
		LABLE3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LABLE3.setBounds(90, 149, 66, 17);
		contentPane.add(LABLE3);
		
		JButton btnLinearSearch = new JButton("Linear search");
		btnLinearSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for linear search
				String sentence=tfa.getText();
				String arr[]=sentence.split(" ");
				System.out.println("enter key to search");
				String key=tfb.getText();
				String result="";
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr.length-1;j++)
					{
						if(Integer.valueOf(key)==Integer.valueOf(arr[i]))
						{
							result="key found at"+i;
							res.setText(result);
							return;
						}
					}
				}
				JOptionPane.showMessageDialog(contentPane, "KeyNotFound");
			}
		});
		btnLinearSearch.setBounds(166, 206, 117, 23);
		contentPane.add(btnLinearSearch);
		
		tfa = new JTextField();
		tfa.setBounds(176, 44, 141, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(176, 96, 141, 20);
		contentPane.add(tfb);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(176, 149, 141, 20);
		contentPane.add(res);
	}

}
