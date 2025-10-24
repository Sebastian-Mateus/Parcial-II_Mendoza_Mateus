package co.edu.uniquindio.poo.parcialii_mendoza_mateus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage primaryStage ;


    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 890, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        primaryStage=stage;
        stage.show();
    }

    public static void cambiarVista(String fxmlView) {
        try {

            String fxmlPath = "/co/edu/uniquindio/poo/parcialii_mendoza_mateus/"+fxmlView;
            FXMLLoader loader = new FXMLLoader(
                    HelloApplication.class.getResource(fxmlPath)
            );

            Parent nuevaRaiz = loader.load();

            Scene escena = primaryStage.getScene();

            if (escena == null) {
                escena = new Scene(nuevaRaiz, 650, 600);
                primaryStage.setScene(escena);
            } else {
                escena.setRoot(nuevaRaiz);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al cargar la vista FXML: " + fxmlView);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}