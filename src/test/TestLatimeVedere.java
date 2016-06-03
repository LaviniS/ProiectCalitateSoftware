package test;

import Clase.Vedere;
import junit.framework.TestCase;

public class TestLatimeVedere extends TestCase{
	
	Vedere vedere=new Vedere();
	public static final String denumire="Marea Neagra";
	public static final int lungime=15;
	public static final int latime=8;
	public static final float greutate=5;
	
	
	public void testareLatimeNormala(){
		int latime=20;
		vedere.setLatime(latime);
		assertEquals("testarea unei latimi normale", latime, vedere.getLatime());
	}
	
	public void testareLatimeNegativa(){
		int latimeNegativa=-5;
		try{vedere.setLatime(latimeNegativa);
		fail("Metoda accepta valori negative");
		}catch(Exception e){}
	}
	
	public void testareLatimeMinima(){
		int latimeMinima=1;
		vedere.setLatime(latimeMinima);
		assertEquals("Latimea minima",latimeMinima,vedere.getLatime());
	}
	
	public void testareLatimeMaxima(){
		int latimeMaxima=50;		
		vedere.setLatime(latimeMaxima);
		assertEquals("Latime maxima", latimeMaxima, vedere.getLatime());
		}
	
	
	public void testareLatimeZero(){
		int latimeZero=0;
		try{
		vedere.setLungime(latimeZero);
		fail("Metoda accepta latimea =0");
		}catch(Exception e){}
	}
	
	

	
}
