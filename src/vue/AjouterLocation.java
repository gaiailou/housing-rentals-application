package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.LineBorder;
import java.awt.Insets;
//import net.miginfocom.swing.MigLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.FormSpecs;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controleur.GestionAjouterLocataire;
import controleur.GestionAjouterLocation;
import modele.dao.requete.RequetesAjouterLocation;

import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

public class AjouterLocation extends JInternalFrame{
	private JTextField textDateDebut;
	private JTextField textDateFin;
	private JTextField textMontantLoyer;
	private JTextField textMontantCharges;
	private JTextField textMontantFonciere;
	private JTextField textAjustementLoyer;
	private JTextField textDernierVersement;
	private JTextField textEcheanceLoyer;
	private JTextField textNomGarant;
	private JTextField textPrenomGarant;
	private JTextField textTelGarant;
	
	private JComboBox comboPeriodicite;
	private JComboBox comboBoxTypeLocation;
	private JComboBox comboBoxLogement;
	private JComboBox comboBoxLocataire;
	private JComboBox comboBoxIdContrat;
	
	private JButton btnPhoto;
	
	private JButton btnActeDeCautionnement;
	private JButton btnBail;
	private JButton btnQuittance;
	private JButton btnSolde;
	private JButton btnRegularisation;
	
	private JButton btnAnnuler;
	private JButton btnValider;
	
	private JLabel labelLogement;
	private JLabel labelLocataire;
	private JLabel labelTypeLocation;
	
	private GestionAjouterLocation gestionClic;
	private JTextField textIndiceInitial;
	private JTextField textVersement;
	
	public JLabel getLabelLogement() {
		return labelLogement;
	}
	
	public void setLabelLogement(JLabel labelLogement) {
		this.labelLogement.setForeground(new Color(255, 0, 0));
		this.labelLogement = labelLogement;
	}
	
	public JLabel getLabelLocataire() {
		return labelLocataire;
	}
	
	public void setLabelLocataire(JLabel labelLocataire) {
		this.labelLocataire.setForeground(new Color(255, 0, 0));
		this.labelLocataire = labelLocataire;
	}
	
	public JLabel getLabelTypeLocation() {
		return this.labelTypeLocation;
	}
	
	public void setLabelTypeLocation(JLabel labelTypeLocation) {
		this.labelTypeLocation.setForeground(new Color(255, 0, 0));
		this.labelTypeLocation = labelTypeLocation;
	}
	
	public String getTextLogement() {
		return this.comboBoxLogement.getSelectedItem().toString();
	}
	
	public String getTextLocataire() {
		return this.comboBoxLocataire.getSelectedItem().toString();
	}
	
	public String getTextTypeLocation() {
		return this.comboBoxTypeLocation.getSelectedItem().toString();
	}
	
	public String getTextPeriodicite() {
		return this.comboPeriodicite.getSelectedItem().toString();
	}
	
	public String getTextIdContrat() {
		return this.comboBoxIdContrat.getSelectedItem().toString();
	}
	
	public String getTextDateDebut() {
		return this.textDateDebut.getText();
	}
	
	public String getTextDateFin() {
		return this.textDateFin.getText();
	}
	
	public String getTextMontantLoyer() {
		return this.textMontantLoyer.getText();
	}
	
	public String getTextMontantCharges() {
		return this.textMontantCharges.getText();
	}
	
	public String getTextMontantFonciere() {
		return this.textMontantFonciere.getText();
	}
	
	public String getTextIndiceInitial() {
		return this.textIndiceInitial.getText();
	}
	
	public String getEcheanceLoyer() {
		return this.textEcheanceLoyer.getText();
	}
	
	public String getVersementDernierLoyer() {
		return this.textDernierVersement.getText();
	}
	
	public String getTextVersement() {
		return this.textVersement.getText();
	}
	
	public String getAjustementLoyer() {
		return this.textAjustementLoyer.getText();
	}
	
	public String getNomGarant() {
		return this.textNomGarant.getText();
	}
	
	public String getPrenomGarant() {
		return this.textPrenomGarant.getText();
	}
	
	public String getTelGarant() {
		return this.textTelGarant.getText();
	}
	
	public String getActeDeCaution() {
		return this.btnActeDeCautionnement.getText();
	}
	
	public String getBail() {
		return this.btnBail.getText();
	}
	
	public String getQuittance() {
		return this.btnQuittance.getText();
	}
	
	public String getSolde() {
		return this.btnSolde.getText();
	}
	
