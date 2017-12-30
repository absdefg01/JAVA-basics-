package JeuxDeCartes;

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


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JeuxDeCarte implements Comparable{
	private List<Carte> paquets;
	private int nbCartesRestantes;
	
	public JeuxDeCarte(){
		this.paquets = new LinkedList<Carte>();
		for(Valeur v : Valeur.values()){
			for(Couleur c : Couleur.values()){
				this.paquets.add(new Carte(v,c));
			}
		}
	}
	
	public void classer(){
		Collections.sort(this.paquets, comparator);
	}
	
	public void mélanger(){
		Collections.shuffle(this.paquets);
	}
	
	private void rotationVersGauche(Carte[] tab){
		Carte tmp = tab[0];
		for(int i = 0; i < this.nbCartesRestantes-1; i++){
			tab[i+1]=tab[i];
		}
		tab[this.nbCartesRestantes-1]=tmp;
	}
	
	public void retourne(){
		System.out.print(this.paquets.get(0));
		Collections.rotate(this.paquets,-1);
	}
	
	public Carte distribue() throws Exception{
	
	}
	public String toString(){
		String retour = " ";
		for(Carte c : this.paquets){
			retour = c.toString();
		}
		return retour;
	}
	public void comparator implements Comparator<Carte>
		public int compareTo(Carte O1, Carte O2) {
			int retour;
			if(O1.getCouleur().ordinal()>O2.getCouleur().ordinal()){
				retour = -1;
			}else{
				if(O1.getCouleur().ordinal()==O2.getCouleur().ordinal()){
					retour = O1.getValeur().ordinal()-O2.getValeur().ordinal();
				}else{
					retour = -1;
				}
			}
			return retour;
	}
}


package JeuxDeCartes;

public class PaquetVide extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8285062940078232953L;

	public PaquetVide(){
		super("Paquet est vide");
	}

}


