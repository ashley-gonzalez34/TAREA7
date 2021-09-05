/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author usuario
 */
public class mdEmpleado {
    
    
    private String Nombre;
    private double Enero;
    private double Febrero;
    private double Marzo;
    private double Totaldeventas;
    private double Promedio;
    
    public String getNombre() {
        return Nombre;
    }
   
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getEnero() {
        return Enero;
    }

    public void setEnero(double Enero) {
        this.Enero = Enero;
    }
   
    public double getFebrero() {
        return Febrero;
    }
   
    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    public double getMarzo() {
        return Marzo;
    }

    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }

    public double getTotaldeventa() {
        return Totaldeventas;
    }

    public void setVentasTotales(double Totaldeventa) {
        this.Totaldeventas = Totaldeventa;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }    
    
    
    
}
