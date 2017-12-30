package personne;

public class Personne extends Subject {
	
	private Memento before;
	private Memento after;
	
	public Personne(String nom, String prénom){
		this.before = new Memento();
		this.after = new Memento();
		this.after.setNom(nom);
		this.after.ajoutPrénom(prénom);
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

	public String getPremierPrénom(){
		return this.after.getPremierPrénom();
	}

	public String getDeuxièmePrénom(){
		return this.after.getDeuxièmePrénom();
	}
	
	public String getTroisèmePrénom() {
		return this.after.getTroisièmePrénom();
	}
	
	public void ajoutPrénom(String prénom) 
	{
		if (this.after.ajoutPrénom(prénom)){
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
