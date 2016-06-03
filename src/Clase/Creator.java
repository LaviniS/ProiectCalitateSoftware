package Clase;

public class Creator {
private String stare;

public void setStare(String stare){
	this.stare=stare;
}
public String getStare(){
	return this.stare.toString();
}

public Memento salveazaStareMemento(){
	System.out.println("Salveaza starea");
	return new Memento(stare);
}

public void  getStareDinMemente(Memento Memento){
	stare=Memento.getStare();
}
}
