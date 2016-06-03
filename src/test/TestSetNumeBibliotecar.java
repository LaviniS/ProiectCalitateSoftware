package test;

import Command.Bibliotecar;
import junit.framework.TestCase;

public class TestSetNumeBibliotecar extends TestCase {
	Bibliotecar bibliotecar1;
	
	public static final String nume="Cludiu";
	public static final int varsta=20;
	
	public TestSetNumeBibliotecar(String nume){
		super(nume);
	}
	
	public void setUp()throws Exception{
		super.setUp();
		this.bibliotecar1=new Bibliotecar(nume, varsta);
	}
	public void tearDown() throws Exception{
		super.tearDown();
		this.bibliotecar1=null;
	}
	
	public void testNumeNull(){
		String nume=null;
		try{
		bibliotecar1.setNume(nume);
		fail("Accepta un nume null");
		}catch(Exception e){}
	}
	
	public void testareNumePotrivit(){
		String numeNou="Claudiu";
		bibliotecar1.setNume(numeNou);
		assertEquals("Numele actual este potrivit",numeNou, bibliotecar1.getNume());
	}
	

	}
	

