
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan for input
        Scanner input = new Scanner(System.in);

        //ask user to input speed limit
        System.out.println("Enter the speed limit: ");
        // variable for speed limit
        int spLimit = input.nextInt();
        //ask user to input recorded speed of car
        System.out.println("Enter the recorded speed of the car: ");
        //variable for car speed
        int cSpeed = input.nextInt();
        //calculate how much the car speed is over the limit
        int radar = cSpeed - spLimit;

        //Determine if car is within speed limit
        if (radar >= 31) {
            System.out.println("You are speeding! Your fine is $500.");
        } else if (radar >= 21) {
            System.out.println("You are speeding! Your fine is $270.");
        } else if (radar >= 1) {
            System.out.println("You are speeding!Your fine is $100.");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}