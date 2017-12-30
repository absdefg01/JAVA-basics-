package exercice;

public class Enfant extends Personne implements Cloneable {

	private Jouet jouetPr�f�r�;
	
	public Enfant(int �ge, Patronyme patronyme, Jouet jouetPr�f�r�) {
		super(�ge, patronyme);
		this.jouetPr�f�r� = jouetPr�f�r�;
	}

	public Jouet getJouetPr�f�r�() {
		return jouetPr�f�r�;
	}

	public void setJouetPr�f�r�(Jouet jouetPr�f�r�) {
		this.jouetPr�f�r� = jouetPr�f�r�;
	}

	@Override
	public String toString() {
		return "Enfant [jouetPr�f�r�=" + jouetPr�f�r� + " "
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
