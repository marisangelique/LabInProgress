import java.util.*;

/**
 *
 * @author marisangelique
 * This program:
 * 1.Asks user for their name
 * 2.Asks use for their height in feet and inches
 * 3.Converts height to inches
 * 4.Asks user for weight in pounds
 * 5.Calculates the BMI
 * 6.Outputs the data
 */
public class Lab1 {

    
    public static void main(String[] args) {
        //Open class to detect keyboard inputs;
        Scanner keyboard = new Scanner(System.in);
        
        //Create variable to hold name, height, converted height, and weight
        String name;
        int heightFeet;
        double heightInches;
        double newHeight;
        double weight;
        double bmi;
        
        //Display program name 
        System.out.println("This is a Body Mass Index Calculator Program\n" 
                            + "You will be asked for your name, weight in pounds, and height in feet and inches\n"
                            + "******************************************************************************************");
        //Asks user for their name and stores input in the name variable
        System.out.print("Please enter your name:");
        name = keyboard.nextLine();
        
        //Asks user for their weight in pounds and stores input in the weight variable
        System.out.print("Please enter your weight in pounds: ");
        weight = keyboard.nextDouble();
        
        //Asks user for their height in feet and inches then stores input in the height variable
        System.out.print("Please enter your height (input the number of feet): ");
        heightFeet = keyboard.nextInt();
        
        System.out.print("Please enter your height (input the number of inches): ");
        heightInches = keyboard.nextDouble();
        
        //Converts height to inches
        newHeight = ((heightFeet * 12)+ heightInches);
        
        //Calculates BMI and rounds to the hundreds place
        bmi = (weight/(Math.pow(newHeight, 2))) * 703;
        
        //Greets and displays BMI
        System.out.printf( "Hi " + name + " your BMI is %.2f", bmi);
        //Create an if statement that displays where they are on the BMI scale 
        if(bmi < 18.5){
            System.out.println("\nYour BMI puts you in the underweight category.");
        } else if( bmi >= 18.5 && bmi <= 24.9 ){
            System.out.println("\nYour BMI puts you in the healthy category.");
        }else if( bmi >= 25.0  && bmi <= 29.9 ){
            System.out.println("\nYour BMI puts you in the overweight category.");
        }else if( bmi >= 30.0 ){
            System.out.println("\nYour BMI puts you in the obese category.");
        }
        
        
//        //Testing
//        System.out.println(name + " is " + weight + " pounds" + " and " + heightFeet + "'" + heightInches + " tall!");
//        System.out.println(name + "'s height is " + newHeight + " in inches");
//        System.out.printf(name + " has the BMI of %.2f", bmi);
        
        
    }
    
}
