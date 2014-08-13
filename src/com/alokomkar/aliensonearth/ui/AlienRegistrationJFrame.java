package com.alokomkar.aliensonearth.ui;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.alokomkar.alienonearth.auxillary.AlienListRetriever;
import com.alokomkar.alienonearth.auxillary.ErrorMessages;
import com.alokomkar.alienonearth.auxillary.ProjectConstants;
import com.alokomkar.aliensonearth.pojo.Alien;

/**
 *
 * @author Alok Omkar
 */
@SuppressWarnings("serial")
public class AlienRegistrationJFrame extends javax.swing.JFrame {

	private ArrayList<Alien> mAlienList = null;
	/**
	 * Creates new form AlienRegistrationJFrame
	 */
	public AlienRegistrationJFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		mAlienCodeLbl = new javax.swing.JLabel();
		mBloodColorLbl = new javax.swing.JLabel();
		mNoOfAntennasLbl = new javax.swing.JLabel();
		mNoOfLegsLbl = new javax.swing.JLabel();
		mHomePlanetLbl = new javax.swing.JLabel();
		mConsoltTitleLbl = new javax.swing.JLabel();
		mAlienCodeTxtField = new javax.swing.JTextField();
		mBloodColorTxtField = new javax.swing.JTextField();
		mNoOfAntennasTxtField = new javax.swing.JTextField();
		mNoOfLegsTxtField = new javax.swing.JTextField();
		mHomePlanetTxtField = new javax.swing.JTextField();
		mSubmitBtn = new javax.swing.JButton();
		mResetBtn = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		mAlienJList = new javax.swing.JList<String>();
		mReportFormatComboBox = new JComboBox<String>();
		mPrintBtn = new javax.swing.JButton();
		mStatusListModel = new DefaultListModel<String>();
		mAlienList = new ArrayList<Alien>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		mAlienCodeLbl.setText(Alien.LABEL_CODE_NAME);

		mBloodColorLbl.setText(Alien.LABEL_BLOOD_COLOR);

		mNoOfAntennasLbl.setText(Alien.LABEL_NO_OF_ANTENNAS);

		mNoOfLegsLbl.setText(Alien.LABEL_NO_OF_LEGS);

		mHomePlanetLbl.setText(Alien.LABEL_HOME_PLANET);

		mConsoltTitleLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
		mConsoltTitleLbl.setText("Alien Registration Console");

		mSubmitBtn.setText("Submit");
		mSubmitBtn.addActionListener( mButtonActionListener );

		mResetBtn.setText("Reset");
		mResetBtn.addActionListener( mButtonActionListener );

		mReportFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Select","Plain Text", "PDF" }));

		mReportFormatComboBox.addActionListener( mButtonActionListener );
		mAlienJList.setModel(mStatusListModel);
		jScrollPane1.setViewportView(mAlienJList);

		mPrintBtn.setText("Print");
		mPrintBtn.addActionListener( mButtonActionListener );

		mAlienList = AlienListRetriever.readAlienListfromFile();

