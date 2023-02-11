package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MyNotePadController;
import model.MyNotePadModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyNotePadView extends JFrame {

	private JPanel contentPane;
	public MyNotePadModel model;
	public JLabel lblNewLabel;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotePadView frame = new MyNotePadView();
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
	public MyNotePadView() {
		model = new MyNotePadModel(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("File:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 11, 354, 39);
		panel.add(lblNewLabel);
		
		//MyNotePadController control = new MyNotePadController(this);
		ActionListener control = new MyNotePadController(this);
		
		JButton button_open = new JButton("Open");
		button_open.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_open.addActionListener(control);
		button_open.setBounds(403, 11, 89, 23);
		panel.add(button_open);
		
		JButton button_save = new JButton("Save");
		button_save.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_save.addActionListener(control);
		button_save.setBounds(567, 11, 89, 23);
		panel.add(button_save);
		this.setVisible(true);
		
		
	}
}