	public String getRegularisation() {
		return this.btnRegularisation.getText();
	}
	
	public String getPhoto() {
		return this.btnPhoto.getText();
	}
	

	/**
	 * Create the frame.
	 */
	public AjouterLocation() {
		this.gestionClic = new GestionAjouterLocation(this);
		
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
		
		this.comboBoxLogement = new JComboBox();
		this.comboBoxLogement.setModel(RequetesAjouterLocation.comboLogement(this.comboBoxLogement));
		this.comboBoxLogement.setMaximumRowCount(20);
		this.comboBoxLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(this.comboBoxLogement);
		
		JButton btnAjoutLogement = new JButton("Ajouter un logement");
		btnAjoutLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(btnAjoutLogement);
		
		JPanel panelChoixLocataire = new JPanel();
		PanelAssociation.add(panelChoixLocataire);
		panelChoixLocataire.setLayout(new GridLayout(0, 1, 0, 2));
		
		this.labelLocataire = new JLabel("Locataire :");
		labelLocataire.setHorizontalAlignment(SwingConstants.CENTER);
		labelLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLocataire.add(labelLocataire);
		
		this.comboBoxLocataire = new JComboBox();
		this.comboBoxLocataire.setSelectedItem(null);
		this.comboBoxLocataire.setModel(RequetesAjouterLocation.comboLocataire(this.comboBoxLocataire));
		this.comboBoxLocataire.setMaximumRowCount(20);
		this.comboBoxLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLocataire.add(this.comboBoxLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLocataire.add(btnAjoutLocataire);
		
		JPanel panelIdContrat = new JPanel();
		PanelAssociation.add(panelIdContrat);
		panelIdContrat.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelIdContrat = new JLabel("Id du contrat");
		labelIdContrat.setHorizontalAlignment(SwingConstants.CENTER);
		labelIdContrat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIdContrat.add(labelIdContrat);
		
		this.comboBoxIdContrat = new JComboBox();
		this.comboBoxIdContrat.setModel(RequetesAjouterLocation.comboIdContrat(this.comboBoxIdContrat));
		this.comboBoxIdContrat.setMaximumRowCount(20);
		this.comboBoxIdContrat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIdContrat.add(this.comboBoxIdContrat);
		
		JButton btnIdContrat = new JButton("Ajouter un contrat");
		btnIdContrat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIdContrat.add(btnIdContrat);
		
		JPanel panelPhoto = new JPanel();
		panelPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGlobalTop.add(panelPhoto, BorderLayout.EAST);
		panelPhoto.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnPhoto = new JButton("PHOTOOOOOOOOOOOOOOOOOOOOO");
		panelPhoto.add(btnPhoto);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAnnuler.addActionListener(gestionClic);
		panelFooter.add(btnAnnuler);
		
		this.btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnValider.addActionListener(gestionClic);
		panelFooter.add(btnValider);
		
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
		
		this.comboBoxTypeLocation = new JComboBox();
		comboBoxTypeLocation.setModel(new DefaultComboBoxModel(new String[] {"Non meublé", "Local commercial"}));
		comboBoxTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(comboBoxTypeLocation);
		
		JPanel panelPeriodicite = new JPanel();
		panelPeriodicite.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelPeriodicite.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelPeriodicite);
		panelPeriodicite.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelPeriodicite = new JLabel("Periodicité");
		LabelPeriodicite.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(LabelPeriodicite);
		
		this.comboPeriodicite = new JComboBox();
		comboPeriodicite.setModel(new DefaultComboBoxModel(new String[] {"Mensuel", "Annuel"}));
		comboPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(comboPeriodicite);
		
		JPanel panelDateDébut = new JPanel();
		panelDateDébut.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateDébut.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDateDébut);
		panelDateDébut.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate = new JLabel("Date début");
		LabelDate.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateDébut.add(LabelDate);
		
		textDateDebut = new JTextField();
		textDateDebut.setHorizontalAlignment(SwingConstants.CENTER);
		textDateDebut.setForeground(Color.LIGHT_GRAY);
		textDateDebut.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDateDebut.setColumns(10);
		panelDateDébut.add(textDateDebut);
		
