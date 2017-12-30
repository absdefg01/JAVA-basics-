TD2 JeuDeCarte
tableau, list, enum

package JeuxDeCartes;

enum Valeur {Sept, Huit, Neuf, Dix, Valet, Dame, Roi, As}
enum Couleur {Pique, Coeur, Carreau, Tretle}

public class Carte {
	private Valeur valeur;
	private Couleur couleur;
	
	/**
	 * constructeur
	 */
	public Carte(Valeur valeur, Couleur couleur){
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	/**
	 * accesseur
	 * @return valeur des cartes
	 */
	public Valeur getValeur(){
		return this.valeur;
	}
	/**
	 * accesseur
	 * @return couleur des cartes
	 */
	public Couleur getCouleur(){
		return this.couleur;
	}

	public String toString() {
		return this.valeur + "De" + this.couleur;
	}

}


package JeuxDeCartes;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JeuxDeCartes {
	private Carte[] paquets;
	private int nbCartesRestantes;
	
	/**
	 * constructeur
	 * @param unJeuxDeCarte
	 */
	public JeuxDeCartes(){
		this.paquets = new Carte[Valeur.values().length*Couleur.values().length];
		int ii = 0;
		for(Valeur v : Valeur.values()){
			for(Couleur c : Couleur.values()){
				this.paquets[ii] = new Carte(v,c);
				ii++;
				System.out.println(this.paquets[ii]);
			}
		}
		this.nbCartesRestantes = this.paquets.length;
	}

	public void classer(){
		//implemetation du tri à billes
		boolean echange;
		do{
			echange = false;
			for (int i=0; i<this.nbCartesRestantes; i++){
				if( (this.paquets[i].getCouleur().ordinal()>this.paquets[i+1].getCouleur().ordinal())||
						(this.paquets[i].getCouleur().ordinal()==this.paquets[i+1].getCouleur().ordinal()&&(this.paquets[i].getValeur().ordinal()>this.paquets[i+1].getValeur().ordinal())) ){
					Carte c = this.paquets[i];
					this.paquets[i]=this.paquets[i+1];
					this.paquets[i+1]=c;
					echange = true;
				}
			}
		}while(echange);
	}
	
	public void mélanger(){
		List<Integer> indicePossible = new LinkedList<Integer>();
		//Initialisation des indices possibles
		for(int i = 0; i<this.nbCartesRestantes; i++){
			indicePossible.add(i);	
		}
		//création du nouveau tableau
		Carte[] nouveau = new Carte[this.paquets.length];
		Random rand = new Random();
		int indice;
		for(int i=0; i< this.nbCartesRestantes; i++){
			indice = rand.nextInt(indicePossible.size());
			nouveau[i] = this.paquets[indicePossible.get(indice)];
			indicePossible.remove(indice);
		}
		this.paquets=nouveau;
	}
	
	private void rotationsVersGauche(Carte[] tab){
		Carte tmp = tab[0];
		for (int i = 0; i<this.nbCartesRestantes-1; i++){
			tab[i]=tab[i+1];
		}
		tab[this.nbCartesRestantes-1]=tmp;
	}
	
	public String retourne(){
		this.rotationsVersGauche(this.paquets);
		return this.paquets[this.nbCartesRestantes-1].toString();
	}
	
	public Carte distribue() throws PaquetVide{
		if (this.nbCartesRestantes == 0){
			throw new PaquetVide();
		}
		Carte tmp = this.paquets[0];
		this.rotationsVersGauche(this.paquets);
		this.nbCartesRestantes--;
		return tmp;
	}
	

}


package JeuxDeCartes;

public class PaquetVide extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaquetVide(){
		super("Paquet de carte vide ! ");
	}

}

package JeuxDeCartes;

import java.util.Collections;
import java.util.Comparator;
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
		Comparator<?super Carte> comparator = null;
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
	/**
	public Carte distribue() throws Exception{
	
	}
	*/
	
	public String toString(){
		String retour = " ";
		for(Carte c : this.paquets){
			retour = c.toString();
		}
		return retour;
	}
	public static int compareTo(Carte O1, Carte O2){
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






