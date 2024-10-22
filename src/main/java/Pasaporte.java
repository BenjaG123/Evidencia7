import java.time.LocalDate;


public class Pasaporte {

	private String id;
	private String nacionalidad;
	private int hojasDisponibles;
	private LocalDate fechaExpiracion;

	public Pasaporte(String id, String nacionalidad,int hojasDisponibles, LocalDate fechaExpiracion) {
		this.id = id;
		this.nacionalidad = nacionalidad;
		this.fechaExpiracion = fechaExpiracion;

	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getHojasDisponibles() {
		return this.hojasDisponibles;
	}

	public void setHojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public LocalDate getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public boolean estaExpirado(){
		return LocalDate.now().isAfter(fechaExpiracion);
	}

	public boolean tieneHojasDisponibles(){
		return this.hojasDisponibles > 0;
	}
}