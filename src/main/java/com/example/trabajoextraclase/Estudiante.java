package com.example.trabajoextraclase;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Estudiante {

    public final SimpleStringProperty Nombre;
    private final SimpleStringProperty Nickname;
    private final SimpleStringProperty email;
    private final SimpleStringProperty tipo;
    private final SimpleIntegerProperty carne;
    private final SimpleIntegerProperty numero;
    private final SimpleIntegerProperty Pquices;
    private final SimpleIntegerProperty Pexamenes;
    private final SimpleIntegerProperty Ptareas;
    private final SimpleIntegerProperty Proyecto1;
    private final SimpleIntegerProperty Proyecto2;
    private final SimpleIntegerProperty Proyecto3;


    public Estudiante(int carne, String Nombre,String email,int numero,String Nickname,
                      String tipo, int Pexamenes, int Pquices, int Ptareas, int Proyecto1,int Proyecto2,int Proyecto3){

        this.carne = new SimpleIntegerProperty(carne);
        this.Nombre = new SimpleStringProperty(Nombre);
        this.email = new SimpleStringProperty(email);
        this.numero = new SimpleIntegerProperty(numero);
        this.Nickname= new SimpleStringProperty(Nickname);
        this.tipo= new SimpleStringProperty(tipo);
        this.Pexamenes= new SimpleIntegerProperty(Pexamenes);
        this.Pquices=new SimpleIntegerProperty(Pquices);
        this.Ptareas = new SimpleIntegerProperty(Ptareas);
        this.Proyecto1= new SimpleIntegerProperty(Proyecto1);
        this.Proyecto2= new SimpleIntegerProperty(Proyecto2);
        this.Proyecto3= new SimpleIntegerProperty(Proyecto3);
    }
    public int getCarne() {return carne.get();}

    public void setCarne(int Carne) {
        carne.set(Carne);
    }

    public String getName() {return Nombre.get();}

    public void setName(String vNombre) { Nombre.set(vNombre);
    }

    public String getEmail() {return email.get();}

    public void setEmail(String vemail) {
        email.set(vemail);
    }

    public int getNumero(){return numero.get();}

    public void setNumero(int vnumero){numero.set(vnumero);}

    public String getNickname(){return Nickname.get();}

    public void setNickname(String vNickname){Nickname.set(vNickname);}

    public String getTipo(){return tipo.get();}

    public void setTipo(String TE){tipo.set(TE);}

    public int getPromedioEx(){return Pexamenes.get();}

    public void setPromedioEx(int promedioEx){Pexamenes.set(promedioEx);}

    public int getPromedioQ(){return Pquices.get();}

    public void setPromedioQ(int promedioQ){Pquices.set(promedioQ);}

    public int getPromedioTa(){return Ptareas.get();}

    public void setPromedioTa(int promedioTa){Pexamenes.set(promedioTa);}

    public int getProyecto1nota(){return Proyecto1.get();}

    public void setProyecto1nota(int proyecto1nota){Proyecto1.set(proyecto1nota);}

    public int getProyecto2nota(){return Proyecto2.get();}

    public void setProyecto2nota(int proyecto2nota){Proyecto2.set(proyecto2nota);}

    public int getProyecto3nota(){return Proyecto3.get();}

    public void setProyecto3nota(int proyecto3nota){Proyecto3.set(proyecto3nota);}




    public void llamar(){
        System.out.println("Hola desde Estudiante " + this.Nombre);
    }

}
