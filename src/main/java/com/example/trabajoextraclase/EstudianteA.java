package com.example.trabajoextraclase;

public class EstudianteA extends Estudiante{

    public EstudianteA(int carne, String nombre,String email,int numero,String Nickname,
                       String tipo, int pexamenes, int pquices, int ptareas, int proyecto1,int proyecto2,int proyecto3) {
        super(carne, nombre, email, numero, Nickname, tipo, pexamenes, pquices, ptareas, proyecto1, proyecto2, proyecto3);
        //super(Nombre);
    }

    /*@Override
    public void llamar() {
        System.out.println("Hola desde EstudianteA " + this.nombre);
    }*/
    public int promedios(){
        return((getPromedioQ()+ getPromedioEx()+getPromedioTa())/3);
    }
    public String promedio(){
        return ( "El promedio de la nota de los estudiantes A es: "+ this.promedios());
    }
}
