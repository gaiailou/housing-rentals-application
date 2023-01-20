package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionInfoLocataire;
import modele.Locataire;
import modele.Location;
import modele.Logement;
import modele.dao.requete.RequeteSelect;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.MouseEvent;

public class Accueil extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField txtPasDeDonnes;
	private JTextField textRevenu;
	private JTable tableImpaye;
	private JTextField textPerte;
	
	private JLayeredPane layeredAccueil;
	private JLayeredPane layeredLogements;
	private JLayeredPane layeredLocataires;
	private JLayeredPane layeredLocations;
	private JLayeredPane layeredDocuments;
	private JLayeredPane layeredblabla;
	private JTextField txtSearchDoc;
	private JList jListLogements;
	private JList jListLocataires;
	private JList jListLocations;
	private JList jListDocs;
	private ArrayList<Location> listeDeLocations;
	private ArrayList<Locataire> listeDeLocataires;
	private ArrayList<Logement> listeDeLogements;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Accueil() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelMenu = new JPanel();
		contentPane.add(panelMenu, BorderLayout.WEST);
		panelMenu.setLayout(new BorderLayout(0, 0));
		
		JPanel panelHeader = new JPanel();
		panelMenu.add(panelHeader, BorderLayout.NORTH);
		
		txtSearch = new JTextField();
		txtSearch.setForeground(Color.LIGHT_GRAY);
		txtSearch.setText("Search");
		panelHeader.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(this);
		panelHeader.add(btnHome);
		
		JPanel panelContent = new JPanel();
		panelContent.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelMenu.add(panelContent);
		panelContent.setLayout(new GridLayout(6, 0, 0, 0));
		
		JButton btnLogements = new JButton("Logements");
		btnLogements.addActionListener(this);
		btnLogements.setToolTipText("Voir les differents logements");
		panelContent.add(btnLogements);
		
		JButton btnLocataires = new JButton("Locataires");
		btnLocataires.addActionListener(this);
		panelContent.add(btnLocataires);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.addActionListener(this);
		panelContent.add(btnLocations);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(this);
		panelContent.add(btnRefresh);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.addActionListener(this);
		panelContent.add(btnNewButton_5);
		
		JButton btnDocuments = new JButton("Documents");
		btnDocuments.addActionListener(this);
		panelContent.add(btnDocuments);
		
		JPanel panelFooter = new JPanel();
		panelMenu.add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnCalculer = new JButton("Calc");
		btnCalculer.addActionListener(this);
		panelFooter.add(btnCalculer);
		
		JButton btnProposerCafe = new JButton("Cafe");
		btnProposerCafe.addActionListener(this);
		panelFooter.add(btnProposerCafe);
		
		JButton btnParametres = new JButton("Param");
		btnParametres.addActionListener(this);
		panelFooter.add(btnParametres);
		
		this.layeredAccueil = new JLayeredPane();
		contentPane.add(this.layeredAccueil, BorderLayout.CENTER);
		this.layeredAccueil.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel11 = new JPanel();
		panel11.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.layeredAccueil.add(panel11);
		panel11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Joli graphique");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel11.add(lblNewLabel_2, BorderLayout.NORTH);
		
		txtPasDeDonnes = new JTextField();
		txtPasDeDonnes.setHorizontalAlignment(SwingConstants.CENTER);
		txtPasDeDonnes.setText("Pas de donn\u00E9es");
		panel11.add(txtPasDeDonnes, BorderLayout.CENTER);
		txtPasDeDonnes.setColumns(10);
		
		JPanel panel12 = new JPanel();
		panel12.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.layeredAccueil.add(panel12);
		panel12.setLayout(new BorderLayout(0, 0));
		
		JLabel labelRevenu = new JLabel("Revenu g\u00E9n\u00E9r\u00E9");
		labelRevenu.setHorizontalAlignment(SwingConstants.CENTER);
		panel12.add(labelRevenu, BorderLayout.NORTH);
		
		textRevenu = new JTextField();
		textRevenu.setHorizontalAlignment(SwingConstants.CENTER);
		textRevenu.setText("0 \u20AC");
		panel12.add(textRevenu, BorderLayout.CENTER);
		textRevenu.setColumns(10);
		
		JPanel panel21 = new JPanel();
		panel21.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.layeredAccueil.add(panel21);
		panel21.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLoyerImpaye = new JLabel("Loyer impay\u00E9");
		lblLoyerImpaye.setHorizontalAlignment(SwingConstants.CENTER);
		panel21.add(lblLoyerImpaye, BorderLayout.NORTH);
		
		JScrollPane scrollPane1 = new JScrollPane();
		panel21.add(scrollPane1, BorderLayout.CENTER);
		
		tableImpaye = new JTable();
		tableImpaye.setModel(new DefaultTableModel(
			new Object[][] {
				{"700\u20AC", "Patrick Jeanjean"},
				{"550\u20AC", "Madame Richelieu"},
				{null, null},
			},
			new String[] {
				"[]", "Locataire"
			}
		));
		tableImpaye.getColumnModel().getColumn(0).setPreferredWidth(29);
		scrollPane1.setViewportView(tableImpaye);
		
		JPanel panel22 = new JPanel();
		panel22.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.layeredAccueil.add(panel22);
		panel22.setLayout(new BorderLayout(0, 0));
		
		JLabel labelPerte = new JLabel("Perte engendr\u00E9");
		labelPerte.setHorizontalAlignment(SwingConstants.CENTER);
		panel22.add(labelPerte, BorderLayout.NORTH);
		
		textPerte = new JTextField();
		textPerte.setHorizontalAlignment(SwingConstants.CENTER);
		textPerte.setText("130 \u20AC");
		panel22.add(textPerte);
		textPerte.setColumns(10);
		
		this.layeredLogements = new JLayeredPane();
		// A enlever quand fini de config
		contentPane.add(this.layeredLogements, BorderLayout.CENTER);
		layeredLogements.setLayout(new BorderLayout(0, 0));
		
		JPanel panelFooterLog = new JPanel();
		layeredLogements.add(panelFooterLog, BorderLayout.SOUTH);
		
		JButton btnAjoutLogements = new JButton("Ajouter un logement");
		btnAjoutLogements.addActionListener(this);
		panelFooterLog.add(btnAjoutLogements);
		
		JPanel panelHeaderLog = new JPanel();
		layeredLogements.add(panelHeaderLog, BorderLayout.NORTH);
		panelHeaderLog.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelLog = new JLabel("Mes logements");
		labelLog.setHorizontalAlignment(SwingConstants.CENTER);
		labelLog.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelHeaderLog.add(labelLog);
		
		JPanel panelLog = new JPanel();
		panelHeaderLog.add(panelLog);
		
		JButton btnRefreshLogement = new JButton("Refresh logement");
		btnRefreshLogement.addActionListener(this);
		panelLog.add(btnRefreshLogement);
		
		JPanel panelContentLog = new JPanel();
		layeredLogements.add(panelContentLog);
		panelContentLog.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelContentLog.add(scrollPane);
		
		jListLogements = new JList();
		scrollPane.setViewportView(jListLogements);
		setJListLogements();
		jListLogements.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				   Logement logementSelected = listeDeLogements.get(jListLogements.getSelectedIndex());
				   InfoLogement infoLogement = new InfoLogement(logementSelected);
				   getLayeredPane().add(infoLogement);
				   infoLogement.setVisible(true);
				   infoLogement.moveToFront();
			   }
		});
		
		this.layeredLocataires = new JLayeredPane();
		contentPane.add(this.layeredLocataires, BorderLayout.CENTER);
		layeredLocataires.setLayout(new BorderLayout(0, 0));
		
		JPanel panelFooterLoc = new JPanel();
		this.layeredLocataires.add(panelFooterLoc, BorderLayout.SOUTH);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.addActionListener(this);
		panelFooterLoc.add(btnAjoutLocataire);
		
		JPanel panelHeaderLoc = new JPanel();
		this.layeredLocataires.add(panelHeaderLoc, BorderLayout.NORTH);
		panelHeaderLoc.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelLoc = new JLabel("Mes locataires");
		labelLoc.setHorizontalAlignment(SwingConstants.CENTER);
		labelLoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelHeaderLoc.add(labelLoc);
		
		JPanel panelloc = new JPanel();
		panelHeaderLoc.add(panelloc);
		
		JButton btnRefreshLocataire = new JButton("Refresh locataire");
		btnRefreshLocataire.addActionListener(this);
		panelloc.add(btnRefreshLocataire);
		
		JPanel panelContentLoc = new JPanel();
		this.layeredLocataires.add(panelContentLoc);
		panelContentLoc.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane2 = new JScrollPane();
		panelContentLoc.add(scrollPane2);
		
		jListLocataires = new JList();
		scrollPane2.setViewportView(jListLocataires);
		setJListLocataires();
		jListLocataires.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				   Locataire locataireSelected = listeDeLocataires.get(jListLocataires.getSelectedIndex());
				   InfoLocataire infoLocataire = new InfoLocataire(locataireSelected);
				   getLayeredPane().add(infoLocataire);
				   infoLocataire.setVisible(true);
				   infoLocataire.moveToFront();
			   }
		});
		
		
		
		
		this.layeredLocations = new JLayeredPane();
		contentPane.add(this.layeredLocations, BorderLayout.CENTER);
		this.layeredLocations.setLayout(new BorderLayout(0, 0));
		
		JPanel panelHeaderLoca = new JPanel();
		this.layeredLocations.add(panelHeaderLoca, BorderLayout.NORTH);
		panelHeaderLoca.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelLoca = new JLabel("Mes locations");
		labelLoca.setHorizontalAlignment(SwingConstants.CENTER);
		labelLoca.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelHeaderLoca.add(labelLoca);
		
		JPanel panelLoca = new JPanel();
		panelHeaderLoca.add(panelLoca);
		
		JButton btnRefreshLocation = new JButton("Refresh location");
		btnRefreshLocation.addActionListener(this);
		panelLoca.add(btnRefreshLocation);
		
		JPanel panelContentLoca = new JPanel();
		this.layeredLocations.add(panelContentLoca, BorderLayout.CENTER);
		panelContentLoca.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane3 = new JScrollPane();
		panelContentLoca.add(scrollPane3);
		
		jListLocations = new JList();
		scrollPane3.setViewportView(jListLocations);
		setJListLocations();
		jListLocations.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				   Location locationSelected = listeDeLocations.get(jListLocations.getSelectedIndex());
				   InfoLocation infoLocation = new InfoLocation(locationSelected);
				   getLayeredPane().add(infoLocation);
				   infoLocation.setVisible(true);
				   infoLocation.moveToFront();
			   }
		});
		
		JPanel panelFooterLoca = new JPanel();
		this.layeredLocations.add(panelFooterLoca, BorderLayout.SOUTH);
		
		JButton btnAjoutLocation = new JButton("Ajouter une location");
		btnAjoutLocation.addActionListener(this);
		panelFooterLoca.add(btnAjoutLocation);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLayeredPane layeredPane1 = new JLayeredPane();
		contentPane.add(layeredPane1, BorderLayout.CENTER);
		
		this.layeredDocuments = new JLayeredPane();
		this.layeredDocuments.setBorder(new EmptyBorder(0, 5, 0, 5));
		contentPane.add(this.layeredDocuments, BorderLayout.CENTER);
		this.layeredDocuments.setLayout(new BorderLayout(0, 0));
		
		JPanel panelHeaderDoc = new JPanel();
		this.layeredDocuments.add(panelHeaderDoc, BorderLayout.NORTH);
		panelHeaderDoc.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelDoc = new JLabel("Mes documents");
		labelDoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelDoc.setHorizontalAlignment(SwingConstants.CENTER);
		panelHeaderDoc.add(labelDoc);
		
		JPanel panelDoc = new JPanel();
		panelHeaderDoc.add(panelDoc);
		
		txtSearchDoc = new JTextField();
		txtSearchDoc.setForeground(Color.LIGHT_GRAY);
		txtSearchDoc.setText("Search");
		txtSearchDoc.setColumns(10);
		panelDoc.add(txtSearchDoc);
		
		JScrollPane scrollPaneDoc = new JScrollPane();
		this.layeredDocuments.add(scrollPaneDoc);
		
		jListDocs = new JList();
		jListDocs.setModel(new AbstractListModel() {
			String[] values = new String[] {"Assurance.pdf", "Fac_logement1_novembre2010.pdf"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPaneDoc.setViewportView(jListDocs);
		
		JPanel panelFooterDoc = new JPanel();
		this.layeredDocuments.add(panelFooterDoc, BorderLayout.SOUTH);
		
		JButton btnAjoutDoc = new JButton("Ajouter un document");
		panelFooterDoc.add(btnAjoutDoc);
		
		//Pour mettre l'accueil a la premi�re page
		contentPane.add(this.layeredAccueil, BorderLayout.CENTER);
		
	}

	public void setJListLocations() throws SQLException {
		listeDeLocations = RequeteSelect.selectLocation() ;
		String[] tableauDeLocations = new String[listeDeLocations.size()];
		for (int i=0; i<listeDeLocations.size();i++) {
			tableauDeLocations[i] = "Location de logement " + listeDeLocations.get(i).getLogement()
					+ "locataire "+listeDeLocations.get(i).getLocataire() 
					+ ", débuté le " +listeDeLocations.get(i).getDateDebutLocation();
		}
		jListLocations.setModel(new AbstractListModel() {
			String[] values = tableauDeLocations;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setJListLocataires() throws SQLException {
		listeDeLocataires = RequeteSelect.selectLocataire() ;
		String[] tableauDeLocataires = new String[listeDeLocataires.size()];
		for (int i=0; i<listeDeLocataires.size();i++) {
			String civilite="????";
			if (listeDeLocataires.get(i).getGenreLocataire()=='M') {
				civilite = "Monsieur";
			}else {
				if (listeDeLocataires.get(i).getGenreLocataire()=='F') {
					civilite = "Madame";
				}
			}
			tableauDeLocataires[i] = civilite +" "+ listeDeLocataires.get(i).getPrenomLocataire() + " " + listeDeLocataires.get(i).getNomLocataire();
		}
		this.jListLocataires.setModel(new AbstractListModel(){
			String[] values = tableauDeLocataires;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setJListLogements() throws SQLException {
		listeDeLogements = RequeteSelect.selectLogement() ;
		String[] tableauDeLogements = new String[listeDeLogements.size()];
		for (int i=0; i<listeDeLogements.size();i++) {
			tableauDeLogements[i] = "Logement "+ listeDeLogements.get(i).getIdLogement() + ", "+ listeDeLogements.get(i).getTypeLogement() +" de superficie " + listeDeLogements.get(i).getSuperficieLogement() + " m²";
		}
		this.jListLogements.setModel(new AbstractListModel() {
			String[] values = tableauDeLogements;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Home":
				rendreVisible(this.layeredAccueil);
				break;
			case"Logements":
				rendreVisible(this.layeredLogements);
				break;
			case"Locataires":
				rendreVisible(this.layeredLocataires);
				break;
			case"Locations":
				rendreVisible(this.layeredLocations);
				break;
			case"Documents":
				//rendreVisible(this.layeredDocuments);
				Document doc = new Document();
				this.getLayeredPane().add(doc);
				doc.setVisible(true);
				doc.moveToFront();
				break;
			case"Calc":
				break;
			case"Cafe":
				Cafe cafe=new Cafe();
				this.getLayeredPane().add(cafe);
				cafe.setVisible(true);
				cafe.moveToFront();
				break;
			case"Param":
				Parametre param=new Parametre();
				this.getLayeredPane().add(param);
				param.setVisible(true);
				param.moveToFront();
				break;
			case"Ajouter un logement":
				AjouterLogement logement=new AjouterLogement();
				this.getLayeredPane().add(logement);
				logement.setVisible(true);
				logement.moveToFront();
				break;
			case"Ajouter un locataire":
				AjouterLocataire locataire=new AjouterLocataire();
				this.getLayeredPane().add(locataire);
				locataire.setVisible(true);
				locataire.moveToFront();
				break;
			case"Ajouter une location":
				AjouterLocation location=new AjouterLocation();
				this.getLayeredPane().add(location);
				location.setVisible(true);
				location.moveToFront();
				break;
			case"New button":
				rendreVisible(this.layeredblabla);
			case"Refresh":
				try {
					refresh();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			case"Refresh logement":
				try {
					refresh();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			case"Refresh locataire":
				try {
					refresh();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			case"Refresh location":
				try {
					refresh();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
		
	public void refresh() throws SQLException {
		setJListLogements();
		setJListLocataires();
		setJListLocations();
	}
	
	public void rendreVisible(JLayeredPane visible) {
		this.layeredAccueil.setVisible(false);
		this.layeredLogements.setVisible(false);
		this.layeredLocataires.setVisible(false);
		this.layeredLocations.setVisible(false);
		this.layeredDocuments.setVisible(false);
		visible.setVisible(true);
		contentPane.add(visible, BorderLayout.CENTER);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}