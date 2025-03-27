package test;

import exception.EccezioneLibro;
import model.Biblioteca;
import model.Libro;
import model.LibroPerBambini;

public class TestBiblioteca {
	
	// Verificherò che tutti i metodi funzionino correttamente
	
    public static void main(String[] args) {
        // Creo dei libri
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", false);
        Libro libro2 = new Libro("Il vento porta il mio nome", "Isabelle Allende", false);
        Libro libro3 = new Libro("Cecità", "Josè Saramago", false);
        Libro libro4 = new Libro("Il trono di spade", "J.R.R. Martin", false);
        Libro libro5 = new LibroPerBambini("Il piccolo Pitone", "Pitoine de Pitons", false, 5);
        Libro libro6 = new LibroPerBambini("Diario di una schiappa", "Greg Heffley", false, 10);

        // Creo la Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Aggiungo i libri in biblioteca
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.addLibro(libro4);
        
     // Stampo le descrizioni di tutti i libri in biblioteca
        System.out.println("Libri in biblioteca:\n");
        for (Libro l : biblioteca.getCollezione()) {
            System.out.println(l.getDescrizione());
        }
        System.out.println("\n");
        
        // Test dei metodi ed eccezioni:

        // Vedo se i libri sono in biblioteca
        System.out.println("Il libro "+ libro1.getTitolo() +" è in biblioteca? " + biblioteca.inBiblioteca(libro1));
        System.out.println("Il libro "+ libro2.getTitolo() +" è in biblioteca? " + biblioteca.inBiblioteca(libro2));
        
        // Vedo se ci sono libri prestati
        System.out.println("Libri in prestito: " + biblioteca.totInPrestito());
        
        try {
            // Presto un libro
            biblioteca.prestato(libro1);
            System.out.println("Il libro "+ libro1.getTitolo() +" è stato prestato.");
            
            // Testo l'eccezione
            biblioteca.prestato(libro1);
        } catch (EccezioneLibro e) {
            System.out.println(libro1.getTitolo() + " "+ e.getMessage());
        }

        // Verifico che i libri sono in prestito
        System.out.println("Libri in prestito: " + biblioteca.totInPrestito());

        // Restituisco un libro
        biblioteca.restituito(libro1);
        System.out.println("Il libro "+ libro1.getTitolo() +" è stato restituito.");
        
        // Verifico che sia restituito
        System.out.println("Libri in prestito: " + biblioteca.totInPrestito());

        // Controllo quanti libri per bambini ci sono
        System.out.println("Libri per bambini con età massima 10: " + biblioteca.perBambini(10));

        // Riverifico i libri in prestito
        System.out.println("Ci sono libri in prestito? " + (biblioteca.nessunPrestito() ? "No" : "Sì"));
        
    }
}