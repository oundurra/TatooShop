package tatoo;

public class Insumo {
	private int id;
	private String nombre;
	private int costo;
	
	public Insumo(int id, String nombre, int costo) {
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
}
