package g_oo;

public abstract class b_carpetVat extends b_IMethods{
	// constructor th same name as the class
	// it is the top of all methods
	// it has no return type, no return , cannot return anything
	// it runs WITHOUT a method call, it cannot be called
	// it  is autoexecuted when i create the object
	// it will run only once!!
	double vatPercentage = 0.0;  // class variable , blue, all methods can use it
	public b_carpetVat (double vat, double cp, double lp){
		super ( lp, cp);
		this.vatPercentage = vat;
	}
	public double addVat (double fullprice){
		double pricePlusVat = 0.0;
		pricePlusVat  = fullprice * vatPercentage ;
		return pricePlusVat;
	}
 

}
