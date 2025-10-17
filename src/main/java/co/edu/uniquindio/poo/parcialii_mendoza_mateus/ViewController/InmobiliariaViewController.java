package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

    public class InmobiliariaViewController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TableView<?> tablaCuentas;

        @FXML
        private TableColumn<?, ?> colCiudad;

        @FXML
        private TableColumn<?, ?> colPrecio;

        @FXML
        private Button btnEliminar;

        @FXML
        private TableColumn<?, ?> colTipo;

        @FXML
        private TableColumn<?, ?> colHabitaciones;

        @FXML
        private TableColumn<?, ?> colNumeroPisos;

        @FXML
        private Button btnAgregar;

        @FXML
        void onPresionarAgregar(ActionEvent event) {

        }

        @FXML
        void OnEliminar(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert tablaCuentas != null : "fx:id=\"tablaCuentas\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert colCiudad != null : "fx:id=\"colCiudad\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert colPrecio != null : "fx:id=\"colPrecio\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert btnEliminar != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert colTipo != null : "fx:id=\"colTipo\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert colHabitaciones != null : "fx:id=\"colHabitaciones\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert colNumeroPisos != null : "fx:id=\"colNumeroPisos\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";
            assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'Inmobiliaria.fxml'.";

        }
    }
    
