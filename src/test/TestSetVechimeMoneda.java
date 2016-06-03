package test;

import Clase.Monede;
import junit.framework.TestCase;

public class TestSetVechimeMoneda extends TestCase {
//unit testing pentru verificarea setter vechime moneda- valori normle
	public void testSettVechime(){
		Monede moneda1=new Monede("Franc", 460, "Franta");
		try {
			moneda1.setVechime(450);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Avem probleme", 450, moneda1.getVechime());
	}
	public void testSetVechimePreaMica(){
		Monede moneda1=new Monede("Ban", 150,"Bizantina");
		int vechimePreaMica=50;
		try {
			moneda1.setVechime(vechimePreaMica);
			fail("Accepta o vechime prea mica");
		} catch (Exception e) {
			
		}
	}
}
