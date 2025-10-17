package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;
 //PATRON FACTORY
public abstract class AbstractInmueble implements Inmueble{

    protected String tipo;
    protected String ciudad;
    protected int habitaciones;
     protected int pisos;
    protected double precio;

    public AbstractInmueble(String tipo, String ciudad, int habitaciones,int pisos, double precio) {
        this.tipo = tipo;
        this.ciudad = ciudad;
        this.habitaciones = habitaciones;
        this.pisos = pisos;
        this.precio = precio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getCiudad() {
        return ciudad;
    }

    @Override
    public int getHabitaciones() {
        return habitaciones;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

     @Override
     public int getPisos() {
        return pisos;
    }

}
