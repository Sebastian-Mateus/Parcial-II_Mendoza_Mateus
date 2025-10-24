package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Controller.AgregarInmuebleController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    void initialize() {
        cbxTipo.getItems().addAll("Casa", "Apartamento", "Finca", "Local");
        agregarInmuebleController = new AgregarInmuebleController();
    }

    @FXML
    void OnGuardar(ActionEvent event) {
        try {
            String tipo = cbxTipo.getValue();
            String ciudad = txtCiudad.getText();
            int habitaciones = Integer.parseInt(txtPisos1.getText());
            int pisos = Integer.parseInt(txtPisos.getText());
            double precio = Double.parseDouble(txtPrecio.getText());

            if (tipo == null || tipo.isEmpty() || ciudad.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Campos incompletos");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, completa todos los campos.");
                alert.showAndWait();
                return;
            }

            agregarInmuebleController.agregarNuevoInmueble(tipo, ciudad, habitaciones, pisos, precio);

            cbxTipo.setValue(null);
            txtCiudad.clear();
            txtPisos1.clear();
            txtPisos.clear();
            txtPrecio.clear();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Inmueble guardado");
            alert.setHeaderText(null);
            alert.setContentText("El inmueble ha sido agregado exitosamente.");
            alert.showAndWait();

            System.out.println("Inmueble guardado");

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de formato");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingresa valores numéricos válidos para habitaciones, pisos y precio.");
            alert.showAndWait();
        }
    }
    }


