package no.hvl.dat109;

public class Brikke {

	private String farge;
	private Rute rute;
	
	public Brikke(String farge) {
		this.farge = farge;
		this.rute = new Rute(0);
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public Rute getPlass() {
		return rute;
	}

	public void setPlass(Rute rute) {
		this.rute = rute;
	}
	
}
