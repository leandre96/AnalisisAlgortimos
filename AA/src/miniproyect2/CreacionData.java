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
import java.util.LinkedList;
import java.util.List;
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
    public static List<int[]> configuracionA(){
        List<int[]> arr=new LinkedList<>();
        for(int i=0;i<100000;i++){
            int[] peque=new int[10];
            for(int j=0;j<10;j++){
                peque[j]=new Random().nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
            }
            arr.add(peque);
        }
        return arr;
    }
    public static List<int[]> configuracionB(){
        List<int[]> arr=new LinkedList<>();
        for(int i=0;i<10000;i++){
            int[] peque=new int[100];
            for(int j=0;j<100;j++){
                peque[j]=new Random().nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
            }
            arr.add(peque);
        }
        return arr;
    }
    public static List<int[]> configuracionC(){
        List<int[]> arr=new LinkedList<>();
        for(int i=0;i<1000;i++){
            int[] peque=new int[1000];
            for(int j=0;j<1000;j++){
                peque[j]=new Random().nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
            }
            arr.add(peque);
        }
        return arr;
    }
    public static List<int[]> configuracionD(){
        List<int[]> arr=new LinkedList<>();
        for(int i=0;i<100;i++){
            int[] peque=new int[10000];
            for(int j=0;j<10000;j++){
                peque[j]=new Random().nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
            }
            arr.add(peque);
        }
        return arr;
    }
    public static List<int[]> configuracionE(){
        List<int[]> arr=new LinkedList<>();
        for(int i=0;i<10;i++){
            int[] peque=new int[100000];
            for(int j=0;j<100000;j++){
                peque[j]=new Random().nextInt(Integer.MAX_VALUE-1000000000)+1000000000;
            }
            arr.add(peque);
        }
        return arr;
    }
    
}
