package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

public class Casa extends AbstractInmueble{


    public Casa(String ciudad, int habitaciones, int pisos, double precio) {
        super("Casa", ciudad, habitaciones, pisos, precio);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tipo='" + tipo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", habitaciones=" + habitaciones +
                ", pisos=" + pisos +
                ", precio=" + precio +
                '}';
    }
}
