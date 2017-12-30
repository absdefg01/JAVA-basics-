package atm;

import java.util.List;

public class CalculatorBillets {
	private static CalculatorBillets suivant;
	
	
	public static void setSuivant(CalculatorBillets suivantb){
			suivant = suivantb;
	}
	
	public void donnerBillets(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		if (suivant != null)
			suivant.donnerBillets(montant, proposition, etat);	
	}	
}