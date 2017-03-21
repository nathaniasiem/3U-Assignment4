
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scanf or user input
        Scanner input = new Scanner(System.in);
        
        //Instruct the user for input
        //ask the first question
        System.out.println("Please answer the following questions to help calculate the cost and find the number of tickets to break even. ");
        System.out.println("How much does the food for prom cost? ");
        //variable for food cost
        int food = input.nextInt();
        //ask second question
        System.out.println("How much does the DJ cost? ");
        //variable for dj cost
        int dj = input.nextInt();
        //ask third question
        System.out.println("How much did it cost to rent the hall? ");
        //variable for hall rental cost
        int hall = input.nextInt();
        //ask fourth question
        System.out.println("How much does the decorations cost? ");
        //variable for decoration cost
        int decor = input.nextInt();
        //ask fifth question
        System.out.println("How much was the cost to hire staff? ");
        int  staff = input.nextInt();
        //ask final question
        System.out.println("How much were the miscellaneous costs? ");
        //variable for miscellaneous costs
        int misc = input.nextInt();
        //determine the total cost
        
    }
}
