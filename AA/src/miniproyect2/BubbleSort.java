/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyect2;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author User
 */
public class BubbleSort {
    
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1]>arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {
                   long tot=0;
        List<int[]> lista=CreacionData.configuracionE();
        for(int[] arre:lista){
            long medi=System.nanoTime();
           bubbleSort(arre);
            long m=System.nanoTime();
            tot=tot+(m-medi);
        }
        
        
        System.out.println("Tiempo total de los 10 datos es  "+tot);
                  
                //sorting array elements using bubble sort  
                 
                
   
        }  
  
}
