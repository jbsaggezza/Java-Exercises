package algorithm.practice;

import java.util.Arrays;

/**
 *
 * @author Jack
 */
public class AlgorithmPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] testArr = {10,2,88,71,69,56,44,31,23};
        insertionSort(testArr);
        
        intersectionDemo();
    }
    
    static void insertionSort(int[] a){
        
        for(int i = 0; i < a.length; i++){
            
            int key = a[i];
            //Insert a[i] into sorted sequence a[1..-1]
            int j = i - 1;
            
            while(j >= 0 && a[j] > key){
                
                a[j + 1] = a[j];
                j = j -1;
                a[j + 1] = key;
                
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
    
    static void unionDemo(){
        
        Set <Integer> s1 = new HashSet <>();
        Set <Integer> s2 = new HashSet <>();
        s1.add(13);
        s1.add(20);
        s1.add(2);
        s1.add(40);
        s1.add(51);
        
        s2.add(1);
        s2.add(4);
        s2.add(5);
        s2.add(78);
        
        Set <Integer> union = new HashSet <>();
        
        for(int i: s1){
            
            union.add(i);        
        }
        
        for(int i: s2){
            
            union.add(i);        
        }
        
        for(int i : union){
            
            System.out.println(i);
        }
    }
    
    static void intersectionDemo(){
        
        Set <Integer> s1 = new HashSet <>();
        Set <Integer> s2 = new HashSet <>();
        Set <Integer> smallerSet = new HashSet <>();
        Set <Integer> intersection = new HashSet <>();
        
        s1.add(1);
        s1.add(20);
        s1.add(2);
        s1.add(40);
        s1.add(51);
        
        s2.add(1);
        s2.add(4);
        s2.add(5);
        s2.add(2);
        
        if(s1.size() < s2.size()){
            
            smallerSet = s2;
        } 
        
         if(s1.size() > s2.size()){
            
            smallerSet = s2;
        } 
          
        for(int i: smallerSet){
            if(s1.contains(i) && s2.contains(i)){
            intersection.add(i); 
            }
        }
        
        for(int i : intersection){
            
            System.out.println(i);
        }  
    }
    
}
