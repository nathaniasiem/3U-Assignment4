
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
            //condition if user inputs sum of dice not between 2-12
            if (dice <= 1) {
                System.out.println("You quit!");
                break;
            }
            //calculate current position
            position = position + dice;
            //determine your current position
            System.out.println("You are on square " + position + ".");
            //create conditions when arriving on snake or ladder
            //at square 54, go down to 19
            //at square 90, go down to 48
            //at square 99, go down to 77
            if (position == 54) {
                position = 19;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } else if (position == 90) {
                position = 48;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } else if (position == 99) {
                position = 77;
                System.out.println("You hit a snake! Go back to square " + position + ".");
            } 
            //at square 9, go up to 34
            //at square 40, go up to 64
            //at square 67, go up to 86
            else if (position == 9) {
                position = 34;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            } else if (position == 40) {
                position = 64;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            } else if (position == 67) {
                position = 86;
                System.out.println("You reached a ladder! Go up to square " + position + ".");
            }
            //create condition when reaching square 100
            //if position is at 100, you win
            //if position is over 100, computer says you already reached 100
            if (position == 100) {
                System.out.println("You win!");
                break;
            } else if (position >= 100) {
                System.out.println("You already reached square 100!" + "You win!");
                break;
            }
        }
    }
}
