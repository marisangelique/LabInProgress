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
 */
public class ProductItem {
    private String name;
    private int bought;
    private double price;

    public ProductItem(String name, int bought, double price) {
        this.name = name;
        this.bought = bought;
        this.price = price;
    }

    public ProductItem() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBought(int bought) {
        this.bought = bought;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getBought() {
        return bought;
    }

    public double getPrice() {
        return price;
    }
    
    public double total(){
        return bought * price;
    }
    
    public String toString() {
        return "Product Name: " + name + "\nNumber of units: " + bought + "\nUnit Price: " + price + "\nTotal Wholesale Price: " + total();
    }
    
}
