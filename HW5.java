import javax.swing.*;  
import java.awt.*;

public class HW5 extends JFrame {

	HW5() {

		Container cp = getContentPane(); 
		cp.setLayout(null);
		
		
		cp.add(jpFirst);
		cp.add(jpSecond);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		setVisible(true);
	}

	public static void main(String args[]) {
		new HW5();
	}
}