package stringhe;

public class ProvaStringBuilder {

	public static void main(String[] args) {

		String uno = "Ciao";
		String due = "Ciao";
		
		System.out.println(uno == due);
		
		String tre = new String("Ciao");
		String quattro = new String("Ciao");
		
		System.out.println(tre == quattro);
  	}
}
