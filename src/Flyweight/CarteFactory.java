
package Flyweight;

import java.util.HashMap;
import java.util.Map;

import Clase.Carte;

public class CarteFactory implements Flyweight{
	private Map<String, Carte>listaCarti;
	public CarteFactory()
	{
		listaCarti=new HashMap<String,Carte>();
		
	}

	
	public int getSize(){
	return listaCarti.size();	
	}
	
	@Override
	public Carte getCarte(int cota, String domeniu, String autor) {
		Carte c=listaCarti.get(domeniu);
		if(c==null){
			c=new Carte(cota,domeniu,autor);
			listaCarti.put(domeniu, c);
		
	}
		return c;
	}
	}

