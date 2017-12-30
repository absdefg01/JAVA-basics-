
public class Entier extends ExpressionArithmetique {
	private int valeur ;

	public Entier(int i) {
		this.valeur = i;
		
	}

	public int evaluate() {
		return valeur;
	}

}
