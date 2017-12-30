package exercice;

public class Enfant extends Personne implements Cloneable {

	private Jouet jouetPréféré;
	
	public Enfant(int âge, Patronyme patronyme, Jouet jouetPréféré) {
		super(âge, patronyme);
		this.jouetPréféré = jouetPréféré;
	}

	public Jouet getJouetPréféré() {
		return jouetPréféré;
	}

	public void setJouetPréféré(Jouet jouetPréféré) {
		this.jouetPréféré = jouetPréféré;
	}

	@Override
	public String toString() {
		return "Enfant [jouetPréféré=" + jouetPréféré + " "
				+ super.toString() + "]";
	}
	
	public Enfant clone(){
		Enfant ef = null;
		try {
			ef = (Enfant) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ef;
	}
}
