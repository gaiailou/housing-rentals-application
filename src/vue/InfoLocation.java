package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import modele.Locataire;
import modele.Location;
import modele.Logement;

import java.awt.event.ActionListener;
import java.sql.SQLException;

public class InfoLocation extends JInternalFrame implements ActionListener {
	
		private Location locationSelected;
		
	//Les attributs a modifier pour connecter a la bd
	//...
		
	private JTextField txtNom;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField txtEx;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Create the frame.
	 */
	public InfoLocation(Location locationSelected) {
		this.locationSelected = locationSelected;
		setResizable(true);
		setBounds(100, 100, 822, 693);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.NORTH);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JLabel labelNom = new JLabel((String)locationSelected.getLocataire()+locationSelected.getLogement());
		//labelNom.setText(locataire.getNom());
		panelContent.add(labelNom);
		
		JPanel panelNom = new JPanel();
		panelContent.add(panelNom);
		
		JLabel LabelNomLocation = new JLabel("Nom de la location");
		LabelNomLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNom.add(LabelNomLocation);
		
		txtNom = new JTextField();
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		labelLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(labelLogement);
		
		JComboBox comboBoxLogement = new JComboBox();
		comboBoxLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLogement.setMaximumRowCount(20);
		comboBoxLogement.setModel(new DefaultComboBoxModel(new String[] {"Logement 1", "Logement 2"}));
		panelChoixLogement.add(comboBoxLogement);
		
		JButton btnAjoutLogement = new JButton("Ajouter un logement");
		btnAjoutLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(btnAjoutLogement);
		
		JPanel panelChoixLoctaire = new JPanel();
		PanelAssociation.add(panelChoixLoctaire);
		panelChoixLoctaire.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelLocataire = new JLabel("Locataire :");
		labelLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLoctaire.add(labelLocataire);
		
		JComboBox comboBoxLocataire = new JComboBox();
		comboBoxLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLocataire.setMaximumRowCount(20);
		comboBoxLocataire.setModel(new DefaultComboBoxModel(new String[] {"Patrick Jeanjean", "Mendy Paul"}));
		panelChoixLoctaire.add(comboBoxLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLoctaire.add(btnAjoutLocataire);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(this);
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFooter.add(btnRetour);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFooter.add(btnOK);
		
		JPanel panelInfoComplementaires = new JPanel();
		panelInfoComplementaires.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplementaires.setForeground(Color.WHITE);
		getContentPane().add(panelInfoComplementaires, BorderLayout.CENTER);
		panelInfoComplementaires.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelActeDeCautionnement = new JPanel();
		panelActeDeCautionnement.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelActeDeCautionnement.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelActeDeCautionnement);
		panelActeDeCautionnement.setLayout(new BorderLayout(0, 0));
		
		JButton btnActeCautionnement = new JButton("Ajouter acte de cautionnement");
		btnActeCautionnement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelActeDeCautionnement.add(btnActeCautionnement);
		
