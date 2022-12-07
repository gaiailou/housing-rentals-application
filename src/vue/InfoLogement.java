package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class InfoLogement extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoLogement frame = new InfoLogement();
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
	public InfoLogement() {
		setBounds(100, 100, 450, 300);

	}

}
