/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monikabhatt
 */

public class ComputeSeries{
    
    public static double m(int i){
        double sum=0.0, den=0.0;
        for(int j=1; j<=i; j++){
            den=((2*(j))+1);
            sum=sum+j/den;
        }
        return sum;
    }
    
    public static void main(String args[]){
        System.out.printf("\n%7si%5sm(i)", ' ', ' ');
        for(int i=1; i<=20; i++){
        System.out.printf("\n%8d %8.4f", i, m(i));
                
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return("I am in ComputSeries");
        
    }
}
