import java.util.ArrayList;
import java.util.List;

class Garaje {
	private List<Vehiculo> vehiculos;

	public Garaje() {
		vehiculos = new ArrayList<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
		System.out.println("Vehículo agregado correctamente.");
	}

	public void mostrarVehiculos() {
		System.out.println("Lista de vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo;
				System.out.println("Tipo: Auto, Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Puertas: " + auto.getNumPuertas());
			} else if (vehiculo instanceof Motocicleta) {
				Motocicleta motocicleta = (Motocicleta) vehiculo;
				System.out.println("Tipo: Motocicleta, Marca: " + motocicleta.getMarca() + ", Modelo: " + motocicleta.getModelo() + ", Cilindrada: " + motocicleta.getCilindrada());
			}
		}
	}
}