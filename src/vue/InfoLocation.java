package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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

import controleur.GestionAjouterLocation;
import modele.Location;
import modele.dao.requete.RequeteFonction;
import modele.dao.requete.RequetesAjouterLocation;
import rapport.Rapport;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class InfoLocation extends JInternalFrame implements ActionListener {
	

	private Location locationSelected; 
	
	private JButton btnPhoto;
	private JButton btnActeDeCautionnement;
	private JButton btnBail;
	private JButton btnQuittance;
	private JButton btnSolde;
	private JButton btnRegularisation;
	private JButton btnAnnuler;
	private JButton btnOK;
	private JLabel labelLogement;
	private JLabel labelLocataire;
	private JLabel labelTypeLocation;
	
	private String id1Logement;
	private String id1Locataire;
	private String contrat1Location;
	private String type1Location;
	private String periodicite1Location;
	private String dateDebut1Location;
	private String dateFin1Location;
	private Integer montantLoyer1Location;
	private Integer charges1Location;
	private String fonciere1Location;
	private String indiceInitial1Location;
	private String echeanceLoyer1Location;
	private String versement1Location;
	private String dateVersement1Location;
	private String ajustementLoyer1Location;
	private String nomGarant1Location;
	private String prenomGarant1Location;
	private Integer telGarant1Location;
	
	
	/**
	 * Create the frame.
	 */
	public InfoLocation(Location locationSelected) {
		
		this.locationSelected=locationSelected;
		this.id1Logement=this.locationSelected.getLogement();
		this.id1Locataire=this.locationSelected.getLocataire();
		this.contrat1Location=this.locationSelected.getContrat();
		this.type1Location=this.locationSelected.getTypeLocation();
		this.periodicite1Location=this.locationSelected.getPeriodicitePaiementLoyer();
		this.dateDebut1Location=this.locationSelected.getDateDebutLocation();
		this.dateFin1Location=this.locationSelected.getDateFinLocation();
		this.montantLoyer1Location=this.locationSelected.getMontantLoyerLocation();
		this.charges1Location=this.locationSelected.getMontantChargesLocation();
		this.fonciere1Location=this.locationSelected.getMontantTaxeFonciereLocation();
		this.indiceInitial1Location=this.locationSelected.getIndiceInitial();
		this.echeanceLoyer1Location=null;
		this.versement1Location=this.locationSelected.getDateVersementDernierLoyer();
		this.dateVersement1Location=this.locationSelected.getDateVersementLoyer();
		this.ajustementLoyer1Location=this.locationSelected.getAjustementLoyer();
		this.nomGarant1Location=null;
		this.prenomGarant1Location=null;
		try {
			this.telGarant1Location=RequeteFonction.soldeToutCompte(this.id1Locataire,this.id1Logement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResizable(true);
		setBounds(50, 50, 795, 563);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.NORTH);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JPanel panelGlobalTop = new JPanel();
		panelContent.add(panelGlobalTop);
		panelGlobalTop.setLayout(new BorderLayout(0, 0));
		
		JPanel PanelAssociation = new JPanel();
		panelGlobalTop.add(PanelAssociation, BorderLayout.CENTER);
		PanelAssociation.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelChoixLogement = new JPanel();
		PanelAssociation.add(panelChoixLogement);
		panelChoixLogement.setLayout(new GridLayout(0, 1, 0, 2));
		
		this.labelLogement = new JLabel("Logement :");
		labelLogement.setHorizontalAlignment(SwingConstants.CENTER);
		labelLogement.setForeground(new Color(0, 0, 0));
		labelLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(labelLogement);
		
		JLabel label1Logement = new JLabel(this.id1Logement);
		label1Logement.setForeground(Color.GRAY);
		label1Logement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label1Logement.setHorizontalAlignment(SwingConstants.CENTER);
		panelChoixLogement.add(label1Logement);
		
		JPanel panelChoixLocataire = new JPanel();
		PanelAssociation.add(panelChoixLocataire);
		panelChoixLocataire.setLayout(new GridLayout(0, 1, 0, 2));
		
		this.labelLocataire = new JLabel("Locataire :");
		labelLocataire.setHorizontalAlignment(SwingConstants.CENTER);
		labelLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLocataire.add(labelLocataire);
		
		JLabel label1Locataire = new JLabel(this.id1Locataire);
		label1Locataire.setHorizontalAlignment(SwingConstants.CENTER);
		label1Locataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label1Locataire.setForeground(Color.GRAY);
		panelChoixLocataire.add(label1Locataire);
		
		JPanel panelIdContrat = new JPanel();
		PanelAssociation.add(panelIdContrat);
		panelIdContrat.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelIdContrat = new JLabel("Id du contrat");
		labelIdContrat.setHorizontalAlignment(SwingConstants.CENTER);
		labelIdContrat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIdContrat.add(labelIdContrat);
		
		JLabel label1Contrat = new JLabel(this.contrat1Location);
		label1Contrat.setHorizontalAlignment(SwingConstants.CENTER);
		label1Contrat.setForeground(Color.GRAY);
		label1Contrat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIdContrat.add(label1Contrat);
		
		JPanel panelPhoto = new JPanel();
		panelPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGlobalTop.add(panelPhoto, BorderLayout.EAST);
		panelPhoto.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnPhoto = new JButton("PHOTO");
		panelPhoto.add(btnPhoto);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(this);
		btnFermer.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFermer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFooter.add(btnFermer);
		
		this.btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFooter.add(btnOK);
		
		JPanel panelInfoComplémentaires = new JPanel();
		panelInfoComplémentaires.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.setForeground(Color.WHITE);
		getContentPane().add(panelInfoComplémentaires, BorderLayout.CENTER);
		panelInfoComplémentaires.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panelTypeLocation = new JPanel();
		panelTypeLocation.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelTypeLocation.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelTypeLocation);
		panelTypeLocation.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.labelTypeLocation = new JLabel("Type de location");
		labelTypeLocation.setHorizontalAlignment(SwingConstants.CENTER);
		labelTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(labelTypeLocation);
		
		JLabel labelType1Location_1 = new JLabel(this.type1Location);
		labelType1Location_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelType1Location_1.setForeground(Color.GRAY);
		labelType1Location_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(labelType1Location_1);
		
		JPanel panelPeriodicite = new JPanel();
		panelPeriodicite.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelPeriodicite.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelPeriodicite);
		panelPeriodicite.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelPeriodicite = new JLabel("Periodicité");
		LabelPeriodicite.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(LabelPeriodicite);
		
		JLabel labelPeriodicite1Location = new JLabel(this.periodicite1Location);
		labelPeriodicite1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelPeriodicite1Location.setForeground(Color.GRAY);
		labelPeriodicite1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(labelPeriodicite1Location);
		
		JPanel panelDateDébut = new JPanel();
		panelDateDébut.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateDébut.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDateDébut);
		panelDateDébut.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate = new JLabel("Date début");
		LabelDate.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateDébut.add(LabelDate);
		
		JLabel labelDateDebut1Location = new JLabel(this.dateDebut1Location);
		labelDateDebut1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateDebut1Location.setForeground(Color.GRAY);
		labelDateDebut1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateDébut.add(labelDateDebut1Location);
		
		JPanel panelDateFin = new JPanel();
		panelDateFin.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateFin.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDateFin);
		panelDateFin.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate_1 = new JLabel("Date fin");
		LabelDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateFin.add(LabelDate_1);
		
		JLabel labelDateFin1Location = new JLabel(this.dateFin1Location);
		labelDateFin1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateFin1Location.setForeground(Color.GRAY);
		labelDateFin1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateFin.add(labelDateFin1Location);
		
		JPanel panelMoyenLoyer = new JPanel();
		panelMoyenLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelMoyenLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelMoyenLoyer);
		panelMoyenLoyer.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMontantLoyer = new JLabel("Montant loyer");
		LabelMontantLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMontantLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMoyenLoyer.add(LabelMontantLoyer);
		
		JLabel labelMontantLoyer1Location = new JLabel(""+this.montantLoyer1Location);
		labelMontantLoyer1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelMontantLoyer1Location.setForeground(Color.GRAY);
		labelMontantLoyer1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMoyenLoyer.add(labelMontantLoyer1Location);
		
		JPanel panelCharges = new JPanel();
		panelCharges.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelCharges.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelCharges);
		panelCharges.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnCharges_1 = new JLabel("Charges");
		LabelMtnCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelMtnCharges_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCharges.add(LabelMtnCharges_1);
		
		JLabel labelCharges1Location = new JLabel(""+this.charges1Location);
		labelCharges1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelCharges1Location.setForeground(Color.GRAY);
		labelCharges1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelCharges.add(labelCharges1Location);
		
		JPanel panelFonciere = new JPanel();
		panelFonciere.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelFonciere.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelFonciere);
		panelFonciere.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnFoncière = new JLabel("Foncière");
		LabelMtnFoncière.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMtnFoncière.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFonciere.add(LabelMtnFoncière);
		
		JLabel labelFonciere1Location = new JLabel(this.fonciere1Location);
		labelFonciere1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelFonciere1Location.setForeground(Color.GRAY);
		labelFonciere1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFonciere.add(labelFonciere1Location);
		
		JPanel panelIndiceInitial = new JPanel();
		panelIndiceInitial.setForeground(Color.WHITE);
		panelIndiceInitial.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelIndiceInitial);
		panelIndiceInitial.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel labelIndiceInitial = new JLabel("Indice Initial");
		labelIndiceInitial.setHorizontalAlignment(SwingConstants.CENTER);
		labelIndiceInitial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIndiceInitial.add(labelIndiceInitial);
		
		JLabel labelIndiceInitial1Location = new JLabel(this.indiceInitial1Location);
		labelIndiceInitial1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelIndiceInitial1Location.setForeground(Color.GRAY);
		labelIndiceInitial1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIndiceInitial.add(labelIndiceInitial1Location);
		
		JPanel panelEcheance = new JPanel();
		panelEcheance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelEcheance.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelEcheance);
		panelEcheance.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateEcheanceLoyer = new JLabel("Echéance loyer");
		LabelDateEcheanceLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateEcheanceLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEcheance.add(LabelDateEcheanceLoyer);
		
		JLabel labelEcheanceLoyer1Location = new JLabel(this.echeanceLoyer1Location);
		labelEcheanceLoyer1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelEcheanceLoyer1Location.setForeground(Color.GRAY);
		labelEcheanceLoyer1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEcheance.add(labelEcheanceLoyer1Location);
		
		JPanel panelDernierLoyer = new JPanel();
		panelDernierLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDernierLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDernierLoyer);
		panelDernierLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateDernierLoyer = new JLabel("Versement mois dernier loyer");
		LabelDateDernierLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateDernierLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDernierLoyer.add(LabelDateDernierLoyer);
		
		JLabel labelVersement1Location = new JLabel(this.versement1Location);
		labelVersement1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelVersement1Location.setForeground(Color.GRAY);
		labelVersement1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDernierLoyer.add(labelVersement1Location);
		
		JPanel panelVersement = new JPanel();
		panelVersement.setForeground(Color.WHITE);
		panelVersement.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelVersement);
		panelVersement.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel labelDateVersement = new JLabel("Date Versement loyer");
		labelDateVersement.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateVersement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelVersement.add(labelDateVersement);
		
		JLabel labelDateVersement1Location = new JLabel(this.dateVersement1Location);
		labelDateVersement1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateVersement1Location.setForeground(Color.GRAY);
		labelDateVersement1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelVersement.add(labelDateVersement1Location);
		
		JPanel panelAjustementLoyer = new JPanel();
		panelAjustementLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelAjustementLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelAjustementLoyer);
		panelAjustementLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelAjustementLoyer = new JLabel("Ajustement du loyer");
		LabelAjustementLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAjustementLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAjustementLoyer.add(LabelAjustementLoyer);
		
		JLabel labelAjustementLoyer1Location = new JLabel(this.ajustementLoyer1Location);
		labelAjustementLoyer1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelAjustementLoyer1Location.setForeground(Color.GRAY);
		labelAjustementLoyer1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAjustementLoyer.add(labelAjustementLoyer1Location);
		
		JPanel panelNomGarant = new JPanel();
		panelNomGarant.setForeground(Color.WHITE);
		panelNomGarant.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelNomGarant);
		panelNomGarant.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelNomGarant = new JLabel("Nom garant");
		LabelNomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNomGarant.add(LabelNomGarant);
		
		JLabel labelNomGarant1Location = new JLabel(this.nomGarant1Location);
		labelNomGarant1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelNomGarant1Location.setForeground(Color.GRAY);
		labelNomGarant1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNomGarant.add(labelNomGarant1Location);
		
		JPanel panelPrenomGarant = new JPanel();
		panelPrenomGarant.setForeground(Color.WHITE);
		panelPrenomGarant.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelPrenomGarant);
		panelPrenomGarant.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelPrenomGarant = new JLabel("Prénom garant");
		LabelPrenomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPrenomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPrenomGarant.add(LabelPrenomGarant);
		
		JLabel labelPrenomGarant1Location = new JLabel(this.prenomGarant1Location);
		labelPrenomGarant1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrenomGarant1Location.setForeground(Color.GRAY);
		labelPrenomGarant1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPrenomGarant.add(labelPrenomGarant1Location);
		
		JPanel panelTel = new JPanel();
		panelTel.setForeground(Color.WHITE);
		panelTel.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelTel);
		panelTel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelTelGarant = new JLabel("Résultat soldeToutCompte");
		LabelTelGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTelGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTel.add(LabelTelGarant);
		
		JLabel labelTelGarant1Location = new JLabel(""+this.telGarant1Location);
		labelTelGarant1Location.setHorizontalAlignment(SwingConstants.CENTER);
		labelTelGarant1Location.setForeground(Color.GRAY);
		labelTelGarant1Location.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTel.add(labelTelGarant1Location);
		
		JPanel panelActeDeCautionnement = new JPanel();
		panelActeDeCautionnement.setForeground(Color.WHITE);
		panelActeDeCautionnement.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelActeDeCautionnement);
		panelActeDeCautionnement.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnActeDeCautionnement = new JButton("Ajouter un acte de cautionnement");
		btnActeDeCautionnement.setForeground(Color.LIGHT_GRAY);
		btnActeDeCautionnement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelActeDeCautionnement.add(btnActeDeCautionnement);
		
		JPanel panelBail = new JPanel();
		panelBail.setForeground(Color.WHITE);
		panelBail.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelBail);
		panelBail.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnBail = new JButton("Ajouter un bail");
		btnBail.setForeground(Color.LIGHT_GRAY);
		btnBail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBail.add(btnBail);
		
		JPanel panelQuittance = new JPanel();
		panelQuittance.setForeground(Color.WHITE);
		panelQuittance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelQuittance);
		panelQuittance.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnQuittance = new JButton("Generer une quittance");
		btnQuittance.addActionListener(this);
		btnQuittance.setBackground(Color.GREEN);
		btnQuittance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelQuittance.add(btnQuittance);
		
		JPanel panelSoldeToutCompte = new JPanel();
		panelSoldeToutCompte.setForeground(Color.WHITE);
		panelSoldeToutCompte.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelSoldeToutCompte);
		panelSoldeToutCompte.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnSolde = new JButton("Solde tout comptes");
		btnSolde.setForeground(Color.LIGHT_GRAY);
		btnSolde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelSoldeToutCompte.add(btnSolde);
		
		JPanel panelRegularisation = new JPanel();
		panelRegularisation.setForeground(Color.WHITE);
		panelRegularisation.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelRegularisation);
		panelRegularisation.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnRegularisation = new JButton("Impression Régularisation");
		btnRegularisation.setForeground(Color.LIGHT_GRAY);
		btnRegularisation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelRegularisation.add(btnRegularisation);

	}
	
	public void actionPerformed(ActionEvent e) {
			JButton btn =(JButton)e.getSource();
			switch(btn.getText()) {
				case"Fermer":
					this.dispose();
					break;
				case"OK":
					this.dispose();
					break;
				case"Generer une quittance":
					try {
						new Rapport().creerUneQuittanceLoyer(locationSelected.getLocataire(),java.time.LocalDate.now().toString(), "Mr.Milan", "1 rue des professeur", locationSelected.getLocataire(), locationSelected.getLogement(), locationSelected.getLogement(), locationSelected.getMontantLoyerLocation(), locationSelected.getMontantChargesLocation());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
}
