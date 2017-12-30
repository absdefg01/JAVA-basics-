package personne;

public class ObserverEtatCivil implements Observer {

	
	@Override
	public void update(Subject s) {
		Personne p = (Personne) s;
		if (!p.getAfter().getNom().equals(p.getBefore().getNom()))
			this.changementDeNom(p);
		else
			this.ajouterPrénom(p);
	}

	private void changementDeNom(Personne p) {
		System.out.println("Changement de nom " + p.getBefore().getNom() + " devient " + p.getAfter().getNom());
		System.out.println("Supprimmer carte d'identité pour " + p.getBefore().getNom());
		System.out.println("Regénérer carte d'identité pour " + p.getAfter().getNom());
	}

	private void ajouterPrénom(Personne p) {
		System.out.print("Ajouter prénom carte d'identité pour " + p.getAfter().getNom());
		if (! p.getAfter().getPremierPrénom().equals(p.getBefore().getPremierPrénom()))
			System.out.print( " " + p.getAfter().getPremierPrénom());
		if (p.getAfter().getDeuxièmePrénom() != null)
			if (! p.getAfter().getDeuxièmePrénom().equals(p.getBefore().getDeuxièmePrénom()))
				System.out.print( " " + p.getAfter().getDeuxièmePrénom());
		if (p.getAfter().getTroisièmePrénom() != null)
			if (! p.getAfter().getTroisièmePrénom().equals(p.getBefore().getTroisièmePrénom()))
				System.out.print( " " + p.getAfter().getTroisièmePrénom());
		System.out.println();
	}
}
