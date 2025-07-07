package g_oo;

public interface b_Interface4 {
// interface has ONLY abstract methods, MUST be implemented
	
	abstract double calcArea (double length , double w);  //abstract method
	//  length*w
	abstract double calcPrice (double area ); // call a method

	abstract double calcLabourCost (double area );
		
	double calcTravelFee(double distcance);
	
	 
}
