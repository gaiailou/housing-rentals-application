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




public class creerQuittanceLoyer{
	
	
	
    public static void main(String[] args) throws IOException {
    	String dateQuittance = "12-07-2012";
    	String nomBailleur = "Mr.Milan";
    	String addresseBailleur = "4 rue de la forge, 31000 Toulouse";
    	
    	String nomLocataire = "Mr.Jack";
    	String addresseLocataire = "3 rue de l'arnaque, 31000 Toulouse";
    	
    	String addresseLocation = "1 rue des anciens silos, 31600 Muret";
    	
    	int loyer = 452;
    	int charge = 89;
    	
    	
        InputStream modele = new FileInputStream("modele.docx");
        
        XWPFDocument document = new XWPFDocument(modele);
        try(FileOutputStream fileOut = new FileOutputStream(new File("Quittance du "+dateQuittance+".docx"))) {
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
        runInfoLocataire.setText(addresseLocataire);
        
        XWPFParagraph infoLocation = document.createParagraph();
        infoLocation.setAlignment(ParagraphAlignment.CENTER);
        
        XWPFRun runinfoLocation = infoLocation.createRun();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.addCarriageReturn();
        runinfoLocation.setText("Adresse location : " + addresseLocation);
        
        
        
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