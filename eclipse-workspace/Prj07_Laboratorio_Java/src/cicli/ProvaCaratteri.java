package cicli;

public class ProvaCaratteri {

	/**
	 * Commento di tipo javadoc 
	 * @param args
	 */
	public static void main(String[] args) {
	
		final int NUM_VOLTE = 65536;
		
		for(int i = 1; i <= NUM_VOLTE; i++) {
			
			System.out.print( (char) i); //casting o forzatura
			
			if (i % 50 == 0) {
				System.out.println();
			}

		}
	
	}

}
