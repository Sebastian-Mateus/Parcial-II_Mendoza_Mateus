module co.edu.uniquindio.poo.parcialii_mendoza_mateus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens co.edu.uniquindio.poo.parcialii_mendoza_mateus to javafx.fxml;
    opens co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController to javafx.fxml;

    exports co.edu.uniquindio.poo.parcialii_mendoza_mateus;
    exports co.edu.uniquindio.poo.parcialii_mendoza_mateus.ViewController;
}
