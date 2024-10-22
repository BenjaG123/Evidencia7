import java.time.LocalDate;

public class Gestion {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto("AeroGarcés", "Fco Salazar");

        Avion avion = new Avion("Modelo1", "Blanco", 100);
        aeropuerto.agregarAvion(avion);

        Vuelo vuelo = new Vuelo("Vuelo1", "2024-10-20", "2024-10-21","Temuco","New York");
        aeropuerto.agregarVuelo(vuelo);

        Piloto piloto = new Piloto("Benjamin", "Garces");
        vuelo.registrarPiloto(piloto);

        Pasaporte pasaporte = new Pasaporte("1234", "Chileno", 3, LocalDate.of(2026,10,20));
        Pasajero pasajero = new Pasajero("Francisco", "Lizama", pasaporte);
        vuelo.registrarPasajero(pasajero);

        System.out.println("Usuarios que viajan el 20 de Octubre: ");
        for (String usuario : aeropuerto.buscarPorFecha("2024-10-20")){
            System.out.println(usuario);
        }


    }
}
