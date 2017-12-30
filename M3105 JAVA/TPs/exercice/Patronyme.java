package exercice;

public class Patronyme implements Cloneable {
	private String nom;
	private String prénom;
	
	public Patronyme(String nom, String prénom) {
		this.nom = nom;
		this.prénom = prénom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
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
		return "Patronyme [nom=" + nom + ", prénom=" + prénom + "]";
	}
	
	
}
