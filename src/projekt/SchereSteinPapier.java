package projekt;

import java.util.Scanner;

public class SchereSteinPapier {
	
	String Schere = "Schere";
	String Stein = "Stein";
	String Papier = "Papier";
	
	boolean spielenWir = false;
	
	Scanner sc = new Scanner(System.in);
	String[] StrArray = new String[3];
	
	public SchereSteinPapier() {
		
		StrArray[0] = "Schere"; 
		StrArray[1] = "Stein";  
		StrArray[2] = "Papier"; 
		
		System.out.println("Hey willst du mit mir eine Runde Schere, Stein Papier spielen?");
		System.out.println("Okey, let's go:");
		
		spielen();
		
	}
	
	
	public void spielen() {
		
		spielenWir = true;
		
		while(spielenWir == true) {
			
			
			
		}
		
	}
	
	

}
