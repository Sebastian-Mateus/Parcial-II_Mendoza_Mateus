package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

public class Local extends AbstractInmueble {

    public Local(String ciudad, int habitaciones, int pisos, double precio) {
        super("Local", ciudad, habitaciones, pisos, precio); // Cambiado de "Apartamento" a "Local"
    }
}