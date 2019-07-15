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
public class ArrayRotate {

    /**
     * @param args the command line arguments
     */
    //Given {1, 2, 3, 4, 5}
    //Rotate each value 4 to the left
    // 5 -> 1
    
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        int n = 3;
        arrayRotationParam(n);
        

    } 
 
 
 
 static void arrayRotationLeft() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //result array
        int[] outarray = new int[arr.length];
           //looping backwards
        for (int i = arr.length - 1; i >= 0; i--) {


            //get the target
            int target = i - 4;

            //but what happens when we get 3. code below creates a wrapping effect.
            if (target < 0) {
                target = target + arr.length;
            }
            System.out.println(target);

            outarray[target] = arr[i];

        }

		for (int i = 0; i < outarray.length; i++) {
		    System.out.println("");
		    System.out.println(outarray[i]);
		}
		
	}
	
	//array rotation to the left with integer parameter
	
    // Array rotate with input array and target int.
    static int[] rotLeft(int[] a, int d) {
    
        //Create result array, which will be the length of input array
        int[] outArray = new int [a.length];
	    
        //Looping backwards because we are rotating to the left.
        for(int i  = a.length-1; i >= 0; i--){

            //get the target
            int target = i - d;

            //Wrapping effect to avoid Nullpointers
            if(target < 0){
                target += a.length;
            }

            outArray[target] = a[i];
        }

        //print outArray to test
        // for(int i = 0; i < outArray.length; i++){
        //     System.out.println(outArray[i]);
        // }

        return outArray;      
    }

  }
