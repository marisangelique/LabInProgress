import java.util.*;
/*
----------------------------
    Moped
----------------------------
-year : Int
-make : String
-speed: int
----------------------------
+Moped(y:int, m:String, s:int)
+Moped()
+setYear(y:int) : void
+setMake(m:String) : void
+setSpeed(s:int) : void
+getYear() : int
+getMake() : String
+getSpeed() : int
+accelerate() : int
+brake() : int
+toString() : String
*/

/**
 *
 * @author marisangelique
 * This program:
 * 1.Prompts the user for the year of their moped between the years of (1995-2023)
 * 2.Validates the user's input and repeats prompt if their input is invalid
 * 3.Prompts the user for the make of their moped
 * 4.Creates a moped object
 * 5.Calls the accelerate method 4 times
 * 6.Displays the speed after each accelerator method called
 * 7.Calls the brake method 3 times
 * 8.Displays the speed after each brake method called
 */
public class MopedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Detect the user input by listening to the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Variables to store users input
        String year; 
        String make;
        
        
     
       
        
        
        //Loop to validate year input and repeat prompt if invalid
        do{
           System.out.println("Enter the year of your Moped (1995-2023)");
           year = keyboard.nextLine();
           
           validYear(year);
        }while(!validYear(year));
        
        //Prompts user for make
        System.out.println("Enter the make of your Moped (such as Yamaha, Vespa, Lexmoto)");
        make = keyboard.nextLine();
        
       
        
        //Create a yourMoped object with the Moped class
        Moped yourMoped = new Moped(year, make);
        
        //Call the accelerator method
        accelerate(yourMoped);
        
        //Call the break method
        brake(yourMoped);
    }
    
    //Method for year validation
    private static boolean validYear(String year){
        return year.matches("^(199[5-9]|20[0-1]\\d|202[0-3])$");
    } 
    
    public static void accelerate(Moped yourMoped){
        for (int i = 0; i < 4; i++ ){
            yourMoped.accelerator();
            System.out.println(yourMoped.toString());
        }
        
    }
    
    public static void brake(Moped yourMoped){
        for (int i = 0; i < 4; i++ ){
            yourMoped.brake();
            System.out.println(yourMoped.toString());
        }
        
    }
    
    
}
