package gioco;

public class Dado {

	int facce;//Dichiariazione e inizializzazione di una variabile. L'inizializzazione può avvenire anche sul rigo successivo. Adesso essendo costruito logicamente si può scegliere il numero di facce
	
	Dado (int numeroDiFacce){
		facce = numeroDiFacce; 
	}
	
	int lancia() {
		return 	(int) (Math.random() * facce) + 1			;//Questa è un'operazione di forzatura, perde di precisine. Int in questa linea è detto cast
	}
}
