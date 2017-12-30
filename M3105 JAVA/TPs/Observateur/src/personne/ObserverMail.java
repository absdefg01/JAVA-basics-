package personne;

public class ObserverMail  {
	
	public void update(Subject s) 
	{
		Agence n = (Agence)  s;
		if (!n.getAfter().getDernierArticle().equals(n.getBefore().getDernierArticle()))
			System.out.println("Nouvelle notification mail :" + n.getAfter().getDernierArticle()); 

	}
}
	
	
