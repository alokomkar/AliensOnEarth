package com.alokomkar.aliensonearth.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import com.alokomkar.aliensonearth.auxillary.AuxilaryClass;
import com.alokomkar.aliensonearth.auxillary.ProjectConstants;
import com.alokomkar.aliensonearth.auxillary.ProjectMessages;
import com.alokomkar.aliensonearth.pojo.Alien;

/**
 *
 * @author Alok Omkar
 */
@SuppressWarnings("serial")
public class AlienRegistrationJFrame extends AbstractRegistrationFrame {


	/**
	 * Creates new form AlienRegistrationJFrame
	 */
	public AlienRegistrationJFrame() {
		super();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {

			/*PluginManager pluginManager = PluginManagerFactory.createPluginManager();
			pluginManager.addPluginsFrom(new File("C:/AlienPlugins/").toURI());*/


			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AlienRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AlienRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AlienRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AlienRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} 

		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				AlienRegistrationJFrame alienRegistrationJFrame = new AlienRegistrationJFrame();

				// Get the size of the screen
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

				// Determine the new location of the window
				int w = alienRegistrationJFrame.getSize().width;
				int h = alienRegistrationJFrame.getSize().height;
				int x = (dim.width-w)/2;
				int y = (dim.height-h)/2;

				// Move the window
				alienRegistrationJFrame.setLocation(x, y);

				alienRegistrationJFrame.setVisible(true);
			}
		});
	}


	protected void btnSubmitAction() {

		if( validateData() == true ) {

			Alien alien = new Alien();

			alien.setmBloodColor(mBloodColorTxtField.getText());
			alien.setmCodeName(mAlienCodeTxtField.getText());
			alien.setmHomePlanet(mHomePlanetTxtField.getText());
			alien.setmNoOfAntennas(Integer.parseInt(mNoOfAntennasTxtField.getText()));
			alien.setmNoOfLegs(Integer.parseInt(mNoOfLegsTxtField.getText()));

			writeAlienToFile( alien );

			mAlienList.add( alien );

			populateAlienJList( mAlienList );

		}

	}

	private void writeAlienToFile( Alien alien ) {

		String path = AuxilaryClass.getAlienListFilePath();
		File file = new File(path);
		FileWriter fileWriter;
		try {

			fileWriter = new FileWriter(file,true);
			BufferedWriter bufferFileWriter  = new BufferedWriter(fileWriter);
			fileWriter.append("\r\n"+alien.toString());
			bufferFileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private boolean validateData() {

		if( validateAlienFeature( mAlienCodeTxtField.getText(), ProjectMessages.EMPTY_ALIEN_CODE ) == false ) {
			mAlienCodeTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mBloodColorTxtField.getText(), ProjectMessages.EMPTY_BLOOD_COLOR ) == false ) {
			mBloodColorTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mHomePlanetTxtField.getText(), ProjectMessages.EMPTY_HOME_PLANET ) == false ) {
			mHomePlanetTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mNoOfAntennasTxtField.getText(), ProjectMessages.EMPTY_NO_OF_ANTENNA ) == false ) {
			mNoOfAntennasTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mNoOfLegsTxtField.getText(), ProjectMessages.EMPTY_NO_OF_LEGS ) == false ) {
			mNoOfLegsTxtField.requestFocus();
			return false;
		}

		return true;
	}


	private boolean validateAlienFeature( String alienFeature, String errorMessage ) {
		if( alienFeature.equals(null) || alienFeature.trim().length() == 0 ) {
			displayErrorDialog( errorMessage );
			return false;
		}
		return true;
	}

	private void displayErrorDialog(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage, null, JOptionPane.ERROR_MESSAGE);
	}

	@Override
	protected void populateAlienJList(ArrayList<Alien> alienList) {
		if( alienList.size() == 0 || alienList == null ) {
			return;
		}
		((DefaultListModel<String>)mAlienJList.getModel()).removeAllElements();
		Iterator<Alien> iterator = alienList.iterator();
		while( iterator.hasNext() ) {
			mStatusListModel.addElement(iterator.next().toString());	
		}
		mAlienJList.updateUI();
	}

	protected void btnPrintAction() {

		int option = mReportFormatComboBox.getSelectedIndex();
		if( mReportList == null || mReportList.size() == 0 ) {
			mReportList = populateReportList();
		}

		String reportType = null;

		if( option != 0 ) {
			reportType = mReportList.get( (option - 1) );
		}


		Class<?> classObject = null;
		@SuppressWarnings("rawtypes")
		Constructor constructor = null;
		Object object = null;
		try {

			classObject = Class.forName( ProjectConstants.KEY_REPORT_PACKAGE_NAME + reportType );
			constructor = classObject.getConstructor(null);
			object = constructor.newInstance();

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(this, "Class not found", null, JOptionPane.ERROR_MESSAGE);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		try {
			Method method = classObject.getMethod("generateReport", null);
			Object returnValue = method.invoke(object, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}



	}

	@SuppressWarnings("resource")
	private ArrayList<String> populateReportList() {

		//TODO To read all available files in a specific directory

		ArrayList<String> reportTypes = new ArrayList<String>();
		File folder = new File("C:/plugins");
		File[] listOfFiles = folder.listFiles();

		if( listOfFiles.length > 0 ) {
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println(listOfFiles[i].getName());
					reportTypes.add(listOfFiles[i].getName().replace(".class", "").trim());
				} 
			}
			return reportTypes;
				
		}
		/*	File file = new File(AuxilaryClass.getConfigFileDir()+ProjectConstants.KEY_SYSTEM_CONFIG_FILE);
		Scanner in;
		try {
			in = new Scanner(file);
			while (in.hasNextLine()){
				reportTypes.add(in.nextLine());
			}
			return reportTypes;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		return null;
	}

	protected void btnResetAction() {

		mBloodColorTxtField.setText("");
		mAlienCodeTxtField.setText("");
		mHomePlanetTxtField.setText("");
		mNoOfAntennasTxtField.setText("");
		mNoOfLegsTxtField.setText("");

	}

	@Override
	protected void ButtonActionFunctions(ActionEvent event) {

		Object eventObject = event.getSource();
		if ( eventObject == mSubmitBtn ) { 
			btnSubmitAction();
		}
		else if( eventObject == mResetBtn ) {
			btnResetAction();
		}
		else if( eventObject == mPrintBtn ) {
			btnPrintAction();
		}

	}


}
