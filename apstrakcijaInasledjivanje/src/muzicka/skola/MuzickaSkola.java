package muzicka.skola;

import model.DuvackiInstrument;
import model.ElektricniInstrument;
import model.Instrument;
import model.Saksofon;
import model.Sintisajzer;

public class MuzickaSkola {

	public static void main(String[] args) {
		
		/*
		 * // prvi instrument sa praznim konstruktorom Instrument instrument = new
		 * Instrument(); instrument.setNazivInstrumenta("Engleski rog");
		 * System.out.println("Ovo je instrument " + instrument.getNazivInstrumenta());
		 * instrument.sviraj(); // drugi instrument sa ful konstruktorom Instrument
		 * instrument2 = new Instrument("Bubanj"); System.out.println("Instrument2 je "
		 * + instrument2.getNazivInstrumenta());
		 */
		
		// prvi duvacki
		DuvackiInstrument duvacki = new DuvackiInstrument();
		duvacki.setNazivInstrumenta("Frula");
		duvacki.setMaterijalIzrade("drvo");
		duvacki.setVrstaPiska("jezicak");
		System.out.println("Ovo je " + duvacki.getNazivInstrumenta());
		System.out.println("Materijal je " + duvacki.getMaterijalIzrade());
		System.out.println("Vrsta piska je " + duvacki.getVrstaPiska());
		duvacki.sviraj();
		
		// drugi duvacki sa ful konstruktorom
		DuvackiInstrument duvacki2 = new DuvackiInstrument("Truba", "limeni", "usnik");
		System.out.println("Ovo je " + duvacki2.getNazivInstrumenta());
		System.out.println("Materijal je " + duvacki2.getMaterijalIzrade());
		System.out.println("Vrsta piska je " + duvacki2.getVrstaPiska());
		System.out.println("Broj zica je " + duvacki2.getBrojZica());
		 
		// Sintisajzer
		Sintisajzer sintisajzer = new Sintisajzer();
		sintisajzer.setNazivInstrumenta("Klavijatura");
		sintisajzer.setVrstaNapajanja("220V");
		sintisajzer.setMarka("Yamaha");
		System.out.println("Ovo je " + sintisajzer.getNazivInstrumenta());
		System.out.println("Napajanje je " + sintisajzer.getVrstaNapajanja());
		System.out.println("Marka je " + sintisajzer.getMarka());
		
		// Saksofon
		Saksofon saksofon = new Saksofon("Saksofon", "drveni", "jezicak", "jazz");
		System.out.println("Ovo je " + saksofon.getNazivInstrumenta());
		System.out.println("Materijal je " + saksofon.getMaterijalIzrade());
		System.out.println("Vrsta piska je " + saksofon.getVrstaPiska());
		System.out.println("Vrsta muzike je " + saksofon.getVrstaMuzike());
		System.out.println("Broj zica je " + saksofon.getBrojZica());
		
		
		// **************************** DOMACI ******************************
		Object o1 = new Saksofon();	// objekt o1 vidi samo delove instance new Saksofon() koje su zajednicke
									// a to su samo uopstene metode klase Object (equals(), hashCode(), toString()).
									// Nema nijedne metode ili atributa iz Saksofon()
		// Medjutim, ako objekat o1 castujemo nazad (konverzija tipa) u Saksofon s2
		// Onda su nam opet na raspolaganju svi atributi (ako nisu private) i metode klase Saksofon
		Saksofon s2 = (Saksofon) o1;
		s2.setNazivInstrumenta("Saksofon kao object");
		System.out.println("\n" + s2.getNazivInstrumenta());
		s2.sviraj();
		
		/*
		 * Object o2 = new Object(); 
		 * Saksofon s3 = (Saksofon) o2;	// ovo proizvodi gresku ClassCastException jer o2 ne referencira
		 * 								// Saksofon objekat u preth.liniji
		 */
		
		Instrument i1 = new Saksofon();


		

		
		
	}

}
