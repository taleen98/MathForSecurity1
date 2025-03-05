package package1;

import java.util.ArrayList;

public class StringRev {

	
	public static void main(String[] args) {
		String word= "Taleen";
		//System.out.print(word.length());
		System.out.print(StringRev(word));
		
		
	}
	
	
	
	public static String StringRev(String word) {
		String revWord = null;
		for (int i=word.length() - 1; i >=0 ; i--) {
			revWord += word.charAt(i);
		}
		return revWord;
		
	}
	
	
//	public static String StringRev2(String word) {
//		ArrayList<String>() revWord = new ArrayList<>();
//		String[] revWord = new String[word.length() - 1];
//		for (int i=word.length() - 1; i >=0 ; i--) {
//			revWord[i] += word.charAt(i);
//		}
//		//return revWord;
		
//	}
	
}
