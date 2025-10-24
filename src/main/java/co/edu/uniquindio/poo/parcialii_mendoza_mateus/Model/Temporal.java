package co.edu.uniquindio.poo.parcialii_mendoza_mateus.Model;

public class Temporal {
    //clase inmobiliariaController
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
    private Button btnAgregar;

    @FXML
    void initialize() {
        // Inicializar el controlador
        inmobiliariaController = new InmobiliariaController();

        // Vincular las columnas con los atributos del modelo
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colHabitaciones.setCellValueFactory(new PropertyValueFactory<>("habitaciones"));
        colNumeroPisos.setCellValueFactory(new PropertyValueFactory<>("pisos"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        // Cargar los datos en la tabla
        loadTable();
    }

    public void onPresionarAgregar(javafx.event.ActionEvent actionEvent) {
        HelloApplication.cambiarVista("AgregarInmueble.fxml");
    }

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

    public void loadTable() {
        inmobiliariaController.sincronizarDatos();
        tablaCuentas.setItems(inmobiliariaController.getObservableInmuebles());
        tablaCuentas.refresh();
    }

    //Claase agregar inmueble
    
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
        // Inicializar el controlador
        agregarInmuebleController = new AgregarInmuebleController();

        // Agregar las opciones al ComboBox
        cbxTipo.getItems().addAll("Casa", "Apartamento", "Finca", "Local");
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

            // Limpiar los campos
            cbxTipo.setValue(null);
            txtCiudad.clear();
            txtPisos1.clear();
            txtPisos.clear();
            txtPrecio.clear();

            // Mostrar mensaje de éxito
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
