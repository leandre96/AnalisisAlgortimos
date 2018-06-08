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
public class Absolute2 {
    public static void main(String[] args) {
      for(int i=5;i<=500;i+=5){
          
          System.out.println((i/5)+".-");
          RandomList rl=new RandomList(i);
          int[] arr=rl.getArreglo();
          
          InsertionSort is=new InsertionSort();
          long num1 = System.nanoTime();
          int[] arr2 = is.sort(arr);
          long num2 = System.nanoTime();
          
          for(int j:arr){
            System.out.print(j);
            System.out.print(" ");
            }
       
          System.out.println("");
          System.out.println((num2-num1)+" milisegundos");
          System.out.println("");
          
      }
    }
}
