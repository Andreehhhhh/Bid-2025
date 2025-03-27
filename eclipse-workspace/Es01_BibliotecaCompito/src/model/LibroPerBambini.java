package model;

public class LibroPerBambini extends Libro{

	private int etaConsigliata;

	public LibroPerBambini(String titolo, String autore, boolean inPrestito, int etaConsigliata) {
		super(titolo, autore, inPrestito);
		this.etaConsigliata = etaConsigliata;
	}
	
	public int getEtaConsigliata() {
		return etaConsigliata;
	}


	public void setEtaConsigliata(int etaConsigliata) {
		this.etaConsigliata = etaConsigliata;
	}


	@Override
	public String getDescrizione() {
		return super.getDescrizione() +", Età consigliata " + etaConsigliata;
	}
	
	
}