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
public class TimeConverter {

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        timeConversion("07:09:50PM");
        

    } 
static String timeConversion(String s) {
        /*
         * Convert analog time to digital.Write your code here. Sample input 07:05:45PM
         */
        
       String a = s.substring(0,2);
       String b = s.substring(3, 5);
       String c = s.substring(6, 8);
        
        int hh = Integer.parseInt(a);
        int mm = Integer.parseInt(b);
        int ss = Integer.parseInt(c);
        
        
        
        if ("PM".equals(s.substring(8,10))){
            if(hh < 12){
            hh = hh+12;
            if (hh == 24){
                hh = 0;
                }
            }
        }
        
        if ("AM".equals(s.substring(8,10))){
            if (hh == 12){
                hh = 0;
            }
        }
       
        
        
                
        String formattedhhs = String.format("%02d", hh);
        String formattedmms = String.format("%02d", mm);
        String formattedsss = String.format("%02d", ss);
        
        String result = formattedhhs + ":" + formattedmms + ":" + formattedsss;
        
        //Printing for test purposes only
        System.out.println(result);
        
        return result;

    }
    
    static void printCheck(String s){
        
        System.out.println(s.substring(8,10));
    }
	
}