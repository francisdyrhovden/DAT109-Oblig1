package no.hvl.dat109;

public class Stigespill {

	private final static int WINPOINT = 100;
	
	private Spiller[] spillere;
	private Terning terning;
	private Brett brett;
	
	public Stigespill(int antallSpillere) {
		this.spillere = new Spiller[antallSpillere];
		this.terning = new Terning();
		this.brett = new Brett();
	}
	
	
	public void start() {
		
	}
}
