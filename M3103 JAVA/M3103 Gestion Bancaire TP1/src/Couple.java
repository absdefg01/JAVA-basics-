
public class Couple<T1,T2>{
	private T1 Devise;
	private T2 Montant;
	
	public Couple(T1 d1, T2 m2){
		this.Devise = d1;
		this.Montant = m2;
	}

	public T1 getDevise() {
		return Devise;
	}

	public T2 getMontant() {
		return Montant;
	}

	
	
	
}
