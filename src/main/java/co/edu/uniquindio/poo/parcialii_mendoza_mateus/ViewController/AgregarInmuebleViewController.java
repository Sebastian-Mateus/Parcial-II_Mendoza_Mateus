package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Controller.AgregarInmuebleController;
import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.Inmueble;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AgregarInmuebleViewController {

    private AgregarInmuebleController agregarInmuebleController;



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPisos1;

    @FXML
    private TextField txtPisos;

    @FXML
    private ComboBox<String> cbxTipo;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPrecio;

    @FXML
    void onTipo(ActionEvent event) {
        System.out.println("Tipo seleccionado: " + cbxTipo.getValue());
    }


    @FXML
    void initialize() {
        cbxTipo.getItems().addAll("Casa", "Apartamento", "Finca", "Local");
    }

    @FXML
    void OnGuardar(ActionEvent event) {
        String tipo = cbxTipo.getValue();
        String ciudad = txtCiudad.getText();
        int habitaciones = Integer.parseInt(txtPisos1.getText());
        int pisos = Integer.parseInt(txtPisos.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        agregarInmuebleController.agregarNuevoInmueble(tipo, ciudad, habitaciones, pisos, precio);

        cbxTipo.setValue(null);
        txtCiudad.clear();
        txtPisos1.clear();
        txtPisos.clear();
        txtPrecio.clear();

        System.out.println("Inmueble guardado");
        }
    }


