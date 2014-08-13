package com.alokomkar.aliensonearth.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

import com.alokomkar.aliensonearth.auxillary.AuxilaryClass;
import com.alokomkar.aliensonearth.pojo.Alien;

@SuppressWarnings("serial")
public abstract class AbstractRegistrationFrame extends javax.swing.JFrame {

	protected AbstractRegistrationFrame() {
		initComponents();
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * @param mButtonActionListener 
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	public void initComponents( ) {

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

		mReportFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Select","PDF", "Plain Text" }));

		mReportFormatComboBox.addActionListener( mButtonActionListener );
		mAlienJList.setModel(mStatusListModel);
		jScrollPane1.setViewportView(mAlienJList);

		mPrintBtn.setText("Print");
		mPrintBtn.addActionListener( mButtonActionListener );

		mAlienList = AuxilaryClass.readAlienListfromFile(AuxilaryClass.getAlienListFilePath());

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

	protected ActionListener mButtonActionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			ButtonActionFunctions(event);
		}

	};
	
	protected abstract void ButtonActionFunctions(ActionEvent arg0); 

	protected abstract void populateAlienJList(ArrayList<Alien> alienList); 

	protected ArrayList<String> mReportList;
	// Variables declaration - do not modify                     
	protected javax.swing.JLabel mNoOfLegsLbl;
	protected javax.swing.JLabel mConsoltTitleLbl;
	protected javax.swing.JPanel jPanel1;
	protected javax.swing.JScrollPane jScrollPane1;
	protected javax.swing.JList<String> mAlienJList;
	public DefaultListModel<String> mStatusListModel;
	protected javax.swing.JLabel mAlienCodeLbl;
	protected javax.swing.JTextField mAlienCodeTxtField;
	protected javax.swing.JLabel mBloodColorLbl;
	protected javax.swing.JTextField mBloodColorTxtField;
	protected javax.swing.JLabel mHomePlanetLbl;
	protected javax.swing.JTextField mHomePlanetTxtField;
	protected javax.swing.JLabel mNoOfAntennasLbl;
	protected javax.swing.JTextField mNoOfAntennasTxtField;
	protected javax.swing.JTextField mNoOfLegsTxtField;
	protected javax.swing.JButton mPrintBtn;
	protected JComboBox<String> mReportFormatComboBox;
	protected javax.swing.JButton mResetBtn;
	protected javax.swing.JButton mSubmitBtn;
	// End of variables declaration
	
	protected ArrayList<Alien> mAlienList = null;
	

}
