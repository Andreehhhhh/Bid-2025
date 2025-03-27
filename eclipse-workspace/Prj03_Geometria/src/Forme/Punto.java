package Forme;

public class Punto {//astrazione di un punto. 
	
	private int x, y; //incapsulamento degli oggetti. Nascondere all'esterno come sono costrutiti.Potenzialmente dichiarazione e inizializzazione possono avvenire nello stesso rigo

				//Parametri formali. Quando si creerà un unovo oggetto verranno chiamati argomenti.
	public Punto (int x, int y) {//Il metodo costruttore non ha riferimento di ritorno perchè costruisce l'oggetto.
		 this.x = x; // La parola this è un puntatore autoreferito. 
		 this.y = y;
	}
	//getters (accessori,accedere alle proprietà)e setters (mutatori, permettono di modificare una proprietà)

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
		
}
