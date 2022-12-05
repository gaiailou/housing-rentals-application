package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
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
import java.awt.Color;

public class AjouterLocataire extends JInternalFrame implements ActionListener {
	private JTextField txtNom;
	private JTextField textPrenom;
	private JTextField txtDateNaissance;
	private JTextField textProfession;
	private JTextField textRevenu;

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
		setBounds(100, 100, 492, 390);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Particulier", "Profesionnel"}));
		panel_7.add(comboBox);
		
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
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panelCivilite = new JPanel();
		FlowLayout fl_panelCivilite = (FlowLayout) panelCivilite.getLayout();
		fl_panelCivilite.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelCivilite);
		
		JLabel labelCivilite = new JLabel("Civilit\u00E9                   ");
		panelCivilite.add(labelCivilite);
		
		JComboBox comboCivilite = new JComboBox();
		comboCivilite.setModel(new DefaultComboBoxModel(new String[] {"Homme", "Femme", "Non Binaire", "Sac Auchan"}));
		panelCivilite.add(comboCivilite);
		
		JPanel panelNom = new JPanel();
		FlowLayout fl_panelNom = (FlowLayout) panelNom.getLayout();
		fl_panelNom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelNom);
		
		JLabel labelNom = new JLabel("Nom                      ");
		panelNom.add(labelNom);
		
		txtNom = new JTextField();
		panelNom.add(txtNom);
		txtNom.setColumns(10);
		
		JPanel panelPrenom = new JPanel();
		FlowLayout fl_panelPrenom = (FlowLayout) panelPrenom.getLayout();
		fl_panelPrenom.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelPrenom);
		
		JLabel labelPrenom = new JLabel("Pr\u00E9nom                 ");
		panelPrenom.add(labelPrenom);
		
		textPrenom = new JTextField();
		panelPrenom.add(textPrenom);
		textPrenom.setColumns(10);
		
		JPanel panelDateNaissance = new JPanel();
		FlowLayout fl_panelDateNaissance = (FlowLayout) panelDateNaissance.getLayout();
		fl_panelDateNaissance.setAlignment(FlowLayout.LEFT);
		panel_5.add(panelDateNaissance);
		
		JLabel labelDateDeNaissance = new JLabel("Date de naissance");
		panelDateNaissance.add(labelDateDeNaissance);
		
		txtDateNaissance = new JTextField();
		txtDateNaissance.setText("JJ/MM/AAAA");
		panelDateNaissance.add(txtDateNaissance);
		txtDateNaissance.setColumns(10);
		
		JPanel panelSitPro = new JPanel();
		panel.add(panelSitPro);
		panelSitPro.setBorder(new EmptyBorder(10, 0, 0, 0));
		panelSitPro.setLayout(new BorderLayout(0, 0));
		
		JLabel labelSitPro = new JLabel("Situation Profesionnelle");
		labelSitPro.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSitPro.add(labelSitPro, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSitPro.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JPanel panelProfession = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelProfession.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_6.add(panelProfession);
		
		JLabel labelProfession = new JLabel("Profession            ");
		panelProfession.add(labelProfession);
		
		textProfession = new JTextField();
		panelProfession.add(textProfession);
		textProfession.setColumns(10);
		
		JPanel panelRevenu = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelRevenu.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_6.add(panelRevenu);
		
		JLabel labelRevenu = new JLabel("Revenu mensuel  ");
		panelRevenu.add(labelRevenu);
		
		textRevenu = new JTextField();
		panelRevenu.add(textRevenu);
		textRevenu.setColumns(10);
		
		JLabel labelDevise = new JLabel("\u20AC");
		panelRevenu.add(labelDevise);
		
		JLayeredPane layeredComplement = new JLayeredPane();
		tabbedPane.addTab("Informations compl\u00E9mentaires", null, layeredComplement, null);
		
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
				this.dispose();
				break;
		}
	}
}
