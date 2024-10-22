import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {

	private String nombre;
	private String direccion;
	private List<Avion> aviones;
	private List<Vuelo> vuelos;

	public Aeropuerto(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.aviones = new ArrayList<>();
		this.vuelos = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarVuelo(Vuelo vuelo){
		this.vuelos.add(vuelo);
	}

	public void agregarAvion(Avion avion){
		this.aviones.add(avion);
	}

	public List<String> buscarPorFecha(String fecha){
		List<String> usuarios = new ArrayList<>();
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getFechaInicio().equals(fecha)) {
				for (Pasajero pasajero: vuelo.getPasajeros()){
					usuarios.add(pasajero.getNombreCompleto());
				}
				if (vuelo.getPiloto() != null){
					usuarios.add(vuelo.getPiloto().getNombreCompleto());
				}
			}
		}
		return usuarios;
	}

	public List<String> buscarPorVuelo(String nombre){
		for (Vuelo vuelo: vuelos){
			if (vuelo.getNombre().equals(nombre)){
				List<String> usuarios = new ArrayList<>();
				for (Pasajero pasajero: vuelo.getPasajeros()){
					usuarios.add(pasajero.getNombreCompleto());
				}
				if (vuelo.getPiloto() != null){
					usuarios.add(vuelo.getPiloto().getNombreCompleto());
				}
				return usuarios;
			}
		}
		return new ArrayList<>();
	}
}