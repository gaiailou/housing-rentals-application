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

import controleur.GestionAjouterLogement;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class AjouterLogement extends JInternalFrame {
	private JTextField textId;
	private JTextField textNumAdresse;
	private JTextField textNomLogement;
	private JTextField textNomRueAdresse;
	private JTextField textFieldCaution;

	private GestionAjouterLogement gestionClic;
	
	private JButton btnAnnuler;
	private JButton btnValider;
	private JTextField textFieldCplmtAdr;
	private JTextField textFieldVille;
	private JTextField textFieldCP;
	private JTextField textFieldSuperficie;
	private JTextField textFieldPrixAcquisition;
	private JTextField textFieldFraisAcquisition;
	
	private JComboBox comboType;
	
	private JSpinner spinnerNbPiece;
	private JSpinner spinnerNbChambre;
	
	private JTextArea textDescription;
	
	private JCheckBox CheckboxCopro;
	private JCheckBox CheckboxGarage;
	
	public String getCheckboxCoPro() {
		return this.CheckboxCopro.getSelectedIcon().toString();
	}
	
	public boolean getCheckboxGarage() {
		return this.CheckboxGarage.isSelected();
	}
	
	public String getTextDescription() {
		return this.textDescription.getSelectedText();
	}
	
	public String getSpinnerNbChambre() {
		return this.spinnerNbChambre.getValue().toString();
	}
	
	public String getSpinnerNbPiece() {
		return this.spinnerNbPiece.getValue().toString();
	}
	
	public String getComboType() {
		return this.comboType.getSelectedItem().toString();
	}

	public String getTextId() {
		return this.textId.getText();
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}

	public String getTextNumAdresse() {
		return this.textNumAdresse.getText();
	}

	public void setTextNumAdresse(JTextField textNumAdresse) {
		this.textNumAdresse = textNumAdresse;
	}

	public String getTextNomLogement() {
		return this.textNomLogement.getText();
	}

	public void setTextNomLogement(JTextField textNomLogement) {
		this.textNomLogement = textNomLogement;
	}

	public String getTextNomRueAdresse() {
		return this.textNomRueAdresse.getText();
	}

	public void setTextNomRueAdresse(JTextField textNomRueAdresse) {
		this.textNomRueAdresse = textNomRueAdresse;
	}

	public String getTextFieldCaution() {
		return this.textFieldCaution.getText();
	}

	public void setTextFieldCaution(JTextField textFieldCaution) {
		this.textFieldCaution = textFieldCaution;
	}

	public GestionAjouterLogement getGestionClic() {
		return gestionClic;
	}

	public void setGestionClic(GestionAjouterLogement gestionClic) {
		this.gestionClic = gestionClic;
	}

	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}

	public void setBtnAnnuler(JButton btnAnnuler) {
		this.btnAnnuler = btnAnnuler;
	}

	public JButton getBtnValider() {
		return btnValider;
	}

	public void setBtnValider(JButton btnValider) {
		this.btnValider = btnValider;
	}

	public String getTextFieldCplmtAdr() {
		return this.textFieldCplmtAdr.getText();
	}

	public void setTextFieldCplmtAdr(JTextField textFieldCplmtAdr) {
		this.textFieldCplmtAdr = textFieldCplmtAdr;
	}

	public String getTextFieldVille() {
		return this.textFieldVille.getText();
	}

	public void setTextFieldVille(JTextField textFieldVille) {
		this.textFieldVille = textFieldVille;
	}

	public String getTextFieldCP() {
		return this.textFieldCP.getText();
	}

	public void setTextFieldCP(JTextField textFieldCP) {
		this.textFieldCP = textFieldCP;
	}

	public String getTextFieldSuperficie() {
		return this.textFieldSuperficie.getText();
	}

	public void setTextFieldSuperficie(JTextField textFieldExempleSurface) {
		this.textFieldSuperficie = textFieldExempleSurface;
	}

	public String getTextFieldPrixAcquisition() {
		return this.textFieldPrixAcquisition.getText();
	}

	public void setTextFieldPrixAcquisition(JTextField textFieldPrixAcquisition) {
		this.textFieldPrixAcquisition = textFieldPrixAcquisition;
	}

	public String getTextFieldFraisAcquisition() {
		return this.textFieldFraisAcquisition.getText();
	}

	public void setTextFieldFraisAcquisition(JTextField textFieldFraisAcquisition) {
		this.textFieldFraisAcquisition = textFieldFraisAcquisition;
	}

	public AjouterLogement() {
		this.gestionClic = new GestionAjouterLogement(this);
		
		setBounds(100, 100, 550, 400);
		
		JPanel panelFooter = new JPanel();
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		this.btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(gestionClic);
		panelFooter.add(btnAnnuler);
		
		this.btnValider = new JButton("Valider");
		this.btnValider.addActionListener(this.gestionClic);
		panelFooter.add(this.btnValider);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelContent.add(panel1);
		panel1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelNom = new JPanel();
		panel1.add(panelNom);
		panelNom.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_17 = new JPanel();
		panelNom.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 1, 0, 0));
		
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
		
		
		JPanel panel_Description = new JPanel();
		panel1.add(panel_Description);
		panel_Description.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LabelDesc = new JLabel("Description :");
		LabelDesc.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_Description.add(LabelDesc);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_Description.add(scrollPane);
		
		this.textDescription = new JTextArea();
		textDescription.setColumns(1);
		scrollPane.setViewportView(textDescription);
		textDescription.setToolTipText("Description du logement");
		textDescription.setTabSize(5);
		textDescription.setRows(1);
		
		JPanel panel2 = new JPanel();
		panelContent.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_type = new JPanel();
		panel_type.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel2.add(panel_type);
		panel_type.setLayout(new GridLayout(2, 3, 0, 0));
		
		JLabel LabelType = new JLabel("Type                      ");
		panel_type.add(LabelType);
		
		this.comboType = new JComboBox();
		comboType.setModel(new DefaultComboBoxModel(new String[] {"Appartement", "Maison", "Garage"}));
		panel_type.add(comboType);
		
		JLabel lblEspace = new JLabel(" ");
		panel_type.add(lblEspace);
		
		JLabel LabelSurface = new JLabel("Surface                     ");
		panel_type.add(LabelSurface);
		
		textFieldSuperficie = new JTextField();
		textFieldSuperficie.setText("25");
		textFieldSuperficie.setForeground(Color.LIGHT_GRAY);
		textFieldSuperficie.setColumns(10);
		panel_type.add(textFieldSuperficie);
		
		JLabel LabelUnite = new JLabel("m\u00B2");
		panel_type.add(LabelUnite);
		
		JPanel panel_nb_piece = new JPanel();
		FlowLayout fl_panel_nb_piece = (FlowLayout) panel_nb_piece.getLayout();
		fl_panel_nb_piece.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_nb_piece);
		
		JLabel LabelNbPiece = new JLabel("Nombre de pi\u00E8ce");
		panel_nb_piece.add(LabelNbPiece);
		
		this.spinnerNbPiece = new JSpinner();
		panel_nb_piece.add(spinnerNbPiece);
		
		JLabel labelNbChambre = new JLabel("dont");
		panel_nb_piece.add(labelNbChambre);
		
		this.spinnerNbChambre = new JSpinner();
		panel_nb_piece.add(spinnerNbChambre);
		
		JLabel lblnbChambre = new JLabel("chambre(s)");
		panel_nb_piece.add(lblnbChambre);
		
		JPanel panelCoproGarage = new JPanel();
		panel_nb_piece.add(panelCoproGarage);
		
		this.CheckboxCopro = new JCheckBox("Co-propri\u00E9t\u00E9");
		panelCoproGarage.add(CheckboxCopro);
		
		this.CheckboxGarage = new JCheckBox("Garage");
		panelCoproGarage.add(CheckboxGarage);
		
		JPanel panel_adresse = new JPanel();
		FlowLayout fl_panel_adresse = (FlowLayout) panel_adresse.getLayout();
		fl_panel_adresse.setAlignment(FlowLayout.LEFT);
		panel2.add(panel_adresse);
		
		JLabel LabelNumAdresse = new JLabel("Num\u00E9ro");
		panel_adresse.add(LabelNumAdresse);
		
		textNumAdresse = new JTextField();
		panel_adresse.add(textNumAdresse);
		textNumAdresse.setColumns(3);
		
		JLabel LabelNomRueAdresse = new JLabel("Rue");
		panel_adresse.add(LabelNomRueAdresse);
		
		textNomRueAdresse = new JTextField();
		panel_adresse.add(textNomRueAdresse);
		textNomRueAdresse.setColumns(10);
		
		JLabel LabelCptAdresse = new JLabel("Compl\u00E9ment adresse ");
		panel_adresse.add(LabelCptAdresse);
		
		textFieldCplmtAdr = new JTextField();
		textFieldCplmtAdr.setColumns(10);
		panel_adresse.add(textFieldCplmtAdr);
		
		JLabel LabelVille = new JLabel("Ville                            ");
		panel_adresse.add(LabelVille);
		
		textFieldVille = new JTextField();
		textFieldVille.setColumns(10);
		panel_adresse.add(textFieldVille);
		
		JLabel LabelCP = new JLabel("Code postal               ");
		panel_adresse.add(LabelCP);
		
		textFieldCP = new JTextField();
		textFieldCP.setColumns(10);
		panel_adresse.add(textFieldCP);
		
		JPanel panelCaution = new JPanel();
		FlowLayout fl_panelCaution = (FlowLayout) panelCaution.getLayout();
		fl_panelCaution.setAlignment(FlowLayout.LEFT);
		panel2.add(panelCaution);
		
		JLabel lblCaution = new JLabel("Caution : ");
		panelCaution.add(lblCaution);
		
		textFieldCaution = new JTextField();
		panelCaution.add(textFieldCaution);
		textFieldCaution.setColumns(10);
		
		JLabel lblEuros = new JLabel("\u20AC");
		panelCaution.add(lblEuros);
		
		JPanel panel_prix_acqui = new JPanel();
		panelCaution.add(panel_prix_acqui);
		panel_prix_acqui.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblPrixDacquisition = new JLabel("Prix d'acquisition : ");
		panel_prix_acqui.add(lblPrixDacquisition);
		
		textFieldPrixAcquisition = new JTextField();
		textFieldPrixAcquisition.setColumns(5);
		panel_prix_acqui.add(textFieldPrixAcquisition);
		
		JLabel lblEuro1 = new JLabel("\u20AC");
		panel_prix_acqui.add(lblEuro1);
		
		JLabel lblFraisDacquisition = new JLabel("Frais d'acquisition : ");
		lblFraisDacquisition.setHorizontalAlignment(SwingConstants.LEFT);
		panel_prix_acqui.add(lblFraisDacquisition);
		
		textFieldFraisAcquisition = new JTextField();
		textFieldFraisAcquisition.setColumns(5);
		panel_prix_acqui.add(textFieldFraisAcquisition);
		
		JLabel lblEuro2 = new JLabel("\u20AC");
		panel_prix_acqui.add(lblEuro2);

	}
}