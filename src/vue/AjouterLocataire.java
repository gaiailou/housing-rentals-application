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

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

public class AjouterLocataire extends JInternalFrame implements ActionListener {
	private JTextField textNom;
	private JTextField textPrenom;
	private JComboBox comboBoxType;
	private JTextField textDateNaissance;
	private JTextField textNbFixe;
	private JTextField textNbPortable;
	private JTextField textIdLocataire;
	private JTextField textProfession;
	private JTextField textRevenu;
	private JTextField textField;
	
	
	public String getTextNom() {
		return this.textNom.getText();
	}

	public String getTextPrenom() {
		return this.textPrenom.getText();
	}

	public JComboBox getComboBoxType() {
		return comboBoxType;
	}

	public JTextField getTextDateNaissance() {
		return textDateNaissance;
	}

	public JTextField getTextProfession() {
		return textNbFixe;
	}

	public JTextField getTextRevenu() {
		return textNbPortable;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterLocataire frame = new AjouterLocataire();
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
	public AjouterLocataire() {
		setBounds(100, 100, 577, 507);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this);
		panelFooter.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
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
		
		JLabel labelType = new JLabel("Type");
		labelType.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelType.add(labelType, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelType.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_7.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Type de locataire  ");
		panel_7.add(lblNewLabel_3);
		
		comboBoxType = new JComboBox();
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Particulier", "Profesionnel"}));
		panel_7.add(comboBoxType);
		
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
		
		JLabel labelIdLocataire = new JLabel("Id Locataire          ");
		panelId.add(labelIdLocataire);
		
		textIdLocataire = new JTextField();
		panelId.add(textIdLocataire);
		textIdLocataire.setColumns(10);
		
		JPanel panelCarteId = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panelCarteId.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelCarteId);
		
		JLabel labelDocument = new JLabel("Document d'identit\u00E9 ");
		panelCarteId.add(labelDocument);
		
		textField = new JTextField();
		panelCarteId.add(textField);
		textField.setColumns(10);
		
		JPanel panelNbTel = new JPanel();
		panel.add(panelNbTel);
		panelNbTel.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelNbTel.setLayout(new BorderLayout(0, 0));
		
		JLabel labelNuméroPerso = new JLabel("Num\u00E9ro de t\u00E9l\u00E9phone");
		labelNuméroPerso.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelNbTel.add(labelNuméroPerso, BorderLayout.NORTH);
		
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
		
		JLayeredPane layeredComplement = new JLayeredPane();
		tabbedPane.addTab("Informations compl\u00E9mentaires", null, layeredComplement, null);
		layeredComplement.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		layeredComplement.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		scrollPane_1.setViewportView(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JPanel panelSitPro = new JPanel();
		panel_8.add(panelSitPro);
		panelSitPro.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelSitPro.setLayout(new BorderLayout(0, 0));
		
		JLabel labelSitPro = new JLabel("Situation Profesionnelle");
		labelSitPro.setVerticalAlignment(SwingConstants.TOP);
		labelSitPro.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSitPro.add(labelSitPro, BorderLayout.NORTH);
		
		JPanel panelSitProf = new JPanel();
		panelSitProf.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSitPro.add(panelSitProf);
		panelSitProf.setLayout(new BoxLayout(panelSitProf, BoxLayout.Y_AXIS));
		
		JPanel panelProfession = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelProfession.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelSitProf.add(panelProfession);
		
		JLabel labelProfession = new JLabel("Profession            ");
		panelProfession.add(labelProfession);
		
		textProfession = new JTextField();
		textProfession.setColumns(10);
		panelProfession.add(textProfession);
		
		JPanel panelRevenu = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelRevenu.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panelSitProf.add(panelRevenu);
		
		JLabel labelRevenu = new JLabel("Revenu mensuel  ");
		panelRevenu.add(labelRevenu);
		
		textRevenu = new JTextField();
		textRevenu.setColumns(10);
		panelRevenu.add(textRevenu);
		
		JLabel labelDevise = new JLabel("\u20AC");
		panelRevenu.add(labelDevise);
		
		JLayeredPane layeredGarants = new JLayeredPane();
		tabbedPane.addTab("Garants", null, layeredGarants, null);
		
		JLayeredPane layeredDocuments = new JLayeredPane();
		tabbedPane.addTab("Documents", null, layeredDocuments, null);
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Annuler":
				this.dispose();
				break;
			case"Valider":
			DataSource bd;
			try {
				String txtNom =  this.getTextNom();
				String txtPrenom = this.getTextPrenom();
				String txtDDN = this.textDateNaissance.getText().toString();
				bd = new CictOracleDataSource ("PLM4280A", "$iutinfo");
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
