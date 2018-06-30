/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyect2;

import aa.AA3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CreacionData {
    private static int arregloGlobal[]=new int[1000000];
    public static void main(String a[]){
        creacion();
        
        
        
    }
    private static void creacion(){
        Random r=new Random();
        for(int i=0;i<1000000;i++){
         arregloGlobal[i]=r.nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
           
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter("randomIntegers.txt", "UTF-8");
            for(int j=0;j<arregloGlobal.length;j++){
                writer.println(arregloGlobal[j]+"\n");
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AA3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AA3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void cargarArreglo(){
        
        try {
            Scanner sc=new Scanner(new File("randomIntegers.txt"));
            int i=0;
            while(sc.hasNext()){
                String pal=sc.next();
                arregloGlobal[i]=Integer.parseInt(pal);
                i++;
            }
        } catch (FileNotFoundException ex) {
            
        }
        
        
    }

    
    public static int[] arreglo(){
        return arregloGlobal;
    }
}
