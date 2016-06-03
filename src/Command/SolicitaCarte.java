package Command;

public class SolicitaCarte implements ComandaBiblioteca {

	public Bibliotecar bibliotecar;
	public String denumire;
	
	@Override
	public void imprumuta() {
		bibliotecar.oferaCarte("Fratii Grim");
		
	}

	public SolicitaCarte(Bibliotecar bibliotecar, String denumire) {
		super();
		this.bibliotecar = bibliotecar;
		this.denumire = denumire;
	}

}
