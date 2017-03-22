
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
        int staff = input.nextInt();
        //ask final question
        System.out.println("How much were the miscellaneous costs? ");
        //variable for miscellaneous costs
        int misc = input.nextInt();
        //determine the total cost
        int total = food + dj + hall + decor + staff + misc;
        System.out.println("The total cost is $" + total + ".");
        //instruct user to calculate the number of tickets
        System.out.println("Now you have your total cost,answer the following question to calculate the number of tickets to sell.");
        //ask for the price of the tickets
        System.out.println("What is the price for the tickets? ");
        //variable for ticket price
        //use this to calculate the number of tickets to sell to break even
        int ticket = input.nextInt();
        //determine the number of tickets
        int tprice = total / ticket;
        System.out.println("You will need " + tprice + " tickets to break even.");
        //End the questionnaire
        System.out.println("You have reached the end of the questionnaire to help you calculate the costs and break even point.");
        System.out.println("Therefore,the total cost is " + "$" + total + "." + "You will need " + tprice + " tickets to break even.");
    }
}
