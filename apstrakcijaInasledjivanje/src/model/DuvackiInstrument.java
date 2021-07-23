package model;

public class DuvackiInstrument extends Instrument {
	
	private String materijalIzrade;
	private String vrstaPiska;
	private final int BROJ_ZICA = 0;	// konstanta koja se mora odmah inicijalizovati i vise se ne moze menjati
	
	// prazan konstruktor
	public DuvackiInstrument() {
	}
	
	public DuvackiInstrument(String nazivInstrumenta, String materijalIzrade, String vrstaPiska) {
		super(nazivInstrumenta);
		this.materijalIzrade = materijalIzrade;
		this.vrstaPiska = vrstaPiska;
	}
	
	public int getBrojZica() {
		return BROJ_ZICA;
	}

	public String getMaterijalIzrade() {
		return materijalIzrade;
	}
	public void setMaterijalIzrade(String materijalIzrade) {
		this.materijalIzrade = materijalIzrade;
	}
	public String getVrstaPiska() {
		return vrstaPiska;
	}
	public void setVrstaPiska(String vrstaPiska) {
		this.vrstaPiska = vrstaPiska;
	}
	
	@Override
	public void sviraj() {
		System.out.println("Sviram duvacki instrument...");
	}

	@Override
	public void obezbediSviraca() {
		System.out.println("Imam dobrog frulasa...");		
	}
	

}
