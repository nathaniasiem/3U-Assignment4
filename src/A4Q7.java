
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
        //variable for starting position
        int position = 1;

        //create loop
        //initialize program of game
        while (true) {
            // ask user to enter sum of dice
            System.out.println("Enter sum of dice: ");
            //variable for sum of dice
            int dice = input.nextInt();
            if (dice <= 1) {
                System.out.println("You quit!");
                break;
            }//calculate current position
            position = position + dice;
            //determine your current position
            System.out.println("You are on square " + position + ".");
            //create conditions when arriving on snake or ladder
            if (position == 54) {
                position = 19;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } else if (position == 90) {
                position = 48;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } else if (position == 99) {
                position = 77;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } else if (position == 9) {
                position = 34;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            } else if (position == 40) {
                position = 64;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            } else if (position == 67) {
                position = 86;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            }
            if (position == 100) {
                System.out.println("You win!");
                break;
            }
            if (dice <= 1) {
                System.out.println("You quit!");
                break;
            }
        }
    }
}
