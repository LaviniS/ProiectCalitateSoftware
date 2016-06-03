package test;

import Clase.BibliotecaSingleton;
import Clase.Carte;
import Clase.Muzica;
import Clase.Produs;
import Interfete.BibliotecaListener;
import junit.framework.TestCase;

public class TestObserver extends TestCase
{
	boolean notified=false;
	
	public void testAdaugaProdus ()
	{
		BibliotecaListener listener=new BibliotecaListener() {
			
			@Override
			public void bibliotecaModificata() {
				notified=true;
			}
		};
		
		BibliotecaSingleton.getInstance().adaugaBibliotecaListener(listener);
		BibliotecaSingleton.getInstance().adaugaProdus(new Carte (1, "", ""));
		System.out.print(notified+"");
		assertEquals(notified, true);
	}
	
	
	public void testEliminaProdus()
	{

		BibliotecaListener listener=new BibliotecaListener() {
			
			@Override
			public void bibliotecaModificata() {
				notified=true;
			}
		};
		
		BibliotecaSingleton.getInstance().adaugaBibliotecaListener(listener);
		BibliotecaSingleton.getInstance().eliminaProdus(new Muzica("muzica", "el", 1998, "jaz"));
		assertEquals(notified, true);
		
	}
	
	
}
