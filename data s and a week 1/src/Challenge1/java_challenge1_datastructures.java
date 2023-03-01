package Challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_challenge1_datastructures {

	public static ArrayList<String> takeInput() {
		// input scanner 
		Scanner input = new Scanner(System.in);
        
		// this bit is to  initiate an array and save the elements in the array
		ArrayList<String> listOfLines = new ArrayList<String>(4);
		System.out.println("input enter 5 lines of strings: ");
		while (listOfLines.size() < 5) {
			listOfLines.add(input.nextLine());
		}

		input.close();
		return listOfLines;
	}

	// calling this method on each element in the array
	public static String reverseTheLine(String str) {

		
		// convert the string to char array
		char[] in = str.toCharArray();
		
		int beginIndex = 0;
		
		int end = in.length - 1;
		char temp;
		while (end > beginIndex) {
			temp = in[beginIndex];
			in[beginIndex] = in[end];
			in[end] = temp;
			end--;
			beginIndex++;
		}
		// convert reversed characters into string 
		return new String(in);

	}

	public static void printLinesInReverse(ArrayList<String> al) {
		List<String> reverseValues = new ArrayList<String>();
		
		// to store each reversed line into the new array
		for (String ls : al) {
			reverseValues.add(reverseTheLine(ls));

		}
         
		System.out.println("\nModified(reversed) lines mainting same order: \n");
		
		// printout our new array
		for (String str : reverseValues) {
			System.out.println(str);
		}

	}

	public static void main(String args[]) {
		
		// calling the method
		printLinesInReverse(takeInput());

	}

}