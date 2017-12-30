public class Touche{
	private ListeCirculaire<Character> chaine; 	//une touche reposera sur une liste circulaire de caractères

	public Touche(String c) throws ListeVide {
		
		for(int i = 0; i < c.length()-1;i++)
		{
			
			this.chaine.ajouter(c.charAt(i));
		}
	}
	
	public Character getCharacter(int n) throws ListeVide
	{
		int i;
		this.chaine.premier();
		for(i = 0; i<n-1;i++){
			this.chaine.suivant(i);
		}
		return this.chaine.suivant(i);
		
	}

}
