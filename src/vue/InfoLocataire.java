package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
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
	private String id1Locataire=null;
	private char civilite1Locataire;
	private String dateDeNaissance1Locataire=null;
	private String nom1Locataire=null;
	private String prenom1Locataire=null;
	private String document1Locataire=null;
	private String nbFixe1Locataire=null;
	private String nbPortable1Locataire=null;

	private GestionInfoLocataire gestionClic;
	
	public Locataire getLocataireSelected() {
		return locataireSelected;
	}

	public void setLocataireSelected(Locataire locataireSelected) {
		this.locataireSelected = locataireSelected;
	}

	public String getId1Locataire() {
		return id1Locataire;
	}

	public void setId1Locataire(String id1Locataire) {
		id1Locataire = id1Locataire;
	}

	public char getCivilite1Locataire() {
		return civilite1Locataire;
	}

	public void setCivilite1Locataire(char civilite1Locataire) {
		civilite1Locataire = civilite1Locataire;
	}

	public String getDateDeNaissance1Locataire() {
		return dateDeNaissance1Locataire;
	}

	public void setDateDeNaissance1Locataire(String dateDeNaissance1Locataire) {
		dateDeNaissance1Locataire = dateDeNaissance1Locataire;
	}

	public String getNom1Locataire() {
		return nom1Locataire;
	}

	public void setNom1Locataire(String nom1Locataire) {
		nom1Locataire = nom1Locataire;
	}

	public String getPrenom1Locataire() {
		return prenom1Locataire;
	}

	public void setPrenom1Locataire(String prenom1Locataire) {
		prenom1Locataire = prenom1Locataire;
	}

	public String getDocument1Locataire() {
		return document1Locataire;
	}

	public void setDocument1Locataire(String document1Locataire) {
		document1Locataire = document1Locataire;
	}

	public String getNbFixe1Locataire() {
		return nbFixe1Locataire;
	}

	public void setNbFixe1Locataire(String nbFixe1Locataire) {
		nbFixe1Locataire = nbFixe1Locataire;
	}

	public String getNbPortable1Locataire() {
		return nbPortable1Locataire;
	}

	public void setNbPortable1Locataire(String nbPortable1Locataire) {
		nbPortable1Locataire = nbPortable1Locataire;
	}

	public GestionInfoLocataire getGestionClic() {
		return gestionClic;
	}

	public void setGestionClic(GestionInfoLocataire gestionClic) {
		this.gestionClic = gestionClic;
	}

	public InfoLocataire(Locataire locataireSelected) {
		this.locataireSelected=locataireSelected;
		this.id1Locataire=this.locataireSelected.getIdLocataire();
		this.civilite1Locataire=this.locataireSelected.getGenreLocataire();
		this.dateDeNaissance1Locataire=this.locataireSelected.getDdnLocataire();
		this.nom1Locataire=this.locataireSelected.getNomLocataire();
		this.prenom1Locataire=this.locataireSelected.getPrenomLocataire();
		this.document1Locataire=this.locataireSelected.getPieceIdentiteLocataire();
		this.nbFixe1Locataire=this.locataireSelected.getTelephoneFixeLocataire();
		this.nbPortable1Locataire=this.locataireSelected.getTelephoneMobileLocataire();
		
		setBounds(50, 50, 577, 507);
		
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
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelType.add(panel4);
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		
		JPanel panel7 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel7.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel4.add(panel7);
		
		JLabel lblIdLocataire = new JLabel("Identifiant du locataire  ");
		panel7.add(lblIdLocataire);
		
		JLabel lblId1Locataire = new JLabel(this.id1Locataire);
		lblId1Locataire.setForeground(new Color(192, 192, 192));
		panel7.add(lblId1Locataire);
		
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
		FlowLayout flPanelCivilite = (FlowLayout) panelCivilite.getLayout();
		flPanelCivilite.setAlignment(FlowLayout.LEFT);
		panel5.add(panelCivilite);
		
		JLabel labelCivilite = new JLabel("Civilité");
		panelCivilite.add(labelCivilite);
		
		JLabel lblCivilite1Locataire = new JLabel(""+this.civilite1Locataire);
		lblCivilite1Locataire.setForeground(new Color(192, 192, 192));
		panelCivilite.add(lblCivilite1Locataire);
		
		JPanel panelDateNaissance = new JPanel();
		FlowLayout flPanelDateNaissance = (FlowLayout) panelDateNaissance.getLayout();
		flPanelDateNaissance.setAlignment(FlowLayout.LEFT);
		panel5.add(panelDateNaissance);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance    ");
		panelDateNaissance.add(lblDateDeNaissance);
		
		JLabel lblDateDeNaissance1Locataire = new JLabel(this.dateDeNaissance1Locataire);
		lblDateDeNaissance1Locataire.setForeground(new Color(192, 192, 192));
		panelDateNaissance.add(lblDateDeNaissance1Locataire);
		
		JPanel panelNom = new JPanel();
		FlowLayout fl_panelNom = (FlowLayout) panelNom.getLayout();
		fl_panelNom.setAlignment(FlowLayout.LEFT);
		panel5.add(panelNom);
		
		JLabel lblNom = new JLabel("Nom                      ");
		panelNom.add(lblNom);
		
		JLabel lblNom1Locataire = new JLabel(this.nom1Locataire);
		lblNom1Locataire.setForeground(new Color(192, 192, 192));
		panelNom.add(lblNom1Locataire);
		
		JPanel panelPrenom = new JPanel();
		FlowLayout flPanelPrenom = (FlowLayout) panelPrenom.getLayout();
		flPanelPrenom.setAlignment(FlowLayout.LEFT);
		panel5.add(panelPrenom);
		
		JLabel lblPrenom = new JLabel("Prénom                     ");
		panelPrenom.add(lblPrenom);
		
		JLabel lblPrenom1Locataire = new JLabel(this.prenom1Locataire);
		lblPrenom1Locataire.setForeground(new Color(192, 192, 192));
		panelPrenom.add(lblPrenom1Locataire);
		
		JPanel panelId = new JPanel();
		FlowLayout fl3 = (FlowLayout) panelId.getLayout();
		fl3.setAlignment(FlowLayout.LEADING);
		panel5.add(panelId);
		
		JPanel panelCarteId = new JPanel();
		FlowLayout fl4 = (FlowLayout) panelCarteId.getLayout();
		fl4.setAlignment(FlowLayout.LEFT);
		panel5.add(panelCarteId);
		
		JLabel lblDocument = new JLabel("Document d'identité ");
		panelCarteId.add(lblDocument);
		
		JLabel lblDocument1Locataire = new JLabel(this.document1Locataire);
		lblDocument1Locataire.setForeground(new Color(192, 192, 192));
		panelCarteId.add(lblDocument1Locataire);
		
		JPanel panelNbTel = new JPanel();
		panel.add(panelNbTel);
		panelNbTel.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelNbTel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNumeroPerso = new JLabel("Numéro de téléphone");
		lblNumeroPerso.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelNbTel.add(lblNumeroPerso, BorderLayout.NORTH);
		
		JPanel panelNumeroTel = new JPanel();
		panelNumeroTel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNbTel.add(panelNumeroTel);
		panelNumeroTel.setLayout(new BoxLayout(panelNumeroTel, BoxLayout.Y_AXIS));
		
		JPanel panelFixe = new JPanel();
		FlowLayout fl_panelFixe = (FlowLayout) panelFixe.getLayout();
		fl_panelFixe.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelFixe);
		
		JLabel lblNbFixe = new JLabel("Numéro fixe");
		panelFixe.add(lblNbFixe);
		
		JLabel lblNbFixe1Locataire = new JLabel(this.nbFixe1Locataire);
		lblNbFixe1Locataire.setForeground(new Color(192, 192, 192));
		panelFixe.add(lblNbFixe1Locataire);
		
		JPanel panelPortable = new JPanel();
		FlowLayout flPanelPortable = (FlowLayout) panelPortable.getLayout();
		flPanelPortable.setAlignment(FlowLayout.LEFT);
		panelNumeroTel.add(panelPortable);
		
		JLabel lblNbPortable = new JLabel("Numéro portable");
		panelPortable.add(lblNbPortable);
		
		JLabel lblNbPortable1Locataire = new JLabel(this.nbPortable1Locataire);
		lblNbPortable1Locataire.setForeground(new Color(192, 192, 192));
		panelPortable.add(lblNbPortable1Locataire);
		
		
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
