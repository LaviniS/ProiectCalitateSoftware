package test;

import Command.Bibliotecar;
import junit.framework.TestCase;

public class TestSetVarstaBibliotecar extends TestCase{

	Bibliotecar bibliotecar;
	
	public static final String nume=" Claudiu";
	public static final int varsta=20;
	
	public TestSetVarstaBibliotecar(String nume){
		super(nume);
	}
	
	public void setUp()throws Exception{
		super.setUp();
		this.bibliotecar=new Bibliotecar(nume, varsta);
	}
	
	public void tearDown() throws Exception{
		super.tearDown();
		this.bibliotecar=null;
	}
	
	public void testareaVarstaNormalaDeMunca(){
		int varstaN=28;
		bibliotecar.setVarsta(varstaN);
		assertEquals("Testarea varstei de lucru normale", varstaN, bibliotecar.getVarsta());
		
	}
	public void testareaVarstaInferioara(){
		int varstaN=15;
		try{
		bibliotecar.setVarsta(varstaN);
		fail("Accepta o varsta mai mica de 18 ani");
		}catch(Exception e){}
		}
	
	public void testareVarstaSuperioare(){
		int varstaS=70;
		try{
		bibliotecar.setVarsta(varstaS);
		fail("Nu se accepta o varsta mai mare de 65 ani");
		}catch(Exception e){}
		}
	
	public void testareVarstaMinimaDeMunca(){
		int varstaMinima=18;
		bibliotecar.setVarsta(varstaMinima);
		assertEquals("Test varsta minima", varstaMinima, bibliotecar.getVarsta());
	}
	
	public void testareVarstaMaximaDeMunca(){
		int varstaMaxima=65;
		bibliotecar.setVarsta(varstaMaxima);
		assertEquals("testare varsta maxima", varstaMaxima, bibliotecar.getVarsta());
	}
} 
