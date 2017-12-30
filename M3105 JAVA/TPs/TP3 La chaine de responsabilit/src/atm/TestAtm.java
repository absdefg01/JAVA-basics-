package atm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestAtm {

	private Distributeur d;
	
	@Before
	public void setUp() throws Exception {
		d = new Distributeur(10, 10, 10, 10);
	}

	@After
	public void tearDown() throws Exception {
		d = null;
	}

	@Test
	public void testDonnerBillets10() {
		List<Couple> proposition = d.donnerBillets(10);
		assertEquals(0,d.montantRestantDû(proposition, 10));
		assertEquals(10, proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		
	}
	
	@Test
	public void testDonnerBillets20() {
		List<Couple> proposition = d.donnerBillets(20);
		assertEquals(0,d.montantRestantDû(proposition, 20));
		assertEquals(10, proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
	}
	
	@Test
	public void testDonnerBillets30() {
		List<Couple> proposition = d.donnerBillets(30);
		assertEquals(0,d.montantRestantDû(proposition, 30));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(1,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void testDonnerBillets40() {
		List<Couple> proposition = d.donnerBillets(40);
		assertEquals(0,d.montantRestantDû(proposition, 40));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void testDonnerBillets50() {
		List<Couple> proposition = d.donnerBillets(50);
		assertEquals(0,d.montantRestantDû(proposition, 50));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(1,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void testDonnerBillets100() {
		List<Couple> proposition = d.donnerBillets(100);
		assertEquals(0,d.montantRestantDû(proposition, 100));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(1,proposition.get(2).getNombreBilletsDélivrés());
	}
}