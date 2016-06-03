package test;

import Clase.Manuscrise;
import junit.framework.TestCase;

public class TestConstructor extends TestCase{
	
	Manuscrise man;
	
	
	public TestConstructor(String autor){
		super(autor);
	}
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testConstructorBun(){
		String autor="Mihai Eminescu";
		int an=1870;
		man=new Manuscrise(autor, an);
		assertEquals("Verific constructor ",autor, man.getAutor());
		assertEquals("Verific constructor ",an, man.getAn());
	}
	
	public void testConstructorNumeNull(){
		String autor=null;
		int an=1870;
		try{
			man=new Manuscrise(autor, an);
			fail("Nu arunca exceptie la numele autorului cand este null");
		}catch(Exception e){}
	}

}
