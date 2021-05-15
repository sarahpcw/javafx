package g_oo;
/*
 */
public class b_execMethodsCarpets {
	
	public static void main(String[] args) { // run class or execute class
		double length = 2.0, width = 4.0;		
		double p = 0.0, lc = 0.0, tf =0.0;
		double fullPrice = 0.0;
		
		// create an object or instantiate the class or create an instance
		//cannot instantiate an abstract class
		//vatUK im = new vatUK();  //constructor runs here
		//vatGermanay im = new vatGermanay(2.5); // labourprice = 2.5
		
		b_finalCarpats  im = new b_finalCarpats(1.14, 22.00, 15); 
		// provide value to the input parameter of the constructor
		double area  = im.calcArea(length, width);  // length * width
		p  = im.calcPrice(area);
		lc = im.calcLabourCost(area);
		tf = im.calcTravelFee(12);
		fullPrice  = p + lc + tf;
		
		System.out.println("Carpet Price " + (p  ));
		System.out.println("Labour Price " + lc ); 
		System.out.println("Travel Fee   " + tf ); 
		System.out.println("Full Price   " + (fullPrice) ); 
		
		double vat = im.addVat(fullPrice);
		System.out.println("Price with VAT: " + vat);
		double bonus = im.bonus(vat);
		System.out.println("Price Plus Bonus" + bonus);
		//double pVat = im.calcVat(fullPrice); //inchild
		//System.out.println("Price with VAT: " + pVat);
		
	}

}
