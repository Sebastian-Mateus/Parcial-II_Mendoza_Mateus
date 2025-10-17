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

        }
    }

