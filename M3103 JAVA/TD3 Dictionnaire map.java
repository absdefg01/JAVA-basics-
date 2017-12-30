
public class Contact {
	
	private String nom;
	private String prénom;

	public Contact(String nom, String prénom) {
		this.nom = nom;
		this.prénom = prénom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrénom() {
		return prénom;
	}

	@Override
	public String toString() {
		return this.prénom + this.nom;
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Gestionnaire implements Comparable{
	private Map<String,Contact> liste;
	
	public Gestionnaire(){
		this.liste = new HashMap<String,Contact>();
	}
	
	public void ajouterContact(Contact c){
		if(c != null){
			Set<Contact> set = (Set<Contact>) this.liste.get(c.toString());
			if(set == null){
				set = new HashSet<Contact>();
				this.liste.put(c.toString(),(Contact) set);
			}
			this.liste.put(c.toString(), c);
			set.add(c);
		}
	}
	
	public Contact rechercherContact(String nom, String prénom){
		Contact retour = null;
		String cle = nom + " " + prénom;
		Set<Contact> elements = (Set<Contact>) this.liste.get(cle);
		if(elements != null){
			Iterator<Contact> valeurs = elements.iterator();
			retour = valeurs.next();
		}
		return retour;
	}

	@Override
	public int compareTo(Object o) {
		if(o != null){
			return this.toString().compareTo(o.toString());
		}else{
			return -1;
		}
	}
	
	public void afficheOrdreAlphbet(){
		List<String> cles = new ArrayList<String>(this.liste.keySet());
		Collections.sort(cles);
		for(String cle : cles){
			Set<Contact> elements = (Set<Contact>) this.liste.get(cles);
			for(Contact c : elements){
				System.out.println(c.toString());
			}
		}
	}
}
