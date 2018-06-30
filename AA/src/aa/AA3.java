/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AA3 {
    public static void main(String a[]){
        
        int arr[]=new int[10000];
        int i=0;
        try {
            Scanner sc=new Scanner(new File("randomIntegers.txt"));
            while(sc.hasNext()){
                arr[i]=Integer.parseInt(sc.next());
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AA3.class.getName()).log(Level.SEVERE, null, ex);
        }
        QuickSort qs=new QuickSort();
        qs.sort(arr);
        PrintWriter writer;
        try {
            writer = new PrintWriter("sortedIntegers.txt", "UTF-8");
            for(int j=0;j<arr.length;j++){
                writer.println(arr[j]+"\n");
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AA3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AA3.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
