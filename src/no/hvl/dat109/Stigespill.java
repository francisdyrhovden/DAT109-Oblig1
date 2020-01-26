package no.hvl.dat109;

public class Stigespill {

	private final static int WINPOINT = 99;

	private Terning terning;
	private Brett brett;
	private Spiller[] spillere;
	private boolean vinner;

	public Stigespill() {
		this.terning = new Terning();
		this.brett = new Brett();
		this.vinner = false;
		this.spillere = new Spiller[2];
	}

	public void run() {

		spillere[0] = new Spiller("Francis", "grønn");
		spillere[1] = new Spiller("Lasse", "blå");

		while (!vinner) {
			spillRunde();
		}
		System.out.println("Noen har vunnet");
	}

	public void spillRunde() {

		for (Spiller s : spillere) {
			s.trill(terning);
			int verdi = terning.getVerdi();
			System.out.println(s.getNavn() + " trilte: " + verdi);
			Rute rute = s.getBrikke().getPlass();
			System.out.println(s.getNavn() + " var på rute nr: " + rute.getTall());
			if (rute.getTall() + verdi >= WINPOINT) {
				vinner = true;
				break;
			}
			Rute nyRute = brett.finnNyRute(rute, verdi);
			s.getBrikke().setPlass(nyRute);
			System.out.println(s.getNavn() + " står nå på rute nr: " + s.getBrikke().getPlass().getTall());
			
		}

	}
}
