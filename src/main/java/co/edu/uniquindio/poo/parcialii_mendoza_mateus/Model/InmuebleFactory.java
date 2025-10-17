package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;
//PATRON FACTORY
public class InmuebleFactory {

    public static Inmueble crearInmueble(String tipo, String ciudad, int numHabitaciones, int pisos, double precio) {
        switch (tipo.toLowerCase()) {
            case "casa":
                // Aquí podrías usar un constructor simple:
                return new Casa(ciudad, numHabitaciones, pisos, precio);
            case "apartamento":
                return new Apartamento(ciudad, numHabitaciones, pisos, precio);
            case "finca":
                return new Finca(ciudad, numHabitaciones, pisos, precio);
            case "local":
                return new Local (ciudad, numHabitaciones, pisos, precio);
            default:
                throw new IllegalArgumentException("Tipo de inmueble no soportado: " + tipo);
        }
    }

}
