import java.util.*;
/**
 *
 * @author marisangelique
 * This program will:
 * 1.Display menu for options of conversion
 * 2.Prompt the user to enter the number of dollars they would like to convert
 * 3.Validates that the user's response is a valid response
 * 4.Displays the US dollar and the conversion
 * 5.Repeats the  menu until the user exits
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Open Scanner class to use keyboard object to detect keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Create variables for the program
        int input = 0;
        double requestConvert;
        double newConvert = 0;
        
        //Create loop to display menu and take in user input
        do{
            System.out.println("*********************************************");
            System.out.println("1.Convert to Euro\n"
                                + "2.Convert to Mexican Pesos\n"
                                + "3.Convert to Japanese Yen\n"
                                + "4.Exit program\n"
                                + "Select the conversion (1-4)");
            input = keyboard.nextInt();
            //exits before prompting next question
            if(input == 4){
                System.out.println("Exiting...");
                System.exit(0);
            }
            
            //Prompt user for the amount of dollars that they want to convert
            System.out.println("Enter the number of US dollars you would like to convert:");
            requestConvert = keyboard.nextDouble();
            
            //Switch to direct user to the method of their choice
            switch (input){
                case 1:
                    newConvert = convertEuro(requestConvert);
                    break;
                case 2:
                    newConvert = convertPesos(requestConvert);
                    break;
                case 3:
                    newConvert = convertYen(requestConvert);
                    break;
                default:
                    System.out.println("This is not a valid input.\n"
                                        + "Please select an input between 1-4.");
            }

            
            
            displayConversion(input, requestConvert, newConvert);

        }while(true);
        
        
    }
    
    //Create a method to convert Dollars into Euros
    public static double convertEuro(double requestConvert){
        //Variable for new conversion
        double exchange = 0.952248;
        double newConvert = requestConvert * exchange;
        
        return newConvert;
    }
    
    //Create a method to convert Dollars into Pesos
    public static double convertPesos(double requestConvert){
        double exchange = 17.7132;
        double newConvert = requestConvert * exchange;
        
        
        return newConvert;
    }
    
    //Create a method to convert Dollars into Yen
    public static double convertYen(double requestConvert){
        double exchange = 149.402;
        double newConvert = requestConvert * exchange;
        
        
        return newConvert;
       
    }
    
    //Create a method that displays the conversion
    public static void displayConversion(int input, double requestConvert, double newConvert){
        //Switch for each currency
        switch (input){
            case 1:
                System.out.printf(requestConvert + " US dollars is equal to %.2f Euros%n",  newConvert);
                break;
            case 2:
                System.out.printf(requestConvert + " US dollars is equal to %.2f Pesos%n", newConvert );
                break;
            case 3:
                System.out.printf(requestConvert + " US dollars is equal to  %.2f Yen%n", newConvert);
                break;
        }
        
    }
    
    
}
