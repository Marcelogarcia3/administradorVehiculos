import java.util.Scanner;

class Menu {
	private Scanner scanner;
	private Garaje garaje;

	public Menu() {
		scanner = new Scanner(System.in);
		garaje = new Garaje();
	}

	public void mostrarMenu() {
		int opcion = 0;

		while (opcion != 4) {
			System.out.println("Menú:");
			System.out.println("1. Crear auto");
			System.out.println("2. Crear motocicleta");
			System.out.println("3. Ver vehículos");
			System.out.println("4. Salir");
			System.out.print("Ingrese una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					System.out.print("Ingrese la marca del auto: ");
					String marcaAuto = scanner.next();
					System.out.print("Ingrese el modelo del auto: ");
					String modeloAuto = scanner.next();
					System.out.print("Ingrese la cantidad de puertas del auto: ");
					int puertasAuto = scanner.nextInt();
					Auto auto = new Auto(marcaAuto, modeloAuto, puertasAuto);
					garaje.agregarVehiculo(auto);
					break;
				case 2:
					System.out.print("Ingrese la marca de la motocicleta: ");
					String marcaMoto = scanner.next();
					System.out.print("Ingrese el modelo de la motocicleta: ");
					String modeloMoto = scanner.next();
					System.out.print("Ingrese la cilindrada de la motocicleta: ");
					int cilindradaMoto = scanner.nextInt();
					Motocicleta motocicleta = new Motocicleta(marcaMoto, modeloMoto, cilindradaMoto);
					garaje.agregarVehiculo(motocicleta);
					break;
				case 3:
					garaje.mostrarVehiculos();
					break;
				case 4:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
					break;
			}
		}

		scanner.close();
	}
}