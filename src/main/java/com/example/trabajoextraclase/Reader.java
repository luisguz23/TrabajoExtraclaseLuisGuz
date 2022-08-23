package com.example.trabajoextraclase;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
//codigo tomado de: https://www.youtube.com/watch?v=zKDmzKaAQro&t=1s
public class Reader {

    public void  Lector () {

        //CSV = Comma-Separated Values
        //   text file that uses a comma to separate values

        String file = "src\\archivocsv.csv";
        BufferedReader reader = null;
        String line = "";
        int prueba = 0;

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                //add a la lista (new Student(row[0], row[1].......)
                //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
//use this if your values already contain commas

                //ObservableList<Estudiante> data = getListEstudiantes()
                //private ObservableList<Estudiante> data;

                for(String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
