
package lab2p2_jesusrodriguez;


public class Meseros {
     private String Nombre;
    private int Edad;
    private int Sueldo;
    private int Propina;
    private int Turno;
    
    public Meseros(String Nombre, int Edad, int Sueldo, int Propina, int Turno) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
        this.Propina = Propina;
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

    public int getPropina() {
        return Propina;
    }

    public void setPropina(int Propina) {
        this.Propina = Propina;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }

    @Override
    public String toString() {
        return "{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sueldo=" + Sueldo + ", Propina=" + Propina + ", Turno=" + Turno + "} \n";
    }
}
