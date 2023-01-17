package vue;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import modele.Logement;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextPane;

public class InfoLogement extends JInternalFrame implements ActionListener {
	
	private Logement logementSelected;
	
	//Les attributs a modifier pour connecter a la bd
	private String Id1Logement=null;
	private String Nom1Logement=null;
	private String Caution1Logement=null;
	private String Desc1Logement=null;
	private String Type1Logement=null;
	private String NbPiece1Logement=null;
	private String Surface1Logement=null;
	private String NbChambre1Logement=null;
	private String Adresse1Logement=null;
	private String Cpt1Logement=null;
	private String Ville1Logement=null;
	private String Prix1Logement=null;
	private String CP1Logement=null;
	private String Frai1Logement=null;
	private Boolean boxCopro=false;
	private Boolean boxGarage=false;

	/**
	 * Create the frame.
	 */
	public InfoLogement(Logement logementSelected) {
		setBounds(100, 100, 450, 348);
		this.logementSelected = logementSelected;
		this.Id1Logement=this.logementSelected.getIdLogement();
		this.Nom1Logement=null;
		this.Caution1Logement=this.logementSelected.getMontantCaution();
		this.Desc1Logement=this.logementSelected.getDescriptionLogement();
		this.Type1Logement=this.logementSelected.getTypeLogement();
		this.NbPiece1Logement=this.logementSelected.getNbPiece();
		this.Surface1Logement=this.logementSelected.getSuperficieLogement();
		this.NbChambre1Logement=this.logementSelected.getNbChambre();
		this.Adresse1Logement=null;
		this.Cpt1Logement=this.logementSelected.getComplementAdresseLogement();
		this.Ville1Logement=null;
		this.Prix1Logement=this.logementSelected.getPrixAcquisitionLogement();
		this.CP1Logement=null;
		this.Frai1Logement=this.logementSelected.getFraisAcquisitionLogement();
		this.boxCopro=false;
		this.boxGarage=false;
		
		JPanel panelHeader = new JPanel();
		getContentPane().add(panelHeader, BorderLayout.NORTH);
		
		JLabel labelNom = new JLabel();
		labelNom.setText("Logement "+this.logementSelected.getIdLogement());
		panelHeader.add(labelNom);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelContent.add(panel1);
		panel1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_Nom = new JPanel();
		panel1.add(panel_Nom);
		panel_Nom.setLayout(new BoxLayout(panel_Nom, BoxLayout.Y_AXIS));
		
		JPanel panelID = new JPanel();
		panel_Nom.add(panelID);
		
		JLabel LabelId = new JLabel("Identifiant :");
		panelID.add(LabelId);
		
		JLabel LabelId1Logement = new JLabel(this.Id1Logement);
		LabelId1Logement.setForeground(new Color(192, 192, 192));
		panelID.add(LabelId1Logement);
		
		JPanel panelNom = new JPanel();
		panel_Nom.add(panelNom);
		
		JLabel LabelNom = new JLabel("Nom du logement :");
		panelNom.add(LabelNom);
		
		JLabel LabelNom1Logement = new JLabel(this.Nom1Logement);
		LabelNom1Logement.setForeground(new Color(192, 192, 192));
		panelNom.add(LabelNom1Logement);
		
		JPanel panelCaution = new JPanel();
		panel_Nom.add(panelCaution);
		
		JLabel LabelCaution = new JLabel("Montant caution :");
		panelCaution.add(LabelCaution);
		
		JLabel LabelCaution1Logement = new JLabel(this.Caution1Logement);
		LabelCaution1Logement.setForeground(new Color(192, 192, 192));
		panelCaution.add(LabelCaution1Logement);
		
		
		JPanel panel_Description = new JPanel();
		panel1.add(panel_Description);
		panel_Description.setLayout(new BorderLayout(0, 0));
		
		JLabel LabelDesc = new JLabel("Description :");
		LabelDesc.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_Description.add(LabelDesc, BorderLayout.NORTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_Description.add(scrollPane_1);
		
		JTextPane txtDesc1Logement = new JTextPane();
		txtDesc1Logement.setForeground(new Color(192, 192, 192));
		txtDesc1Logement.setText(this.Desc1Logement);
		scrollPane_1.setViewportView(txtDesc1Logement);
		
		JPanel panel2 = new JPanel();
		panelContent.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_type = new JPanel();
		panel_type.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel2.add(panel_type);
		panel_type.setLayout(new BoxLayout(panel_type, BoxLayout.X_AXIS));
		
		JLabel LabelType = new JLabel("Type                      ");
		panel_type.add(LabelType);
		
		JLabel LabelType1Logement = new JLabel(this.Type1Logement);
		LabelType1Logement.setForeground(new Color(192, 192, 192));
		panel_type.add(LabelType1Logement);
		
		JPanel panel_nb_piece = new JPanel();
		FlowLayout fl_panel_nb_piece = (FlowLayout) panel_nb_piece.getLayout();
		fl_panel_nb_piece.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_nb_piece);
		
		JLabel LabelNbPiece = new JLabel("Nombre de pi\u00E8ce");
		panel_nb_piece.add(LabelNbPiece);
		
		JLabel LabelNbPiece1Logement = new JLabel(this.NbPiece1Logement);
		LabelNbPiece1Logement.setForeground(new Color(192, 192, 192));
		panel_nb_piece.add(LabelNbPiece1Logement);
		
		JPanel panel_surface = new JPanel();
		FlowLayout fl_panel_surface = (FlowLayout) panel_surface.getLayout();
		fl_panel_surface.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_surface);
		
		JLabel LabelSurface = new JLabel("Surface                     ");
		panel_surface.add(LabelSurface);
		
