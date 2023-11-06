import java.util.*;
/*
----------------------------
    ProductItem
----------------------------
-name : String
-bought : int
-price: double
----------------------------
+ProductItem(b:int, n:String, p:double)
+ProductItem()
+setbought(b:int) : void
+setName(n:String) : void
+setPrice(p:double) : void
+getBought() : int
+getName() : String
+getPrice() : double
+total() : int
+toString() : String
*/

/**
 *
 * @author marisangelique
 * This program:
 * 1.Prompts user for the name of the product they are purchasing
 * 2.Prompts the user for the amount of items they are buying
 * 3.Prompts user for the price of the item
 * 4.Creates a new object from the ProductItem class with the users input
 * 5.Calculates the total for their purchase
 * 6.Displays their input and total 
 * 7.Repeats this program 3 times
 */
public class ProductItemDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Opening Scanner class to create keyboard object to listen to keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Variables for the program
        int repeat = 3;//To repeat this program 3 times
        String product;
        int bought;
        double price;
        
        
        //Loop to call the methods 3 times
        for (int i=0; i < repeat; i++){
            //Prompt user for input
            System.out.println("What is the name of the product?");
            product = keyboard.nextLine();
            
            System.out.println("Enter the amount of products bought:");
            bought = keyboard.nextInt();
            
            System.out.println("Enter the unit price of the product:");
            price = keyboard.nextDouble();
            
            keyboard.nextLine();
            
            //Open ProductItem class and create a new object
            ProductItem yourTotal = new ProductItem(product, bought, price);
            //call the total method from the ProductInput class
            yourTotal.total();
            
            //Call to string method from class to print display
            System.out.println(yourTotal.toString());
            System.out.println("*******************************************");
        }
        
    }
    
   
}
