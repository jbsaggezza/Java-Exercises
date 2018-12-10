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
public class BracketCheck {

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        isBalanced("{[([])]}");
        

    } 

/* A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.

Function Description

Complete the function isBalanced in the editor below. It must return a string: YES if the sequence is balanced or NO if it is not.

isBalanced has the following parameter(s):

s: a string of brackets
Input Format

The first line contains a single integer , the number of strings. 
Each of the next  lines contains a single string , a sequence of brackets.

Constraints

, where  is the length of the sequence.
All characters in the sequences ∈ { {, }, (, ), [, ] }.
Output Format

For each string, return YES or NO.

Sample Input

4
{[()]}
{[(])}
{{[[(())]]}}
[({}

Sample Output

YES
NO
YES
NO

Explanation

The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
The string {[(])} is not balanced because the brackets enclosed by the matched pair { and } are not balanced: [(]).
The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
The string [({} in not balanced, because there are no matching braces for the first two characters.
*/
    
    static void isBalanced(String s){
        
        String result = "";
        char [] cArray = s.toCharArray();
        int counter = 0;
        int temp = 0;
        
        if(cArray[0] == '[' || cArray[0] == '(' || cArray[0] == '{'){
            
            
                
                for(int j = cArray.length -1 ; j >= cArray.length/2; j--){
                    
                    
                    if(match(cArray[temp], cArray[j]) == true){
                        temp++;
                        counter++;   
                }
                    
             
        } 
            if(counter == (cArray.length) - cArray.length/2){
                            
                result = "YES";
                        }
                     else{
            
                        result = "NO";
                    }
                    
                    System.out.println(result);
        }
    }
    
    static boolean match(char a, char b){
        
        boolean isMatched = false;
        
        switch(a){
            
            case '(':
                if(b ==  ')'){
                    
                    isMatched = true;
                    
                }
                break;
        
            case '[':
                if(b == ']'){
                    
                    isMatched = true;
                }
                break;
               
            case '{':
                if(b == '}'){
                    
                    isMatched = true;
                }
                
            
        }
        
        return isMatched;
    }
	
}