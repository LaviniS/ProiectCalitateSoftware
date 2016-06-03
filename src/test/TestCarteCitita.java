package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Facade.BibliotecaFacade;
import junit.framework.TestCase;

public class TestCarteCitita extends TestCase
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	protected void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
    }
	
    protected void tearDown() throws Exception {
    	System.setOut(System.out);
    }
	
	public void testCitesteCarte()
	{
		BibliotecaFacade.citesteCarte(123, "It", "Ionita", 2102, 2);
		assertEquals("Sala de lectura este deschisa Cartea cu cota 123 scrisa de autorul Ionita este citita in sala de lectura 2102Sala de lectura este inchisa",
				outContent.toString().replace("\n", "").replace("\r", ""));
	}
	
}
