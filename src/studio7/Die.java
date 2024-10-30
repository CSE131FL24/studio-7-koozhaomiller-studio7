package studio7;

public class Die {
     // instance variables 
     private int n;
     
     // constructor: construct a Person copying in the data into the instance variables
     public Die(int initN) {
        n = initN;
     }
     
     // String representation of a person
     public int Roll() {
       return (int) ((Math.random() * (n))+1);
     }
     
     
 
     // main method for testing
     public static void main(String[] args) {
        // call the constructor to create a new person
        Die die1 = new Die(6);
        // call p1's print method
        int s = die1.Roll();
        System.out.println(s);
     }
  }