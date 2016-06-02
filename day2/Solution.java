
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

	int entered_int = scan.nextInt();

            double entered_double = scan.nextFloat();


	scan.nextLine(); // So it consules extra \n 
            String entered_string = scan.nextLine();
              
                
        /* Print the sum of both integer variables on a new line. */

        System.out.println(i+entered_int);

        /* Print the sum of the double variables on a new line. */
        
        System.out.printf("%.1f",d+entered_double);

	System.out.println(); //As printf used above will now leave to next line

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+entered_string);scan.close();
    }
}
