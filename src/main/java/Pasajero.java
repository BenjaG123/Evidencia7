public class Pasajero {

	private String nombre;
	private String apellido;
	private Pasaporte pasaporte;

	public Pasajero(String nombre, String apellido, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public boolean verificarPasaporte(){
		return !pasaporte.estaExpirado() && pasaporte.tieneHojasDisponibles();
	}

	public String getNombreCompleto(){
		return this.nombre + " " + this.apellido;
	}

}