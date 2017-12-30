package personne;

public class ObserverEtatCivil implements Observer {

	
	@Override
	public void update(Subject s) {
		Personne p = (Personne) s;
		if (!p.getAfter().getNom().equals(p.getBefore().getNom()))
			this.changementDeNom(p);
		else
			this.ajouterPr�nom(p);
	}

	private void changementDeNom(Personne p) {
		System.out.println("Changement de nom " + p.getBefore().getNom() + " devient " + p.getAfter().getNom());
		System.out.println("Supprimmer carte d'identit� pour " + p.getBefore().getNom());
		System.out.println("Reg�n�rer carte d'identit� pour " + p.getAfter().getNom());
	}

	private void ajouterPr�nom(Personne p) {
		System.out.print("Ajouter pr�nom carte d'identit� pour " + p.getAfter().getNom());
		if (! p.getAfter().getPremierPr�nom().equals(p.getBefore().getPremierPr�nom()))
			System.out.print( " " + p.getAfter().getPremierPr�nom());
		if (p.getAfter().getDeuxi�mePr�nom() != null)
			if (! p.getAfter().getDeuxi�mePr�nom().equals(p.getBefore().getDeuxi�mePr�nom()))
				System.out.print( " " + p.getAfter().getDeuxi�mePr�nom());
		if (p.getAfter().getTroisi�mePr�nom() != null)
			if (! p.getAfter().getTroisi�mePr�nom().equals(p.getBefore().getTroisi�mePr�nom()))
				System.out.print( " " + p.getAfter().getTroisi�mePr�nom());
		System.out.println();
	}
}
