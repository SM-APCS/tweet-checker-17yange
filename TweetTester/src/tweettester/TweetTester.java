/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author INSERT YOUR NAME HERE
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner (System.in);
        String tweet;
        // initializes a string called tweet
        System.out.println("Please enter your tweet: ");
        // prompts user for input
        tweet = scan.nextLine();
        // reads everything from the prompt to when we hit enter to finalize the input into the code
        int i = tweet.length();
        // counts the length of the string including symbols and spaces
        System.out.println("Your tweet is " + i + " characters long");
        // prints the length of the string
    }
}
