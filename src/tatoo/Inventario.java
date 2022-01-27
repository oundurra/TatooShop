package tatoo;

public class Inventario {
	private int stock;
	private Local local;
	private Insumo insumo;
	
	public Inventario(int stock, Local local, Insumo insumo) {
		this.stock = stock;
		this.local = local;
		this.insumo = insumo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	
}
