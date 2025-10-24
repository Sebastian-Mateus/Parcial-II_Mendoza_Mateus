package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Controller.InmobiliariaController;
import co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model.Inmueble;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InmobiliariaViewController {

        private InmobiliariaController inmobiliariaController;

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
        void initialize() {
            inmobiliariaController = new InmobiliariaController();

            colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
            colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
            colHabitaciones.setCellValueFactory(new PropertyValueFactory<>("habitaciones"));
            colNumeroPisos.setCellValueFactory(new PropertyValueFactory<>("pisos"));
            colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

            loadTable();
        }

    public void loadTable() {
        inmobiliariaController.sincronizarDatos();
        tablaCuentas.setItems(inmobiliariaController.getObservableInmuebles());
        tablaCuentas.refresh();
    }


    @FXML
        public void OnEliminar(javafx.event.ActionEvent actionEvent) {
            Inmueble inmuebleSeleccionado = tablaCuentas.getSelectionModel().getSelectedItem();

            if (inmuebleSeleccionado != null) {
                inmobiliariaController.eliminarInmueble(inmuebleSeleccionado);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Eliminación exitosa");
                alert.setHeaderText(null);
                alert.setContentText("El inmueble ha sido eliminado correctamente.");
                alert.showAndWait();

                loadTable();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ningún inmueble seleccionado");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, selecciona un inmueble de la tabla para eliminar.");
                alert.showAndWait();
            }
        }

    }

