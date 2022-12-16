package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
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

public class AjouterLocation extends JInternalFrame implements ActionListener {
	private JTextField txtNom;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField txtEx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterLocation frame = new AjouterLocation();
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
	public AjouterLocation() {
		setResizable(true);
		setBounds(100, 100, 822, 693);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.NORTH);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JPanel panelNom = new JPanel();
		panelContent.add(panelNom);
		
		JLabel LabelNomLocation = new JLabel("Nom de la location");
		LabelNomLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNom.add(LabelNomLocation);
		
		txtNom = new JTextField();
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNom.setForeground(Color.LIGHT_GRAY);
		txtNom.setText("nom");
		panelNom.add(txtNom);
		txtNom.setColumns(10);
		
		JPanel PanelAssociation = new JPanel();
		panelContent.add(PanelAssociation);
		PanelAssociation.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelChoixLogement = new JPanel();
		PanelAssociation.add(panelChoixLogement);
		panelChoixLogement.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelLogement = new JLabel("Logement :");
		labelLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLogement.add(labelLogement);
		
		JComboBox comboBoxLogement = new JComboBox();
		comboBoxLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLogement.setMaximumRowCount(20);
		comboBoxLogement.setModel(new DefaultComboBoxModel(new String[] {"Logement 1", "Logement 2"}));
		panelChoixLogement.add(comboBoxLogement);
		
		JButton btnAjoutLogement = new JButton("Ajouter un logement");
		btnAjoutLogement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAjoutLogement.addActionListener(this);
		panelChoixLogement.add(btnAjoutLogement);
		
		JPanel panelChoixLoctaire = new JPanel();
		PanelAssociation.add(panelChoixLoctaire);
		panelChoixLoctaire.setLayout(new GridLayout(0, 1, 0, 2));
		
		JLabel labelLocataire = new JLabel("Locataire :");
		labelLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelChoixLoctaire.add(labelLocataire);
		
		JComboBox comboBoxLocataire = new JComboBox();
		comboBoxLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLocataire.setMaximumRowCount(20);
		comboBoxLocataire.setModel(new DefaultComboBoxModel(new String[] {"Patrick Jeanjean", "Mendy Paul"}));
		panelChoixLoctaire.add(comboBoxLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAjoutLocataire.addActionListener(this);
		panelChoixLoctaire.add(btnAjoutLocataire);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Annuler");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(this);
		panelFooter.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Valider");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(this);
		panelFooter.add(btnNewButton_1);
		
		JPanel panelInfoComplémentaires = new JPanel();
		getContentPane().add(panelInfoComplémentaires, BorderLayout.CENTER);
		panelInfoComplémentaires.setLayout(new GridLayout(3, 7, 0, 0));
		
		JPanel panelActeDeCautionnement = new JPanel();
		panelInfoComplémentaires.add(panelActeDeCautionnement);
		panelActeDeCautionnement.setLayout(new BorderLayout(0, 0));
		
		JButton btnActeCautionnement = new JButton("Acte de cautionnement");
		btnActeCautionnement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelActeDeCautionnement.add(btnActeCautionnement);
		
		JPanel panelTypeLocation = new JPanel();
		panelInfoComplémentaires.add(panelTypeLocation);
		
		JLabel LabelTypeLocation = new JLabel("Type de location");
		LabelTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(LabelTypeLocation);
		
		JComboBox comboBoxTypeLocation = new JComboBox();
		comboBoxTypeLocation.setModel(new DefaultComboBoxModel(new String[] {"Non meublé", "Local commercial"}));
		comboBoxTypeLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTypeLocation.add(comboBoxTypeLocation);
		
		JPanel panelMoyenLoyer = new JPanel();
		panelInfoComplémentaires.add(panelMoyenLoyer);
		
		JLabel LabelMontantLoyer = new JLabel("Montant loyer");
		LabelMontantLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMoyenLoyer.add(LabelMontantLoyer);
		
		textField_2 = new JTextField();
		textField_2.setText("600 €");
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		panelMoyenLoyer.add(textField_2);
		
		JPanel panelDateDébut = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelDateDébut.getLayout();
		panelInfoComplémentaires.add(panelDateDébut);
		
		JLabel LabelDate = new JLabel("Date début");
		LabelDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateDébut.add(LabelDate);
		
		textField = new JTextField();
		textField.setText("18/01/2022");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		panelDateDébut.add(textField);
		
		JPanel panelDateFin = new JPanel();
		panelInfoComplémentaires.add(panelDateFin);
		
		JLabel LabelDate_1 = new JLabel("Date fin");
		LabelDate_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDateFin.add(LabelDate_1);
		
		textField_1 = new JTextField();
		textField_1.setText("15/12/2022");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		panelDateFin.add(textField_1);
		
		JPanel panelPeriodicite = new JPanel();
		panelInfoComplémentaires.add(panelPeriodicite);
		
		JLabel LabelPeriodicite = new JLabel("Periodicité");
		LabelPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(LabelPeriodicite);
		
		JComboBox comboPeriodicite = new JComboBox();
		comboPeriodicite.setModel(new DefaultComboBoxModel(new String[] {"Mensuel", "Annuel"}));
		comboPeriodicite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelPeriodicite.add(comboPeriodicite);
		
		JPanel panelCharges = new JPanel();
		panelInfoComplémentaires.add(panelCharges);
		
		JLabel LabelMtnCharges_1 = new JLabel("Charges");
		LabelMtnCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelMtnCharges_1.setHorizontalAlignment(SwingConstants.LEFT);
		panelCharges.add(LabelMtnCharges_1);
		
		textField_4 = new JTextField();
		textField_4.setText("100 €");
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_4.setColumns(10);
		panelCharges.add(textField_4);
		
		JPanel panelFonciere = new JPanel();
		panelInfoComplémentaires.add(panelFonciere);
		
		JLabel LabelMtnFoncière = new JLabel("Foncière");
		LabelMtnFoncière.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFonciere.add(LabelMtnFoncière);
		
		textField_3 = new JTextField();
		textField_3.setText("600 €");
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		panelFonciere.add(textField_3);
		
		JPanel panelAjustementLoyer = new JPanel();
		panelInfoComplémentaires.add(panelAjustementLoyer);
		
		JLabel LabelAjustementLoyer = new JLabel("Ajustement du loyer");
		LabelAjustementLoyer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelAjustementLoyer.add(LabelAjustementLoyer);
		
		txtEx = new JTextField();
		txtEx.setText("Ex : 18 € ou -18€");
		txtEx.setForeground(Color.LIGHT_GRAY);
		txtEx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEx.setColumns(10);
		panelAjustementLoyer.add(txtEx);
		
		JPanel panelPhoto = new JPanel();
		getContentPane().add(panelPhoto, BorderLayout.EAST);
		panelPhoto.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelPhoto = new JLabel("PHOTO.png");
		LabelPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPhoto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelPhoto.add(LabelPhoto);

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
			case"Ajouter un logement":
				Accueil fp1 = (Accueil) this.getTopLevelAncestor();
				AjouterLogement logement=new AjouterLogement();
				fp1.getLayeredPane().add(logement);
				logement.setVisible(true);
				logement.moveToFront();
				break;
			case"Ajouter un locataire":
				Accueil fp2 = (Accueil) this.getTopLevelAncestor();
				AjouterLocataire locataire=new AjouterLocataire();
				fp2.getLayeredPane().add(locataire);
				locataire.setVisible(true);
				locataire.moveToFront();
				break;
		}
	}
}
