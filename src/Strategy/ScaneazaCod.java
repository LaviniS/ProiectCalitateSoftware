package Strategy;

import Clase.Carte;

public class ScaneazaCod implements InterfataStrategy {

	@Override
	public void realizeazaStrategie(Carte c) {
		System.out.println("Cartea cu cota " + c.getCota() + "este scanata");
		}
}
