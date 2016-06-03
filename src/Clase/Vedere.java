package Clase;

public class Vedere {
	String denumire;
	int lungime;
	int latime;
	float greutate;
	public Vedere(String denumire, int lungime, int latime, float greutate) {
		super();
		this.denumire = denumire;
		this.lungime = lungime;
		this.latime = latime;
		this.greutate = greutate;
	}
	public Vedere() {
		super();
	}
	public String getDenumire() {
		return denumire;
	}

	
	public void setDenumire(String denumire) {
		if(denumire==null){
			throw new NullPointerException();
		}
		else
		this.denumire = denumire;
	}
	
	public int getLungime() {
		return lungime;
	}
	public void setLungime(int lungime) {
		if(lungime>0 && latime <=100){
			this.lungime = lungime;
			}
			else
				throw new UnsupportedOperationException();
	
	}
	public int getLatime() {
		return latime;
	}
	public void setLatime(int latime) {
		if(latime>0 && latime <=50){
		this.latime = latime;
		}
		else
			throw new UnsupportedOperationException();
	}
	
	public float getGreutate() {
		return greutate;
	}
	public void setGreutate(float greutate) {
		if(greutate>=0 && greutate <=100){
		this.greutate = greutate;
		
		}
		else
			throw new UnsupportedOperationException();	
	}
	@Override
	public String toString() {
		return "Vedere [denumire=" + denumire + ", lungime=" + lungime + ", latime=" + latime + ", greutate=" + greutate
				+ "]";
	}
	
	
	
}
