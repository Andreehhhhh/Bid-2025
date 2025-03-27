package gioco;

public class GiocoDemo {

	public static void main(String[] args) {
	
		Dado dado1 = new Dado(6);//Dichiarazione e inizializzazione di un oggetto. Dado()è il costruttore. Prima deve esistere una classe che istanzi l'oggetto
		Dado dado2 = new Dado(6);
		
		
		int volte= 100_000;
		int vittorie = 0; 
		
		long start = System.currentTimeMillis();//Millisecondi 
		for (int i = 0; i < volte; i++) {
			int res1 = dado1.lancia(); 
			int res2 = dado2.lancia();
			//System.out.println("Dado 1 vale " + res1);
			//System.out.println("Dado 2 vale " + res2);
			if (res1 == res2) {
				vittorie ++;
				//System.out.println("Hai vinto");
			}
			else {
				//System.out.println("Non hai vinto");
			}
			
		}//Finisce il ciclo for	
		long stop = System.currentTimeMillis();
		
	System.out.println(" Hai giocato "+  volte+" volte ");
	System.out.println(" Hai vinto "+vittorie+" volte ");
	System.out.println(" L'elaborazione ha impiegato " + (stop - start) + " Millisecondi " );
	}	
	
}