		JPanel panelDateFin = new JPanel();
		panelDateFin.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDateFin.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDateFin);
		panelDateFin.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelDate_1 = new JLabel("Date fin");
		LabelDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDate_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateFin.add(LabelDate_1);
		
		textDateFin = new JTextField();
		textDateFin.setHorizontalAlignment(SwingConstants.CENTER);
		textDateFin.setForeground(Color.LIGHT_GRAY);
		textDateFin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDateFin.setColumns(10);
		panelDateFin.add(textDateFin);
		
		JPanel panelMoyenLoyer = new JPanel();
		panelMoyenLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelMoyenLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelMoyenLoyer);
		panelMoyenLoyer.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMontantLoyer = new JLabel("Montant loyer");
		LabelMontantLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMontantLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMoyenLoyer.add(LabelMontantLoyer);
		
		textMontantLoyer = new JTextField();
		textMontantLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		textMontantLoyer.setForeground(Color.LIGHT_GRAY);
		textMontantLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMontantLoyer.setColumns(10);
		panelMoyenLoyer.add(textMontantLoyer);
		
		JPanel panelCharges = new JPanel();
		panelCharges.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelCharges.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelCharges);
		panelCharges.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnCharges_1 = new JLabel("Charges");
		LabelMtnCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelMtnCharges_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCharges.add(LabelMtnCharges_1);
		
		textMontantCharges = new JTextField();
		textMontantCharges.setHorizontalAlignment(SwingConstants.CENTER);
		textMontantCharges.setForeground(Color.LIGHT_GRAY);
		textMontantCharges.setFont(new Font("Dialog", Font.PLAIN, 16));
		textMontantCharges.setColumns(10);
		panelCharges.add(textMontantCharges);
		
		JPanel panelFonciere = new JPanel();
		panelFonciere.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelFonciere.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelFonciere);
		panelFonciere.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel LabelMtnFoncière = new JLabel("Foncière");
		LabelMtnFoncière.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMtnFoncière.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFonciere.add(LabelMtnFoncière);
		
		textMontantFonciere = new JTextField();
		textMontantFonciere.setHorizontalAlignment(SwingConstants.CENTER);
		textMontantFonciere.setForeground(Color.LIGHT_GRAY);
		textMontantFonciere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMontantFonciere.setColumns(10);
		panelFonciere.add(textMontantFonciere);
		
		JPanel panelIndiceInitial = new JPanel();
		panelIndiceInitial.setForeground(Color.WHITE);
		panelIndiceInitial.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelIndiceInitial);
		panelIndiceInitial.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel labelIndiceInitial = new JLabel("Indice Initial");
		labelIndiceInitial.setHorizontalAlignment(SwingConstants.CENTER);
		labelIndiceInitial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelIndiceInitial.add(labelIndiceInitial);
		
		textIndiceInitial = new JTextField();
		textIndiceInitial.setHorizontalAlignment(SwingConstants.CENTER);
		textIndiceInitial.setForeground(Color.LIGHT_GRAY);
		textIndiceInitial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIndiceInitial.setColumns(10);
		panelIndiceInitial.add(textIndiceInitial);
		
		JPanel panelEcheance = new JPanel();
		panelEcheance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelEcheance.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelEcheance);
		panelEcheance.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateEcheanceLoyer = new JLabel("Echéance loyer");
		LabelDateEcheanceLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateEcheanceLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelEcheance.add(LabelDateEcheanceLoyer);
		
		textEcheanceLoyer = new JTextField();
		textEcheanceLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		textEcheanceLoyer.setForeground(Color.LIGHT_GRAY);
		textEcheanceLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textEcheanceLoyer.setColumns(10);
		panelEcheance.add(textEcheanceLoyer);
		
		JPanel panelDernierLoyer = new JPanel();
		panelDernierLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelDernierLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelDernierLoyer);
		panelDernierLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDateDernierLoyer = new JLabel("Versement mois dernier loyer");
		LabelDateDernierLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDateDernierLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDernierLoyer.add(LabelDateDernierLoyer);
		
		textDernierVersement = new JTextField();
		textDernierVersement.setHorizontalAlignment(SwingConstants.CENTER);
		textDernierVersement.setForeground(Color.LIGHT_GRAY);
		textDernierVersement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDernierVersement.setColumns(10);
		panelDernierLoyer.add(textDernierVersement);
		
		JPanel panelVersement = new JPanel();
		panelVersement.setForeground(Color.WHITE);
		panelVersement.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelVersement);
		panelVersement.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel labelDateVersement = new JLabel("Date Versement loyer");
		labelDateVersement.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateVersement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelVersement.add(labelDateVersement);
		
		textVersement = new JTextField();
		textVersement.setHorizontalAlignment(SwingConstants.CENTER);
		textVersement.setForeground(Color.LIGHT_GRAY);
		textVersement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textVersement.setColumns(10);
		panelVersement.add(textVersement);
		
		JPanel panelAjustementLoyer = new JPanel();
		panelAjustementLoyer.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelAjustementLoyer.setForeground(Color.WHITE);
		panelInfoComplémentaires.add(panelAjustementLoyer);
		panelAjustementLoyer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelAjustementLoyer = new JLabel("Ajustement du loyer");
		LabelAjustementLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAjustementLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAjustementLoyer.add(LabelAjustementLoyer);
		
		textAjustementLoyer = new JTextField();
		textAjustementLoyer.setHorizontalAlignment(SwingConstants.CENTER);
		textAjustementLoyer.setForeground(Color.LIGHT_GRAY);
		textAjustementLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textAjustementLoyer.setColumns(10);
		panelAjustementLoyer.add(textAjustementLoyer);
		
		JPanel panelNomGarant = new JPanel();
		panelNomGarant.setForeground(Color.WHITE);
		panelNomGarant.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelNomGarant);
		panelNomGarant.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelNomGarant = new JLabel("Nom garant");
		LabelNomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNomGarant.add(LabelNomGarant);
		
		textNomGarant = new JTextField();
		textNomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		textNomGarant.setForeground(Color.LIGHT_GRAY);
		textNomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNomGarant.setColumns(10);
		panelNomGarant.add(textNomGarant);
		
		JPanel panelPrenomGarant = new JPanel();
		panelPrenomGarant.setForeground(Color.WHITE);
		panelPrenomGarant.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelPrenomGarant);
		panelPrenomGarant.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelPrenomGarant = new JLabel("Nom garant");
		LabelPrenomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPrenomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPrenomGarant.add(LabelPrenomGarant);
		
		textPrenomGarant = new JTextField();
		textPrenomGarant.setHorizontalAlignment(SwingConstants.CENTER);
		textPrenomGarant.setForeground(Color.LIGHT_GRAY);
		textPrenomGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPrenomGarant.setColumns(10);
		panelPrenomGarant.add(textPrenomGarant);
		
		JPanel panelTel = new JPanel();
		panelTel.setForeground(Color.WHITE);
		panelTel.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelTel);
		panelTel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelTelGarant = new JLabel("Téléphone garant");
		LabelTelGarant.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTelGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTel.add(LabelTelGarant);
		
		textTelGarant = new JTextField();
		textTelGarant.setHorizontalAlignment(SwingConstants.CENTER);
		textTelGarant.setForeground(Color.LIGHT_GRAY);
		textTelGarant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTelGarant.setColumns(10);
		panelTel.add(textTelGarant);
		
		JPanel panelActeDeCautionnement = new JPanel();
		panelActeDeCautionnement.setForeground(Color.WHITE);
		panelActeDeCautionnement.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelActeDeCautionnement);
		panelActeDeCautionnement.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnActeDeCautionnement = new JButton("Ajouter un acte de cautionnement");
		btnActeDeCautionnement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelActeDeCautionnement.add(btnActeDeCautionnement);
		
		JPanel panelBail = new JPanel();
		panelBail.setForeground(Color.WHITE);
		panelBail.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelBail);
		panelBail.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnBail = new JButton("Ajouter un bail");
		btnBail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBail.add(btnBail);
		
		JPanel panelQuittance = new JPanel();
		panelQuittance.setForeground(Color.WHITE);
		panelQuittance.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelQuittance);
		panelQuittance.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnQuittance = new JButton("Ajouter une quittance");
		btnQuittance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelQuittance.add(btnQuittance);
		
		JPanel panelSoldeToutCompte = new JPanel();
		panelSoldeToutCompte.setForeground(Color.WHITE);
		panelSoldeToutCompte.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelSoldeToutCompte);
		panelSoldeToutCompte.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnSolde = new JButton("Solde tout comptes");
		btnSolde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelSoldeToutCompte.add(btnSolde);
		
		JPanel panelRegularisation = new JPanel();
		panelRegularisation.setForeground(Color.WHITE);
		panelRegularisation.setBorder(new EmptyBorder(1, 1, 1, 1));
		panelInfoComplémentaires.add(panelRegularisation);
		panelRegularisation.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnRegularisation = new JButton("Impression Régularisation");
		btnRegularisation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelRegularisation.add(btnRegularisation);

	}
}
