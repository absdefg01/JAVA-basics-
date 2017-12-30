package personne;

public class Personne extends Subject {
	
	private Memento before;
	private Memento after;
	
	public Personne(String nom, String pr�nom){
		this.before = new Memento();
		this.after = new Memento();
		this.after.setNom(nom);
		this.after.ajoutPr�nom(pr�nom);
		this.before = this.after.clone();
	}

	public String getNom() {
		return this.after.getNom();
	}

	public void setNom(String nom) {
		if (!this.after.getNom().equals(nom)){
			this.after.setNom(nom);
			this.notifyObservers();
			this.before = this.after.clone();
		}
	}

	public String getPremierPr�nom(){
		return this.after.getPremierPr�nom();
	}

	public String getDeuxi�mePr�nom(){
		return this.after.getDeuxi�mePr�nom();
	}
	
	public String getTrois�mePr�nom() {
		return this.after.getTroisi�mePr�nom();
	}
	
	public void ajoutPr�nom(String pr�nom) 
	{
		if (this.after.ajoutPr�nom(pr�nom)){
			this.notifyObservers();
			this.before = this.after.clone();
		}
	}

	public Memento getBefore() {
		return before;
	}

	public Memento getAfter() {
		return after;
	}
	
}
