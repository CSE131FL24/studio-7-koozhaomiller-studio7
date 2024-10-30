package studio7;

public class Fraction {
    // instance variables 
    private static double n;
    private static double d;
    
    // constructor: 
    public Fraction(double initN, double initD) {
       n = initN;
       d = initD;
    }
    
    public double Num(Fraction frac) {
    	return n;
    }
    public double Den(Fraction frac) {
    	return d;
    }
 
    public Fraction Multiply(Fraction frac) {
    	double c = Num(frac);
    	// a/b + c/e
    	double e = Den(frac);
   
    	double newnum = n*c;
    	double newden = d*e;
    	
      return new Fraction(newnum, newden);
    }
    
    public Fraction Add(Fraction frac) {
    	double c = Num(frac);
    	// a/b + c/e
    	double e = Den(frac);
   
    	double newnum = n*e+d*c;
    	double newden = d*e;
    	
      return new Fraction(newnum, newden);
    }
    
	public Fraction Reciprocal() {
    	return new Fraction(d,n);
    }
	
    public Fraction simplify() {
    	double newnum = n / gcd(n,d);
    	double newden = d / gcd(n,d);
    	
    	return new Fraction(newnum, newden);
    }
    
    public static void printFraction(Fraction frac) {
    	System.out.println(n + "/" + d);
    }
	public static double gcd(double p, double q) {
		
		if (p==q) {
			return p;
			
		} else if (p > q) {
			p = p-q;
			return gcd(p,q);
		} else {
			q = q-p;
			return gcd(p,q);
		}
	}
	
	
    // main method for testing
    public static void main(String[] args) {
       // call the constructor to create a new person
       Fraction f1 = new Fraction(2,4);
       Fraction f2 = new Fraction(3,2);
       
       // call p1's print method

       printFraction(f1.Add(f2));
       printFraction(f1.Multiply(f2));
       printFraction(f1.Reciprocal());
       printFraction(f1.simplify());

       
    }
 }