package ejerci;

import java.util.ArrayList;
import java.util.Collection;

public class PruebaPublicaciones {

	public static void main(String[] args) {
		ArrayList<Publicación> publicaciones = new ArrayList<>();
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Cervantes"));
		publicaciones.add(new Revista(2, "Don Balón", 2021, 3, 31, 150));

		for (Publicación p : publicaciones)
			System.out.println(p.toString());

		procesarPublicación(new Libro(3, "Antifrágil", 2005, "Taleb"));
		procesarPublicación(new Revista(4, "x", 2015, 2, 28, 100));
	}

	static void procesarPublicación(Publicación pu) {
		System.out.println(pu.toString());
	}

}
