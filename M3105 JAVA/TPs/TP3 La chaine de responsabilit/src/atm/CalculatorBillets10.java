package atm;

import java.util.List;

public class CalculatorBillets10 extends CalculatorBillets{

	public void donnerBillets(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		int u=montant.getMontant();
		if (montant.getMontant() > 0) {
			int nBillets10 = Math.min(montant.getMontant()/10, etat.getNb10Disponible());
			u -= nBillets10*10;
			montant.setMontant(u);
			etat.setNb10Disponible(etat.getNb10Disponible() - nBillets10);
			proposition.add(new Couple(10,nBillets10));
			
		}
	}
}