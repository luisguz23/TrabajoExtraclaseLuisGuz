package com.example.trabajoextraclase;

public class Estudiante {

    String nombre;
    String correo;
    String nickname;
    String Tipo;
    int carne;
    int numero;
    int Pquices;
    int Pexamenes;
    int Ptareas;
    int Proyecto1;
    int Proyecto2;
    int Proyecto3;


    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public void llamar(){
        System.out.println("Hola desde Estudiante " + this.nombre);
    }

}
