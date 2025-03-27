package model;

import java.util.ArrayList;

import exception.EccezioneLibro;

public class Biblioteca {
	
	private ArrayList<Libro> collezione;
	
	public Biblioteca( ) {
		collezione = new ArrayList<>();
	}

	public void addLibro(Libro l) {
		collezione.add(l);
	}
	
	public boolean inBiblioteca(Libro l) {
        return collezione.contains(l);
    }
	
	public ArrayList<Libro> getCollezione() {
	    return collezione;
	}
	
	public void prestato(Libro l) throws EccezioneLibro {
        if (!inBiblioteca(l)) {
            throw new EccezioneLibro("non è presente in biblioteca.");
        } else if (l.isInPrestito()) {
            throw new EccezioneLibro("è già in prestito.");
        } else {
            l.setInPrestito(true);
        }
    }
	
	public void restituito(Libro l) {
        l.setInPrestito(false);
    }

    public int totInPrestito() {
        int count = 0;
        for (Libro l : collezione) {
            if (l.isInPrestito()) {
                count++;
            }
        }
        return count;
    }

    public boolean nessunPrestito() {
        return totInPrestito() == 0;
    }

    public int perBambini(int etaMax) {
        int count = 0;
        for (Libro l : collezione) {
            if (l instanceof LibroPerBambini) {
                LibroPerBambini libroPerBambini = (LibroPerBambini) l;
                if (libroPerBambini.getEtaConsigliata() <= etaMax) {
                    count++;
                }
            }
        }
        return count;
    }
}


