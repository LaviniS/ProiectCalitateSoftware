package test;

import Clase.Vedere;
import Command.Bibliotecar;
import junit.framework.TestCase;

public class TestSetDenumireVedere extends TestCase {
	Vedere vedere1;
	public static final String denumire="Marea Neagra";
	public static final int lungime=15;
	public static final int latime=8;
	public static final float greutate=5;
	
	public TestSetDenumireVedere(String denumire){
		super(denumire);
		
	}
	public void setUp()throws Exception{
		super.setUp();
		this.vedere1=new Vedere(denumire, lungime, latime, greutate);
	}
	public void tearDown() throws Exception{
		super.tearDown();
		this.vedere1=null ;
	}
	
	public void testDenumireNull(){
		String denumire=null;
		try{
		vedere1.setDenumire(denumire);
		fail("Accepta o denumire nulla");
		}catch(Exception e){}
	}
	 
	public void testareDenumiraPotrivita(){
		String denumireN="Marea rosie";
		vedere1.setDenumire(denumireN);
		assertEquals("Denumirea vederii este potrivita",denumireN, vedere1.getDenumire());
	}
	

}
