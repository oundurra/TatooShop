package tatoo;

import java.util.ArrayList;

public class Venta {
	private int folio;
	private int monto;
	private Cliente cliente;
	private Tatuador tatuador;
	private Local local;
	private ArrayList<Tatuaje> tatuaje; 
	private ArrayList<Insumo> insumo;
	
	public Venta(int folio, int monto, Cliente cliente, Tatuador tatuador, Local local, ArrayList<Tatuaje> tatuaje,
			ArrayList<Insumo> insumo) {
		this.folio = folio;
		this.monto = monto;
		this.cliente = cliente;
		this.tatuador = tatuador;
		this.local = local;
		this.tatuaje = tatuaje;
		this.insumo = insumo;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tatuador getTatuador() {
		return tatuador;
	}

	public void setTatuador(Tatuador tatuador) {
		this.tatuador = tatuador;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public ArrayList<Tatuaje> getTatuaje() {
		return tatuaje;
	}

	public void setTatuaje(ArrayList<Tatuaje> tatuaje) {
		this.tatuaje = tatuaje;
	}

	public ArrayList<Insumo> getInsumo() {
		return insumo;
	}

	public void setInsumo(ArrayList<Insumo> insumo) {
		this.insumo = insumo;
	} 
	
}
