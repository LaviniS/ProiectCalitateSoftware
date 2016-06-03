package Clase;

import Interfete.InterfataBuilder;

public class VedereBuilder extends InterfataBuilder<Vedere> {

	
	public VedereBuilder(){
		object=new Vedere();
	}
	
	public VedereBuilder Nume(String denumire){
		object.setDenumire(denumire);
		return this;
	}
	
	public VedereBuilder Lungime(int lungime){
		object.setLungime(lungime);
		return this;
	}
	
	public VedereBuilder Latime(int latime){
		object.setLatime(latime);
		return this;
	}
	public VedereBuilder Greutate(float greutate){
		object.setGreutate(greutate);
		return this;
	}
	
	@Override
	public Vedere build() {
		return object;
	}

}
