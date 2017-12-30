

public class ExpressionDiv extends ExpressionArithmetique {

	
	

	public ExpressionDiv() {
		super();
	}

	
	public int evaluate(){
		int result = 0;
		Integer var ;
		
		
			var = this.liste.get(0).evaluate();

		result =var;
		for(int i =1; i< this.liste.size(); i++){
			var =  this.liste.get(i).evaluate();
			result = result/var;
			
		}
		return  result;
	}
}
