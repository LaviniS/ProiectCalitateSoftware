package test;

import Clase.Carte;
import Flyweight.CarteFactory;
import Flyweight.Pozitie;
import junit.framework.TestCase;

public class TestCarteFactory extends TestCase {

	public void testAseazaCarte ()
	{
		CarteFactory carteF=new CarteFactory();
		Pozitie poz=new Pozitie(25,36,12);
		Carte c1=carteF.getCarte(126, "Chimie", "Paul Vladescu");
		c1.aseazaCarte(poz);
		assertEquals(c1.pozitie.getPozA(), poz.getPozA());
		assertEquals(c1.pozitie.getPozB(), poz.getPozB());
		assertEquals(c1.pozitie.getPozC(), poz.getPozC());
	}
}
