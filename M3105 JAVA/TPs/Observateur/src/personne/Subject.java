package personne;

import java.util.LinkedHashSet;
import java.util.Set;

public class Subject {
	
	private Set<Observer> observers;
	
	public Subject(){
		this.observers = new LinkedHashSet<Observer>();
	}
	
	public void attach(Observer obs){
		this.observers.add(obs);
	}
	
	public void detach(Observer obs){
		this.observers.remove(obs);
	}
	
	public void notifyObservers(){
		for (Observer obs : this.observers){
			obs.update(this);
		}
	}
}
