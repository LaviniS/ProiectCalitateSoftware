package test;

import Clase.CompositeAngajati;
import junit.framework.TestCase;

public class TestComposite extends TestCase {
	
	public void testAdaugaAngajat ()
	{		
	
		
		CompositeAngajati DirectorGeneral=new CompositeAngajati("Matei Cristian", "Director General", 20000);
		CompositeAngajati bibliotecarSef=new CompositeAngajati("Ionita Valeria", "bibliotecarSef", 2500);
		CompositeAngajati directorIT=new CompositeAngajati("Stana Robert", "directorIT", 6000);		
		CompositeAngajati bibliotecar=new CompositeAngajati("Stoian Bianca", "bibliotecar", 1500);
		CompositeAngajati programator=new CompositeAngajati("Visa Aurel","programator", 3000);
		
		DirectorGeneral.adaugaAngajat(bibliotecarSef);
		DirectorGeneral.adaugaAngajat(directorIT);		
		bibliotecarSef.adaugaAngajat(bibliotecar);
		directorIT.adaugaAngajat(programator);
		
		assertEquals(DirectorGeneral.getSubordonati().contains(bibliotecarSef), true);		
		assertEquals(DirectorGeneral.getSubordonati().contains(directorIT), true);
		assertEquals(directorIT.getSubordonati().contains(programator), true);
		assertEquals(bibliotecarSef.getSubordonati().contains(bibliotecar), true);
		
	}
	
	public void testStergeAngajat(){
		CompositeAngajati DirectorGeneral=new CompositeAngajati("Matei Cristian", "Director General", 20000);
		CompositeAngajati bibliotecarSef=new CompositeAngajati("Ionita Valeria", "bibliotecarSef", 2500);
		CompositeAngajati directorIT=new CompositeAngajati("Stana Robert", "directorIT", 6000);		
		CompositeAngajati bibliotecar=new CompositeAngajati("Stoian Bianca", "bibliotecar", 1500);
		CompositeAngajati programator=new CompositeAngajati("Visa Aurel","programator", 3000);
		
		DirectorGeneral.stergeAngajat(bibliotecarSef);
		DirectorGeneral.stergeAngajat(directorIT);		
		bibliotecarSef.stergeAngajat(bibliotecar);
		directorIT.stergeAngajat(programator);
		assertEquals(DirectorGeneral.getSubordonati().contains(bibliotecarSef), false);
		
	}
}
