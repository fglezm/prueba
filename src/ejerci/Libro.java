package ejerci;

public class Libro extends Publicaci�n {

	private String autor;

	public Libro(int codigo, String titulo, int a�o, String autor) {
		super(codigo, titulo, a�o);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return super.toString() + "[autor=" + autor + "]";
	}

}
