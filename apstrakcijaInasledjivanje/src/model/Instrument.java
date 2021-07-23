package model;

public abstract class Instrument {
	
	private String nazivInstrumenta;
	
	public Instrument() {
	}
	
	public Instrument(String nazivInstrumenta) {
		this.nazivInstrumenta = nazivInstrumenta;
	}

	public String getNazivInstrumenta() {
		return nazivInstrumenta;
	}

	public void setNazivInstrumenta(String nazivInstrumenta) {
		this.nazivInstrumenta = nazivInstrumenta;
	}
	
	public void sviraj() {
		System.out.println("Sviram instrument...");
	}
	
	// nijednu obicnu metodu ne moramo overrideovati ako to ne zelimo
	public final void popraviInstrument() {		// final = ne moze se overrideovati metoda
		System.out.println("Popravljam instrument...");
	}
	
	// apstraktna metoda MORA da se implementira u subklasama
	public abstract void obezbediSviraca();
	
	
}
