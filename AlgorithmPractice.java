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
    
}
