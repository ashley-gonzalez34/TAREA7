/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author usuario
 */
public class AccesoDatos extends Exception{
    
    String Mensaje;
    public AccesoDatos(String msg){
        this.Mensaje = msg;
    } 
    
}
