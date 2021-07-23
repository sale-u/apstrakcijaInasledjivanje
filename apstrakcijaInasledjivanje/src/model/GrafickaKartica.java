package model;

public abstract class GrafickaKartica {
	
	private String model;
	private String memorija;
	private String procesor;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMemorija() {
		return memorija;
	}
	public void setMemorija(String memorija) {
		this.memorija = memorija;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	
	public abstract void prikljuciKarticu();
	
	

}
