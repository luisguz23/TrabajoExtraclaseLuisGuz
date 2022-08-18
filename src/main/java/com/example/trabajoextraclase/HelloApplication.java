package com.example.trabajoextraclase;

import javafx.application.Application;
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
    }
}