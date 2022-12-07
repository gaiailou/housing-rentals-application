package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class InfoLocation extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoLocation frame = new InfoLocation();
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
	public InfoLocation() {
		setBounds(100, 100, 450, 300);

	}

}
