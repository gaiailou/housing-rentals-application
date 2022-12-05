package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class AjouterLocation extends JInternalFrame implements ActionListener {
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterLocation frame = new AjouterLocation();
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
	public AjouterLocation() {
		setBounds(100, 100, 450, 300);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.NORTH);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JPanel panelNom = new JPanel();
		panelContent.add(panelNom);
		
		JLabel LabelNomLocation = new JLabel("Nom de la location");
		panelNom.add(LabelNomLocation);
		
		txtNom = new JTextField();
		txtNom.setForeground(Color.LIGHT_GRAY);
		txtNom.setText("nom");
		panelNom.add(txtNom);
		txtNom.setColumns(10);
		
		JPanel PanelAssociation = new JPanel();
		panelContent.add(PanelAssociation);
		PanelAssociation.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelChoixLogement = new JPanel();
		PanelAssociation.add(panelChoixLogement);
		panelChoixLogement.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelLogement = new JLabel("Logement :");
		panelChoixLogement.add(labelLogement);
		
		JComboBox comboBoxLogement = new JComboBox();
		comboBoxLogement.setMaximumRowCount(20);
		comboBoxLogement.setModel(new DefaultComboBoxModel(new String[] {"Logement 1", "Logement 2"}));
		panelChoixLogement.add(comboBoxLogement);
		
		JButton btnAjoutLogement = new JButton("Ajouter un logement");
		btnAjoutLogement.addActionListener(this);
		panelChoixLogement.add(btnAjoutLogement);
		
		JPanel panelChoixLoctaire = new JPanel();
		PanelAssociation.add(panelChoixLoctaire);
		panelChoixLoctaire.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelLocataire = new JLabel("Locataire :");
		panelChoixLoctaire.add(labelLocataire);
		
		JComboBox comboBoxLocataire = new JComboBox();
		comboBoxLocataire.setMaximumRowCount(20);
		comboBoxLocataire.setModel(new DefaultComboBoxModel(new String[] {"Patrick Jeanjean", "Mendy Paul"}));
		panelChoixLoctaire.add(comboBoxLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.addActionListener(this);
		panelChoixLoctaire.add(btnAjoutLocataire);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Annuler");
		btnNewButton.addActionListener(this);
		panelFooter.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Valider");
		btnNewButton_1.addActionListener(this);
		panelFooter.add(btnNewButton_1);

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
			case"Ajouter un logement":
				Accueil fp1 = (Accueil) this.getTopLevelAncestor();
				AjouterLogement logement=new AjouterLogement();
				fp1.getLayeredPane().add(logement);
				logement.setVisible(true);
				logement.moveToFront();
				break;
			case"Ajouter un locataire":
				Accueil fp2 = (Accueil) this.getTopLevelAncestor();
				AjouterLocataire locataire=new AjouterLocataire();
				fp2.getLayeredPane().add(locataire);
				locataire.setVisible(true);
				locataire.moveToFront();
				break;
		}
	}
}
