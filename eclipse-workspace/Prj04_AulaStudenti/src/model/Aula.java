package model;

public class Aula {

	private Studente[] studenti; 
	private Postazione[] postazioni; 
	
	public Aula (){//Aula aggrega studenti e postazioni adesso.
		studenti = new Studente [30];	//Questo array non può essere modficiato.
		postazioni = new Postazione [30];	//Questo array non può essere modficiato.
	}
	//Create
	public void addStudente(Studente s, int pos) {
		studenti[pos] = s; 
		
	}
	//Read
	public Studente getStudenteById(int pos) {
		return studenti [pos];	
	}
	//Read di tutti gli studenti
	public Studente[] getStudenti() {
		return studenti;
	}
	//Update
	public void updateStudente(Studente s, int pos) {
		studenti[pos] = s; 
		
	}
	
	//Delete
	public void deleteStudente(int pos) {
		studenti [pos] = null;
	}
}