		JPanel panelBail = new JPanel();
		panelBail.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelBail.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelBail);
		panelBail.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnBail = new JButton("Ajouter un bail");
		btnBail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBail.add(btnBail);
		
		JPanel panelQuittance = new JPanel();
		panelQuittance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelQuittance.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelQuittance);
		panelQuittance.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnQuittance = new JButton("Ajouter une quittance");
		btnQuittance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelQuittance.add(btnQuittance);
		
		JPanel panelMoyenLoyer = new JPanel();
		panelMoyenLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelMoyenLoyer.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelMoyenLoyer);
		panelMoyenLoyer.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMontantLoyer = new JLabel("Montant loyer");
		LabelMontantLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMontantLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMoyenLoyer.add(LabelMontantLoyer);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("600 �");
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		panelMoyenLoyer.add(textField_2);
		
		JPanel panelTypeLocation = new JPanel();
		panelTypeLocation.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelTypeLocation.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelTypeLocation);
		panelTypeLocation.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel LabelTypeLocation = new JLabel("Type de location");
		LabelTypeLocation.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(LabelTypeLocation);
		
		JComboBox comboBoxTypeLocation = new JComboBox();
		comboBoxTypeLocation.setModel(new DefaultComboBoxModel(new String[] {"Non meuble", "Local commercial"}));
		comboBoxTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(comboBoxTypeLocation);
		
		JPanel panelPeriodicite = new JPanel();
		panelPeriodicite.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelPeriodicite.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelPeriodicite);
		panelPeriodicite.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelPeriodicite = new JLabel("Periodicite");
		LabelPeriodicite.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(LabelPeriodicite);
		
		JComboBox comboPeriodicite = new JComboBox();
		comboPeriodicite.setModel(new DefaultComboBoxModel(new String[] {"Mensuel", "Annuel"}));
		comboPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(comboPeriodicite);
		
		JPanel panelCharges = new JPanel();
		panelCharges.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelCharges.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelCharges);
		panelCharges.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnCharges_1 = new JLabel("Charges");
		LabelMtnCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelMtnCharges_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCharges.add(LabelMtnCharges_1);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("100 �");
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_4.setColumns(10);
		panelCharges.add(textField_4);
		
		JPanel panelDateDebut = new JPanel();
		panelDateDebut.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateDebut.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelDateDebut);
		panelDateDebut.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate = new JLabel("Date debut");
		LabelDate.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateDebut.add(LabelDate);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("18/01/2022");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		panelDateDebut.add(textField);
		
		JPanel panelEcheance = new JPanel();
		panelEcheance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelEcheance.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelEcheance);
		panelEcheance.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateEcheanceLoyer = new JLabel("Echeance loyer");
		LabelDateEcheanceLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateEcheanceLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEcheance.add(LabelDateEcheanceLoyer);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("10/02/2023");
		textField_6.setForeground(Color.LIGHT_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		panelEcheance.add(textField_6);
		
		JPanel panelFonciere = new JPanel();
		panelFonciere.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelFonciere.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelFonciere);
		panelFonciere.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnFonciere = new JLabel("Fonciere");
		LabelMtnFonciere.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMtnFonciere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFonciere.add(LabelMtnFonciere);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("600 �");
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		panelFonciere.add(textField_3);
		
		JPanel panelDateFin = new JPanel();
		panelDateFin.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateFin.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelDateFin);
		panelDateFin.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate_1 = new JLabel("Date fin");
		LabelDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateFin.add(LabelDate_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("15/12/2022");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		panelDateFin.add(textField_1);
		
		JPanel panelDernierLoyer = new JPanel();
		panelDernierLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDernierLoyer.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelDernierLoyer);
		panelDernierLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateDernierLoyer = new JLabel("Versement dernier loyer");
		LabelDateDernierLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateDernierLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDernierLoyer.add(LabelDateDernierLoyer);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setText("04/01/2023");
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		panelDernierLoyer.add(textField_5);
		
		JLabel lblFill = new JLabel("");
		panelInfoComplementaires.add(lblFill);
		
		JPanel panelAjustementLoyer = new JPanel();
		panelAjustementLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelAjustementLoyer.setForeground(Color.WHITE);
		panelInfoComplementaires.add(panelAjustementLoyer);
		panelAjustementLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelAjustementLoyer = new JLabel("Ajustement du loyer");
		LabelAjustementLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAjustementLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAjustementLoyer.add(LabelAjustementLoyer);
		
		txtEx = new JTextField();
		txtEx.setHorizontalAlignment(SwingConstants.CENTER);
		txtEx.setText("Ex : 18 � ou -18�");
		txtEx.setForeground(Color.LIGHT_GRAY);
		txtEx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEx.setColumns(10);
		panelAjustementLoyer.add(txtEx);
		
		JPanel panelPhoto = new JPanel();
		panelPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(panelPhoto, BorderLayout.EAST);
		panelPhoto.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelPhoto = new JLabel("PHOTOOOOOOOOOOOOOOOOOOOOOO.png");
		LabelPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPhoto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelPhoto.add(LabelPhoto);

	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Retour":
				this.dispose();
				break;
			case"Supprimer":
				this.locationSelected.deleteLocation();
				this.dispose();
				break;
			/*case"Ajouter un logement":
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
				break;*/
		}
	}
}
