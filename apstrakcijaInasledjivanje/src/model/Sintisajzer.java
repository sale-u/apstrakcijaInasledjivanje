package model;

public class Sintisajzer extends ElektricniInstrument {
	
	private String marka;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public void obezbediSviraca() {
		System.out.println("Obezbedio sam sviraca...");
		
	}
	
	

}
