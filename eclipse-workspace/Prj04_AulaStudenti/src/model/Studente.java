package model;

import java.time.LocalDate;

public class Studente {//Questa classe rappresenta una tabella.
	//Proprietà private per rispettare l'incapsulamento.
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataNascita; //Usiamo Localdate dal momento che è una data che viene applicata al singolo individuo.
	
	public Studente(int id, String nome, String cognome, LocalDate dataNascita) {
		super();//Dal momento che è la prima classe, sta discendendo da Object
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
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
