import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GestionTest {
    private Aeropuerto aeropuerto;
    private Vuelo vuelo;
    private Pasaporte pasaporte;
    private Pasajero pasajero;
    private Piloto piloto;

    @BeforeEach
    public void setUp() {
        aeropuerto = new Aeropuerto("AeroGarcés", "Fco Salazar");
        piloto = new Piloto("Benjamin", "Garces");
        vuelo = new Vuelo("Vuelo1", "2024-10-20", "2024-10-21", "Temuco", "New York");
        pasaporte = new Pasaporte("1234", "Chileno", 3, LocalDate.of(2026, 10, 20));
        pasajero = new Pasajero("Francisco", "Lizama", pasaporte);

        aeropuerto.agregarAvion(new Avion("Modelo1", "Blanco", 100));
        aeropuerto.agregarVuelo(vuelo);
    }

    @Test
    public void testRegistrarPasajero() {
        vuelo.registrarPasajero(pasajero);
        assertEquals(1, vuelo.getPasajeros().size());
        assertEquals("Francisco Lizama", vuelo.getPasajeros().get(0).getNombreCompleto());
    }

    @Test
    public void testBuscarPorFecha() {
        vuelo.registrarPiloto(piloto);
        vuelo.registrarPasajero(pasajero);

        List<String> usuarios = aeropuerto.buscarPorFecha("2024-10-20");
        assertTrue(usuarios.contains("Benjamin Garces"));
        assertTrue(usuarios.contains("Francisco Lizama"));
    }

    @Test
    public void testPasaporteValido() {
        assertFalse(pasaporte.estaExpirado());
    }

    @Test
    public void testPasaporteExpirado() {
        Pasaporte pasaporteExpirado = new Pasaporte("5678", "Chileno", 3, LocalDate.of(2020, 10, 20));
        assertTrue(pasaporteExpirado.estaExpirado());
    }
}
