package studio7;

public class Rectangle {
    // instance variables 
    private double l;
    private double w;
    
    // constructor: construct a Person copying in the data into the instance variables
    public Rectangle(double initL, double initW) {
       l = initL;
       w = initW;
    }
    
    public double Area() {
      return (w * l);
    }
    
    public double Perimeter() {
    	return (2*w + 2*l);
    }
    public boolean isSquare() {
    	if (w==l) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isLarger(Rectangle sanlkdnlasknd) {
    	if (sanlkdnlasknd.Area() < Area()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    // main method for testing
    public static void main(String[] args) {
       // call the constructor to create a new person
       Rectangle r1 = new Rectangle(6,2);
       
       
       // call p1's print method
       Rectangle r3 = new Rectangle(6,6);
       
       System.out.println(r3.Area());
       System.out.println(r3.Perimeter());
       System.out.println(r3.isSquare());
       System.out.println(r3.isLarger(r1));

       
    }
 }