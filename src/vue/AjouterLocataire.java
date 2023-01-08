package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.sql.DataSource;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import controleur.CictOracleDataSource;
import controleur.GestionAjouterLocataire;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

public class AjouterLocataire extends JInternalFrame {
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textId;
	private JComboBox comboCivilite;
	private JTextField textDateNaissance;
	private JTextField textNbFixe;
	private JTextField textNbPortable;
	private JTextField textField;
	private JButton btnAnnuler;
	private GestionAjouterLocataire gal;

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
		this.gal = new GestionAjouterLocataire();
		
		setBounds(100, 100, 577, 507);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		this.btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(gal);
		panelFooter.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(gal);
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
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelType.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_7.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Identifiant du locataire  ");
		panel_7.add(lblNewLabel_3);
		
		textId = new JTextField();
		panel_7.add(textId);
		textId.setColumns(10);
		
		JPanel panelInfoPerso = new JPanel();
		panel.add(panelInfoPerso);
		panelInfoPerso.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelInfoPerso.setLayout(new BorderLayout(0, 0));
		
		JLabel LabelInfoPerso = new JLabel("Informations Personnelles");
		LabelInfoPerso.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelInfoPerso.add(LabelInfoPerso, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfoPerso.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelCivilite = new JPanel();
		FlowLayout fl_panelCivilite = (FlowLayout) panelCivilite.getLayout();
		fl_panelCivilite.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelCivilite);
		
		JLabel labelCivilite = new JLabel("Civilit\u00E9                   ");
		panelCivilite.add(labelCivilite);
		
		JComboBox comboCivilite = new JComboBox();
		comboCivilite.setModel(new DefaultComboBoxModel(new String[] {"H", "F"}));
		panelCivilite.add(comboCivilite);
		
		JPanel panelDateNaissance = new JPanel();
		FlowLayout fl_panelDateNaissance = (FlowLayout) panelDateNaissance.getLayout();
		fl_panelDateNaissance.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelDateNaissance);
		
		JLabel labelDateDeNaissance = new JLabel("Date de naissance    ");
		panelDateNaissance.add(labelDateDeNaissance);
		
		textDateNaissance = new JTextField();
		textDateNaissance.setText("JJ/MM/AAAA");
		panelDateNaissance.add(textDateNaissance);
		textDateNaissance.setColumns(10);
		
		JPanel panelNom = new JPanel();
		FlowLayout fl_panelNom = (FlowLayout) panelNom.getLayout();
		fl_panelNom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelNom);
		
		JLabel labelNom = new JLabel("Nom                      ");
		panelNom.add(labelNom);
		
		textNom = new JTextField();
		panelNom.add(textNom);
		textNom.setColumns(10);
		
		JPanel panelPrenom = new JPanel();
		FlowLayout fl_panelPrenom = (FlowLayout) panelPrenom.getLayout();
		fl_panelPrenom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelPrenom);
		
		JLabel labelPrenom = new JLabel("Pr\u00E9nom                     ");
		panelPrenom.add(labelPrenom);
		
		textPrenom = new JTextField();
		panelPrenom.add(textPrenom);
		textPrenom.setColumns(10);
		
		JPanel panelId = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelId.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEADING);
		panel_5.add(panelId);
		
		JPanel panelCarteId = new JPanel();
		panelId.add(panelCarteId);
		FlowLayout flowLayout_4 = (FlowLayout) panelCarteId.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		
		JLabel labelDocument = new JLabel("Document d'identit\u00E9 ");
		panelCarteId.add(labelDocument);
		
		textField = new JTextField();
		panelCarteId.add(textField);
		textField.setColumns(10);
		
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
		FlowLayout fl_panelFixe = (FlowLayout) panelFixe.getLayout();
		fl_panelFixe.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelFixe);
		
		JLabel labelNbFixe = new JLabel("Num\u00E9ro fixe");
		panelFixe.add(labelNbFixe);
		
		textNbFixe = new JTextField();
		panelFixe.add(textNbFixe);
		textNbFixe.setColumns(10);
		
		JPanel panelPortable = new JPanel();
		FlowLayout fl_panelPortable = (FlowLayout) panelPortable.getLayout();
		fl_panelPortable.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelPortable);
		
		JLabel labelNbPortable = new JLabel("Num\u00E9ro portable");
		panelPortable.add(labelNbPortable);
		
		textNbPortable = new JTextField();
		panelPortable.add(textNbPortable);
		textNbPortable.setColumns(10);		
		
		
		JLayeredPane layeredGarants = new JLayeredPane();
		tabbedPane.addTab("Garants", null, layeredGarants, null);
		
		JLayeredPane layeredDocuments = new JLayeredPane();
		tabbedPane.addTab("Documents", null, layeredDocuments, null);
	}
	
}
