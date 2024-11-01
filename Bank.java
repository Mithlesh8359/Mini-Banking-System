import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Bank extends JWindow {

	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

	public Bank() {

		JLabel lbImage    = new JLabel (new ImageIcon ("Bank.jpg"));
		Color cl = new Color (45, 8, 179);
		lbImage.setBorder (new LineBorder (cl, 1));

		getContentPane().add (lbImage, BorderLayout.CENTER);
		pack();

		setSize (getSize().width, getSize().height);
		setLocation (d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);

		show();



		new BankSystem ();

		toFront();
		dispose ();
		setVisible (false);

	}

	public static void main (String[] args) {
		
		new Bank();

	}

}
