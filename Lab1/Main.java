package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		System.out.println(parags());
		System.out.println(words());
		System.out.println(lines());
		System.out.println(chars());
		
	}

	
	
	
	
	
	
	public static String parags(){
		int countParags = 0;
		File file = new File("C:\\Users\\AdminGaming\\eclipse-workspace\\Crypto\\src\\file.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){
				String parags = scanner.nextLine();
				countParags++;

				
				//System.out.println(parags);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return "[ The Number Of Paragraphs Is : "  + countParags + "]" ;
		
		
	}
	
	
	
	public static String words(){
		int countwords = 0;
		File file = new File("C:\\Users\\AdminGaming\\eclipse-workspace\\Crypto\\src\\file.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				String word = scanner.next();
				
				//System.out.println(word);
				countwords++;
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return "[ The Number Of Words Is : "  + countwords + "]" ;
		
		
		
	}
	
	
	
	public static String lines(){
		int countLines = 0;
		File file = new File("C:\\Users\\AdminGaming\\eclipse-workspace\\Crypto\\src\\file.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				String[] lines = line.split("\\.");
				
				for (int i=0; i< lines.length; i++){
					//System.out.println(lines[i].trim());
					countLines++;
				}
		
			}

			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		//return countParags;
		return "[ The Number Of Lines Is : "  + countLines + "]" ;
		
		
	}
	
	
	
	public static String chars() {
		double countChars = 0;
		int countSpaces = 0;
		int countCommas = 0;
		double countA = 0;
		double countB =0;

		File file = new File("C:\\Users\\AdminGaming\\eclipse-workspace\\Crypto\\src\\file.txt");

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				for (int i = 0; i < line.length(); i++) {
					char currentChar = line.charAt(i);
					
					if (currentChar == ' ') { 
						countSpaces++;
					} else if (currentChar == ',') { 
						countCommas++;
					} else if (currentChar == 'a' || currentChar == 'A' ) {
						countA++;
					} else if (currentChar == 'b' || currentChar == 'B')
						countB++;
					countChars++;
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		double percA = (countA/countChars)*100;
		double percB = (countB/countChars)*100;
		
		return "[ The Number Of Chars Is : " + countChars + " ]\n" +
			   "[ The Number Of Spaces Is : " + countSpaces + " ]\n" +
			   "[ The Number Of Commas Is : " + countCommas + " ]\n" +
			   "[ The Percentage  of A Is : " + percA + "% ]\n" +
			   "[ The Percentage  of A Is : " + percB + "% ]";
	}
		
		
		
	
	
	
	
}
