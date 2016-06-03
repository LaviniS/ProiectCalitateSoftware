package test;

import Command.Cititor;
import junit.framework.TestCase;

public class CitittoriTesting extends TestCase {
	 Cititor cititor1;
	
	public CitittoriTesting(String name){
		super(name);
	}
	
	protected void setUp() throws Exception {

		super.setUp();

		cititor1 =new Cititor("Popescu","Andrei");

		}
	
	protected void tearDown() throws Exception {

		super.tearDown();

		cititor1 = null;

		}
	
	public void testCititor(){
		assertNotNull("Nu se poate crea intanta", cititor1 );
	}
	public void testGetNumeCititor(){
		assertEquals("Numele nu este corect", "Popescu", cititor1.getNume());
	}
	
	
	public void testSetNumeCititor(){
		cititor1.setNume("Ilie");
		assertEquals("Numele este incorect","Ilie", cititor1.getNume());
	try{
		cititor1.setNume(null);
		fail("IllegalArgumentException nu trebuie sa avem proprietaatea null");
	}catch(IllegalArgumentException iae){}
	}
	
	public void testGetPrenumeCititor(){
		assertEquals("Prenumele nu este corect", "Andrei", cititor1.getPrenume ());
	}
	
	public void testSetPrenumeCititor(){
		cititor1.setPrenume("Stefan");
		assertEquals("Prenumele este incorect","Stefan", cititor1.getPrenume());
	}
	
}

