module com.example.trabajoextraclase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabajoextraclase to javafx.fxml;
    exports com.example.trabajoextraclase;
}