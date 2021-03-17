package ejerci;

public class Libro extends Publicación {

	private String autor;

	public Libro(int codigo, String titulo, int año, String autor) {
		super(codigo, titulo, año);
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
