package projekt;

import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {

//	String Schere = "Schere";
//	String Stein = "Stein";
//	String Papier = "Papier";
	
	int comSpielStand; 
	int spieSpielStand; 

	boolean spielenWir = false;

	Scanner sc = new Scanner(System.in);
	String[] StrArray = new String[3];

	public SchereSteinPapier() {

		StrArray[0] = "Schere";
		StrArray[1] = "Stein";
		StrArray[2] = "Papier";
		
		comSpielStand = 0; 
		spieSpielStand = 0; 

		System.out.println("Hey willst du mit mir eine Runde Schere, Stein Papier spielen?");
		System.out.println("Okey, let's go:");

		spielen();

	}

	public void spielen() {

		spielenWir = true;

		while (spielenWir == true) {

			if (!sc.hasNext("Stop")) {

				Random ran = new Random();

				int nxt = ran.nextInt(2);

				System.out.println(nxt);

			}

			else if (sc.hasNext("Stop")) {
				spielenWir = false;
				sc.close();
				System.out.println("Supper! Es war sehr schön mit dir zu spielen!");

			}

		}

	}

}
