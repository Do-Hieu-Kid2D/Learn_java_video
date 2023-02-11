package bai21_keotha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;

public class Vidu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vidu frame = new Vidu();
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
	public Vidu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 405);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrNguQua = new JTextArea();
		txtrNguQua.setText("ngu qua");
		txtrNguQua.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrNguQua.setBounds(266, 141, 151, 97);
		contentPane.add(txtrNguQua);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("chon1");
		rdbtnNewRadioButton.setBounds(123, 39, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("chon 2");
		rdbtnNewRadioButton_1.setBounds(123, 82, 111, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		setVisible(true);
	}
}
