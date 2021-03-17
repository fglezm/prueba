package ejerci;

public class Revista extends Publicación {

	private int numero;
	private int mes;
	private int dia;

	public Revista(int codigo, String titulo, int año, int mes, int dia, int numero) {
		super(codigo, titulo, año);
		this.mes = mes;
		this.dia = dia;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", mes=" + mes + ", dia=" + dia + ", toString()=" + super.toString() + "]";
	}

}
