package com.example.trabajoextraclase;
import java.io.*;

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
                //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
//use this if your values already contain commas
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
