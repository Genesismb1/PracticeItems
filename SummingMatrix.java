/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monikabhatt
 * 
 */

// This program sums the elements of a matrix

import java.util.Scanner;
public class SummingMatrix {
    
    public static int sumElements(int[][] m){
        int sum=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                sum=sum+m[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String [] args){
        int [][] matrix= new int[4][4];
        int[] arr = new int[16];
        int i=0, l=0;
        System.out.println("Enter a 4 * 4 matrix row by row");
        try (Scanner scan = new Scanner(System.in)) {
            while(scan.hasNextLine()){
                String [] s=scan.nextLine().trim().split(" ");
                if(s[0].isEmpty()) break;
                for(String a:s){
                    arr[i]=Integer.parseInt(a);
                    i++;
                }
            }
            scan.close();
        }
        
        for(int k=0; k<4; k++){
            for(int j=0; j<4; j++){
               matrix[k][j]=arr[l] ;
               l++;
            }
            
        }
        System.out.println("The sum of the elements of the matrix is " + sumElements(matrix));
    }
    
}
