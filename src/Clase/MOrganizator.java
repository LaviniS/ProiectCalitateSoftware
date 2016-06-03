package Clase;

import java.util.ArrayList;
import java.util.List;

public class MOrganizator {
	private List<Memento>listaMemento=new ArrayList<Memento>();
	
	public void adauga(Memento stare){
		listaMemento.add(stare);
	}
	public Memento get(int index){
		return listaMemento.get(index);
	}
}
