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
 */
public class Moped {
  private String year;
  private String make;
  private int speed;

    public Moped(String year, String make) {
        this.year = year;
        this.make = make;
        this.speed = 0;
    }

    public Moped() {
        
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public int accelerator(){
        return speed += 5;
    }
    public int brake(){
        return speed -= 5;
    }
    public String toString() {
        return "A " + year + " " + make + " moped going " + speed + " miles per hour.";
    }
    
    
  
    
}
