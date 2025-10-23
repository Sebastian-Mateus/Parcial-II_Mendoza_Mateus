package co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;
import co.edu.uniquindio.poo.parcialii_mendoza_mateus.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InmobiliariaMainViewController {


    @FXML
    private Button iniciar;

    @FXML
    public void btnIniciar(ActionEvent actionEvent) {
        HelloApplication.cambiarVista("Inmobiliaria.fxml");

    }








}