		if( mAlienList.size() > 0 && mAlienList != null ) {
			populateAlienJList(mAlienList);
		}

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jScrollPane1))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(jPanel1Layout.createSequentialGroup()
																				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(mAlienCodeLbl)
																						.addComponent(mBloodColorLbl))
																						.addGap(39, 39, 39)
																						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																								.addComponent(mBloodColorTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
																								.addComponent(mAlienCodeTxtField)))
																								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																																.addComponent(mNoOfAntennasLbl)
																																.addGap(18, 18, 18))
																																.addGroup(jPanel1Layout.createSequentialGroup()
																																		.addComponent(mNoOfLegsLbl)
																																		.addGap(42, 42, 42)))
																																		.addGroup(jPanel1Layout.createSequentialGroup()
																																				.addComponent(mHomePlanetLbl)
																																				.addGap(33, 33, 33)))
																																				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																																						.addGroup(jPanel1Layout.createSequentialGroup()
																																								.addComponent(mSubmitBtn)
																																								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																								.addComponent(mResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
																																								.addComponent(mNoOfAntennasTxtField)
																																								.addComponent(mNoOfLegsTxtField)
																																								.addComponent(mHomePlanetTxtField)))))
																																								.addGroup(jPanel1Layout.createSequentialGroup()
																																										.addContainerGap()
																																										.addComponent(mReportFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(mPrintBtn))
																																										.addGroup(jPanel1Layout.createSequentialGroup()
																																												.addGap(72, 72, 72)
																																												.addComponent(mConsoltTitleLbl)))
																																												.addGap(0, 52, Short.MAX_VALUE)))
																																												.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(15, 15, 15)
						.addComponent(mConsoltTitleLbl)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(mAlienCodeLbl)
								.addComponent(mAlienCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(mBloodColorLbl)
										.addComponent(mBloodColorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(mNoOfAntennasLbl)
												.addComponent(mNoOfAntennasTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(mNoOfLegsLbl)
														.addComponent(mNoOfLegsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(mHomePlanetLbl)
																.addComponent(mHomePlanetTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18, 18)
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(mSubmitBtn)
																		.addComponent(mResetBtn))
																		.addGap(18, 18, 18)
																		.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(mReportFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(mPrintBtn))
																				.addContainerGap(12, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		pack();
	}// </editor-fold>                        



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

	ActionListener mButtonActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
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
	};

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

		String path = "C:\\Aliens.txt";
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

		if( validateAlienFeature( mAlienCodeTxtField.getText(), ErrorMessages.EMPTY_ALIEN_CODE ) == false ) {
			mAlienCodeTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mBloodColorTxtField.getText(), ErrorMessages.EMPTY_BLOOD_COLOR ) == false ) {
			mBloodColorTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mHomePlanetTxtField.getText(), ErrorMessages.EMPTY_HOME_PLANET ) == false ) {
			mHomePlanetTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mNoOfAntennasTxtField.getText(), ErrorMessages.EMPTY_NO_OF_ANTENNA ) == false ) {
			mNoOfAntennasTxtField.requestFocus();
			return false;
		}
		else if( validateAlienFeature( mNoOfLegsTxtField.getText(), ErrorMessages.EMPTY_NO_OF_LEGS ) == false ) {
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

	private void populateAlienJList(ArrayList<Alien> alienList) {
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

		if( option == 1 ) {
			try {
				Desktop.getDesktop().open(new File(ProjectConstants.KEY_TEXT_FILE_PATH));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		String reportType = mReportList.get(0);

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

		File file = new File(ProjectConstants.KEY_SYSTEM_CONFIG_DATA_PATH);
		ArrayList<String> reportTypes = new ArrayList<String>();
		Scanner in;
		try {
			in = new Scanner(file);
			while (in.hasNextLine()){
				reportTypes.add(in.nextLine());
			}
			return reportTypes;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void btnResetAction() {

		mBloodColorTxtField.setText("");
		mAlienCodeTxtField.setText("");
		mHomePlanetTxtField.setText("");
		mNoOfAntennasTxtField.setText("");
		mNoOfLegsTxtField.setText("");

	}

	private ArrayList<String> mReportList;
	// Variables declaration - do not modify                     
	private javax.swing.JLabel mNoOfLegsLbl;
	private javax.swing.JLabel mConsoltTitleLbl;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JList<String> mAlienJList;
	public DefaultListModel<String> mStatusListModel;
	private javax.swing.JLabel mAlienCodeLbl;
	private javax.swing.JTextField mAlienCodeTxtField;
	private javax.swing.JLabel mBloodColorLbl;
	private javax.swing.JTextField mBloodColorTxtField;
	private javax.swing.JLabel mHomePlanetLbl;
	private javax.swing.JTextField mHomePlanetTxtField;
	private javax.swing.JLabel mNoOfAntennasLbl;
	private javax.swing.JTextField mNoOfAntennasTxtField;
	private javax.swing.JTextField mNoOfLegsTxtField;
	private javax.swing.JButton mPrintBtn;
	private JComboBox<String> mReportFormatComboBox;
	private javax.swing.JButton mResetBtn;
	private javax.swing.JButton mSubmitBtn;
	// End of variables declaration                   

}
