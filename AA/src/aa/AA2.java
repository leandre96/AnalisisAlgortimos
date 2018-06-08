/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;



/**
 *
 * @author User
 */
public class AA2 {
    
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        long num1 = System.currentTimeMillis();
        InsertionSort is=new InsertionSort();
        int[] arr2 = is.sort(arr1);
        long num2 =System.currentTimeMillis();
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("");
        
        System.out.println(num2+" milisegundos y "+num1+" milisegundos");
    }
}
