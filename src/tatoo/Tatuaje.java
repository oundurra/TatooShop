package tatoo;

public class Tatuaje {
	private int id;
	private String descripcion;
	private String tamano;
	private boolean escolor;
	private int precio;
	
	public Tatuaje(int id, String descripcion, String tamano, boolean escolor, int precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.tamano = tamano;
		this.escolor = escolor;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public boolean isEscolor() {
		return escolor;
	}

	public void setEscolor(boolean escolor) {
		this.escolor = escolor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
