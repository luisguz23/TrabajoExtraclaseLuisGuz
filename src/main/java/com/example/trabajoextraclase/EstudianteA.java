package com.example.trabajoextraclase;

public class EstudianteA extends Estudiante{
    int nota1;
    int nota2;
    public EstudianteA(String nombre, int nota1, int nota2) {
        super(nombre);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public void llamar() {
        System.out.println("Hola desde EstudianteA " + this.nombre);
    }

    public int promedio(){
        return (this.nota1 + this.nota2)/2;
    }
}
