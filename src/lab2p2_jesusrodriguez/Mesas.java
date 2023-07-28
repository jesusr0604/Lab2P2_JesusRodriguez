/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_jesusrodriguez;

/**
 *
 * @author Jesus
 */
public class Mesas {
    private int Platos;
    private int Utensilios;
    private int Precio;

    public Mesas(int Platos, int Utensilios, int Precio) {
        this.Platos = Platos;
        this.Utensilios = Utensilios;
        this.Precio = Precio;
    }
    
    

    public int getPlatos() {
        return Platos;
    }

    public void setPlatos(int Platos) {
        this.Platos = Platos;
    }

    public int getUtensilios() {
        return Utensilios;
    }

    public void setUtensilios(int Utensilios) {
        this.Utensilios = Utensilios;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "{" + "Platos=" + Platos + ", Utensilios=" + Utensilios + ", Precio=" + Precio + "} \n";
    }
    

    
    
}
