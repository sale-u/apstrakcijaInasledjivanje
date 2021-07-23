package interfejsi;

public interface Upgradeable {
	
	public void upgradeMemory();	// apstraktne su metode jer se to podrazumeva u interfejsu (i ne oznacava se abstract)
	public void upgradeProccessor();// moze se izostaviti i public jer se i to podrauzumeva u interfejsu
	
	public static void statickaMetoda() {
		System.out.println("Poziv staticke metode iz interfejsa Upgradeable!");
	}
	
	public default void defaultMetoda() {	// ova default metoda se moze override-ovati u klasi koja implementira ovaj interfejs
		System.out.println("Poziv default metode iz interfejsa Upgradeable!");
	}
	
	

}
