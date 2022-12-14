package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class AjouterLogement extends JInternalFrame implements ActionListener {
	private JTextField textId;
	private JTextField textSurface;
	private JTextField textAdresse;
	private JTextField textVille;
	private JTextField textCptAdresse;
	private JTextField textCP;
	private JTextField textNomLogement;
	private JTextField textPrixAcquisition;
	private JTextField textFraiAcquisition;
	private JTextField textCaution;

	/**
	 * Create the frame.
	 */
	public AjouterLogement() {
		setBounds(100, 100, 550, 400);
		
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
		
		JPanel panel_17 = new JPanel();
		panel_Nom.add(panel_17);
		
		JLabel LabelId = new JLabel("Identifiant :");
		panel_17.add(LabelId);
		
		textId = new JTextField();
		textId.setColumns(10);
		panel_17.add(textId);
		
		JLabel LabelNom = new JLabel("Nom du logement :");
		panel_17.add(LabelNom);
		
		textNomLogement = new JTextField();
		textNomLogement.setColumns(10);
		panel_17.add(textNomLogement);
		
		
		JLabel LabelCaution = new JLabel("Montant caution :");
		panel_17.add(LabelCaution);
		
		textCaution = new JTextField();
		textCaution.setColumns(10);
		panel_17.add(textCaution);
		
		
		JPanel panel_Description = new JPanel();
		panel1.add(panel_Description);
		panel_Description.setLayout(new BorderLayout(0, 0));
		
		JLabel LabelDesc = new JLabel("Description :");
		LabelDesc.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_Description.add(LabelDesc, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_Description.add(scrollPane);
		
		JTextArea textDescription = new JTextArea();
		scrollPane.setViewportView(textDescription);
		textDescription.setToolTipText("Une tr\u00E8s longue description langoureuse sur le logement parce qu'il a toute les qualit\u00E9 du monde rien qu'a lui");
		textDescription.setTabSize(7);
		textDescription.setRows(3);
		
		JPanel panel2 = new JPanel();
		panelContent.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_type = new JPanel();
		panel_type.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel2.add(panel_type);
		panel_type.setLayout(new BoxLayout(panel_type, BoxLayout.X_AXIS));
		
		JLabel LabelType = new JLabel("Type                      ");
		panel_type.add(LabelType);
		
		JComboBox comboType = new JComboBox();
		comboType.setModel(new DefaultComboBoxModel(new String[] {"Appartement", "Maison", "Garage"}));
		panel_type.add(comboType);
		
		JPanel panel_nb_piece = new JPanel();
		FlowLayout fl_panel_nb_piece = (FlowLayout) panel_nb_piece.getLayout();
		fl_panel_nb_piece.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_nb_piece);
		
		JLabel LabelNbPiece = new JLabel("Nombre de pi\u00E8ce");
		panel_nb_piece.add(LabelNbPiece);
		
		JSpinner spinnerPiece = new JSpinner();
		panel_nb_piece.add(spinnerPiece);
		
		JPanel panel_surface = new JPanel();
		FlowLayout fl_panel_surface = (FlowLayout) panel_surface.getLayout();
		fl_panel_surface.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_surface);
		
		JLabel LabelSurface = new JLabel("Surface                     ");
		panel_surface.add(LabelSurface);
		
		textSurface = new JTextField();
		textSurface.setForeground(Color.LIGHT_GRAY);
		textSurface.setText("25");
		panel_surface.add(textSurface);
		textSurface.setColumns(10);
		
		JLabel LabelUnit? = new JLabel("m\u00B2");
		panel_surface.add(LabelUnit?);
		
		JPanel panel_nb_chambre = new JPanel();
		FlowLayout fl_panel_nb_chambre = (FlowLayout) panel_nb_chambre.getLayout();
		fl_panel_nb_chambre.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_nb_chambre);
		
		JLabel labelNbChambre = new JLabel("Nombre de chambre");
		panel_nb_chambre.add(labelNbChambre);
		
		JSpinner spinnerChambre = new JSpinner();
		panel_nb_chambre.add(spinnerChambre);
		
		JPanel panel_adresse = new JPanel();
		FlowLayout fl_panel_adresse = (FlowLayout) panel_adresse.getLayout();
		fl_panel_adresse.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_adresse);
		
		JLabel LabelAdresse = new JLabel("Adresse                     ");
		panel_adresse.add(LabelAdresse);
		
		textAdresse = new JTextField();
		panel_adresse.add(textAdresse);
		textAdresse.setColumns(10);
		
		JPanel panel_copro = new JPanel();
		FlowLayout fl_panel_copro = (FlowLayout) panel_copro.getLayout();
		fl_panel_copro.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_copro);
		
		JCheckBox CheckboxCopro = new JCheckBox("Co-propri\u00E9t\u00E9");
		panel_copro.add(CheckboxCopro);
		
		JPanel panel_cpt_adresse = new JPanel();
		FlowLayout fl_panel_cpt_adresse = (FlowLayout) panel_cpt_adresse.getLayout();
		fl_panel_cpt_adresse.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_cpt_adresse);
		
		JLabel LabelCptAdresse = new JLabel("Compl\u00E9ment adresse ");
		panel_cpt_adresse.add(LabelCptAdresse);
		
		textCptAdresse = new JTextField();
		panel_cpt_adresse.add(textCptAdresse);
		textCptAdresse.setColumns(10);
		
		JPanel panel_garage = new JPanel();
		FlowLayout fl_panel_garage = (FlowLayout) panel_garage.getLayout();
		fl_panel_garage.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_garage);
		
		JCheckBox CheckboxGarage = new JCheckBox("Garage");
		panel_garage.add(CheckboxGarage);
		
		JPanel panel_ville = new JPanel();
		FlowLayout fl_panel_ville = (FlowLayout) panel_ville.getLayout();
		fl_panel_ville.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_ville);
		
		JLabel LabelVille = new JLabel("Ville                            ");
		panel_ville.add(LabelVille);
		
		textVille = new JTextField();
		panel_ville.add(textVille);
		textVille.setColumns(10);
		
		JPanel panel_prix_acqui = new JPanel();
		FlowLayout fl_panel_prix_acqui = (FlowLayout) panel_prix_acqui.getLayout();
		fl_panel_prix_acqui.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_prix_acqui);
		
		JLabel labelPrixAcquisition = new JLabel("Prix d'acquisition");
		panel_prix_acqui.add(labelPrixAcquisition);
		
		textPrixAcquisition = new JTextField();
		panel_prix_acqui.add(textPrixAcquisition);
		textPrixAcquisition.setColumns(10);
		
		JPanel panel_codepostal = new JPanel();
		FlowLayout fl_panel_codepostal = (FlowLayout) panel_codepostal.getLayout();
		fl_panel_codepostal.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_codepostal);
		
		JLabel LabelCP = new JLabel("Code postal               ");
		panel_codepostal.add(LabelCP);
		
		textCP = new JTextField();
		panel_codepostal.add(textCP);
		textCP.setColumns(10);
		
		JPanel panel_frai_acqui = new JPanel();
		FlowLayout fl_panel_frai_acqui = (FlowLayout) panel_frai_acqui.getLayout();
		fl_panel_frai_acqui.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_frai_acqui);
		
		JLabel labelFraiAcquisition = new JLabel("Frais d'acquisition");
		labelFraiAcquisition.setHorizontalAlignment(SwingConstants.LEFT);
		panel_frai_acqui.add(labelFraiAcquisition);
		
		textFraiAcquisition = new JTextField();
		panel_frai_acqui.add(textFraiAcquisition);
		textFraiAcquisition.setColumns(10);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this);
		panelFooter.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
		panelFooter.add(btnValider);

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
