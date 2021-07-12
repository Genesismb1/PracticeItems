/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monikabhatt
 */

// The program calculates the number of corresponding integers in a random array of 200 numbers

public class Rand {
    
    public static void main(String[] args){
        
        int[] arr = new int [200];
        int [] countArr = new int [10];
        int tempCount=0;
        for(int i=0; i<arr.length; i++) arr[i]=(int) (Math.random()*10); 
        
        
        for(int j=0; j<10; j++){
            for(int k=0; k<200; k++){
                if(arr[k]==j) tempCount++;
            }
            countArr[j]=tempCount;
            tempCount=0;

        }
        
        for(int y=0; y<10; y++) System.out.printf("\nThe number of %d in the array is %d",y,countArr[y]);
    }
    
}
