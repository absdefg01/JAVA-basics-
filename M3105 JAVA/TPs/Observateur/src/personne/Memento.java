package personne;

import java.util.LinkedList;
import java.util.List;

public class Memento implements Cloneable {

	private String nom;
	
	private String[] notification;

	private List<String> prénoms;

	public Memento(){
		this.nom = null;
		this.prénoms = new LinkedList<String>();
		this.notification = new String[100];
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPremierPrénom() {
		if (this.prénoms.size() > 0)
			return this.prénoms.get(0);
		else
			return null;
	}
	
	public String getDeuxièmePrénom() {
		if (this.prénoms.size() > 1)
			return this.prénoms.get(1);
		else
			return null;
	}
	
	public String getTroisièmePrénom() {
		if (this.prénoms.size() > 2)
			return this.prénoms.get(2);
		else
			return null;
	}
	
	public boolean ajoutPrénom(String prénom) {
		if (this.prénoms.size() < 3){
			this.prénoms.add(prénom);
			return true;
		}
		return false;
	}
	
	public Memento clone() {
		Memento memento = null;
		try {
			memento = (Memento) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		memento.prénoms = new LinkedList<String>();
		for (String s : this.prénoms) {
			memento.prénoms.add(s);
		}
		return memento;
	}
	
	public void addNotification(String notif) throws Exception
	{
		if (this.notification.length == 100) throw new Exception("Notif pleine");

		{
				for(int i = 0; i < this.notification.length-1;i++){
				this.notification[i] = this.notification[i+1];
			}
		}
	}

	public Memento getderniereNotification() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
