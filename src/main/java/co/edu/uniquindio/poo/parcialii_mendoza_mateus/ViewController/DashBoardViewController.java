package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;


public class DashBoardViewController {

        @FXML
        private Button agregar;

        @FXML
        private Button listar;

        @FXML
        private BorderPane Dashboard;

        @FXML
        void agregarInmueble(ActionEvent event) {
                cargarContenidoCentral("AgregarInmueble.fxml");
        }

        @FXML
        void listarInmuebles(ActionEvent event) {
                cargarContenidoCentral("Inmobiliaria.fxml");
        }

        public void cargarContenidoCentral(String fxmlName) {
                try {

                        String fxmlPath = "/co/edu/uniquindio/poo/parcialii_mendoza_mateus/" + fxmlName;

                        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));

                        Parent nuevaVista = loader.load();

                        Dashboard.setCenter(nuevaVista);

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }


}
