package Facade;

public class SalaDeLectura {
	int nrSalaDeLectura;
	boolean incepeProgram; 
	
	
	


	public SalaDeLectura(int nrSalaDeLectura, boolean incepeProgram) {
		super();
		this.nrSalaDeLectura = nrSalaDeLectura;
		this.incepeProgram = incepeProgram;
	}
	public void deschide(){
		
		System.out.println("Sala de lectura este deschisa");
	}

	public void inchide(){
	
		System.out.println("Sala de lectura este inchisa");
	}
	
	
	
	@Override
	public String toString() {
		return nrSalaDeLectura+"";
	}
public void program()
{
	if(incepeProgram)
	{
		System.out.println("In sala se poate lucra");
		incepeProgram=true;
	}
	else
	{
		System.out.println("Programul s-a incheiat");
		incepeProgram=false;
	}
}
}