		JLabel LabelSurface1Logement = new JLabel(this.Surface1Logement);
		LabelSurface1Logement.setForeground(new Color(192, 192, 192));
		panel_surface.add(LabelSurface1Logement);
		
		JLabel LabelUnite = new JLabel("m\u00B2");
		panel_surface.add(LabelUnite);
		
		JPanel panel_nb_chambre = new JPanel();
		FlowLayout fl_panel_nb_chambre = (FlowLayout) panel_nb_chambre.getLayout();
		fl_panel_nb_chambre.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_nb_chambre);
		
		JLabel labelNbChambre = new JLabel("Nombre de chambre");
		panel_nb_chambre.add(labelNbChambre);
		
		JLabel LabelNbChambre1Logement = new JLabel(this.NbChambre1Logement);
		LabelNbChambre1Logement.setForeground(new Color(192, 192, 192));
		panel_nb_chambre.add(LabelNbChambre1Logement);
		
		JPanel panel_adresse = new JPanel();
		FlowLayout fl_panel_adresse = (FlowLayout) panel_adresse.getLayout();
		fl_panel_adresse.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_adresse);
		
		JLabel LabelAdresse = new JLabel("Adresse                     ");
		panel_adresse.add(LabelAdresse);
		
		JLabel LabelAdresse1Logement = new JLabel(this.Adresse1Logement);
		LabelAdresse1Logement.setForeground(new Color(192, 192, 192));
		panel_adresse.add(LabelAdresse1Logement);
		
		JPanel panel_copro = new JPanel();
		FlowLayout fl_panel_copro = (FlowLayout) panel_copro.getLayout();
		fl_panel_copro.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_copro);
		
		JCheckBox CheckboxCopro = new JCheckBox("Co-propri\u00E9t\u00E9");
		CheckboxCopro.setSelected(this.boxCopro);
		panel_copro.add(CheckboxCopro);
		
		JPanel panel_cpt_adresse = new JPanel();
		FlowLayout fl_panel_cpt_adresse = (FlowLayout) panel_cpt_adresse.getLayout();
		fl_panel_cpt_adresse.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_cpt_adresse);
		
		JLabel LabelCptAdresse = new JLabel("Compl\u00E9ment adresse ");
		panel_cpt_adresse.add(LabelCptAdresse);
		
		JLabel LabelCpt1Logement = new JLabel(this.Cpt1Logement);
		LabelCpt1Logement.setForeground(new Color(192, 192, 192));
		panel_cpt_adresse.add(LabelCpt1Logement);
		
		JPanel panel_garage = new JPanel();
		FlowLayout fl_panel_garage = (FlowLayout) panel_garage.getLayout();
		fl_panel_garage.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_garage);
		
		JCheckBox CheckboxGarage = new JCheckBox("Garage");
		CheckboxGarage.setSelected(this.boxGarage);
		panel_garage.add(CheckboxGarage);
		
		JPanel panel_ville = new JPanel();
		FlowLayout fl_panel_ville = (FlowLayout) panel_ville.getLayout();
		fl_panel_ville.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_ville);
		
		JLabel LabelVille = new JLabel("Ville                            ");
		panel_ville.add(LabelVille);
		
		JLabel LabelVille1Logement = new JLabel(this.Ville1Logement);
		LabelVille1Logement.setForeground(new Color(192, 192, 192));
		panel_ville.add(LabelVille1Logement);
		
		JPanel panel_prix_acqui = new JPanel();
		FlowLayout fl_panel_prix_acqui = (FlowLayout) panel_prix_acqui.getLayout();
		fl_panel_prix_acqui.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_prix_acqui);
		
		JLabel labelPrixAcquisition = new JLabel("Prix d'acquisition");
		panel_prix_acqui.add(labelPrixAcquisition);
		
		JLabel LabelPrix1Logement = new JLabel(this.Prix1Logement);
		LabelPrix1Logement.setForeground(new Color(192, 192, 192));
		panel_prix_acqui.add(LabelPrix1Logement);
		
		JPanel panel_codepostal = new JPanel();
		FlowLayout fl_panel_codepostal = (FlowLayout) panel_codepostal.getLayout();
		fl_panel_codepostal.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_codepostal);
		
		JLabel LabelCP = new JLabel("Code postal               ");
		panel_codepostal.add(LabelCP);
		
		JLabel LabelCP1Logement = new JLabel(this.CP1Logement);
		LabelCP1Logement.setForeground(new Color(192, 192, 192));
		panel_codepostal.add(LabelCP1Logement);
		
		JPanel panel_frai_acqui = new JPanel();
		FlowLayout fl_panel_frai_acqui = (FlowLayout) panel_frai_acqui.getLayout();
		fl_panel_frai_acqui.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_frai_acqui);
		
		JLabel labelFraiAcquisition = new JLabel("Frais d'acquisition");
		labelFraiAcquisition.setHorizontalAlignment(SwingConstants.LEFT);
		panel_frai_acqui.add(labelFraiAcquisition);
		
		JLabel LabelFrai1Logement = new JLabel(this.Frai1Logement);
		LabelFrai1Logement.setForeground(new Color(192, 192, 192));
		panel_frai_acqui.add(LabelFrai1Logement);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnAnnuler = new JButton("Fermer");
		btnAnnuler.addActionListener(this);
		panelFooter.add(btnAnnuler);
		
		JButton btnSuppr = new JButton("Supprimer");
		btnSuppr.addActionListener(this);
		panelFooter.add(btnSuppr);

	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Fermer":
				this.dispose();
				break;
			case"Supprimer":
				this.logementSelected.deleteLogement();
				this.dispose();
				break;
		}
	}
}