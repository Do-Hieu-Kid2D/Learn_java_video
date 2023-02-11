package test;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HoiCham extends JFrame{
	public HoiCham() {
        setLayout(new GridLayout(1, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
 
        // create JLabel have text color red and background color green
        JLabel lb;
        lb = createJLabel("JLabel 1", Color.red, Color.green);
        add(lb);
        // create JLabel have text color blue and background color yellow
        lb = createJLabel("JLabel 2", Color.blue, Color.yellow);
        add(lb);
         
        // display JFrame
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    private JLabel createJLabel(String text, Color textColor, Color backgroundColor) {
        JLabel lb = new JLabel(text);
        // set align
        lb.setHorizontalAlignment(JLabel.CENTER);
        // set color
        lb.setForeground(textColor);
        // set background color
        lb.setOpaque(true);
        lb.setBackground(backgroundColor);
 
        return lb;
    }
 
    public static void main(String[] args) {
        new HoiCham();
    }
	
}
