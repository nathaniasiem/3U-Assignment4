
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author candy
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan user input
        Scanner input = new Scanner(System.in);

        //ask user to type in the measurement.
        //use this to convert into centimetres
        System.out.println("Hello. ");
        System.out.println("Please enter the measurement in inches you wish to convert: ");
        double inches = input.nextDouble();
        //converting input to centimetres
        double convert = inches * 2.54;
        if (convert > 0) {
            System.out.println(inches + " inches " + "is the same as " + convert + "cm ");
        }
    }
}