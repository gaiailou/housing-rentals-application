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
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controleur.GestionAjouterLocataire;

public class AjouterLocataire extends JInternalFrame {
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textId;
	
	private JTextField textDateNaissance;
	private JTextField textNbFixe;
	private JTextField textNbPortable;
	private JTextField textField;
	
	private JComboBox comboCivilite;
	
	private JButton btnAnnuler;
	private JButton btnValider;
	
	private GestionAjouterLocataire gestionClic;
	
	private JLabel lblIdLoc;
	
	public JLabel getLblIdLoc() {
		return lblIdLoc;
	}

	public void setLblIdLoc(JLabel lblIdLoc) {
		this.lblIdLoc = lblIdLoc;
	}


	public String getTextNom() {
		return this.textNom.getText();
	}

	public String getTextPrenom() {
		return this.textPrenom.getText();
	}

	public String getTextId() {
		return this.textId.getText();
	}

	public String getComboCivilite() {
		return this.comboCivilite.getSelectedItem().toString();
	}

	public String getTextDateNaissance() {
		return this.textDateNaissance.getText();
	}

	public String getTextNbFixe() {
		return this.textNbFixe.getText();
	}

	public String getTextNbPortable() {
		return this.textNbPortable.getText();
	}

	public String getTextField() {
		return this.textField.getText();
	}

	/**
	 * Create the frame.
	 */
	public AjouterLocataire() {
		this.gestionClic = new GestionAjouterLocataire(this);
		
		setBounds(50, 50, 577, 507);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		this.btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(gestionClic);
		panelFooter.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(gestionClic);
		panelFooter.add(btnValider);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JLayeredPane layeredGeneral = new JLayeredPane();
		tabbedPane.addTab("Informations g\u00E9n\u00E9rales", null, layeredGeneral, null);
		layeredGeneral.setLayout(new BoxLayout(layeredGeneral, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		layeredGeneral.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panelType = new JPanel();
		panel.add(panelType);
		panelType.setLayout(new BorderLayout(0, 0));
		
		JLabel labelId = new JLabel("Identifiant");
		labelId.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelType.add(labelId, BorderLayout.NORTH);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelType.add(panel4);
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		
		JPanel panel7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel7.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel4.add(panel7);
		
		this.lblIdLoc = new JLabel("Identifiant du locataire  ");
		panel7.add(this.lblIdLoc);
		
		this.textId = new JTextField();
		panel7.add(this.textId);
		this.textId.setColumns(10);
		
		JPanel panelInfoPerso = new JPanel();
		panel.add(panelInfoPerso);
		panelInfoPerso.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelInfoPerso.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInfoPerso = new JLabel("Informations Personnelles");
		lblInfoPerso.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelInfoPerso.add(lblInfoPerso, BorderLayout.NORTH);
		
		JPanel panel5 = new JPanel();
		panel5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfoPerso.add(panel5);
		panel5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelCivilite = new JPanel();
		FlowLayout fl_panelCivilite = (FlowLayout) panelCivilite.getLayout();
		fl_panelCivilite.setAlignment(FlowLayout.LEFT);
		panel5.add(panelCivilite);
		
		JLabel labelCivilite = new JLabel("Civilité");
		panelCivilite.add(labelCivilite);
		
		this.comboCivilite = new JComboBox();
		this.comboCivilite.setModel(new DefaultComboBoxModel(new String[] {"H", "F"}));
		panelCivilite.add(this.comboCivilite);
		
		JPanel panelDateNaissance = new JPanel();
		FlowLayout flPanelDateNaissance = (FlowLayout) panelDateNaissance.getLayout();
		flPanelDateNaissance.setAlignment(FlowLayout.LEFT);
		panel5.add(panelDateNaissance);
		
		JLabel labelDateDeNaissance = new JLabel("Date de naissance    ");
		panelDateNaissance.add(labelDateDeNaissance);
		
		this.textDateNaissance = new JTextField();
		this.textDateNaissance.setText("JJ/MM/AAAA");
		panelDateNaissance.add(this.textDateNaissance);
		this.textDateNaissance.setColumns(10);
		
		JPanel panelNom = new JPanel();
		FlowLayout flpanelNom = (FlowLayout) panelNom.getLayout();
		flpanelNom.setAlignment(FlowLayout.LEFT);
		panel5.add(panelNom);
		
		JLabel labelNom = new JLabel("Nom                      ");
		panelNom.add(labelNom);
		
		this.textNom = new JTextField();
		panelNom.add(this.textNom);
		this.textNom.setColumns(10);
		
		JPanel panelPrenom = new JPanel();
		FlowLayout flPanelPrenom = (FlowLayout) panelPrenom.getLayout();
		flPanelPrenom.setAlignment(FlowLayout.LEFT);
		panel5.add(panelPrenom);
		
		JLabel labelPrenom = new JLabel("Pr\u00E9nom                     ");
		panelPrenom.add(labelPrenom);
		
		this.textPrenom = new JTextField();
		panelPrenom.add(this.textPrenom);
		this.textPrenom.setColumns(10);
		
		JPanel panelId = new JPanel();
		FlowLayout fl3 = (FlowLayout) panelId.getLayout();
		fl3.setAlignment(FlowLayout.LEADING);
		panel5.add(panelId);
		
		JPanel panelCarteId = new JPanel();
		FlowLayout fl4 = (FlowLayout) panelCarteId.getLayout();
		fl4.setAlignment(FlowLayout.LEFT);
		panel5.add(panelCarteId);
		
		JLabel labelDocument = new JLabel("Document d'identit\u00E9 ");
		panelCarteId.add(labelDocument);
		
		this.textField = new JTextField();
		panelCarteId.add(this.textField);
		this.textField.setColumns(10);
		
		JPanel panelNbTel = new JPanel();
		panel.add(panelNbTel);
		panelNbTel.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelNbTel.setLayout(new BorderLayout(0, 0));
		
		JLabel labelNumeroPerso = new JLabel("Num\u00E9ro de t\u00E9l\u00E9phone");
		labelNumeroPerso.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelNbTel.add(labelNumeroPerso, BorderLayout.NORTH);
		
		JPanel panelNumeroTel = new JPanel();
		panelNumeroTel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNbTel.add(panelNumeroTel);
		panelNumeroTel.setLayout(new BoxLayout(panelNumeroTel, BoxLayout.Y_AXIS));
		
		JPanel panelFixe = new JPanel();
		FlowLayout flPanelFixe = (FlowLayout) panelFixe.getLayout();
		flPanelFixe.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelFixe);
		
		JLabel labelNbFixe = new JLabel("Num\u00E9ro fixe");
		panelFixe.add(labelNbFixe);
		
		this.textNbFixe = new JTextField();
		panelFixe.add(this.textNbFixe);
		this.textNbFixe.setColumns(10);
		
		JPanel panelPortable = new JPanel();
		FlowLayout fl_panelPortable = (FlowLayout) panelPortable.getLayout();
		fl_panelPortable.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelPortable);
		
		JLabel labelNbPortable = new JLabel("Num\u00E9ro portable");
		panelPortable.add(labelNbPortable);
		
		this.textNbPortable = new JTextField();
		panelPortable.add(this.textNbPortable);
		this.textNbPortable.setColumns(10);		
		
		
		JLayeredPane layeredGarants = new JLayeredPane();
		tabbedPane.addTab("Garants", null, layeredGarants, null);
		
		JLayeredPane layeredDocuments = new JLayeredPane();
		tabbedPane.addTab("Documents", null, layeredDocuments, null);
		
		
	}
	
}
