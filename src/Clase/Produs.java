package Clase;
import java.io.Serializable;


public abstract  class Produs implements Serializable {
	public int id;
	public String nume;
	
	//nr de produse
	int n;
	Produs[] p=new Produs[10000];
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}


	public void adaugaProdus(Produs p){
		if(n<10000){
			this.p[n]=p;
			n++;
		}
	}
	
	
	public void afiseazaProdus(){
		for(int i=0;i<n;i++){
			System.out.println(p[i]);
		}
	}
	public String getNume(){
		return nume;
	}


	@Override
	public String toString() {
		return "Produs [id=" + id + ", nume=" + nume + "]";
	}
	
	

}