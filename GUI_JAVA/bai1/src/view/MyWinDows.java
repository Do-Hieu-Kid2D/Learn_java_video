package view;

import java.awt.Window;

import javax.swing.JFrame;

public class MyWinDows extends JFrame{
	
	public MyWinDows() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showmy() {
		this.setVisible(true);
	}
	
	public void showmy(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showmy(String title , int rong, int cao) {
		this.setTitle(title);
		this.setLocation(rong, cao);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyWinDows mw = new MyWinDows();
		mw.showmy();
		MyWinDows m2 = new MyWinDows();
		m2.showmy("Hieu");
		MyWinDows m3 = new MyWinDows();
		m3.showmy("Hieu thu 2 ",50,50);
				
	}
	
}
