package racunari;

import model.DesignGraphicCard;
import model.GamingGraphicCard;
import interfejsi.Upgradeable;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Upgradeable.statickaMetoda();			// poziv staticke metode iz Upgradeable interfejsa
		
		GamingGraphicCard gaming = new GamingGraphicCard();
			gaming.setModel("nVidia3060");
			gaming.setMemorija("6GB");
			gaming.setProcesor("QuadroCore");
			gaming.setBrojVentilatora(4 + gaming.addSomeCoolers());
			System.out.println("Broj ventilatora je: " + gaming.getBrojVentilatora());
		gaming.prikljuciKarticu();	
		gaming.upgradeMemory();
		gaming.upgradeProccessor();	
		
		gaming.defaultMetoda();		// poziv default metode iz interfejsa Upgradeable kroz instancu gaming klase GamingGraphicCard koja je implementirala Upgradeable interfejs
					
		System.out.println();
		DesignGraphicCard design = new DesignGraphicCard();
			design.setModel("nVidiaQuadro");
			design.setMemorija("2GB");
			design.setProcesor("OctaCore");
			design.setTurboProcessor(1);
		design.prikljuciKarticu();	
		design.upgradeMemory();
		design.upgradeProccessor();
		
		
		System.out.println();
		
		// ***************************************************************************
		// instanciranje interfejsa je moguce ali vrlo retko:
		// Eclipsa nam u ovom slucaju otvara unutrasnju neimenovanu klasu
		// u kojoj definisemo/implementiramo metode iz interfejsa
		Upgradeable u0 = new Upgradeable() {	// oznacen je pocetak tela neimenovane unutrasnje klase 
												// koja implementira ovaj Upgradeable interfejs ovde, na licu mesta!
			@Override
			public void upgradeProccessor() { 	// implementacija metode iz interfejsa
			}
			@Override
			public void upgradeMemory() { 		// implementacija metode iz interfejsa
			}
		};										// kraj anonimne klase i ujedno kraj naredbe instanciranja interfejsa
		
		
		Upgradeable u = new DesignGraphicCard();  // instanciramo klasu koja je implementirala interfejs
		u.upgradeMemory();		// na referenci Upgradeable u mozemo prozvati samo metode interfejsa
		u.upgradeProccessor();
		
	}

}
