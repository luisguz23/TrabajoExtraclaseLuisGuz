package com.example.trabajoextraclase;

public class EstudianteB extends Estudiante{
    int notaP1;
    int notaP2;
    int notaP3;

    public EstudianteB(String nombre, int nota1, int nota2,int nota3) {
            super(nombre);
            this.notaP1 = notaP1;
            this.notaP2 = notaP2;
            this.notaP3 =notaP3;
    }
    public int promedio_Proyectos(){
        return (this.notaP1 + this.notaP2+ this.notaP3)/3;}
}
