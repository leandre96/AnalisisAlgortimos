/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import java.util.Random;

/**
 *
 * @author User
 */
public class RandomList {
    private int[] arreglo;
    
    public RandomList(int n){
        arreglo=new int[n];
        for (int i=0;i<n;i++){
            Random r=new Random();
            arreglo[i]=r.nextInt(100);
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
}
