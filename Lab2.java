import java.util.*;
/**
 *
 * @author marisangelique
 * This program
 * 1.Selects one of the three fishes
 * 2.Prompts the user to pick a fish
 * 3.Validates whether or not the user picked the same fish the program does
 * 4.Displays whether or not user got it correct
 * 5.Counts how many the user gets correct out of 10
 * 6.Displays the amount the user got correct
 * 
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Open Random class to create random instances
        Random random = new Random();
        
        //Create variables for the program
        int loop = 10; //to repeat the program 10 times
        int correct = 0; //initializes how many the user gets correct
        
        //Create a for loop that picks a fish, prompts user to pick, validates, and counts correct answers
        for(int i =0; i < loop;i++){
            //Open Scanner class for keyboard detection
            Scanner keyboard = new Scanner(System.in);
            
            //Create variable for computers' choice
            int computer = random.nextInt(3);
            String comChoice = " ";
            
            //Create variable for user choice
            String userChoice = " ";
            
            //Switch to assign number to string choice
            switch (computer){
                case 0:
                    comChoice = "AHI";
                    break;
                
                case 1:
                    comChoice = "OPAH";
                    break;
                case 2:
                    comChoice = "UKU";
                    break;
                case 3:
                    comChoice = "ONO";
                    break;
            }
        
        //Prompt user for their choice and store in variable
        System.out.println("I'm thinking of a fish.\n"
                            + "Is it Ahi, Opah, Uku, or Ono?");
        userChoice = keyboard.nextLine();
        
        
        //Display user and computer choice
        System.out.println("You chose " + userChoice);
        System.out.println("Computer chose " + comChoice);
            
        
        
        //if statement that counts correct answers
        if( userChoice.toUpperCase().equals(comChoice)){
            correct++;
            System.out.println("Great job!");
        }else {
            System.out.println("Just missed...");
        }
        System.out.println("**********************************");
        
         
        }
        
        //Display the amount of answers correct
        System.out.println("You got " + correct +" guesses correct!");
        
       
    }
    
}
