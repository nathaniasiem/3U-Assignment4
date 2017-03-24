
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan for user input
        Scanner input = new Scanner(System.in);
       
        //create loop
        //initialize program of game
        while(true){
            // ask user to enter sum of dice
            System.out.println("Enter sum of dice: ");
            //variable for sum of dice
            int dice = input.nextInt();
            //calculate current spot
            int move = dice+1;
            System.out.println("You are on square "+move+".");
            
            
            
        }
    }
}
