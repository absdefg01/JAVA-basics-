
public class OutilsFinanciers {
	
	public static Float tauxDeChange(Devise d1, Devise d2){
		float taux = 0 ;
		
		if(d1==d2){
			 taux = 1;
		} 
		else{	
			switch(d1){
				case Euro : 
					
						taux = 1.31486f;
					
					break;
		
				case Dollar :
					
						taux = 0.760541f;
					break;
			}
			
		}
		return taux;
	}
	
	
	public static Couple<Devise, Float> Convertir(Couple< Devise, Float > c1, Devise d2){
		float tdc = tauxDeChange(c1.getDevise(),d2);
		return (new Couple<Devise, Float>(d2,c1.getMontant()*tdc));
		
	}
}	

		
	