import java.util.ArrayList;
import java.util.List;

public class Vuelo {

	private String nombre;
	private String fechaInicio;
	private String fechaFinal;
	private String ciudadOrigen;
	private String ciudadDestino;
	private Piloto piloto;
	private List<Pasajero> pasajeros;

	public Vuelo(String nombre, String fechaInicio, String fechaFinal, String ciudadOrigen, String ciudadDestino) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.pasajeros = new ArrayList<>();
	}

	public String getNombre() { return nombre; }

	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public void registrarPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public void registrarPasajero(Pasajero pasajero) {
		if (!pasajero.verificarPasaporte()){
			this.pasajeros.add(pasajero);
		}
	}

	public Piloto getPiloto(){
		return piloto;
	}

	public List<Pasajero> getPasajeros() {
		return this.pasajeros;
	}

}