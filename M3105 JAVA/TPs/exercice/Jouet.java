package exercice;

public class Jouet {
	private String nom;

	public Jouet(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Jouet [nom=" + nom + "]";
	}
	
	
}
