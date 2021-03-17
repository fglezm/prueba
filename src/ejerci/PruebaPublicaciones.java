package ejerci;

import java.util.ArrayList;
import java.util.Collection;

public class PruebaPublicaciones {

	public static void main(String[] args) {
		ArrayList<Publicaci�n> publicaciones = new ArrayList<>();
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Cervantes"));
		publicaciones.add(new Revista(2, "Don Bal�n", 2021, 3, 31, 150));

		for (Publicaci�n p : publicaciones)
			System.out.println(p.toString());

		procesarPublicaci�n(new Libro(3, "Antifr�gil", 2005, "Taleb"));
		procesarPublicaci�n(new Revista(4, "x", 2015, 2, 28, 100));
	}

	static void procesarPublicaci�n(Publicaci�n pu) {
		System.out.println(pu.toString());
	}

}
