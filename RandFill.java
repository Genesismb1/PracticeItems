/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monikabhatt
 */

// This program calculates the first row with the largest value in a matrix

public class RandFill {
    
    public static void main(String [] args){
        
        int[][] matrix = new int[5][5];
        int[] rowSum=new int [5];
        int temp=Integer.MIN_VALUE, rowHighest=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[1].length; j++){
                matrix[i][j]=(int)(Math.random()*2);
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[1].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[1].length; j++){
                rowSum[i]=rowSum[i]+matrix[i][j];
            }
        }
        
        for(int i=0; i<rowSum.length; i++){
            if(rowSum[i]>temp){
                temp=rowSum[i];
                rowHighest=i;
            }
            
        }
        
        System.out.println("The first row with the largest value is row number " + rowHighest);
    }
    
}
