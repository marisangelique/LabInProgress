import java.util.*;
import java.io.*;

/**
 *
 * @author mwhite23
 * This program will take in, total, and display the total sales entered by the user
 * 1.Display menu for user
 * 2.Get choice
 * 3.Display according to the user's choice
 * 
 */
public class Lab4 {

    public static void main(String[] args) throws IOException {
        int choice;
        
        do{
        //Display menu
        System.out.println("***********************************");
        System.out.println("*******File Operations Menu********");
        System.out.println("***********************************");
        
        System.out.println("1.Enter Sales Figures (in File)\n" 
                            + "2.Display Sales Figures\n"
                            + "3.Display Total Sales\n"
                            + "4.Exit Program");
        
        //Create variable to hold choice
     
        
        //Prompt and collect the users' choice
        System.out.println("Enter choice: ");
        Scanner keyboard = new Scanner(System.in);
        choice = keyboard.nextInt();
        

        //Create an if statement for choice #1 to collect sales figures and input the data into the file
        if(choice == 1){

            
            //Create and open file for users' input
            PrintWriter salesFigures = new PrintWriter("salesFigures.txt");

            
            //Prompt user for the number of weeks for calculation
            System.out.println("How many weeks of sales figures do you have to enter?");
        
            //Create the variable and collect number of weeks
            int weeks = keyboard.nextInt();
            
            //Create for loop to prompt user and collect input for the sales figures for the number of the weeks entered
            for(int counter=1; counter<=weeks; counter++){
                
                System.out.print("Enter week " + counter + " sales figures: ");
                double sales = keyboard.nextDouble();
                
                //Store data in file
                salesFigures.println(sales);
                
            }
            //Close file when done
            salesFigures.close();
        }
        
        if(choice == 2){
            //Create and open file for reading
            File salesFigures = new File("salesFigures.txt");
            Scanner inputFile = new Scanner(salesFigures);
            
            //Loop to print data in file
            while(inputFile.hasNext()){
                double weekSales = inputFile.nextDouble();
                System.out.println(weekSales);
            }
            
            
        }
        
        if(choice == 3){
            //Create and open file for reading
            File salesFigures = new File("salesFigures.txt");
            Scanner inputFile = new Scanner(salesFigures);
            
            
            
            double total = 0;
            while(inputFile.hasNext()){
                double weekSales = inputFile.nextDouble();
                total += weekSales;
                
            }


            System.out.println("Total sales: " + total);
        }
        } while (choice != 4);
        if(choice == 4){
            System.out.println("Thanks for using the program!");
        }
        
    }
    
}

