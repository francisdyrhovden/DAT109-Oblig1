package no.hvl.dat109;

public class Spiller {
	
	private String navn;
	private Brikke brikke;
	
	
	public Spiller(String navn, String farge) {
		this.navn = navn;
		this.brikke = new Brikke(farge);
	}
	
	public void trill(Terning terning) {
		terning.trill();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Brikke getBrikke() {
		return brikke;
	}
	
}
