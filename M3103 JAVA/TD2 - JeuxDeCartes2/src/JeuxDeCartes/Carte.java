package JeuxDeCartes;

enum Valeur {Sept, Huit, Neuf, Dix, Valet, Dame, Roi, As}
enum Couleur{Pique, Coeur, Carreau, Trèfle}

public class Carte {
	private Valeur valeur;
	private Couleur couleur;
	
	public Carte(Valeur valeur, Couleur couleur){
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public Valeur getValeur(){
		return this.valeur;
	}
	
	public Couleur getCouleur(){
		return this.couleur;
	}
	
	public String toString(){
		return this.valeur + "De" + this.couleur;
	}

}
