public class Auto extends Vehiculo {
	private int numPuertas;

	public String getTipo() {
		return "Auto";
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Auto(String marca, String modelo, int numPuertas) {
		super(marca,modelo);
		this.numPuertas = numPuertas;
	}

}