
public abstract class CompteBancaire {
	private String libelle;
	private float solde;
	private Devise devise;
	
	public CompteBancaire (String l, Devise d){
		this.libelle=l;
		this.devise=d;
	}
	public String getLibelle(){
		return this.libelle;
	}
	public Devise getDevise(){
		return this.devise;
	}
	
	@Override
	public String toString() {
		return ("Compte Bancaire : " + libelle + "( " + solde + " - " + devise + " ) ");
	}
	
	public void Crediter(Couple< Devise, Float > c){
		this.solde += OutilsFinanciers.Convertir(c, this.devise).getMontant();
	}
	
		
	
}
