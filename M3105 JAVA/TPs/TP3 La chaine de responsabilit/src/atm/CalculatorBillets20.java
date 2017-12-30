package atm;

import java.util.List;

public class CalculatorBillets20 extends CalculatorBillets{
	
	public void donnerBillets(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		int u=montant.getMontant();
		if (montant.getMontant() > 20) {
			int nBillets20 = 0;
			if (montant.getMontant() % 20 == 0) {
				nBillets20 = montant.getMontant() / 20 -1;
			}
			else {
				nBillets20 = montant.getMontant() / 20;
			}
			nBillets20 = Math.min(nBillets20, etat.getNb20Disponible());
			u -= nBillets20*20;
			montant.setMontant(u);
			etat.setNb20Disponible(etat.getNb20Disponible() - nBillets20);
			proposition.add(new Couple(20,nBillets20));
		}
		setSuivant(new CalculatorBillets10());
		super.donnerBillets(montant, proposition, etat);
	}
}