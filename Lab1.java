
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mwhite23
 * This program will:
 * 1.Ask the user for their name
 * 2.Ask the user for their height in feet and inches
 * 3.Converts height into inches
 * 4.Ask for the user's weight in pounds
 * 5.Calculates the BMI
 * 6.Outputs data nicely
 * 
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        //Design intro output
        System.out.println("This is a Body Mass Index Calculator Program");
        System.out.println("You will be asked for your name, weight in pounds, and height in feet and inches");
        System.out.println("***********************************************************************************************");
        
        //Declare values to store name, height, and weight
        String name;
        double height;
        double weight;
        
        //Create way to collect users input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for their name and store it in the string variable
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        
        //
    }
    
}
