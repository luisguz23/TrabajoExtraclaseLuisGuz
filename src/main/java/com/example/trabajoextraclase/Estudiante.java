package com.example.trabajoextraclase;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Estudiante {

    private final SimpleStringProperty Nombre;
    private final SimpleStringProperty Nickname;
    private final SimpleStringProperty Email;
    private final SimpleStringProperty Tipo;
    private final SimpleIntegerProperty Carne;
    private final SimpleIntegerProperty Numero;
    private final SimpleIntegerProperty Pquices;
    private final SimpleIntegerProperty Pexamenes;
    private final SimpleIntegerProperty Ptareas;
    private final SimpleIntegerProperty Proyecto1;
    private final SimpleIntegerProperty Proyecto2;
    private final SimpleIntegerProperty Proyecto3;


    public Estudiante(int carne, String nombre,String email,int numero,String nickname,
                      String tipo, int pexamenes, int pquices, int ptareas, int proyecto1,int proyecto2,int proyecto3){

        this.Carne = new SimpleIntegerProperty(carne);
        this.Nombre = new SimpleStringProperty(nombre);
        this.Email = new SimpleStringProperty(email);
        this.Numero = new SimpleIntegerProperty(numero);
        this.Nickname= new SimpleStringProperty(nickname);
        this.Tipo= new SimpleStringProperty(tipo);
        this.Pexamenes= new SimpleIntegerProperty(pexamenes);
        this.Pquices=new SimpleIntegerProperty(pquices);
        this.Ptareas = new SimpleIntegerProperty(ptareas);
        this.Proyecto1= new SimpleIntegerProperty(proyecto1);
        this.Proyecto2= new SimpleIntegerProperty(proyecto2);
        this.Proyecto3= new SimpleIntegerProperty(proyecto3);
    }
    public int getCarne() {return Carne.get();}

    public void setCarne(int carne) {
        Carne.set(carne);
    }

    public String getName() {return Nombre.get();}

    public void setName(String nombre) { Nombre.set(nombre);
    }

    public String getEmail() {return Email.get();}

    public void setEmail(String email) {
        Email.set(email);
    }

    public int getNumero(){return Numero.get();}

    public void setNumero(int numero){Numero.set(numero);}

    public String getNickname(){return Nickname.get();}

    public void setNickname(String nickname){Nickname.set(nickname);}

    public String getTipo(){return Tipo.get();}

    public void setTipo(String tipo){Tipo.set(tipo);}

    public int getPromedioEx(){return Pexamenes.get();}

    public void setPromedioEx(int pexamenes){Pexamenes.set(pexamenes);}

    public int getPromedioQ(){return Pquices.get();}

    public void setPromedioQ(int pquices){Pquices.set(pquices);}

    public int getPromedioTa(){return Ptareas.get();}

    public void setPromedioTa(int ptareas){Pexamenes.set(ptareas);}

    public int getProyecto1nota(){return Proyecto1.get();}

    public void setProyecto1nota(int proyecto1){Proyecto1.set(proyecto1);}

    public int getProyecto2nota(){return Proyecto2.get();}

    public void setProyecto2nota(int proyecto2){Proyecto2.set(proyecto2);}

    public int getProyecto3nota(){return Proyecto3.get();}

    public void setProyecto3nota(int proyecto3){Proyecto3.set(proyecto3);}




    public void llamar(){
        System.out.println("Hola desde Estudiante " + this.Nombre);
    }

}
