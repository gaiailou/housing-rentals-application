package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parametre extends JInternalFrame implements ActionListener {

	/**
	 * Create the frame.
	 */
	public Parametre() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel LabelParametres = new JLabel(" Param\u00E8tres");
		LabelParametres.setFont(new Font("Tahoma", Font.BOLD, 16));
		LabelParametres.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(LabelParametres, BorderLayout.NORTH);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox CheckBoxOui = new JCheckBox("Oui");
		CheckBoxOui.setSelected(true);
		panelContent.add(CheckBoxOui);
		
		JCheckBox CheckBoxOptionCafe = new JCheckBox("Option caf\u00E9");
		CheckBoxOptionCafe.setSelected(true);
		panelContent.add(CheckBoxOptionCafe);
		
		JCheckBox CheckBoxNon = new JCheckBox("Non");
		panelContent.add(CheckBoxNon);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this);
		panelFooter.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
		panelFooter.add(btnValider);

	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Annuler":
				this.dispose();
				break;
			case"Valider":
				this.dispose();
				break;
		}
	}
}
