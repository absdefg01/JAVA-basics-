package Singleton;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author ZHAO Mengzi
 * S3-GroupeA
 */
public class SingletonTest {
	
	/**
	 * vérifier que la méthode getInstance() renvoie bien un objet non nul 
	 */
	@Test
	public void test1() {
		assertNotNull(Singleton.getInstance());
	}
	
	/**
	 * 	vérifier que la méthode getInstance() renvoie bien toujours le même objet.érifier que la méthode getInstance() renvoie bien un objet de type Singleton. 
	 */
	@Test
	public void test2(){
		assertTrue(Singleton.getInstance() instanceof Singleton);
	}
	
	/**
	 * vérifier que la méthode getInstance() renvoie bien toujours le même objet
	 */
	@Test
	public void test3(){
		assertSame(Singleton.getInstance(),Singleton.getInstance());
	}

}
