package model;

import java.time.LocalDate;

public class Studente {
	
	public static int counter = 1; //Serve a creare uno spazio nella Ram a cui da un reference a ogni 
	
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataNascita; //Usiamo Localdate dal momento che è una data che viene applicata al singolo individuo.
	
	public Studente (String nome, String cognome) {
		this.id = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Studente( String nome, String cognome, LocalDate dataNascita) {
		this(nome, cognome); //Questo è il concetto di overload. Prende i parametri dal costruttore preceente. 
		this.dataNascita = dataNascita;
		//getters, setters. Accedere ai e modificare i parametri 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
	}
	
}
