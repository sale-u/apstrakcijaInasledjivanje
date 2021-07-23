package model;

import interfejsi.SlotNumberUpgradeable;

public class DesignGraphicCard extends GrafickaKartica implements SlotNumberUpgradeable {

	private int turboProcessor;

	public int getTurboProcessor() {
		return turboProcessor;
	}

	public void setTurboProcessor(int turboProcessor) {
		this.turboProcessor = turboProcessor;
	}

	@Override
	public void prikljuciKarticu() {
		System.out.println("Prikljucujem design karticu...");

	}

	@Override
	public void upgradeMemory() {	// implementacija metode iz grandparrent interfacea Upgradeable
		System.out.println("Upgrading design memory...");
	}

	@Override
	public void upgradeProccessor() {	// implementacija metode iz grandparrent interfacea Upgradeable
		this.setTurboProcessor(this.getTurboProcessor() + 5);
		System.out.println("Upgrade design procesor, value is " + this.getTurboProcessor());
	}

	@Override
	public void upgradeSlot() {			// implementacija metode iz parrent interfacea SlotNumberUpgradeable
		// TODO Auto-generated method stub

	}

}
