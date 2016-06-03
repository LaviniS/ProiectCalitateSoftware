package Clase;

public class ProdusFactory {
	public static Produs createInstance(Class<?extends Produs>type){
	if(type==Muzica.class)
		return new Muzica();
	else if(type==Monede.class)
		return new Monede("dolar", 232,"Italia");
	else if(type==Manuscrise.class)
		return new Manuscrise();
	else if(type==Carte.class)
		return new Carte();
	return new Carte();
	}
}
