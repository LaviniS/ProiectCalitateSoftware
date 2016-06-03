package Flyweight;

public class Pozitie {
	private int pozA;
	private int pozB;
	private int pozC;
	
	public Pozitie(int pozA, int pozB, int pozC) {
		super();
		this.pozA = pozA;
		this.pozB = pozB;
		this.pozC = pozC;
	}

	public Pozitie() {
		super();
	}

	public int getPozA() {
		return pozA;
	}

	public void setPozA(int pozA) {
		this.pozA = pozA;
	}

	public int getPozB() {
		return pozB;
	}

	public void setPozB(int pozB) {
		this.pozB = pozB;
	}

	public int getPozC() {
		return pozC;
	}

	public void setPozC(int pozC) {
		this.pozC = pozC;
	}

	@Override
	public String toString() {
		return "Pozitie [pozA=" + pozA + ", pozB=" + pozB + ", pozC=" + pozC + "]";
	}
	
	
	
	
	
}
