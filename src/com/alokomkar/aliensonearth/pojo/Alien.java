package com.alokomkar.aliensonearth.pojo;

public class Alien {

	String mCodeName = "";
	String mBloodColor = "";
	int mNoOfAntennas = 0;
	int mNoOfLegs = 0;
	String mHomePlanet = "";
	
	public static String LABEL_CODE_NAME = "Alient Code";
	public static String LABEL_BLOOD_COLOR = "Blood Color";
	public static String LABEL_NO_OF_ANTENNAS = "No of Antennas";
	public static String LABEL_NO_OF_LEGS = "No of Legs";
	public static String LABEL_HOME_PLANET = "Home Planet";
	
	/**
	 * @return the mCodeName
	 */
	public String getmCodeName() {
		return mCodeName;
	}
	/**
	 * @param mCodeName the mCodeName to set
	 */
	public void setmCodeName(String mCodeName) {
		this.mCodeName = mCodeName;
	}
	/**
	 * @return the mBloodColor
	 */
	public String getmBloodColor() {
		return mBloodColor;
	}
	/**
	 * @param mBloodColor the mBloodColor to set
	 */
	public void setmBloodColor(String mBloodColor) {
		this.mBloodColor = mBloodColor;
	}
	/**
	 * @return the mNoOfAntennas
	 */
	public int getmNoOfAntennas() {
		return mNoOfAntennas;
	}
	/**
	 * @param mNoOfAntennas the mNoOfAntennas to set
	 */
	public void setmNoOfAntennas(int mNoOfAntennas) {
		this.mNoOfAntennas = mNoOfAntennas;
	}
	/**
	 * @return the mNoOfLegs
	 */
	public int getmNoOfLegs() {
		return mNoOfLegs;
	}
	/**
	 * @param mNoOfLegs the mNoOfLegs to set
	 */
	public void setmNoOfLegs(int mNoOfLegs) {
		this.mNoOfLegs = mNoOfLegs;
	}
	/**
	 * @return the mHomePlanet
	 */
	public String getmHomePlanet() {
		return mHomePlanet;
	}
	/**
	 * @param mHomePlanet the mHomePlanet to set
	 */
	public void setmHomePlanet(String mHomePlanet) {
		this.mHomePlanet = mHomePlanet;
	}
	
	/**
	 * @param mCodeName
	 * @param mBloodColor
	 * @param mNoOfAntennas
	 * @param mNoOfLegs
	 * @param mHomePlanet
	 */
	public Alien(String mCodeName, String mBloodColor, int mNoOfAntennas,
			int mNoOfLegs, String mHomePlanet) {
		super();
		this.mCodeName = mCodeName;
		this.mBloodColor = mBloodColor;
		this.mNoOfAntennas = mNoOfAntennas;
		this.mNoOfLegs = mNoOfLegs;
		this.mHomePlanet = mHomePlanet;
	}
	/**
	 * Default Constructor
	 */
	public Alien() {
		
		super();
		this.mCodeName = "";
		this.mBloodColor = "";
		this.mNoOfAntennas = 0;
		this.mNoOfLegs = 0;
		this.mHomePlanet = "";
		
	}
	
	public static String[] getColumns() {
        
        String[] cols = { LABEL_CODE_NAME, LABEL_BLOOD_COLOR, LABEL_NO_OF_ANTENNAS, LABEL_NO_OF_LEGS, LABEL_HOME_PLANET };
	    return cols;
	    
    }
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return mCodeName + "," + mBloodColor
				+ "," + mNoOfAntennas + ","
				+ mNoOfLegs + "," + mHomePlanet;
	}
	
	
	
}
