import java.util.ArrayList;
import java.util.List;

public class Avion {

	private String modelo;
	private String color;
	private int capacidad;
	private List<Vuelo> vuelos;

	public Avion(String modelo, String color, int capacidad) {
		this.modelo = modelo;
		this.color = color;
		this.capacidad = capacidad;
		this.vuelos = new ArrayList<>();
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return this.capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void asignarVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
	}

}