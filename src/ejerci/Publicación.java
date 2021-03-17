package ejerci;

public abstract class Publicación {

	private int codigo;
	private String titulo;
	private int año;

	public Publicación(int codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getAño() {
		return año;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Publicación [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}

}
