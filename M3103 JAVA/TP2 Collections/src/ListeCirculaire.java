import java.util.ArrayList;
import java.util.List;


public class ListeCirculaire<T>{
	private List<T> l;
	private int i;	//indice de list
	
	public ListeCirculaire(int i) {
		this.l = new ArrayList<T>();
		this.i = i;
	}
	
	public int getIndice(){
		return this.i;
	}
	
	/**
	 * nb est un élement ajouté à la fin d'une liste
	 */
	public void ajouter(T nb){
		this.l.add(nb);
	
	}
	
	/**
	 * positionne le curseur de lecture au début dela liste 
	 * puis retourne le premier élément
	 */
	public T premier() throws ListeVide{
		
		return this.l.get(0);
	}
	
	/**
	 * @param indiceSuivant
	 * @return l’élément suivant de la liste circulaire
	 */
	public T suivant(int indiceSuivant)throws ListeVide{
		
		indiceSuivant = (this.i + 1)%this.l.size();
		return this.l.get(indiceSuivant);
	}
	

	
	

}
