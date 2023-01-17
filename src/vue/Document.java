package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Document extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Document frame = new Document();
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
	public Document() {
		setBounds(50, 50, 450, 300);

	}

}
