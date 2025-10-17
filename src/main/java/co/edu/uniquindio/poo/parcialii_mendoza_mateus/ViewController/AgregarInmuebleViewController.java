package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AgregarInmuebleViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPisos1;

    @FXML
    private TextField txtPisos;

    @FXML
    private ComboBox<?> cbxTipo;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPrecio;

    @FXML
    void onTipo(ActionEvent event) {

    }

    @FXML
    void OnGuardar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtPisos1 != null : "fx:id=\"txtPisos1\" was not injected: check your FXML file 'AgregarInmueble.fxml'.";
        assert txtPisos != null : "fx:id=\"txtPisos\" was not injected: check your FXML file 'AgregarInmueble.fxml'.";
        assert cbxTipo != null : "fx:id=\"cbxTipo\" was not injected: check your FXML file 'AgregarInmueble.fxml'.";
        assert txtCiudad != null : "fx:id=\"txtCiudad\" was not injected: check your FXML file 'AgregarInmueble.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'AgregarInmueble.fxml'.";

    }
}
