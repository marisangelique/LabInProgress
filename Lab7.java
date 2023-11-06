import java.util.*;
import java.util.regex.*;

/**
 *
 * @author marisangelique
 * This program will:
 * 1.Prompt user to enter their name (A-Z) only
 * 2.Validate and remind user what input it is looking for if invalid
 * 3.Prompt user to enter their student ID in the @######### format
 * 4.Validate response and remind user of the format if invalid
 * 5.Prompt user for their phone number in the (###)###-#### format
 * 6.Validate response and remind user of the format if invalid
 * 7.Prompt user for their birthday in the (##/##/####) mm/dd/yyyy format
 * 8.Validate and remind user of the format if invalid
 * 9.Displays user's input
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Open Scanner class to create keyboard object for detecting input
        Scanner keyboard = new Scanner(System.in);
        
        //Variable to hold user's input
        String userName;
        String idStudent;
        String phone;
        String birth;
        
       
        //Create a loop that obtains users name and validates their input
        do{
            //Passes the keyboard object in the name method to listen for user input and store in userName variable
            userName = name(keyboard);
            
            //Reminds user the format needed for this input
            if(!validateName(userName)){
                System.out.println("That is not a valid input. Please enter your full name with the characters A-Z.");
            }
         //Keeps asking this question until validateName method is true
        }while(!validateName(userName));

        do{
            
            idStudent = id(keyboard);
            
            
            if(!validateID(idStudent)){
                System.out.println("That is not a valid input.");
            }
         
        }while(!validateID(idStudent));
        
        do{
            
            phone = phone(keyboard);
            
            
            if(!validatePhone(phone)){
                System.out.println("That is not a valid input.");
            }
         
        }while(!validatePhone(phone));
        
        do{
            
            birth = birth(keyboard);
            
            
            if(!validateBirth(birth)){
                System.out.println("That is not a valid input.");
            }
         
        }while(!validateBirth(birth));
        
        //Call display method
        display(userName, idStudent, phone, birth);
        
    }
    
    //Method for obtaining users name passing in the keyboard object for keyboard detection
    public static String name(Scanner keyboard){
        //Prompt user for their name (A-Z) only and store in the userName variable
        System.out.println("Enter your full name with the alphabets (A-Z) only: ");
        
        //Returns users' input
        return keyboard.nextLine();
    }
    
    //Method for obtaining users' student ID
    public static String id(Scanner keyboard){
       
        System.out.println("Enter your student ID in the format '@#########'");
        
        
        return keyboard.nextLine();
    }
    
    //Method for obtaining users' phone number
    public static String phone(Scanner keyboard){
       
        System.out.println("Enter your phone number in the format (###)###-####");
        
        
        return keyboard.nextLine();
    }
    
    //Method for obtaining birthday
    public static String birth(Scanner keyboard){
       
        System.out.println("Enter your birthday in the format MM/DD/YYYY");
        
        
        return keyboard.nextLine();
    }
    
    //Method for validating user name
    private static boolean validateName(String userName){
       
        //Returns RegEx validation for userName. Increased last name amount for longer last names.
        return userName.matches("[A-Za-z]{2,15} [A-Za-z]{3,15}");
        
    }

    
    //Method for obtaining users' student ID
    private static boolean validateID(String idStudent){
        return idStudent.matches("[@][0-9]{9}");
    }
    
    //Method for obtaining user phone number
    private static boolean validatePhone(String phone){
        return phone.matches("[(][0-9]{3}[)][0-9]{3}-[0-9]{4}");
    }
    
    //Method for obtaining user birthday
    private static boolean validateBirth(String birth){
        return birth.matches("[0-12]{2}/[0-31]{2}/[0-9]{4}");
    }
    
    //Method to display user's name, id, phone, and birthday input
    private static void display(String userName, String idStudent, String phone, String birth){
        System.out.println("ID:" + idStudent + "\nName: " + userName + "\nPhone: " + phone + "\nBirthday: " + birth);
    }  
    
}
