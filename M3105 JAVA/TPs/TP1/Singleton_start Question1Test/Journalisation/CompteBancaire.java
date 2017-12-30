package Journalisation;

public class CompteBancaire {
	private int numero;
	private double solde;

	public CompteBancaire(int numero) {
		this.numero = numero;
		this.solde = 0.0;
	}

	public void déposer(double montant) {
		if (montant > 0.0) {
			solde += montant;
			Journal.getInstance("Informations").ajouterLog("Dépôt de " + montant + "€ sur le compte " + numero + ".");
		} else {
			Journal.getInstance("Erreur").ajouterLog("/!\\ Dépôt d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
	public void retirer(double montant) {
		if (montant > 0.0) {
			if (solde >= montant) {
				solde -= montant;
				Journal.getInstance("Informations").ajouterLog("Retrait de " + montant + "€ sur le compte " + numero+ ".");
			} else {
				Journal.getInstance("Erreur").ajouterLog("/!\\ La banque n'autorise pas de découvert (" + numero+ ").");
			}
		} else {
			Journal.getInstance("Erreur").ajouterLog("/!\\ Retrait d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
}
