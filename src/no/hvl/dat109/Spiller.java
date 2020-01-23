package no.hvl.dat109;

public class Spiller {
	
	private String navn;
	
	public Spiller(String navn) {
		this.navn = navn;
	}
	
	public int trillTerning(Terning terning) {
		return terning.trill();
	}
	
	public void flytt(int terningVerdi) {
		
	}
}
