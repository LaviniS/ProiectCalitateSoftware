package Command;

import java.util.ArrayList;

public class Cititor {
	public String nume;
	public String prenume;
	public ArrayList<ComandaBiblioteca>listaComenzi;
	
	public Cititor(String nume){
		this.nume=nume;
		listaComenzi=new ArrayList<>();
	}

	public Cititor(){
		super();
	}
	public Cititor(String nume, String prenume){
		super();
		this.nume=nume;
		this.prenume=prenume;
	}
	
	public String getNume()
	{
		return nume;
	}
	public void setNume(String nume){
		if(nume== null){
			throw new IllegalArgumentException("Proprietatea nu poate sa fie null");
			
		}
		this.nume=nume;
	}
	
	public String getPrenume(){
		return prenume;
	}
	
	public void setPrenume(String prenume){
		this.prenume=prenume;
	}
	public void pregatesteLista(ComandaBiblioteca c){
		this.listaComenzi.add(c);
	}
	
	public void solicitaComenzi(){
		for(ComandaBiblioteca c:listaComenzi)
			c.imprumuta();
	}
	}

