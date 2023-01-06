package controleur;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;
import javax.swing.JButton;

import vue.AjouterLocataire;

public class GestionAjouterLocataire implements ActionListener {
	private AjouterLocataire al;
	private JButton btn;

	
	public GestionAjouterLocataire(AjouterLocataire ajouterLocataire) {
		this.al = ajouterLocataire;
		
		
	}


	public void actionPerformed(ActionEvent e) {
		this.btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Annuler":
				this.al.dispose();
				break;
			case"Valider":
			DataSource bd;
			try {
				
				bd = new CictOracleDataSource ();
				Connection cn = bd.getConnection() ;
				String req = "insert into BSJ3657A.Locataire VALUES('GTGTGT', '" + this.getTextNom() + "', '"+ this.getTextPrenom() +"', 'M', '0988764551', '0972535892', 'mohamed.boughanem@iut-tlse3.fr', '17/09/1999', 'idP.jpg')";
				java.sql.Statement stEns = cn.createStatement () ;
				ResultSet rsEns = stEns.executeQuery (req) ;
				
				rsEns.close () ;
				stEns.close() ;
				cn.close() ;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				this.dispose();
				break;
		}
	}
}
