/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author James
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bottles = "bottles of beer on the wall.  ";
        int numBottles = 99;
        int index = 0;
        
        for (index = 0; index < numBottles; numBottles--)
        {
            System.out.print(numBottles + " " + bottles);
            System.out.print(numBottles + " " + bottles);
            System.out.print("take one down, pass it around,");
            System.out.println(numBottles - 1 + " " + bottles);
        }
        
               
    }
    
}
