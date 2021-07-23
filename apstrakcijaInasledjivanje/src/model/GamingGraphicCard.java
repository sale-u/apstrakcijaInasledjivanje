package model;

import interfejsi.IAddingCoolers;
import interfejsi.Upgradeable;

public class GamingGraphicCard extends GrafickaKartica implements Upgradeable, IAddingCoolers {

	private int brojVentilatora;

	public int getBrojVentilatora() {
		return brojVentilatora;
	}

	public void setBrojVentilatora(int brojVentilatora) {
		this.brojVentilatora = brojVentilatora;
	}

	@Override
	public void prikljuciKarticu() {
		System.out.println("Prikacio sam gaming karticu " + this.getModel());
		
	}

	@Override
	public void upgradeMemory() {
		System.out.println("Upgrading graphic memory...");
	}

	@Override
	public void upgradeProccessor() {
		System.out.println("Upgrading graphic proccessor...");
	}

	@Override
	public int addSomeCoolers() {
		int addedCoolers = 3;
		return addedCoolers;
	}
	
//	@Override
//	public void defaultMetoda() {
//		System.out.println("Override default metode iz interfejsa");
//	}
	
	
	
	
}
