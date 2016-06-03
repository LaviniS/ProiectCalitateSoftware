package Facade;

import Clase.Carte;
import Clase.Manuscrise;
import Clase.Muzica;

public class BibliotecaFacade {

	//Facade
	public static void citesteCarte(int cotaCarte,String domeniu, String autor,
			int nrSala, int nrCititori){
		Carte c=new Carte(cotaCarte,domeniu,autor);
		SalaDeLectura sala=new SalaDeLectura(nrSala,false);
		
		sala.deschide();
		c.citeste(sala);
		sala.inchide();
		
}
	public static void citesteManuscris(String autor, int an, int nrSala){
		Manuscrise m=new Manuscrise(autor, an);
		SalaDeLectura sala1=new SalaDeLectura(nrSala, false);
		m.citesteManuscris(sala1);
	}
	

	}
