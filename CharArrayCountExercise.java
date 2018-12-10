import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Jack
 */
public class CharArrayCount {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
      
        arraysCountCharArrayWParam("aabbddeefffffixxxx");
        

    } 
 
 
 
 //Given string, we have to construct output string based on the character count.
//Example :
    //a 			-----> a1
    //aaabbccaa 	-----> a3b2c2a2
    //AAbCCdddd 	-----> A2b1C2d4
    static void arraysCountCharArray() {

        //basic string(input)
        String s = "aaabbccaa";
        //The counter gives an int count of the number of characters 
        int counter = 1;
        //chop string (s) into char array.
        char[] sarr = s.toCharArray();
        //loop backwards
        for (int i = 0; i < sarr.length; i++) {
            //prevents out of bounds exception
            if (i != sarr.length - 1) {
                //if the next char is different to the current one
                if (sarr[i] != sarr[i + 1]) {
                    //print the current char and its current count int
                    System.out.println(Character.toString(sarr[i]) + counter);
                    counter = 1;
                } else {
                    //increase the counter for that char
                    counter++;
                }
            }
            else
                //print regardless i.e. print last char and count
            {
                System.out.println(Character.toString(sarr[i]) + counter);
            }
        }

    }
	
	static void arraysCountCharArrayWParam(String s) {
        
        //The counter gives an int count of the number of characters 
        int counter = 1;
        //chop string (s) into char array.
        char[] sarr = s.toCharArray();
        
        for (int i = 0; i < sarr.length; i++) {
            //prevents out of bounds exception
            if (i != sarr.length - 1) {
                //if the next char is different to the current one
                if (sarr[i] != sarr[i + 1]) {
                    //print the current char and its current count int
                    System.out.println(Character.toString(sarr[i]) + counter);
                    counter = 1;
                } else {
                    //increase the counter for that char
                    counter++;
                }
            }
            else
                //print regardless i.e. print last char and count
            {
                System.out.println(Character.toString(sarr[i]) + counter);
            }
        }

    }
  }