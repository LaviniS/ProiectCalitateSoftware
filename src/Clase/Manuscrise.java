package Clase;
import java.io.Serializable;

import Facade.SalaDeLectura;


public class Manuscrise extends Produs implements Serializable {
	private String autor;
	private int an;
	
	public Manuscrise(String autor, int an) {
		super();
		if(autor==null)
			throw new UnsupportedOperationException();
		this.autor = autor;
		this.an = an;
	}
	
	public Manuscrise() {
		super();
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		if(an<1860 && an> 1889) throw new UnsupportedOperationException();
		this.an = an;
	}
	@Override
	public String toString() {
		return "Manuscrise [autor=" + autor + ", an=" + an + "]";
	}
	
	public void citesteManuscris(SalaDeLectura sala1){
		System.out.println(" Manuscrisul lui  "+ autor +
				" este citit in sala de lectura " +sala1);
	}
	 

	
}
