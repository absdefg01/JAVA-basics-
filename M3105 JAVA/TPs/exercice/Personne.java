package exercice;

public class Personne {
	private int âge;
	private Patronyme patronyme;
	
	public Personne(int âge, Patronyme patronyme) {
		this.âge = âge;
		this.patronyme = patronyme;
	}

	public int getÂge() {
		return âge;
	}

	public void setÂge(int âge) {
		this.âge = âge;
	}

	public Patronyme getPatronyme() {
		return patronyme;
	}

	public void setPatronyme(Patronyme patronyme) {
		this.patronyme = patronyme;
	}

	@Override
	public String toString() {
		return "Personne [âge=" + âge + ", patronyme=" + patronyme + "]";
	}
	
	

}
