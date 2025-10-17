package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

public class InmobiliariaFacade {
    //PATRON FACADE

    private InmobilirariaService inmobiliariaService;

    public InmobiliariaFacade() {
        this.inmobiliariaService = new InmobilirariaService();
    }
}
