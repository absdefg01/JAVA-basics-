package personne;


import java.util.Deque;
import java.util.LinkedList;

public class Agence extends Subject 
{
	private Deque <String> article;
	private Agence before;
	private Agence after;
	
	public Agence (String notif)
	{
		this.article = new LinkedList<String>();
	}
	
	public String getDernierArticle()
	{
		return this.article.getLast();
	}
	
	public void ajouterArticle(String a)
	{
		this.article.addLast(a);
	}
	
	public Agence getBefore()
	{
		return this.before;
	}
	
	public Agence getAfter()
	{
		return this.after;
	}
}
	
	
	
	


