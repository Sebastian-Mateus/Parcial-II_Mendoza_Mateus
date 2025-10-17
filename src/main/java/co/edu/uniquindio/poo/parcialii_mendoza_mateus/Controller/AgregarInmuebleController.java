package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Controller;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.InmobiliariaFacade;

public class AgregarInmuebleController {

    private InmobiliariaFacade inmobiliariaFacade;

    public AgregarInmuebleController() {
        this.inmobiliariaFacade = new InmobiliariaFacade();
    }

    public void agregarNuevoInmueble(String tipo, String ciudad, int habitaciones, int pisos, double precio) {
        inmobiliariaFacade.CrearInmueble(tipo, ciudad, habitaciones, pisos, precio);

        System.out.println("Inmueble de tipo " + tipo + " en " + ciudad + " creado exitosamente.");
    }
}

