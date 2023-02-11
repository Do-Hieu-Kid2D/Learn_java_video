package test;

import javax.swing.UIManager;
	
import view.lastButtonView;

public class TestMain {
	public static void main(String[] args) {
		new lastButtonView();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
