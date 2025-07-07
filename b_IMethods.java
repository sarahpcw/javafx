package g_oo;
// abstract class is a class with at least 1 abstract method
// abstract class cannot be instantiated, it MUST have a child class
// abstract method MUST be implemented in the child class
public abstract class b_IMethods implements b_Interface4 {  //parent, base, super class
	double labourSQM =0.00;
	double carpetSQM =0;
	
	b_IMethods(double lp, double cp){
		this.labourSQM = lp;
		this.carpetSQM = cp;
	}

	public double calcArea (double l , double w){
		double area ;
		area = l * w;
		return area;
	}
	//method overload, the paramaters are different
    public double calcArea (double l ){
		double area ;
		area = l * l;
		return area;
	}
	
    public double calcPrice (double area ){
		double sqmPrice= 	carpetSQM ;
		double a = area * sqmPrice;
		return a;
	}
	public double calcLabourCost (double area){
		double labourSQM= this.labourSQM;
		return area * labourSQM;
	}
	public double calcTravelFee (double distance){
		double travelFee=0.0;
		if (distance < 10 ) {
			travelFee = 0.0;
		} else if (distance >= 10 && distance < 20) {
			travelFee = 10.0; 	
		} else if ( distance > 20) { 
			travelFee = 20.0;	
		}
	    return travelFee;
	}

	abstract double addVat (double fullprice);
	//abstract double calcVat ( double fullPrice );
	// prescribe signature
	// abstract method MUST be overriden

}
