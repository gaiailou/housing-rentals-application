package controleur;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Collection;

import javax.swing.JButton;

import vue.AjouterLocataire;

public class GestionAjouterLocataire implements ActionListener {
	private AjouterLocataire al;
	private JButton btn;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.btn = (JButton) e.getSource();
		switch(btn.getName()) {
		case "":
		}
	}
}
