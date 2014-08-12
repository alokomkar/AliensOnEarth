package com.alokomkar.alienonearth.auxillary;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.alokomkar.aliensonearth.pojo.Alien;


public class AlienListRetriever {

	public static ArrayList<Alien> readAlienListfromFile() {

		ArrayList<Alien> aliens = new ArrayList<Alien>();
		Alien alien = null;

		String file = "C:/Aliens.txt";
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader( file ));
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
		return null;


	}

}
