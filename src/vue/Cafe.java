package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Cafe extends JInternalFrame implements ActionListener {
	private JTextField txtMotif;

	/**
	 * Create the frame.
	 */
	public Cafe() {
		setBounds(100, 100, 450, 300);
		
		JLabel labelTitre = new JLabel("Proposer un caf\u00E9 \u00E0");
		labelTitre.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitre.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelTitre, BorderLayout.NORTH);
		
		JPanel panelContent = new JPanel();
		getContentPane().add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.PAGE_AXIS));
		
		JPanel panelPersonne = new JPanel();
		panelPersonne.setBorder(new EmptyBorder(20, 0, 0, 0));
		FlowLayout flowLayout = (FlowLayout) panelPersonne.getLayout();
		panelContent.add(panelPersonne);
		
		JComboBox comboPersonne = new JComboBox();
		comboPersonne.setModel(new DefaultComboBoxModel(new String[] {"Monsieur Boughanem", "Ga\u00EFa Ducournau", "Jason Besier", "Kemit Carabin", "Mendy Paul", "Nicolas Rousseau", "Patrick Jeanjean"}));
		panelPersonne.add(comboPersonne);
		
		JPanel panelDate = new JPanel();
		panelContent.add(panelDate);
		
		JLabel labelLe = new JLabel(" le ");
		panelDate.add(labelLe);
		
		JComboBox comboJour = new JComboBox();
		comboJour.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panelDate.add(comboJour);
		
		JComboBox comboMois = new JComboBox();
		comboMois.setModel(new DefaultComboBoxModel(new String[] {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Ao\u00FBt", "Septembre", "Octobre", "Novembre", "Decembre"}));
		panelDate.add(comboMois);
		
		JComboBox comboAnnée = new JComboBox();
		comboAnnée.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "Apr\u00E8s 2030"}));
		panelDate.add(comboAnnée);
		
		JPanel panelHeure = new JPanel();
		panelContent.add(panelHeure);
		
		JLabel labelA = new JLabel("\u00E0");
		panelHeure.add(labelA);
		
		JComboBox comboHeure = new JComboBox();
		comboHeure.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		panelHeure.add(comboHeure);
		
		JLabel labelH = new JLabel(" h ");
		panelHeure.add(labelH);
		
		JComboBox comboMinutes = new JComboBox();
		comboMinutes.setModel(new DefaultComboBoxModel(new String[] {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		panelHeure.add(comboMinutes);
		
		JPanel panelMotif = new JPanel();
		panelContent.add(panelMotif);
		
		JLabel labelPour = new JLabel("pour ");
		panelMotif.add(labelPour);
		
		txtMotif = new JTextField();
		txtMotif.setForeground(Color.LIGHT_GRAY);
		txtMotif.setText("ex : Passer du bon temps");
		panelMotif.add(txtMotif);
		txtMotif.setColumns(20);
		
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
