import java.util.ArrayList;


public class ExpressionArithmetique {
	
	protected ArrayList<ExpressionArithmetique> liste; 

	public ExpressionArithmetique() {
		liste = new ArrayList<ExpressionArithmetique>();
	}

	public void add(ExpressionArithmetique expr) {
		this.liste.add(expr);
	}

	public void add(Entier entier) {
		this.liste.add(entier);
		
		
	}

	public int evaluate(){
		int result = 0;
		Integer var ;
		
		
			var = this.liste.get(0).evaluate();

		result =var;
		for(int i =1; i< this.liste.size(); i++){
			var =  this.liste.get(i).evaluate() ;
			result = result+var;
			
		}
		return  result;
		

	}
}
