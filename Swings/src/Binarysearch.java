import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Binarysearch extends JFrame {

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
					Binarysearch frame = new Binarysearch();
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
	public Binarysearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setFont(new Font("Tahoma", Font.BOLD, 15));
		heading.setBounds(161, 11, 126, 19);
		contentPane.add(heading);
		
		JLabel lable1 = new JLabel("Enter 5 numbers");
		lable1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lable1.setBounds(52, 53, 107, 16);
		contentPane.add(lable1);
		
		JLabel label2 = new JLabel("Enter key to search");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label2.setBounds(52, 105, 110, 16);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Result");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label3.setBounds(78, 164, 60, 16);
		contentPane.add(label3);
		
		tfa = new JTextField();
		tfa.setBounds(189, 52, 144, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(189, 104, 144, 20);
		contentPane.add(tfb);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(189, 163, 144, 20);
		contentPane.add(res);
		
		JButton btnBinarySearch = new JButton("Binary Search");
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=tfa.getText();
				String arr[]=sentence.split(" ");
				String key=tfb.getText();
				int low=0;
				int high=arr.length-1;
				String result=res.getText();
				int mid=0;
				while(low<=high)
				{
					mid=(low+high)/2;
					if(Integer.valueOf(key)==Integer.valueOf(arr[mid]))
					{
						result="key found at "+mid;
						res.setText(result);
						return;
					}
					else if (Integer.valueOf(key)>Integer.valueOf(arr[mid]))
					{
						low=mid+1;
						high=high;
					}
					else
					{
						high=mid-1;
						low=low;
					}
					
					}
				JOptionPane.showMessageDialog(contentPane, "keyNotFound");
			}
		});
		btnBinarySearch.setBackground(new Color(0, 255, 0));
		btnBinarySearch.setForeground(new Color(255, 0, 0));
		btnBinarySearch.setBounds(142, 213, 145, 23);
		contentPane.add(btnBinarySearch);
	}

}
