package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controleur.GestionInfoLocataire;
import modele.Locataire;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class InfoLocataire extends JInternalFrame implements ActionListener{

	private Locataire locataireSelected;
	
	//Les attributs a modifier pour connecter a la bd
	private String Id1Locataire=null;
	private char Civilite1Locataire;
	private String DateDeNaissance1Locataire=null;
	private String Nom1Locataire=null;
	private String Prenom1Locataire=null;
	private String Document1Locataire=null;
	private String NbFixe1Locataire=null;
	private String NbPortable1Locataire=null;

	private GestionInfoLocataire gestionClic;
	
	public Locataire getLocataireSelected() {
		return locataireSelected;
	}

	public void setLocataireSelected(Locataire locataireSelected) {
		this.locataireSelected = locataireSelected;
	}

	public String getId1Locataire() {
		return Id1Locataire;
	}

	public void setId1Locataire(String id1Locataire) {
		Id1Locataire = id1Locataire;
	}

	public char getCivilite1Locataire() {
		return Civilite1Locataire;
	}

	public void setCivilite1Locataire(char civilite1Locataire) {
		Civilite1Locataire = civilite1Locataire;
	}

	public String getDateDeNaissance1Locataire() {
		return DateDeNaissance1Locataire;
	}

	public void setDateDeNaissance1Locataire(String dateDeNaissance1Locataire) {
		DateDeNaissance1Locataire = dateDeNaissance1Locataire;
	}

	public String getNom1Locataire() {
		return Nom1Locataire;
	}

	public void setNom1Locataire(String nom1Locataire) {
		Nom1Locataire = nom1Locataire;
	}

	public String getPrenom1Locataire() {
		return Prenom1Locataire;
	}

	public void setPrenom1Locataire(String prenom1Locataire) {
		Prenom1Locataire = prenom1Locataire;
	}

	public String getDocument1Locataire() {
		return Document1Locataire;
	}

	public void setDocument1Locataire(String document1Locataire) {
		Document1Locataire = document1Locataire;
	}

	public String getNbFixe1Locataire() {
		return NbFixe1Locataire;
	}

	public void setNbFixe1Locataire(String nbFixe1Locataire) {
		NbFixe1Locataire = nbFixe1Locataire;
	}

	public String getNbPortable1Locataire() {
		return NbPortable1Locataire;
	}

	public void setNbPortable1Locataire(String nbPortable1Locataire) {
		NbPortable1Locataire = nbPortable1Locataire;
	}

	public GestionInfoLocataire getGestionClic() {
		return gestionClic;
	}

	public void setGestionClic(GestionInfoLocataire gestionClic) {
		this.gestionClic = gestionClic;
	}

	public InfoLocataire(Locataire locataireSelected) {
		this.locataireSelected=locataireSelected;
		this.Id1Locataire=this.locataireSelected.getIdLocataire();
		this.Civilite1Locataire=this.locataireSelected.getGenreLocataire();
		this.DateDeNaissance1Locataire=this.locataireSelected.getDdnLocataire();
		this.Nom1Locataire=this.locataireSelected.getNomLocataire();
		this.Prenom1Locataire=this.locataireSelected.getPrenomLocataire();
		this.Document1Locataire=this.locataireSelected.getPieceIdentiteLocataire();
		this.NbFixe1Locataire=this.locataireSelected.getTelephoneFixeLocataire();
		this.NbPortable1Locataire=this.locataireSelected.getTelephoneMobileLocataire();
		
		setBounds(100, 100, 577, 507);
		
		JPanel panelHeader = new JPanel();
		getContentPane().add(panelHeader, BorderLayout.NORTH);
		
		JLabel labelNomLocataire = new JLabel();
		labelNomLocataire.setText("Locataire "+this.locataireSelected.getIdLocataire());
		panelHeader.add(labelNomLocataire);

		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(this);
		panelFooter.add(btnFermer);
		
		JButton btnSuppr = new JButton("Supprimer");
		btnSuppr.addActionListener(this);
		panelFooter.add(btnSuppr);
		
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
		
		JLabel LabelId1Locataire = new JLabel(this.Id1Locataire);
		LabelId1Locataire.setForeground(new Color(192, 192, 192));
		panel_7.add(LabelId1Locataire);
		
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
		
		JLabel labelCivilite = new JLabel("Civilité");
		panelCivilite.add(labelCivilite);
		
		JLabel LabelCivilite1Locataire = new JLabel(""+this.Civilite1Locataire);
		LabelCivilite1Locataire.setForeground(new Color(192, 192, 192));
		panelCivilite.add(LabelCivilite1Locataire);
		
		JPanel panelDateNaissance = new JPanel();
		FlowLayout fl_panelDateNaissance = (FlowLayout) panelDateNaissance.getLayout();
		fl_panelDateNaissance.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelDateNaissance);
		
		JLabel labelDateDeNaissance = new JLabel("Date de naissance    ");
		panelDateNaissance.add(labelDateDeNaissance);
		
		JLabel LabelDateDeNaissance1Locataire = new JLabel(this.DateDeNaissance1Locataire);
		LabelDateDeNaissance1Locataire.setForeground(new Color(192, 192, 192));
		panelDateNaissance.add(LabelDateDeNaissance1Locataire);
		
		JPanel panelNom = new JPanel();
		FlowLayout fl_panelNom = (FlowLayout) panelNom.getLayout();
		fl_panelNom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelNom);
		
		JLabel labelNom = new JLabel("Nom                      ");
		panelNom.add(labelNom);
		
		JLabel LabelNom1Locataire = new JLabel(this.Nom1Locataire);
		LabelNom1Locataire.setForeground(new Color(192, 192, 192));
		panelNom.add(LabelNom1Locataire);
		
		JPanel panelPrenom = new JPanel();
		FlowLayout fl_panelPrenom = (FlowLayout) panelPrenom.getLayout();
		fl_panelPrenom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelPrenom);
		
		JLabel labelPrenom = new JLabel("Prénom                     ");
		panelPrenom.add(labelPrenom);
		
		JLabel LabelPrenom1Locataire = new JLabel(this.Prenom1Locataire);
		LabelPrenom1Locataire.setForeground(new Color(192, 192, 192));
		panelPrenom.add(LabelPrenom1Locataire);
		
		JPanel panelId = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelId.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEADING);
		panel_5.add(panelId);
		
		JPanel panelCarteId = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panelCarteId.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelCarteId);
		
		JLabel labelDocument = new JLabel("Document d'identité ");
		panelCarteId.add(labelDocument);
		
		JLabel LabelDocument1Locataire = new JLabel(this.Document1Locataire);
		LabelDocument1Locataire.setForeground(new Color(192, 192, 192));
		panelCarteId.add(LabelDocument1Locataire);
		
		JPanel panelNbTel = new JPanel();
		panel.add(panelNbTel);
		panelNbTel.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelNbTel.setLayout(new BorderLayout(0, 0));
		
		JLabel labelNumeroPerso = new JLabel("Numéro de téléphone");
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
		
		JLabel labelNbFixe = new JLabel("Numéro fixe");
		panelFixe.add(labelNbFixe);
		
		JLabel LabelNbFixe1Locataire = new JLabel(this.NbFixe1Locataire);
		LabelNbFixe1Locataire.setForeground(new Color(192, 192, 192));
		panelFixe.add(LabelNbFixe1Locataire);
		
		JPanel panelPortable = new JPanel();
		FlowLayout fl_panelPortable = (FlowLayout) panelPortable.getLayout();
		fl_panelPortable.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelPortable);
		
		JLabel labelNbPortable = new JLabel("Numéro portable");
		panelPortable.add(labelNbPortable);
		
		JLabel LabelNbPortable1Locataire = new JLabel(this.NbPortable1Locataire);
		LabelNbPortable1Locataire.setForeground(new Color(192, 192, 192));
		panelPortable.add(LabelNbPortable1Locataire);
		
		
		JLayeredPane layeredGarants = new JLayeredPane();
		tabbedPane.addTab("Garants", null, layeredGarants, null);
		
		JLayeredPane layeredDocuments = new JLayeredPane();
		tabbedPane.addTab("Documents", null, layeredDocuments, null);

	}
	public void actionPerformed(ActionEvent e) {
		JButton item =(JButton)e.getSource();
		switch(item.getText()) {
			case"Fermer":
				this.dispose();
				break;
			case"Supprimer":
				try {
					System.out.println("wesh");
					int res = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer un locataire ?");
				    if(res == JOptionPane.YES_OPTION){
				      this.getLocataireSelected().deleteLocataire();
				      JOptionPane jpn = new JOptionPane();
				      jpn.showMessageDialog(jpn, "Votre locataire a bien été supprimé.\n Appuyez sur le bouton 'Refresh' pour voir les changements", "Message de confirmation", JOptionPane.PLAIN_MESSAGE);
					}
				} catch (SQLException e1) {
					//JOptionPane jpn = new JOptionPane();
				    //jpn.showMessageDialog(jpn, "Votre locataire n'a pas bien été supprimé", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				this.dispose();
				break;
		}
	}
}
