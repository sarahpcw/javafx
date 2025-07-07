package e_stringArgs;

import java.util.Scanner;

public class stringargs2 {

	public static void main(String[] args) {
		if (!(args.length >0) ) {
        System.err.println("no args given");
        System.exit(-1);
		}
		// declare
		double width = 0.0, length = 0.00,  sqm = 0.0, distance =0.0, tf = 0.0;
		
		// gather input values 
		length =  Double.parseDouble(args[0]);
		width =  Double.parseDouble(args[1]);
		distance =  Double.parseDouble(args[2]);
		
		// calculations
		sqm = length * width;
		if (distance < 10 ){
			tf = 0.0;
			System.out.println("Travel fee is free");
		} else if (distance > 10 &&  distance <20) {
			tf = 10.0;
			System.out.println("Travel fee is $10");
		} else {
			tf = 20.0;
			System.out.println("Travel fee is $20");
		}

		// output
		System.out.println("Length "+length + ", Width " + width + ", Sqm " + sqm);
		System.out.println("Distance " + distance);
		System.out.println("Travel Fee " + tf);
	
	}

}
