package Singleton;

/**
 * 
 * @author ZHAO Mengzi
 *S3-GroupeA
 */

/**
 *cr�er une classe n�a qu�une seule instance en m�moire 
 *permet un acc�s global � celle-ci
 */
public class Singleton {
	
	/**
	 * cr�er une instance
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
	 * m�thode pour afficher cet instance
	 */
	public void doSomething()
	{
		System.out.println(instance);	
	}
}
