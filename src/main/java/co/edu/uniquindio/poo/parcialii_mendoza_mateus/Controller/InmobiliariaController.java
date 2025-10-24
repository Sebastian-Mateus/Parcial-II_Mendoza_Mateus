package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Controller;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.DatabaseAdapter;
import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.Inmueble;
import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.InmobiliariaFacade;
import javafx.collections.ObservableList;

public class InmobiliariaController {

    private InmobiliariaFacade inmobiliariaFacade;
    private DatabaseAdapter databaseAdapter;

    public InmobiliariaController() {
        this.inmobiliariaFacade = new InmobiliariaFacade();
        this.databaseAdapter = new DatabaseAdapter();
    }

    /**
     * Retorna la lista observable para la tabla
     */
    public ObservableList<Inmueble> getObservableInmuebles() {
        return databaseAdapter.getObservableInmuebles();
    }

    /**
     * Elimina un inmueble seleccionado
     */
    public void eliminarInmueble(Inmueble inmueble) {
        if (inmueble != null) {
            inmobiliariaFacade.eliminarInmueble(inmueble);
            databaseAdapter.removeInmueble(inmueble);
        }
    }

    /**
     * Sincroniza los datos de la base de datos con la vista
     */
    public void sincronizarDatos() {
        databaseAdapter.syncFromDatabase();
    }
}