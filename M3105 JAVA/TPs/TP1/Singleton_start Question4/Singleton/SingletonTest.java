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
	 * v�rifier que la m�thode getInstance() renvoie bien un objet non nul 
	 */
	@Test
	public void test1() {
		assertNotNull(Singleton.getInstance());
	}
	
	/**
	 * 	v�rifier que la m�thode getInstance() renvoie bien toujours le m�me objet.�rifier que la m�thode getInstance() renvoie bien un objet de type Singleton. 
	 */
	@Test
	public void test2(){
		assertTrue(Singleton.getInstance() instanceof Singleton);
	}
	
	/**
	 * v�rifier que la m�thode getInstance() renvoie bien toujours le m�me objet
	 */
	@Test
	public void test3(){
		assertSame(Singleton.getInstance(),Singleton.getInstance());
	}

}
