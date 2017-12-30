package atm;

import java.util.List;

public class CalculatorBillets50 extends CalculatorBillets{
	
	public void donnerBillets(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		int u=montant.getMontant();
		if (montant.getMontant() > 50) {
			int nBillets50 = Math.min((int)Math.ceil(montant.getMontant()/2/50), etat.getNb50Disponible());
			u -= nBillets50*50;
			montant.setMontant(u);
			etat.setNb50Disponible(etat.getNb50Disponible() - nBillets50);
			if (nBillets50 > 0) {
				proposition.add(new Couple(50,nBillets50));
			}
		}
		setSuivant(new CalculatorBillets20());
		super.donnerBillets(montant, proposition, etat);
	}
}