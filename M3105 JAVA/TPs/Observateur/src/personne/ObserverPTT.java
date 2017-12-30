package personne;

public class ObserverPTT implements Observer {

	@Override
	public void update(Subject s) {
		Personne p = (Personne) s;
		if (!p.getAfter().getNom().equals(p.getBefore().getNom()))
			this.changementDeNom(p);
	}
	
	private void changementDeNom(Personne p) {
		System.out.println("Changement d'adresse postal pour " + p.getBefore().getNom() + " devient " + p.getAfter().getNom());
	}
}
