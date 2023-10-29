import java.util.*;


/**
 *
 * @author marisangelique
 * This program uses five methods (either void or value-returning):
 * 1.Generates a random number between 0-3
 * 2.Assigns that random number to one of the 4 fish options
 * 3.Asks the user to guess the fish the computer chose
 * 4.Validates the users input
 * 5.Displays the user's and computer's choice
 * 6.Counts the correct guesses
 * 7.Repeats this process 10 times
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create variables for the program
        int loop = 10; //to repeat the program 10 times
        String comChoice = " ";
        String userChoice = " ";
        int correct = 0;
        int computer = 0;
        
         //Create a for loop that calls the methods that picks a fish, prompts user to pick, validates, and counts correct answers
        for(int i =0; i < loop;i++){
            
            //Call the method that choses a random number
            computer = choose();
            
            //Call the method that translate number to fish
            comChoice = translate(computer);
            
            //Call method that prompts user for their choice and stores their input
            userChoice = userInput();
            
            //Call method that counts the number of correct answers
            correct = countCorrect(correct, comChoice, userChoice);
            
            //Call method that displays the correct answers, user input, and computer input
            display(correct, comChoice, userChoice);
        }
    }
    //Method that generates random number 
    public static int choose(){
        //Open Random class to create a random object for the computer to chose 
        Random random = new Random();
        //Create variable for computers' choice
        int computer = random.nextInt(3);
            
        
        
        return computer;
    }
    
    //Method that picks a fish for computer through translating the number to string
    public static String translate(int computer){
        String comChoice = " ";
        
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
        
        return comChoice;
    }
    
    //Method that asks user for their guess
    public static String userInput(){
        //Open Scanner class for keyboard detection
        Scanner keyboard = new Scanner(System.in);
        
        //Create variable for user choice
        String userChoice = " ";
         
        //Prompt user for their choice and store in variable
        System.out.println("I'm thinking of a fish.\n"
                            + "Is it Ahi, Opah, Uku, or Ono?");
        userChoice = keyboard.nextLine();
        
        return userChoice;
    }
    
    //Method that counts correct answers
    public static int countCorrect(int correct, String comChoice, String userChoice){
       
        //if statement that counts correct answers
        if( userChoice.toUpperCase().equals(comChoice)){
            correct++;
            System.out.println("Great job!");
        }else {
            System.out.println("Just missed...");
        }
        
        System.out.println("**********************************");
            
       return correct;
    }
    
    //Method that displays correct answers both user and computers guess
    public static void display(int correct, String comChoice, String userChoice){
        //Display user and computer choice
        System.out.println("You chose " + userChoice);
        System.out.println("Computer chose " + comChoice);
        
        //Display the amount of answers correct
        System.out.println("You got " + correct +" guesses correct!");
    }
    
}
