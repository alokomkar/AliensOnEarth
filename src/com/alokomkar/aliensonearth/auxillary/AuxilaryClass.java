package com.alokomkar.aliensonearth.auxillary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.alokomkar.aliensonearth.pojo.Alien;


public class AuxilaryClass {

	public static ArrayList<Alien> readAlienListfromFile( String fileName ) {

		ArrayList<Alien> aliens = new ArrayList<Alien>();
		Alien alien = null;

		
		BufferedReader bufferedReader;
		File file = new File(fileName);
		try {
			if( file.exists() == false ) {
				return aliens;
			}

			bufferedReader = new BufferedReader( new FileReader( fileName ));
			String line;
			int index = 0;
			while ((line = bufferedReader.readLine()) != null) {
				String alienFeatures[] = line.split(",");
				if( alienFeatures.length == 5 ) {
					alien = new Alien();
					alien.setmCodeName(alienFeatures[index++]);
					alien.setmBloodColor(alienFeatures[index++]);
					alien.setmNoOfAntennas(Integer.parseInt(alienFeatures[index++]));
					alien.setmNoOfLegs(Integer.parseInt(alienFeatures[index++]));
					alien.setmHomePlanet(alienFeatures[index++]);
					aliens.add(alien);
					index = 0;
				}
			}
			bufferedReader.close();
			return aliens;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aliens;


	}

	public static String getAlienListFilePath( ) {
		
		String finalfile = "";
		String workingDir = System.getProperty("user.dir");

		String your_os = System.getProperty("os.name").toLowerCase();
		if(your_os.indexOf("win") >= 0){
			finalfile = workingDir + "\\" + ProjectConstants.KEY_FILE_NAME_WINDOWS;
		}else if(your_os.indexOf( "nix") >=0 || your_os.indexOf( "nux") >=0){
			finalfile = workingDir + "/" + ProjectConstants.KEY_FILE_NAME_UNIX;
		}else{
			finalfile = workingDir + "{others}" + ProjectConstants.KEY_FILE_NAME_UNIX;
		}
		return finalfile;
	}
	
	public static String getConfigFileDir( ) {
		String finalfile = "";
		String workingDir = System.getProperty("user.dir");

		String your_os = System.getProperty("os.name").toLowerCase();
		if(your_os.indexOf("win") >= 0){
			finalfile = workingDir + "\\";
		}else if(your_os.indexOf( "nix") >=0 || your_os.indexOf( "nux") >=0){
			finalfile = workingDir + "/";
		}else{
			finalfile = workingDir + "{others}";
		}
		return finalfile;
		
	}

}
