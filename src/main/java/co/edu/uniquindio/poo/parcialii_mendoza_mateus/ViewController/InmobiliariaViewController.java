package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;


import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.Inmueble;
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
        private TableView<Inmueble> tablaCuentas;

        @FXML
        private TableColumn<Inmueble, String> colCiudad;

        @FXML
        private TableColumn<Inmueble, Double> colPrecio;

        @FXML
        private Button btnEliminar;

        @FXML
        private TableColumn<Inmueble, String> colTipo;

        @FXML
        private TableColumn<Inmueble, Integer> colHabitaciones;

        @FXML
        private TableColumn<Inmueble, Integer> colNumeroPisos;

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

        }

        public void onPresionarAgregar(javafx.event.ActionEvent actionEvent) {
        }

        public void OnEliminar(javafx.event.ActionEvent actionEvent) {
            
        }

        public void loadTble(){
            
        }
    }

