package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Draw_example  extends JFrame{
	public Draw_example() {
		// TODO Auto-generated constructor stub
		this.setTitle("Ve thu");
		this.setSize(500,550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Draw draw = new Draw();
		this.setLayout(new BorderLayout());
		this.add(draw,BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Draw_example();
	}
	
}
