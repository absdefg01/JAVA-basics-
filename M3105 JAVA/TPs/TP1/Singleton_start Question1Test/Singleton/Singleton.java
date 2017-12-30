package Singleton;

/**
 * 
 * @author ZHAO Mengzi
 *S3-GroupeA
 */

/**
 *créer une classe n’a qu’une seule instance en mémoire 
 *permet un accès global à celle-ci
 */
public class Singleton {
	
	/**
	 * créer une instance
	 */
	private static Singleton instance;
	
	/**
	 * constructeur
	 */
	private Singleton() {}
	
	/**
	 * accesseur
	 * @return une instance
	 */
	public static synchronized Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
	
	/**
	 * méthode pour afficher cet instance
	 */
	public void doSomething()
	{
		System.out.println(instance);	
	}
}
