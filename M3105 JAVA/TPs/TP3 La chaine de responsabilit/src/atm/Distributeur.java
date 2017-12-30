package atm;

import java.util.LinkedList;
import java.util.List;

public class Distributeur {
	
	private EtatDistributeur etat;
	
	public Distributeur(int nb50, int nb20, int nb10, int nb5) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10, nb5);
	}
	
	public void recharger(int nb50, int nb20, int nb10, int nb5) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
		this.etat.setNb5Disponible(nb5);
	}
	
	public List<Couple> donnerBillets(int montant){
		List<Couple> proposition = new LinkedList<Couple>();
		WrapperMontant v = new WrapperMontant(montant);
		CalculatorBillets ca= new CalculatorBillets();
		CalculatorBillets.setSuivant(new CalculatorBillets50());
		ca.donnerBillets(v,proposition,this.etat);
		return proposition;	 
	}
	

	public String toStringProposition(List<Couple> proposition, int montant) {
		StringBuffer res = new StringBuffer();
		res.append("Montant à débiter : " + montant + "€ \n");
		for (Couple c : proposition) {
			res.append(c.toString() + '\n');
		}
		res.append("Montant restant dû : " + this.montantRestantDû(proposition, montant));
		return res.toString();
	}
	
	public void donnerBilletsPetitesCoupures(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		int nBillets5 = 0;
		int u=montant.getMontant();
		if (montant.getMontant() > 20 && montant.getMontant() <= 100) {
			nBillets5 = 2;
			u -= nBillets5*5;		
		}
		montant.setMontant(u);
		etat.setNb5Disponible(etat.getNb5Disponible() - nBillets5);
		proposition.add(new Couple(5,nBillets5));		
	
	}
	
	public void donnerBilletsGrossesCoupures(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat){
		
	}
	
	public int montantRestantDû(List<Couple> proposition, int montant) {
		int montantRestantDû = montant;
		for (Couple c : proposition) {
			montantRestantDû -= c.getValeurBillet() * c.getNombreBilletsDélivrés();
		}
		return montantRestantDû;
	}
}