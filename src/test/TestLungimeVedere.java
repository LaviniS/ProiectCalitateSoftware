package test;

import Clase.Vedere;
import junit.framework.TestCase;

public class TestLungimeVedere extends TestCase {
	Vedere vedere=new Vedere();
	public static final String denumire="Marea Neagra";
	public static final int lungime=15;
	public static final int latime=8;
	public static final float greutate=5;
	
	
	public void testareLungimeNormala(){
		int lungime=20;
		vedere.setLungime(lungime);
		assertEquals("testarea unei lungimi normale", lungime, vedere.getLungime());
	}
	
	public void testareLungimeNegativa(){
		int lungimeNegativa=-10;
		try{vedere.setLungime(lungimeNegativa);
		fail("Metoda accepta valori negative");
		}catch(Exception e){}
	}
	
	public void testareLungimeMinima(){
		int lungimeMinima=1;
		vedere.setLungime(lungimeMinima);
		assertEquals("Lungimea minima",lungimeMinima,vedere.getLungime());
	}
	
	public void testareLungimeMaxima(){
		int lungimeMaxima=100;
		vedere.setLungime(lungimeMaxima);
		assertEquals("Lungimea maxima", lungimeMaxima, vedere.getLungime());
	}
	
	public void testareLungimeZero(){
		int lungimeZero=0;
		try{
		vedere.setLungime(lungimeZero);
		fail("Metoda accepta lungimea =0");
		}catch(Exception e){}
		
	}
}
