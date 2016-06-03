package Clase;

import java.io.Serializable;

import Facade.SalaDeLectura;
import Flyweight.Pozitie;
import Strategy.InterfataStrategy;

public class Carte extends Produs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1015869418401211370L;
	
	private int cota;
	private String domeniu;
	private String autor;
	
	public Pozitie pozitie;
	public InterfataStrategy strategy;
	


	public Carte(int cota, String domeniu, String autor) {
		super();
		this.cota = cota;
		this.domeniu = domeniu;
		this.autor = autor;
	}
	
	
	public Carte() {
		super();
		this.domeniu="IT";
	}


	public int getCota() {
		return cota;
	}
	public void setCota(int cota) {
		this.cota = cota;
	}
	public String getDomeniu() {
		return domeniu;
	}
	public void setDomeniu(String domeniu) {
		this.domeniu = domeniu;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public InterfataStrategy getStrategy() {
		return strategy;
	}
	
	public void setStrategy(InterfataStrategy strategy) {
		this.strategy = strategy;
	}

	
	public void citeste(SalaDeLectura sala1){
		System.out.println(" Cartea cu cota "+ cota +" scrisa de autorul "+ autor+
				" este citita in sala de lectura " +sala1);
	}

	@Override
	public String toString() {
		return "Carte [cota=" + cota + ", domeniu=" + domeniu + ", autor="
				+ autor + "]";
	}

	
	
	
//pt flyweight
	public void aseazaCarte (Pozitie poz){
		this.pozitie=poz;
		System.out.println("Cartea din domeniul"+ domeniu+" este asezata la pozitia " +poz.toString());
	}
	
	
	//Strategy
	public void metodaStrategy(Carte c){
		if(strategy!=null){
			strategy.realizeazaStrategie(this);
		}
	}

}