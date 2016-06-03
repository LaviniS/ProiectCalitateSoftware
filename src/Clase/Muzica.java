package Clase;
import java.io.Serializable;

import Facade.SalaDeLectura;


public class Muzica extends Produs implements Serializable {
	private String nume;
	private String interpret;
	private int anAparitie;
	private String genMuzical;
	
	
		

	public Muzica(String nume, String interpret, int anAparitie, String genMuzical) {
		super();
		this.nume = nume;
		this.interpret = interpret;
		this.anAparitie = anAparitie;
		this.genMuzical = genMuzical;
	}
	
	public Muzica() {
		super();
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getInterpret() {
		return interpret;
	}
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	public int getAnAparitie() {
		return anAparitie;
	}
	public void setAnAparitie(int anAparitie) {
		this.anAparitie = anAparitie;
	}
	public String getGenMuzical() {
		return genMuzical;
	}
	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}
	@Override
	public String toString() {
		return "Muzica [nume=" + nume + ", interpret=" + interpret
				+ ", anAparitie=" + anAparitie + ", genMuzical=" + genMuzical
				+ "]";
	}
	
	public void ascultaMuzica(SalaDeLectura sala3){
		System.out.println(" Albumul  "+ nume + "interpretat de "+ interpret+
				 "se asculta in "+ sala3);
	}
}