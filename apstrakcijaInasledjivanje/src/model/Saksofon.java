package model;

public final class Saksofon extends DuvackiInstrument{
	
	private String vrstaMuzike;
	
	public Saksofon() {
		
	}
	
	public Saksofon(String nazivInstrumenta, String materijalIzrade, String vrstaPiska, String vrstaMuzike) {
		super(nazivInstrumenta, materijalIzrade, vrstaPiska);
		this.vrstaMuzike = vrstaMuzike;
	}

	public String getVrstaMuzike() {
		return vrstaMuzike;
	}

	public void setVrstaMuzike(String vrstaMuzike) {
		this.vrstaMuzike = vrstaMuzike;
	}
	
	@Override
	public void sviraj() {
		System.out.println("Sviram saksofon...");
	}
	
	

}
