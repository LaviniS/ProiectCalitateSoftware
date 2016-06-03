package Command;

public class Bibliotecar {
	public  String nume;
	public int varsta;
	

	public Bibliotecar(String nume, int varsta) {
		super();
		this.setNume(nume);
		this.setVarsta(varsta);
		
	}
	
	public int getVarsta()
	{
		return varsta;
	}
	public String getNume(){
		return nume;
	}
	
	public void setVarsta(int varsta) {
		if(varsta>=18 && varsta<=65){
			this.varsta=varsta;
		
		}
		else
			throw new UnsupportedOperationException();
	}

	public void setNume(String nume) {
		if(nume==null)
			throw new NullPointerException();
		this.nume=nume;
	}

	public void oferaCarte(String denumire){
		System.out.println("A fost oferita o carte scrisa de "+ denumire);
	}
	public void imprumutaManuscris(String denumire){
		System.out.println("A fost imprumutat un manuscris al lui " + denumire);
	}
}
