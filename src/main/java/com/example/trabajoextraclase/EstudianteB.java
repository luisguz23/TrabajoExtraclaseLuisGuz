package com.example.trabajoextraclase;

public class EstudianteB extends Estudiante{

    public EstudianteB(int carne, String nombre,String email,int numero,String nickname,
                       String tipo, int Pexamenes, int Pquices, int Ptareas, int Proyecto1,int Proyecto2,int Proyecto3) {
            super(carne, nombre, email, numero, nickname, tipo, Pexamenes, Pquices, Ptareas, Proyecto1, Proyecto2, Proyecto3);

    }
    public int promedio_Proyectos(){
        return ((getProyecto1nota()+getProyecto2nota()+getProyecto3nota())/3);}
    public String mostrar_promedio(){
        return ( "El promedio de la nota de los estudiantes B es: "+ this.promedio_Proyectos());
    }
}
