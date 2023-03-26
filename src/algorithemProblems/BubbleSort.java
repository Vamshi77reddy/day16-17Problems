package algorithemProblems;

import java.util.Arrays;

public class BubbleSort {

	 public static void main(String args[]) {

		    // create an array
		    int[] Array = { 9,6,5,7,4,8,3,6 };

			 
			    int size = Array.length;

			  
			   
			    for (int i = 0; i < size - 1; i++) {

			      for (int j = 0; j < size - i - 1; j++) {

			     
			          // compares the adjacent element
			          if (Array[j] > Array[j + 1]) {

			            // swap if left element is greater than right
			            int temp = Array[j];
			            Array[j] = Array[j + 1];
			            Array[j + 1] = temp;
			          
			          }}}
	 System.out.println("Sorted Array in Ascending Order:");

	    // call toString() of Arrays class
	    // to convert data into the string
	    System.out.println (Arrays.toString(Array));

			  
	 }
			 
			}
			