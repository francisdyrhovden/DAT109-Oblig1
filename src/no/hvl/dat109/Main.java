package no.hvl.dat109;

public class Main {

	public static void main(String[] args) {
		
		Brukergrensesnitt bg = new Brukergrensesnitt(new Stigespill());
		bg.start();
	}
}
