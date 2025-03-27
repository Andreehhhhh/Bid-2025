package service;

import java.util.ArrayList;
import java.util.List;

import model.Libro;
/**
 * Ripiano: un ripiano ha un nome e contiene una lista di libri
 */
public class Ripiano {

	private String nome;
	private List<Libro> libri;
	
	/**
	 * Costruttore del ripiano che contiene una lista di libri
	 * @param nome scrivere il nome del ripiano
	 */
	public Ripiano(String nome) {
		super();
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
	}
	
	public Libro addLibro(Libro l) {
		this.libri.add(l);
		return l; //Non avendo un database dietro restituiamo lo stesso libro che ha immesso l'utente
	}
	
	public Libro getLibro(int id) {
		return null; 
	}
	
	public List<Libro> getLibri(){
		return this.libri;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Ripiano [nome=" + nome + ", libri=" + libri + "]";
	}
	
	
}
