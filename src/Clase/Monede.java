package Clase;
import java.io.Serializable;

import Facade.SalaDeLectura;


public class Monede extends Produs implements Serializable{
	private String nume;
	private int vechime;
	private String origine;

	
	


	public Monede(String nume, int vechime, String origine) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.origine = origine;
	}
	

	public Monede() {
		super();
	}


	public String getNume(){
		return nume;
		
	}
	
	public void setNume(String nume)
	{
		this.nume=nume;
	}
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) throws Exception {
		if(vechime<100)
			throw new Exception();
		this.vechime = vechime;
	}
	public String getOrigine() {
		return origine;
	}
	
	
	@Override
	public String toString() {
		return "Monede [nume=" + nume + ", vechime=" + vechime
				+ ", nationalitate=" + " origine=" + origine
				+ "]";
	}
	
	public void ObservaMonede(SalaDeLectura sala2){
		System.out.println(" Moneda  "+ nume + "are o vechime de "+ vechime+
				"si este de origine "+ origine +"este observata in sala"+ sala2);
	}
	

}