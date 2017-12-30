package exercice;

public class Patronyme implements Cloneable {
	private String nom;
	private String pr�nom;
	
	public Patronyme(String nom, String pr�nom) {
		this.nom = nom;
		this.pr�nom = pr�nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}
	
	public Patronyme clone(){
		Patronyme p = null;
		try {
			p = (Patronyme) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	@Override
	public String toString() {
		return "Patronyme [nom=" + nom + ", pr�nom=" + pr�nom + "]";
	}
	
	
}
