package exercice;

public class Personne {
	private int �ge;
	private Patronyme patronyme;
	
	public Personne(int �ge, Patronyme patronyme) {
		this.�ge = �ge;
		this.patronyme = patronyme;
	}

	public int get�ge() {
		return �ge;
	}

	public void set�ge(int �ge) {
		this.�ge = �ge;
	}

	public Patronyme getPatronyme() {
		return patronyme;
	}

	public void setPatronyme(Patronyme patronyme) {
		this.patronyme = patronyme;
	}

	@Override
	public String toString() {
		return "Personne [�ge=" + �ge + ", patronyme=" + patronyme + "]";
	}
	
	

}
