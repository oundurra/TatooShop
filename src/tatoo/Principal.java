package tatoo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// Se crean las variables
		Tatuador tatuador = new Tatuador(1,"Luciano");
		Cliente cliente = new Cliente(9,"Victor");
		Local local = new Local(1,"Quinta Normal");
		Tatuaje tatuaje1 = new Tatuaje(1, "Diente de leon", "Mediano", false, 100000);
		Tatuaje tatuaje2 = new Tatuaje(2, "8 ball", "Mediano", true, 700000);
		Insumo insumo1 = new Insumo(1, "Tinta", 15000);
		Insumo insumo2 = new Insumo(2, "Agujas", 1000);
		
		// Se carga el inventario
		Inventario inventario1 = new Inventario(10, local, insumo1);
		Inventario inventario2 = new Inventario(200, local, insumo2);
		
		// Venta
		Venta venta = new Venta(
							1,
							100000,
							cliente,
							tatuador,
							local,
							new ArrayList<Tatuaje>(),
							new ArrayList<Insumo>()
				);
		
		venta.getTatuaje().add(tatuaje1);
		venta.getTatuaje().add(tatuaje2);
		venta.getInsumo().add(insumo1);
		venta.getInsumo().add(insumo2);
		
		String tatuajes = "";
		for (int i=0; i < venta.getTatuaje().size(); i++) {
			tatuajes = tatuajes + venta.getTatuaje().get(i).getDescripcion() + " ,";
		}
		
		System.out.println("En el local " + venta.getLocal().getNombre() + " " + venta.getCliente().getNombre() + " se hizo los tatuajes " + tatuajes + " y le costaron " + venta.getMonto());
	}
}
