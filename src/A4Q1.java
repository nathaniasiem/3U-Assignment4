
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner to scan input
        Scanner input = new Scanner(System.in);
        
        // ask user to type in their name
        System.out.println("Please enter your name: ");
        
        //scanning in their name into a variable 
        String name2 = input.nextLine();
        
        //string name = "Bob";
        String name = "Bob";
        
        //saying hello to Bob and how he is feeling today
        System.out.println("Hello " + name2 + ".");
        System.out.println("How are you today? ");
          
    }
}
