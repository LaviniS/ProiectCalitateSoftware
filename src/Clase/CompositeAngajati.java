package Clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAngajati {
 public String nume;
 public String functie;
 public int salariu;
 public List<CompositeAngajati>subordonati;
 
public CompositeAngajati(String nume, String functie, int salariu) {
	super();
	this.nume = nume;
	this.functie = functie;
	this.salariu = salariu;
	subordonati=new ArrayList<CompositeAngajati>();
}
 public void adaugaAngajat(CompositeAngajati a){
	 subordonati.add(a);
 }
 
 public void stergeAngajat(CompositeAngajati a){
	 subordonati.remove(a);
 }
 public List<CompositeAngajati>getSubordonati(){
	 return subordonati;
 }
@Override
public String toString() {
	return "CompositeAngajati [nume=" + nume + ", functie=" + functie + ", salariu=" + salariu +  "]";
}
 
 
}
