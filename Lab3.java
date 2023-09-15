 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;
import java.util.*;
/**
 *
 * @author mwhite23
 * This program will:
 * 1.Get phrase from user
 * 2.Get key shift
 * 3.Apply shift to phrase
 * 5.Print encrypted message
 * 
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
//    static void shiftedLetter(){
//        
//    }
    public static void main(String[] args) {
        //Design intro output
        System.out.println("************************************");
        System.out.println("Top Secret Message Maker");
        System.out.println("************************************");
        
        //Create variable to hold secret phrase and prompt user for phrase
        String phrase;
        System.out.println("What message would you like to encrypt?");
        
        //Collect phrase
        Scanner keyboard = new Scanner(System.in);
        phrase = keyboard.nextLine();
        
        //Create and store value for key word and prompt user for key word 
        int shift;
        System.out.println("What is your shift number?");
        
        shift = keyboard.nextInt();
        
        //Create variable to hold shifted letter
        char newLetter;
        

        String encryption = " ";
        //Create for loop to apply shift number for each letter in the phrase
        for (int counter=0; counter<phrase.length();counter++){ 
            //Get each character in the phrase string
            newLetter = phrase.charAt(counter);
            int shiftedLetters;
 
            
            if(newLetter >= 'A' && newLetter <='Z' || newLetter >= 'a' && newLetter <='z')
            {
                shiftedLetters = (int)newLetter + shift; 
                
                if(shiftedLetters >'Z' && shiftedLetters < 'a'){
                    shiftedLetters = shiftedLetters - 26; 
                }
                if(shiftedLetters > 'z'){
                    shiftedLetters -=26;                 
                }
                
                encryption += (char)shiftedLetters;
                
            }else{
                encryption += (char)newLetter;
            }    
        }
        
        System.out.println("Encrypted Message = " + encryption);
        
        
    }
    
}
