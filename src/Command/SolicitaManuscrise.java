package Command;

public class SolicitaManuscrise implements ComandaBiblioteca {

	public Bibliotecar bibliotecar;
	public String denumire;
	
	@Override
	public void imprumuta() {
	
		this.bibliotecar.imprumutaManuscris(this.denumire);
		
	}
	public SolicitaManuscrise(Bibliotecar bibliotecar, String denumire){
		this.bibliotecar=bibliotecar;
		this.denumire=denumire;
	}



	}


