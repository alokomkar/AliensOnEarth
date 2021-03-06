package com.alokomkar.aliensonearth.report;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import com.alokomkar.aliensonearth.auxillary.AuxilaryClass;
import com.alokomkar.aliensonearth.auxillary.ProjectConstants;
import com.alokomkar.aliensonearth.auxillary.ProjectMessages;
import com.alokomkar.aliensonearth.plugin.ReportPluginInterface;
import com.alokomkar.aliensonearth.pojo.Alien;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author Alok Omkar
 */
@PluginImplementation
public class AlienRegistrationLogReportDialog implements ReportPluginInterface {

	private final String FILE_NAME;

	private String filePath;
	private ArrayList<Alien> mAlienArrayList;
	
	private static String KEY_REPORT_GENERATED_BY = "Generated by : Alok Omkar";
	private static String KEY_PAGE_TITLE = "Alien Registration Log";
	private static String KEY_PAGE_SUBJECT = "Alien Registration Log";

	public AlienRegistrationLogReportDialog( ) {

		this.FILE_NAME = ProjectConstants.KEY_PDF_REPORT_FILE_NAME;
		this.filePath = ProjectConstants.KEY_REPORT_PATH;
		this.mAlienArrayList = AuxilaryClass.readAlienListfromFile( AuxilaryClass.getAlienListFilePath() );
		
	}

	
	public void showReportCreationStatusDiaolg( String filePath ){

		if(filePath == null)
		{
			JOptionPane.showMessageDialog(null, ProjectMessages.REPORT_NOT_GENERATED, null, JOptionPane.ERROR_MESSAGE);

		}
		else {

			JOptionPane.showMessageDialog(null, ProjectMessages.REPORT_GENERATION_SUCCESS, null, JOptionPane.INFORMATION_MESSAGE);


			try {

				if( Desktop.isDesktopSupported() == true )
					Desktop.getDesktop().open( new File(filePath));
				else
					JOptionPane.showMessageDialog(null, ProjectMessages.REPORT_OPEN_FILE_PATH + filePath, null, JOptionPane.ERROR_MESSAGE);

			} catch (IOException ex) {

				JOptionPane.showMessageDialog(null, ProjectMessages.REPORT_OPEN_ERROR, null, JOptionPane.ERROR_MESSAGE);

			}

		}
	}

	@Override
	public void generateReport() {

		String fileName = new AlienRegistrationlogPdfReport().generatePage( filePath + FILE_NAME );
		showReportCreationStatusDiaolg(fileName);
	}

	private class AlienRegistrationlogPdfReport extends AbstractPdfReport {

		@Override
		public void addContent(Document document) throws DocumentException{

			if( mAlienArrayList == null || mAlienArrayList.size() == 0 ) {
				return;
			}

			if( mAlienArrayList != null ){

				String[] cols = Alien.getColumns();
				PdfPTable table = new PdfPTable(cols.length);

				table.setWidthPercentage(100);
				table.setSpacingBefore(5);
				float[] columnWidths = {20f, 20f,25f,20f,25f} ;
				table.setWidths(columnWidths);

				addTableColumns(cols, table);
				table.setHeaderRows(1);

				for(Alien alien : mAlienArrayList ){

					if(alien == null)
						continue;

					table.addCell(new Phrase(String.valueOf(alien.getmCodeName()),smallerFont));
					table.addCell(new Phrase(String.valueOf(alien.getmBloodColor()),smallerFont));
					table.addCell(new Phrase(String.valueOf(alien.getmNoOfAntennas()),smallerFont));
					table.addCell(new Phrase(String.valueOf(alien.getmNoOfLegs()),smallerFont));
					table.addCell(new Phrase(String.valueOf(alien.getmHomePlanet()),smallerFont));

				}

				document.add(table);

			}
		}


		@Override
		public void addPageHeaderFooter(int pageNo, PdfWriter writer, Document document, Rectangle rect) {

			ColumnText.showTextAligned(writer.getDirectContent(),
					Element.ALIGN_CENTER, new Phrase(getPageTitle(),normalFont),
					(rect.getWidth()) / 2, rect.getTop() - 15, 0);

			ColumnText.showTextAligned(writer.getDirectContent(),
					Element.ALIGN_RIGHT, new Phrase(String.format(" Page %d", pageNo),smallerFont),
					(rect.getWidth()) - 10, rect.getBottom() + 20, 0);

			ColumnText.showTextAligned(writer.getDirectContent(),
					Element.ALIGN_CENTER, new Phrase(
							String.format
							( KEY_REPORT_GENERATED_BY ), smallerFont ),	
							(rect.getWidth()) / 2, rect.getBottom() + 20, 0);

		}

		@Override
		public String getPageTitle() {
			return KEY_PAGE_TITLE;
		}

		@Override
		public String getPageSubject() {
			return KEY_PAGE_SUBJECT;
		}

	}




}