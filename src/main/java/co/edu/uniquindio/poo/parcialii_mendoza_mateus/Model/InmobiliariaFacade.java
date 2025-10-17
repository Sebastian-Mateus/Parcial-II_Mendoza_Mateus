package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

public class InmobiliariaFacade {

    //PATRON FACADE

    private InmobilirariaService inmobiliariaService;

    public InmobiliariaFacade() {
        this.inmobiliariaService = new InmobilirariaService();
    }

    public void CrearInmueble (String tipo, String ciudad, int habitaciones, int pisos, double precio){
        inmobiliariaService.CrearInmueble(tipo, ciudad, habitaciones, pisos, precio);
    }

    public void eliminarInmueble (Inmueble inmueble){
        inmobiliariaService.eliminarInmueble(inmueble);
    }
}
