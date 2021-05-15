package g_oo;

final class b_finalCarpats  extends b_carpetVat{
	public b_finalCarpats (double vat, double cp, double lp){
		super ( vat, lp, cp );
	}
	
	public double bonus (double PricePlusVat){
		double PricePlusBonus = PricePlusVat + 10 ;
		return PricePlusBonus;
	}

 
}
