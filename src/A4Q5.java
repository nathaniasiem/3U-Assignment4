
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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan for user input
        Scanner input = new Scanner(System.in);

        //ask user to type in their name
        System.out.println("Please enter your name: ");
        //variable for name
        String name = input.nextLine();
        //Test 1 marks
        System.out.println("What was the first test out of? ");
        int test1 = input.nextInt();
        System.out.println("What mark did you get? ");
        int mark1 = input.nextInt();
        //Test 2
        System.out.println("What was the second test out of? ");
        int test2 = input.nextInt();
        System.out.println("What mark did you get? ");
        int mark2 = input.nextInt();
        //Test 3
        System.out.println("What was the third test out of? ");
        int test3 = input.nextInt();
        System.out.println("What mark did you get? ");
        int mark3 = input.nextInt();
        //Test 4
        System.out.println("What was the fourth test out of? ");
        int test4 = input.nextInt();
        System.out.println("What mark did you get? ");
        int mark4 = input.nextInt();
        //Test 5
        System.out.println("What was the fifth test out of? ");
        int test5 = input.nextInt();
        System.out.println("What mark did you get? ");
        int mark5 = input.nextInt();
        //determine the test 1 score
        int tScore1 = mark1 * 100 / test1;
        //determine the test 2 score
        double tScore2 = mark2 * 100.0 / test2;
        //determine the test 3 score
        double tScore3 = mark3 * 100.0 / test3;
        //determine the test 4 score
        double tScore4 = mark4 * 100.0 / test4;
        //determine the test 5 score
        double tScore5 = mark5 * 100.0 / test5;
        //determine the average
        double avg = (tScore1 + tScore2 + tScore3 + tScore4 + tScore5) / 5.0;

        //Determine the test scores for Doug
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + tScore1 + "%");
        System.out.println("Test 2: " + tScore2 + "%");
        System.out.println("Test 3: " + tScore3 + "%");
        System.out.println("Test 4: " + tScore4 + "%");
        System.out.println("Test 5: " + tScore5 + "%");

        System.out.println("Average: " + avg + "%");
    }
}
