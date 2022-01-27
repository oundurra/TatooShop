package tatoo;

public class Tatuador  implements Persona {
	private int rut;
	private String nombre;
	
	public Tatuador(int rut, String nombre) {
		this.rut = rut;
		this.nombre = nombre;
	}
	
	@Override
	public void setRut(int rut) {
		this.rut = rut;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int getRut() {
		return this.rut;
	}
}
