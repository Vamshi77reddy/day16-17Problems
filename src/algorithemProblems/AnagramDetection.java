package algorithemProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	    private void anagram() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the String 1 : ");
	        String S1 = scanner.nextLine();
	        System.out.print("Enter the String 2 : ");
	        String S2 = scanner.nextLine();
	//String to Array:
	        if (S1.length() == S2.length()) {
	            char[] arrayS1 = S1.toCharArray();
	            char[] arrayS2 = S2.toCharArray();
	//Sorting:
	            Arrays.sort(arrayS1);
	            Arrays.sort(arrayS2);

	            String sortedString1 = new String(arrayS1);

	            String sortedString2 = new String(arrayS2);

	            if (sortedString1.equals(sortedString2))
	                System.out.println("Two Strings are Anagram.");
	            else
	                System.out.println("Strings are NOT Anagram");
	        }
	        else
	            System.out.println("Not an Anagram");
	    }

	    public static void main(String[] args) {

	        AnagramDetection anagramDetection = new AnagramDetection();
	        anagramDetection.anagram();
	    }
	}

