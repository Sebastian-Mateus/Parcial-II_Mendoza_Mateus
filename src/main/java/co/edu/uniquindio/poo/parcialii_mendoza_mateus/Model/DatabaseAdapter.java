package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * PATRÓN ADAPTER
 * Adapta el ArrayList de Database a ObservableList para JavaFX TableView
 */
public class DatabaseAdapter {

    private Database database;
    private ObservableList<Inmueble> observableInmuebles;

    public DatabaseAdapter() {
        this.database = Database.getInstance();
        this.observableInmuebles = FXCollections.observableArrayList(database.getInmuebles());
    }

    /**
     * Retorna la lista observable para usar en TableView
     */
    public ObservableList<Inmueble> getObservableInmuebles() {
        return observableInmuebles;
    }

    /**
     * Agrega un inmueble y actualiza ambas listas
     */
    public void addInmueble(Inmueble inmueble) {
        database.getInmuebles().add(inmueble);
        observableInmuebles.add(inmueble);
    }

    /**
     * Elimina un inmueble y actualiza ambas listas
     */
    public void removeInmueble(Inmueble inmueble) {
        database.getInmuebles().remove(inmueble);
        observableInmuebles.remove(inmueble);
    }

    /**
     * Sincroniza la ObservableList con el ArrayList de Database
     */
    public void syncFromDatabase() {
        observableInmuebles.clear();
        observableInmuebles.addAll(database.getInmuebles());
    }

    /**
     * Limpia todas las listas
     */
    public void clear() {
        database.getInmuebles().clear();
        observableInmuebles.clear();
    }
}