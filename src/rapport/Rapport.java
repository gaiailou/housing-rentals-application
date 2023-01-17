
package rapport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;




public class Rapport{

	
	public void creerUnSoldeDeToutCompte(String ladateQuittance, String leNomBailleur, String adressedubailleur,String nomduLocataire,String adressedulocataire,String adressedelaLocation, int leloyer, int lescharges) throws IOException {
    	String dateSoldeDeToutCompte = ladateQuittance;
    	String nomBailleur = leNomBailleur;
    	String addresseBailleur = adressedubailleur;
    	
    	String nomLocataire = nomduLocataire;
    	String adresseLocataire = adressedulocataire;
    	
    	String adresseLocation = adressedelaLocation;
    	
    	int loyer = leloyer;
    	int charge = lescharges;
    	
    	
        InputStream modele = new FileInputStream("modele.docx");
        
        XWPFDocument document = new XWPFDocument(modele);
        try(FileOutputStream fileOut = new FileOutputStream(new File("Solde du "+dateSoldeDeToutCompte+".docx"))) {
        XWPFParagraph titre = document.createParagraph();
        titre.setAlignment(ParagraphAlignment.CENTER);  
        XWPFRun run = titre.createRun();
        
        run.setText("Objet : Solde de tout compte");
        
        XWPFParagraph infoBailleur = document.createParagraph();
        infoBailleur.setAlignment(ParagraphAlignment.LEFT);  
        
        XWPFRun runinfoBailleur = infoBailleur.createRun();
        
        runinfoBailleur.setText("Bailleur :");
        runinfoBailleur.addCarriageReturn();
        runinfoBailleur.setText(nomBailleur);
        runinfoBailleur.addCarriageReturn();
        runinfoBailleur.setText(addresseBailleur);
        
        XWPFParagraph infoLocataire = document.createParagraph();
        infoLocataire.setAlignment(ParagraphAlignment.RIGHT);  
        
        XWPFRun runInfoLocataire = infoLocataire.createRun();
        
        runInfoLocataire.setText("Locataire :");
        runInfoLocataire.addCarriageReturn();
        runInfoLocataire.setText(nomLocataire);
        runInfoLocataire.addCarriageReturn();
        runInfoLocataire.setText(adresseLocataire);
        runInfoLocataire.addCarriageReturn();
        
        runInfoLocataire.setText("Toulouse le "+dateSoldeDeToutCompte);
        
        XWPFParagraph infoLocation = document.createParagraph();
        infoLocation.setAlignment(ParagraphAlignment.CENTER);
        
        XWPFRun runinfoLocation = infoLocation.createRun();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.setText("Adresse location : " + adresseLocation);
        
        
        
        XWPFParagraph paragraph3 = document.createParagraph();
        XWPFRun run3 = paragraph3.createRun();
        run3.addCarriageReturn();
        run3.addCarriageReturn();
        
        run3.setText("Je vous prie de bien vouloir trouver, ci-dessous, le détail du solde de tout compte.");
        run3.addCarriageReturn();
        
        XWPFTable table = document.createTable();
        XWPFTableRow row = table.getRow(0); // First row
        
        
        row.getCell(0).setText("Loyer pour la peridode : ");
        row.addNewTableCell().setText(loyer+"€");
        
        row = table.createRow();
        row.getCell(0).setText("Charge : "); 
        row.getCell(1).setText(charge+"€"); 
        
        row = table.createRow();
        row.getCell(0).setText("Total : "); 
        row.getCell(1).setText(loyer+charge+"€"); 
        
        XWPFParagraph paragraph4 = document.createParagraph();
        XWPFRun run4 = paragraph4.createRun();
        
        run4.addCarriageReturn();
        run4.addCarriageReturn();
        
        run4.setText("Le bailleur donne quittance au locataire de cette somme.");
        
        run4.addCarriageReturn();
        
        XWPFParagraph signature = document.createParagraph();
        signature.setAlignment(ParagraphAlignment.RIGHT);
        XWPFRun runSignature = signature.createRun();
        
        runSignature.setText("Signature bailleur : ");
        
        document.write(fileOut);
        } finally {
        modele.close();
        document.close();
        }
    }
	
	
    public void creerUneQuittanceLoyer(String idLocataire, String ladateQuittance, String leNomBailleur, String adressedubailleur,String nomduLocataire,String adressedulocataire,String adressedelaLocation, int leloyer, int lescharges) throws IOException {
    	String idLocat = idLocataire;
    	String dateQuittance = ladateQuittance;
    	String nomBailleur = leNomBailleur;
    	String addresseBailleur = adressedubailleur;
    	
    	String nomLocataire = nomduLocataire;
    	String adresseLocataire = adressedulocataire;
    	
    	String adresseLocation = adressedelaLocation;
    	
    	int loyer = leloyer;
    	int charge = lescharges;
    	
    	
        InputStream modele = new FileInputStream("modele.docx");
        
        XWPFDocument document = new XWPFDocument(modele);
        try(FileOutputStream fileOut = new FileOutputStream(new File("Quittance "+idLocat+" du "+dateQuittance+".docx"))) {
        XWPFParagraph titre = document.createParagraph();
        titre.setAlignment(ParagraphAlignment.CENTER);  
        XWPFRun run = titre.createRun();
        
        run.setText("Quittance de loyer du "+dateQuittance);
        
        XWPFParagraph infoBailleur = document.createParagraph();
        infoBailleur.setAlignment(ParagraphAlignment.LEFT);  
        
        XWPFRun runinfoBailleur = infoBailleur.createRun();
        
        runinfoBailleur.setText("Bailleur :");
        runinfoBailleur.addCarriageReturn();
        runinfoBailleur.setText(nomBailleur);
        runinfoBailleur.addCarriageReturn();
        runinfoBailleur.setText(addresseBailleur);
        
        XWPFParagraph infoLocataire = document.createParagraph();
        infoLocataire.setAlignment(ParagraphAlignment.RIGHT);  
        
        XWPFRun runInfoLocataire = infoLocataire.createRun();
        
        runInfoLocataire.setText("Locataire :");
        runInfoLocataire.addCarriageReturn();
        runInfoLocataire.setText(nomLocataire);
        runInfoLocataire.addCarriageReturn();
        runInfoLocataire.setText(adresseLocataire);
        
        XWPFParagraph infoLocation = document.createParagraph();
        infoLocation.setAlignment(ParagraphAlignment.CENTER);
        
        XWPFRun runinfoLocation = infoLocation.createRun();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.setText("Adresse location : " + adresseLocation);
        
        
        
        XWPFParagraph paragraph3 = document.createParagraph();
        XWPFRun run3 = paragraph3.createRun();
        run3.addCarriageReturn();
        run3.addCarriageReturn();
        
        run3.setText("Veuillez trouver ci-joint, l'ensemble des informations de la quittance.");
        run3.addCarriageReturn();
        
        XWPFTable table = document.createTable();
        XWPFTableRow row = table.getRow(0); // First row
        
        
        row.getCell(0).setText("Loyer pour la peridode : ");
        row.addNewTableCell().setText(loyer+"€");
        
        row = table.createRow();
        row.getCell(0).setText("Charge : "); 
        row.getCell(1).setText(charge+"€"); 
        
        row = table.createRow();
        row.getCell(0).setText("Total : "); 
        row.getCell(1).setText(loyer+charge+"€"); 
        
        XWPFParagraph paragraph4 = document.createParagraph();
        XWPFRun run4 = paragraph4.createRun();
        
        run4.addCarriageReturn();
        run4.addCarriageReturn();
        
        run4.setText("Le bailleur donne quittance au locataire de cette somme.");
        
        run4.addCarriageReturn();
        
        XWPFParagraph signature = document.createParagraph();
        signature.setAlignment(ParagraphAlignment.RIGHT);
        XWPFRun runSignature = signature.createRun();
        
        runSignature.setText("Signature bailleur : ");
        
        document.write(fileOut);
        } finally {
        modele.close();
        document.close();
        }
    }
}