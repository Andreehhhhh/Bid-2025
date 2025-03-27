package model;

public class Libro {

	private String titolo;
	private String autore;
	private boolean inPrestito;
	
	public Libro(String titolo, String autore, boolean inPrestito) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.inPrestito = inPrestito;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public boolean isInPrestito() {
		return inPrestito;
	}

	public void setInPrestito(boolean inPrestito) {
		this.inPrestito = inPrestito;
	}

	public String getDescrizione() {
		return "Titolo: " + titolo + ",Autore: " + autore;
	}
	
	
	
}
