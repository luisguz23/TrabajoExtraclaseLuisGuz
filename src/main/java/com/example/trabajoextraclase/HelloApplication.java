package com.example.trabajoextraclase;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private TableView<Estudiante> table = new TableView<Estudiante>();
    private Reader red= new Reader();
    private final ObservableList<Estudiante> data =
            FXCollections.observableArrayList(
                    new Estudiante(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                            "Luisguz23","A",80,90,70,65,85,90),
                    new Estudiante(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                            "Luisguz23","A",80,90,70,65,85,90),
                    new Estudiante(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                            "Luisguz23","A",80,90,70,65,85,90),
                    new Estudiante(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                            "Luisguz23","A",80,90,70,65,85,90),
                    new Estudiante(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                            "Luisguz23","A",80,90,70,65,85,90)
            );

    public static void main(String[] args) {
        Reader readcsv = new Reader();
        readcsv.Lector();
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(500);

        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("Carne");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("carne"));

        TableColumn lastNameCol = new TableColumn("Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("Nombre"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("email"));

        TableColumn TelefonoCol = new TableColumn("Telefono");
        TelefonoCol.setMinWidth(200);
        TelefonoCol.setCellValueFactory( new PropertyValueFactory<Estudiante, Integer>("numero"));

        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
/*import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 920, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //System.out.println("Hola a todos");
        Estudiante est1 = new Estudiante("Luis");
        est1.llamar();
        EstudianteA est2 = new EstudianteA ("Fernando",80,90);
        int promedio= est2.promedio();
        est2.llamar();
        System.out.println(promedio);
        //String minombre = est1.nombre;
        //System.out.println(minombre);
        EstudianteB est3 = new EstudianteB("Sebastian", 90, 80, 70);
        int promedioP = est3.promedio_Proyectos();
        est3.llamar();
        System.out.println(promedioP);
        Reader readcsv = new Reader();
        readcsv.Lector();
        launch();
    }*/
}