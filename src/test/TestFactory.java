package test;

import Clase.Carte;
import Clase.Manuscrise;
import Clase.Monede;
import Clase.Muzica;
import Clase.Produs;
import Clase.ProdusFactory;
import junit.framework.TestCase;

public class TestFactory extends TestCase
{
	
	public void testMuzica()
	{
		assertEquals (ProdusFactory.createInstance(Muzica.class) instanceof Muzica, true);
		
	}
	public void testMonede()
	{
		assertEquals(ProdusFactory.createInstance(Monede.class)instanceof Monede,true);
	}
	public void testManuscrise()
	{
		assertEquals(ProdusFactory.createInstance(Manuscrise.class) instanceof Manuscrise, true);
	}
	public void testCarte()
	{
		assertEquals(ProdusFactory.createInstance(Carte.class)instanceof Carte, true);
	}
}
