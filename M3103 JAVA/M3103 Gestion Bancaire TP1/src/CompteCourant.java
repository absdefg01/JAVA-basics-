
public class CompteCourant extends CompteBancaire {

	public CompteCourant(String l, Devise d) {
		super(l, d);
	}
	
	public void Debiter(Couple< Devise, Float > c){
		this. -= OutilsFinanciers.Convertir(c, this.getDevise()).getMontant();
	}
	
	
}
