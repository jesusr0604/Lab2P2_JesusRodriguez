package lab2p2_jesusrodriguez;

import java.awt.Color;
import java.util.Date;

public class Chefs {

    private String Nombre;
    private int Edad;
    private int Sueldo;
    private int Estrellas;
    private int Turno;

    public Chefs(String Nombre, int Edad, int Sueldo, int Estrellas, int Turno) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
        this.Estrellas = Estrellas;
        this.Turno = Turno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }

   

    @Override
    public String toString() {
        return "{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sueldo=" + Sueldo + ", Estrellas=" + Estrellas+ ", Turno =" + Turno + "} \n";
    }

    
    
}
