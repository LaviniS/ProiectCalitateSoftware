package Main;

import java.io.*;
//import java.util.Map.Entry;
import java.util.*;

import Clase.BibliotecaSingleton;
import Clase.Carte;
import Clase.CompositeAngajati;
import Clase.Manuscrise;
import Clase.Monede;
import Clase.Muzica;
import Clase.Produs;
import Clase.ProdusFactory;
import Clase.Vedere;
import Clase.VedereBuilder;
import Command.Bibliotecar;
import Command.Cititor;
import Command.SolicitaCarte;
import Command.SolicitaManuscrise;
import Facade.BibliotecaFacade;
import Flyweight.CarteFactory;
import Flyweight.Pozitie;
import Strategy.Imprumuta;
import Strategy.ScaneazaCod;





public class Main extends Thread {
	public static ArrayList<Integer> lista = new ArrayList<>();



	public static void main(String[] args) {
		
		
		new MainFrame();	
		
	String[] carti={"Poezii", "Istorie","Romane","Psihologie","Anatomie","Filozofie"};
		List<String> list=new ArrayList<String>();
		
		for(String x:carti){
			list.add(x);
		}
		
		for(int i=0;i<list.size();i++){
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(list.get(i));
			
		}
		
		String[] monede={"franci","euro","dolari","lire"};
		List<String>list2=new  ArrayList<String>();
		
		for(String y:monede){
			list2.add(y);
			
			for(int j=0;j<list2.size();j++){
			
			
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				*/
			System.out.println(list2.get(j));
			
			
		}
			Monede moneda1=new Monede("Franc", 450, "Franta");
			try {
				moneda1.setVechime(460);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Monede moneda2=new Monede("Ban", 50, "Bizantina");
			try {
				moneda2.setVechime(150);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		String[] muzica={"jaz","rock","dance","folclor","pop"};
		List<String>list3=new ArrayList<String>();
		
		for(String z:muzica){
			list3.add(z);
		}
		for(int t=0;t<list3.size();t++){
		System.out.println(list3.get(t));
	
	}
		
		
		
		//Scrierea in fisier text
		try {
		File fisier= new File("fisier.txt");
		
			FileWriter scrie=new FileWriter(fisier);
			BufferedWriter buf=new BufferedWriter(scrie);
			buf.write("Cartea Istoria Romanilor are cota 4562, este din domeniul Istorie si  este scrisa de istorici contemporani");
			buf.write("\n Cartea Muntii Carpati are cota 4568, este din domeniul Geografie si  este scrisa de Vlada Ionut");
			buf.write("\n Cartea Pezii are cota 4572, este din domeniul Literaura si  este scrisa de Mihai Eminescu");
			buf.write("\n Manuscrisul apartine autorului Mihai Eminescu si este din anul 1879");
			buf.write("\n Monedele sunt de origine franceza si sunt din anul 1700");
			buf.write("\n Monedele sunt de origine ceha si  sunt din anul 1800");
							
			buf.close();
			scrie.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/////////////////////////////////////////////////////////////
		//citirea din fisier text
	
		
		  try {
		File fisier=new File("fisier.txt");
		
			FileReader citeste=new FileReader(fisier);

			BufferedReader buff=new BufferedReader(citeste);
			System.out.println(buff.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		  
		  //SINGLETON
		  System.out.println("\nSingleton");
		  BibliotecaSingleton.getInstance().setDenumire("Biblioteca Academiei Romane");
		  BibliotecaSingleton.getInstance().setId(123);
		  System.out.println(BibliotecaSingleton.getInstance().toString());
		  
		 
		  
		  //Factory
		  System.out.println("\nSImple Factory");
			
			try {
				System.out.println(ProdusFactory.createInstance(Muzica.class).toString());
			System.out.println(ProdusFactory.createInstance(Monede.class).toString());
			System.out.println(ProdusFactory.createInstance(Carte.class).toString());
			System.out.println(ProdusFactory.createInstance(Manuscrise.class).toString());
			System.out.println(ProdusFactory.createInstance((Class<?extends Produs>)Produs.class).toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		  
		  ////
		  //Builder
		  //////////
		  
			Clase.Vedere veder=new VedereBuilder().Greutate(10.0f)
					.Nume("Marea Neagra")
					.Lungime(20)
					.Latime(6)
					.build();
			System.out.println("\nBuilder");
			System.out.println(veder.toString());
			
			////
			
			//FACADE
			
			//
			
			System.out.println("\nFACADE");
			
			
			BibliotecaFacade.citesteCarte(123, "It", "Ionita", 2102, 2);
			BibliotecaFacade.citesteCarte(223, "Literatura", "anonim", 23012, 3);
			BibliotecaFacade.citesteManuscris("Mihai Eminescu", 1880, 1235);
	
			
			////////////
		//COMPOSITE
			////////////
		
		
			System.out.println("\nCOMPOSITE");
						
			CompositeAngajati DirectorGenera=new CompositeAngajati("Matei Cristian", "Director General", 20000);
			CompositeAngajati bibliotecarSef=new CompositeAngajati("Ionita Valeria", "bibliotecarSef", 2500);
			CompositeAngajati directorIT=new CompositeAngajati("Stana Robert", "directorIT", 6000);
			
			CompositeAngajati bibliotecar=new CompositeAngajati("Stoian Bianca", "bibliotecar", 1500);
			CompositeAngajati programator=new CompositeAngajati("Visa Aurel","programator", 3000);
			
			DirectorGenera.adaugaAngajat(bibliotecarSef);
			DirectorGenera.adaugaAngajat(directorIT);
			
			bibliotecarSef.adaugaAngajat(bibliotecar);
			directorIT.adaugaAngajat(programator);
			
			System.out.println(DirectorGenera);
			
			for(CompositeAngajati superiori:DirectorGenera.getSubordonati())
			{
				System.out.println(superiori);
			
			
			for(CompositeAngajati angajati: superiori.getSubordonati()){
				System.out.println(angajati);
			}
			}
			
		
			
			//////////////
			
			//COMAND
			/////////////
			
			System.out.println("\nCOMAND");
			Bibliotecar bibliotecar1=new Bibliotecar("Claudiu", 25);
			
			String denumire="";
			
			Cititor c1=new Cititor(denumire);
			c1.pregatesteLista(new SolicitaCarte(bibliotecar1, "Carte"));
			c1.pregatesteLista(new SolicitaManuscrise(bibliotecar1, "Mihai Eminescu"));
		    c1.solicitaComenzi();
		}
		
		
		/////////////
		//Flyweight
		//}
		System.out.println("FLYWEIGHT");
		CarteFactory carte1=new CarteFactory();
		Pozitie poz=new Pozitie(25,36,12);
		
		Carte c1=carte1.getCarte(123, "IT", "Paul Vladescu");
		Carte c2=carte1.getCarte(456, "Literatura", "Mihai Eminescu");
		Carte c3=carte1.getCarte(789, "Istorie", "Emil Vlad");
		
		poz=new Pozitie(12,15,30);
		carte1.getCarte(123, "IT", "Paul Vladescu").aseazaCarte(poz);
		poz=new Pozitie(20,25,40);
		carte1.getCarte(456, "Literatura", "Mihai Eminescu").aseazaCarte(poz);;
		poz=new Pozitie(15,30,40);
		carte1.getCarte(789, "Istorie", "Emil Vlad").aseazaCarte(poz);;

		System.out.println("Numarul de carti asezate:"+ carte1.getSize());
		
		//}
		
		//Strategy
		
		System.out.println("Strategy\n");
		Carte carteN=new Carte(10, "Literatura", "Mircea Eliade");
		carteN.setStrategy(new ScaneazaCod());		
		carteN.metodaStrategy(carteN);
		
		carteN=new Carte(10, "Literatura", "Mircea Eliade");
		carteN.setStrategy(new Imprumuta());
		carteN.metodaStrategy(carteN);
	
		
		
}
}
