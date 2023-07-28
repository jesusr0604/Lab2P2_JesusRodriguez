
package lab2p2_jesusrodriguez;


public class Bartenders {
    private String Nombre;
    private int Edad;
    private int Sueldo;
    private int licores;
    private int Turno;

    public Bartenders(String Nombre, int Edad, int Sueldo, int licores, int Turno) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
        this.licores = licores;
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

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }

    @Override
    public String toString() {
        return "{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sueldo=" + Sueldo + ", licores=" + licores + ", Turno=" + Turno + "} \n";
    }
    
}
