
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan user input
        Scanner input = new Scanner(System.in);
        
        //ask user to input numbers on separate lines
        System.out.println("Please enter in 4 numbers on separate lines. ");
        
        //scanning in the numerical input into variables
        double no1 = input.nextDouble();
        double no2 = input.nextDouble();
        double no3 = input.nextDouble();
        double no4 = input.nextDouble();
        
        //determine their numbers
        System.out.println("Your numbers were " +no1+"," + no2+","+ no3+","+ "and "+ no4+".");
    }
}