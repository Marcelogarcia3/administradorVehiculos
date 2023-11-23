public class Motocicleta extends Vehiculo {
	private int cilindrada;

	public String getTipo() {
		return "motocicleta";
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Motocicleta(String marca, String modelo, int cilindrada) {
		super(marca, modelo);
		this.cilindrada = cilindrada;
	}
}