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
//codigo tomado de: https://docs.oracle.com/javafx/2/ui_controls/table-view.htm
public class HelloApplication extends Application {

    private TableView<Estudiante> table = new TableView<Estudiante>();
    private Reader red= new Reader();
    private final ObservableList<Estudiante> data =
            FXCollections.observableArrayList(
                    new Estudiante(20220022,"Tony Stark","tony@starkinduestries.com",
                            86860000,"ironman","A",99,98,95,80,85,90),
                    new Estudiante(20221133,"Din Djarin","mando@mandalore.com",
                            87878787,"mando","B",90,83,87,92,94,81)
            );

    public static void main(String[] args) {
        Reader readcsv = new Reader();
        readcsv.Lector();
        EstudianteA promedioA= new EstudianteA(2022144358, "Luis Guzman", "jacob.smith@example.com",72250291,
                "Luisguz23","A",80,90,70,65,85,90);
        System.out.println(promedioA.promedio());
        EstudianteB promedioB= new EstudianteB(20221133,"Din Djarin","mando@mandalore.com",
                87878787,"mando","B",90,83,87,92,94,81);
        System.out.println(promedioB.mostrar_promedio());
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(1380);
        stage.setHeight(480);

        final Label label = new Label("Estudiantes");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn CarneCol = new TableColumn("Carne");
        CarneCol.setMinWidth(100);
        CarneCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("Carne"));

        TableColumn NameCol = new TableColumn("Nombre");
        NameCol.setMinWidth(150);
        NameCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("Nombre"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Estudiante, String>("Email"));

        TableColumn TelefonoCol = new TableColumn("Telefono");
        TelefonoCol.setMinWidth(100);
        TelefonoCol.setCellValueFactory( new PropertyValueFactory<Estudiante, Integer>("Numero"));

        TableColumn NicknameCol = new TableColumn("Nickname");
        NicknameCol.setMinWidth(100);
        NicknameCol.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("Nickname"));

        TableColumn TipoCol = new TableColumn("Tipo");
        TipoCol.setMinWidth(50);
        TipoCol.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Tipo"));

        TableColumn ExamenCol = new TableColumn("Pexamenes");
        ExamenCol.setMinWidth(100);
        ExamenCol.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Pexamenes"));

        TableColumn QuicesCol = new TableColumn("Pquices");
        QuicesCol.setMinWidth(100);
        QuicesCol.setCellValueFactory(new PropertyValueFactory<Estudiante,Integer>("Pquices"));

        TableColumn TareasCol = new TableColumn("Ptareas");
        TareasCol.setMinWidth(100);
        TareasCol.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Ptareas"));

        TableColumn Proyecto1Col = new TableColumn("Proyecto1");
        Proyecto1Col.setMinWidth(100);
        Proyecto1Col.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Proyecto1"));

        TableColumn Proyecto2Col = new TableColumn("Proyecto2");
        Proyecto2Col.setMinWidth(100);
        Proyecto2Col.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Proyecto2"));

        TableColumn Proyecto3Col = new TableColumn("Proyecto3");
        Proyecto3Col.setMinWidth(100);
        Proyecto3Col.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Proyecto3"));

        table.setItems(data);
        table.getColumns().addAll(CarneCol, NameCol, emailCol, TelefonoCol,NicknameCol,TipoCol,
                ExamenCol,QuicesCol, TareasCol,Proyecto1Col, Proyecto2Col, Proyecto3Col);

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