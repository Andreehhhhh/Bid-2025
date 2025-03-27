package Demo;

import Forme.Punto;
import Forme.Segmento;
import Forme.Triangolo;

public class ProveDiGeometria {

	public static void main(String[] args) {//Questo è il metodo ToString
		
		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		
		System.out.println(" il punto a " + a);
		System.out.println(" il punto b " + b);
		System.out.println(" il punto c " + c);
		
		Segmento ab = new Segmento (a, b);
		Segmento ac = new Segmento (a, c);
		Segmento bc = new Segmento (b, c);
		
		System.out.println(ab);
		System.out.println(ac);
		System.out.println(bc);
		
		Triangolo t = new Triangolo(a, b, c);
		System.out.println(t);
		
		// TODO Auto-generated method stub

	}

}
