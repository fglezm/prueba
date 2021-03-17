package ejerci;

public abstract class Publicaci�n {

	private int codigo;
	private String titulo;
	private int a�o;

	public Publicaci�n(int codigo, String titulo, int a�o) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�o = a�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getA�o() {
		return a�o;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Publicaci�n [codigo=" + codigo + ", titulo=" + titulo + ", a�o=" + a�o + "]";
	}

}
